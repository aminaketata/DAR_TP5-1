package rmiServer;

import rmiService.ConversionImpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ConversionServer
{
	public static void main(String[] args) 
	{
		try 
		{
            LocateRegistry.createRegistry(1098); //anniaire
            ConversionImpl od = new ConversionImpl(); // Skeleton
            System.out.println(od.toString());
            Naming.rebind("rmi://localhost:1098/ConversionObject",od);

        } 
		catch (Exception e) 
		{
            e.printStackTrace();
        }
	}
}

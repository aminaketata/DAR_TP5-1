package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient 
{
    public static void main(String[] args) 
    {
        try {
        		IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1098/ConversionObject");
                                //Naming.lookup return an instance of Remote
            System.out.println(stub.convertirMontant(700.00));
            System.out.println(stub.convertirMontant(80.00));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
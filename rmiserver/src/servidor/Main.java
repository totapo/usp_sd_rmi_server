package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.Server;
import rmi_base.EPRMI;

public class Main {
	
	public static void main(String args[]) {
        //args 0 = porta registry
		//args 1 = porta objeto
		
		if(args.length>=2) {
			try {
	            Server obj = new Server(Integer.parseInt(args[1]));
	            
	            // Bind the remote object's stub in the registry
	            Registry registry = LocateRegistry.createRegistry(Integer.parseInt(args[0]));
	            registry.bind("EPRMI", obj);

	            System.err.println("Server ready");
	        } catch (Exception e) {
	            System.err.println("Server exception: " + e.toString());
	            e.printStackTrace();
	        }
		}
        
    }

}

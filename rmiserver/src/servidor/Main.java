package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.Server;
import rmi_base.EPRMI;

public class Main {
	
	public static void main(String args[]) {
        
        try {
            Server obj = new Server();
            EPRMI stub = (EPRMI) UnicastRemoteObject.exportObject(obj, 50000);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("EPRMI", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }

}

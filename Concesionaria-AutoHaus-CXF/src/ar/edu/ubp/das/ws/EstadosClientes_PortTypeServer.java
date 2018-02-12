
package ar.edu.ubp.das.ws;

import javax.xml.ws.Endpoint;
 
public class EstadosClientes_PortTypeServer{

    protected EstadosClientes_PortTypeServer() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new ar.edu.ubp.das.ws.EstadosClientes();
        String address = "http://localhost:9090/EstadosClientesPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new EstadosClientes_PortTypeServer();
        System.out.println("Server ready..."); 
        /*
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);*/
    }
}
 
 
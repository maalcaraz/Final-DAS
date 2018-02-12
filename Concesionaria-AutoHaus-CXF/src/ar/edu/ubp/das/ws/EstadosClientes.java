package ar.edu.ubp.das.ws;

import javax.jws.WebMethod;
//import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.das.ubp.edu.ar/", portName = "EstadosClientesPort", serviceName = "EstadosClientesService")
public class EstadosClientes {

	@WebMethod(operationName = "getEstados", action = "urn:GetEstados")
	public String getEstados(){
		return "Anda el servicio sin parámetros";
	}
}

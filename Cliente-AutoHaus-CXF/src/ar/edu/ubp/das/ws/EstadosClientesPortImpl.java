
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ar.edu.ubp.das.ws;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2018-02-12T14:00:26.548-03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "EstadosClientesService",
                      portName = "EstadosClientesPort",
                      targetNamespace = "http://ws.das.ubp.edu.ar/",
                      wsdlLocation = "http://localhost:9090/EstadosClientesPort?wsdl",
                      endpointInterface = "ar.edu.ubp.das.ws.EstadosClientes")
                      
public class EstadosClientesPortImpl implements EstadosClientes {

    private static final Logger LOG = Logger.getLogger(EstadosClientesPortImpl.class.getName());

    /* (non-Javadoc)
     * @see ar.edu.ubp.das.ws.EstadosClientes#getEstados()*
     */
    public java.lang.String getEstados() { 
        LOG.info("Executing operation getEstados");
        try {
            java.lang.String _return = "_return-520432010";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

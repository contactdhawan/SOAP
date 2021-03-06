package sf.crom.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-08-30T19:56:56.627-05:00
 * Generated source version: 3.0.3
 * 
 */
@WebService(targetNamespace = "http://services.crom.sf/", name = "MyMathInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface MyMathInterface {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://services.crom.sf/", className = "sf.crom.services.Sum")
    @WebMethod
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://services.crom.sf/", className = "sf.crom.services.SumResponse")
    public int sum(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b
    );
}

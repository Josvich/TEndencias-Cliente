
package sv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Access", targetNamespace = "http://sv/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Access {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns sv.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://sv/", className = "sv.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://sv/", className = "sv.LoginResponse")
    @Action(input = "http://sv/Access/loginRequest", output = "http://sv/Access/loginResponse")
    public User login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param ope
     * @param value
     * @param username
     * @return
     *     returns sv.User
     */
    @WebMethod(operationName = "Update")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Update", targetNamespace = "http://sv/", className = "sv.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://sv/", className = "sv.UpdateResponse")
    @Action(input = "http://sv/Access/UpdateRequest", output = "http://sv/Access/UpdateResponse")
    public User update(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "value", targetNamespace = "")
        int value,
        @WebParam(name = "ope", targetNamespace = "")
        boolean ope);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sv/", className = "sv.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sv/", className = "sv.HelloResponse")
    @Action(input = "http://sv/Access/helloRequest", output = "http://sv/Access/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param password
     * @param balance
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "SingUp")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SingUp", targetNamespace = "http://sv/", className = "sv.SingUp")
    @ResponseWrapper(localName = "SingUpResponse", targetNamespace = "http://sv/", className = "sv.SingUpResponse")
    @Action(input = "http://sv/Access/SingUpRequest", output = "http://sv/Access/SingUpResponse")
    public boolean singUp(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "balance", targetNamespace = "")
        int balance);

}

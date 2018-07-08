/**
 * Company_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

public interface Company_Service extends javax.xml.rpc.Service {
    public java.lang.String getCompanyPortAddress();

    public wsdl.Company_PortType getCompanyPort() throws javax.xml.rpc.ServiceException;

    public wsdl.Company_PortType getCompanyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

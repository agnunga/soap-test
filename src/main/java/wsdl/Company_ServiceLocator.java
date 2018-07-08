/**
 * Company_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

public class Company_ServiceLocator extends org.apache.axis.client.Service implements wsdl.Company_Service {

    public Company_ServiceLocator() {
    }


    public Company_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Company_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CompanyPort
    private java.lang.String CompanyPort_address = "https://beep2.cellulant.com:9001/assessments/Company";

    public java.lang.String getCompanyPortAddress() {
        return CompanyPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CompanyPortWSDDServiceName = "CompanyPort";

    public java.lang.String getCompanyPortWSDDServiceName() {
        return CompanyPortWSDDServiceName;
    }

    public void setCompanyPortWSDDServiceName(java.lang.String name) {
        CompanyPortWSDDServiceName = name;
    }

    public wsdl.Company_PortType getCompanyPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CompanyPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCompanyPort(endpoint);
    }

    public wsdl.Company_PortType getCompanyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            wsdl.CompanyPortBindingStub _stub = new wsdl.CompanyPortBindingStub(portAddress, this);
            _stub.setPortName(getCompanyPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCompanyPortEndpointAddress(java.lang.String address) {
        CompanyPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (wsdl.Company_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                wsdl.CompanyPortBindingStub _stub = new wsdl.CompanyPortBindingStub(new java.net.URL(CompanyPort_address), this);
                _stub.setPortName(getCompanyPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CompanyPort".equals(inputPortName)) {
            return getCompanyPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebService/", "Company");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebService/", "CompanyPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CompanyPort".equals(portName)) {
            setCompanyPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

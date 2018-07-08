/**
 * Company_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

public interface Company_PortType extends java.rmi.Remote {
    public wsdl.Departments[] fetchDepartments() throws java.rmi.RemoteException;
    public wsdl.Staff[] fetchStaff(java.lang.Integer departmentID) throws java.rmi.RemoteException;
}

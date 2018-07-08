/**
 * Departments.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;

public class Departments implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Departments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebService/", "departments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private java.lang.String dateCreated;
    private java.lang.String dateModified;
    private java.lang.Integer departmentID;
    private java.lang.String description;
    private java.lang.String name;
    private java.lang.Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public Departments() {
    }


    public Departments(
            java.lang.String dateCreated,
            java.lang.String dateModified,
            java.lang.Integer departmentID,
            java.lang.String description,
            java.lang.String name) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.departmentID = departmentID;
        this.description = description;
        this.name = name;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the dateCreated value for this Departments.
     *
     * @return dateCreated
     */
    public java.lang.String getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the dateCreated value for this Departments.
     *
     * @param dateCreated
     */
    public void setDateCreated(java.lang.String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Gets the dateModified value for this Departments.
     *
     * @return dateModified
     */
    public java.lang.String getDateModified() {
        return dateModified;
    }

    /**
     * Sets the dateModified value for this Departments.
     *
     * @param dateModified
     */
    public void setDateModified(java.lang.String dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * Gets the departmentID value for this Departments.
     *
     * @return departmentID
     */
    public java.lang.Integer getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the departmentID value for this Departments.
     *
     * @param departmentID
     */
    public void setDepartmentID(java.lang.Integer departmentID) {
        this.departmentID = departmentID;
    }

    /**
     * Gets the description value for this Departments.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the description value for this Departments.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Gets the name value for this Departments.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the name value for this Departments.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Departments)) return false;
        Departments other = (Departments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.dateCreated == null && other.getDateCreated() == null) ||
                        (this.dateCreated != null &&
                                this.dateCreated.equals(other.getDateCreated()))) &&
                ((this.dateModified == null && other.getDateModified() == null) ||
                        (this.dateModified != null &&
                                this.dateModified.equals(other.getDateModified()))) &&
                ((this.departmentID == null && other.getDepartmentID() == null) ||
                        (this.departmentID != null &&
                                this.departmentID.equals(other.getDepartmentID()))) &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateModified() != null) {
            _hashCode += getDateModified().hashCode();
        }
        if (getDepartmentID() != null) {
            _hashCode += getDepartmentID().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

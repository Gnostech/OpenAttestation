//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.28 at 01:24:35 PM EDT 
//


package org.trustedcomputinggroup.xml.schema.core_integrity_v1_0_1_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ComponentID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.trustedcomputinggroup.org/XML/SCHEMA/Core_Integrity_v1_0_1#}ComponentIDType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComponentIDREF" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *       &lt;/choice>
 *       &lt;attribute name="ComponentLoc" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentRefType", propOrder = {
    "componentID",
    "componentIDREF"
})
public class ComponentRefType {

    @XmlElement(name = "ComponentID")
    protected ComponentRefType.ComponentID componentID;
    @XmlElement(name = "ComponentIDREF")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object componentIDREF;
    @XmlAttribute(name = "ComponentLoc")
    @XmlSchemaType(name = "anyURI")
    protected String componentLoc;

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentRefType.ComponentID }
     *     
     */
    public ComponentRefType.ComponentID getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentRefType.ComponentID }
     *     
     */
    public void setComponentID(ComponentRefType.ComponentID value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the componentIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentIDREF() {
        return componentIDREF;
    }

    /**
     * Sets the value of the componentIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponentIDREF(Object value) {
        this.componentIDREF = value;
    }

    /**
     * Gets the value of the componentLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentLoc() {
        return componentLoc;
    }

    /**
     * Sets the value of the componentLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentLoc(String value) {
        this.componentLoc = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.trustedcomputinggroup.org/XML/SCHEMA/Core_Integrity_v1_0_1#}ComponentIDType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ComponentID
        extends ComponentIDType
    {


    }

}
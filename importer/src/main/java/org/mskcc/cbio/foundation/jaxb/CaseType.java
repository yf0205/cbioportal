//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.05 at 10:50:18 AM EDT 
//


package org.mskcc.cbio.foundation.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variant-report" type="{}variant-reportType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="case" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fmiCase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasVariant" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseType", propOrder = {
    "variantReport"
})
public class CaseType {

    @XmlElement(name = "variant-report", required = true)
    protected VariantReportType variantReport;
    @XmlAttribute(name = "case")
    protected String _case;
    @XmlAttribute(name = "fmiCase")
    protected String fmiCase;
    @XmlAttribute(name = "hasVariant")
    protected Byte hasVariant;

    /**
     * Gets the value of the variantReport property.
     * 
     * @return
     *     possible object is
     *     {@link VariantReportType }
     *     
     */
    public VariantReportType getVariantReport() {
        return variantReport;
    }

    /**
     * Sets the value of the variantReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantReportType }
     *     
     */
    public void setVariantReport(VariantReportType value) {
        this.variantReport = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCase(String value) {
        this._case = value;
    }

    /**
     * Gets the value of the fmiCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmiCase() {
        return fmiCase;
    }

    /**
     * Sets the value of the fmiCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmiCase(String value) {
        this.fmiCase = value;
    }

    /**
     * Gets the value of the hasVariant property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getHasVariant() {
        return hasVariant;
    }

    /**
     * Sets the value of the hasVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setHasVariant(Byte value) {
        this.hasVariant = value;
    }

}
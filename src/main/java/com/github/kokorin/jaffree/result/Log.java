
package com.github.kokorin.jaffree.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="parent_context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent_category" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logType")
public class Log {

    @XmlAttribute(name = "context")
    protected String context;
    @XmlAttribute(name = "level")
    protected Integer level;
    @XmlAttribute(name = "category")
    protected Integer category;
    @XmlAttribute(name = "parent_context")
    protected String parentContext;
    @XmlAttribute(name = "parent_category")
    protected Integer parentCategory;
    @XmlAttribute(name = "message")
    protected String message;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategory(Integer value) {
        this.category = value;
    }

    /**
     * Gets the value of the parentContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentContext() {
        return parentContext;
    }

    /**
     * Sets the value of the parentContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentContext(String value) {
        this.parentContext = value;
    }

    /**
     * Gets the value of the parentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentCategory() {
        return parentCategory;
    }

    /**
     * Sets the value of the parentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentCategory(Integer value) {
        this.parentCategory = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.23 at 01:37:35 PM MSK 
//


package com.vtb.api.bookstore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="genre">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FANTASY"/>
 *     &lt;enumeration value="FICTION"/>
 *     &lt;enumeration value="DETECTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genre")
@XmlEnum
public enum Genre {

    FANTASY,
    FICTION,
    DETECTIVE;

    public String value() {
        return name();
    }

    public static Genre fromValue(String v) {
        return valueOf(v);
    }

}

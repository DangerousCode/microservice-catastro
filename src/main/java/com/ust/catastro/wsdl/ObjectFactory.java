//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.03 a las 11:54:50 AM CEST 
//


package com.ust.catastro.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hello.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Provincia_QNAME = new QName("http://www.catastro.meh.es/", "Provincia");
    private final static QName _Municipio_QNAME = new QName("http://www.catastro.meh.es/", "Municipio");
    private final static QName _RefCat_QNAME = new QName("http://www.catastro.meh.es/", "RefCat");
    private final static QName _TipoVia_QNAME = new QName("http://www.catastro.meh.es/", "TipoVia");
    private final static QName _NombreVia_QNAME = new QName("http://www.catastro.meh.es/", "NombreVia");
    private final static QName _NomVia_QNAME = new QName("http://www.catastro.meh.es/", "NomVia");
    private final static QName _Numero_QNAME = new QName("http://www.catastro.meh.es/", "Numero");
    private final static QName _Sigla_QNAME = new QName("http://www.catastro.meh.es/", "Sigla");
    private final static QName _Calle_QNAME = new QName("http://www.catastro.meh.es/", "Calle");
    private final static QName _Bloque_QNAME = new QName("http://www.catastro.meh.es/", "Bloque");
    private final static QName _Escalera_QNAME = new QName("http://www.catastro.meh.es/", "Escalera");
    private final static QName _Planta_QNAME = new QName("http://www.catastro.meh.es/", "Planta");
    private final static QName _Puerta_QNAME = new QName("http://www.catastro.meh.es/", "Puerta");
    private final static QName _Poligono_QNAME = new QName("http://www.catastro.meh.es/", "Poligono");
    private final static QName _Parcela_QNAME = new QName("http://www.catastro.meh.es/", "Parcela");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hello.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaDNP }
     * 
     */
    public ConsultaDNP createConsultaDNP() {
        return new ConsultaDNP();
    }

    /**
     * Create an instance of {@link Provincias }
     * 
     */
    public Provincias createProvincias() {
        return new Provincias();
    }

    /**
     * Create an instance of {@link Municipios }
     * 
     */
    public Municipios createMunicipios() {
        return new Municipios();
    }

    /**
     * Create an instance of {@link Callejero }
     * 
     */
    public Callejero createCallejero() {
        return new Callejero();
    }

    /**
     * Create an instance of {@link ConsultaDNPPP }
     * 
     */
    public ConsultaDNPPP createConsultaDNPPP() {
        return new ConsultaDNPPP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Provincia")
    public JAXBElement<String> createProvincia(String value) {
        return new JAXBElement<String>(_Provincia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Municipio")
    public JAXBElement<String> createMunicipio(String value) {
        return new JAXBElement<String>(_Municipio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "RefCat")
    public JAXBElement<String> createRefCat(String value) {
        return new JAXBElement<String>(_RefCat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "TipoVia")
    public JAXBElement<String> createTipoVia(String value) {
        return new JAXBElement<String>(_TipoVia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "NombreVia")
    public JAXBElement<String> createNombreVia(String value) {
        return new JAXBElement<String>(_NombreVia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "NomVia")
    public JAXBElement<String> createNomVia(String value) {
        return new JAXBElement<String>(_NomVia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Numero")
    public JAXBElement<String> createNumero(String value) {
        return new JAXBElement<String>(_Numero_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Sigla")
    public JAXBElement<String> createSigla(String value) {
        return new JAXBElement<String>(_Sigla_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Calle")
    public JAXBElement<String> createCalle(String value) {
        return new JAXBElement<String>(_Calle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Bloque")
    public JAXBElement<String> createBloque(String value) {
        return new JAXBElement<String>(_Bloque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Escalera")
    public JAXBElement<String> createEscalera(String value) {
        return new JAXBElement<String>(_Escalera_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Planta")
    public JAXBElement<String> createPlanta(String value) {
        return new JAXBElement<String>(_Planta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Puerta")
    public JAXBElement<String> createPuerta(String value) {
        return new JAXBElement<String>(_Puerta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Poligono")
    public JAXBElement<String> createPoligono(String value) {
        return new JAXBElement<String>(_Poligono_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catastro.meh.es/", name = "Parcela")
    public JAXBElement<String> createParcela(String value) {
        return new JAXBElement<String>(_Parcela_QNAME, String.class, null, value);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.22 at 04:59:47 PM EEST 
//


package pachage.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Greenhouse_QNAME = new QName("", "greenhouse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreenhouseType }
     * 
     */
    public GreenhouseType createGreenhouseType() {
        return new GreenhouseType();
    }

    /**
     * Create an instance of {@link MediumSizeType }
     * 
     */
    public MediumSizeType createMediumSizeType() {
        return new MediumSizeType();
    }

    /**
     * Create an instance of {@link TemperatureType }
     * 
     */
    public TemperatureType createTemperatureType() {
        return new TemperatureType();
    }

    /**
     * Create an instance of {@link VisualParametersType }
     * 
     */
    public VisualParametersType createVisualParametersType() {
        return new VisualParametersType();
    }

    /**
     * Create an instance of {@link WateringType }
     * 
     */
    public WateringType createWateringType() {
        return new WateringType();
    }

    /**
     * Create an instance of {@link PlantType }
     * 
     */
    public PlantType createPlantType() {
        return new PlantType();
    }

    /**
     * Create an instance of {@link GrowingTipsType }
     * 
     */
    public GrowingTipsType createGrowingTipsType() {
        return new GrowingTipsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreenhouseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "greenhouse")
    public JAXBElement<GreenhouseType> createGreenhouse(GreenhouseType value) {
        return new JAXBElement<GreenhouseType>(_Greenhouse_QNAME, GreenhouseType.class, null, value);
    }

}

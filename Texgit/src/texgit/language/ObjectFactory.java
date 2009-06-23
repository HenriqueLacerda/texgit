//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.03 at 12:27:56 AM GMT-03:00 
//

package texgit.language;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the texgit.language package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Texgit_QNAME = new QName(
			"http://gilmatryx.googlepages.com/Texgit", "Texgit");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: texgit.language
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link MetaField }
	 * 
	 */
	public MetaField createMetaField() {
		return new MetaField();
	}

	/**
	 * Create an instance of {@link MetaFlatFile }
	 * 
	 */
	public MetaFlatFile createMetaFlatFile() {
		return new MetaFlatFile();
	}

	/**
	 * Create an instance of {@link MetaOrderedField }
	 * 
	 */
	public MetaOrderedField createMetaOrderedField() {
		return new MetaOrderedField();
	}

	/**
	 * Create an instance of {@link MetaRecord }
	 * 
	 */
	public MetaRecord createMetaRecord() {
		return new MetaRecord();
	}

	/**
	 * Create an instance of {@link MetaLayout }
	 * 
	 */
	public MetaLayout createMetaLayout() {
		return new MetaLayout();
	}

	/**
	 * Create an instance of {@link MetaTexgit }
	 * 
	 */
	public MetaTexgit createMetaTexgit() {
		return new MetaTexgit();
	}

	/**
	 * Create an instance of {@link MetaFormatter }
	 * 
	 */
	public MetaFormatter createMetaFormatter() {
		return new MetaFormatter();
	}

	/**
	 * Create an instance of {@link MetaGroupFields }
	 * 
	 */
	public MetaGroupFields createMetaGroupFields() {
		return new MetaGroupFields();
	}

	/**
	 * Create an instance of {@link MetaGroupRecords }
	 * 
	 */
	public MetaGroupRecords createMetaGroupRecords() {
		return new MetaGroupRecords();
	}

	/**
	 * Create an instance of {@link MetaFiller }
	 * 
	 */
	public MetaFiller createMetaFiller() {
		return new MetaFiller();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MetaTexgit }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gilmatryx.googlepages.com/Texgit", name = "Texgit")
	public JAXBElement<MetaTexgit> createTexgit(MetaTexgit value) {
		return new JAXBElement<MetaTexgit>(_Texgit_QNAME, MetaTexgit.class,
				null, value);
	}

	/**
	 * Create an instance of {@link MetaGroupFields.SequencialNumber }}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "SequencialNumber", scope = MetaGroupFields.class)
	public MetaGroupFields.SequencialNumber createMetaGroupFieldsSequencialNumber(
			MetaOrderedField value) {
		return new MetaGroupFields.SequencialNumber(value);
	}

	/**
	 * Create an instance of {@link MetaGroupFields.IdType }}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "IdType", scope = MetaGroupFields.class)
	public MetaGroupFields.IdType createMetaGroupFieldsIdType(
			MetaOrderedField value) {
		return new MetaGroupFields.IdType(value);
	}

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.03 at 12:27:56 AM GMT-03:00 
//

package texgit.language;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 
 * <p>
 * Para defini��o da posi��o.
 * </p>
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaOrderedField")
public class MetaOrderedField extends MetaField {

	@XmlAttribute(required = true)
	protected int position;

	/**
	 * Gets the value of the position property.
	 * 
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Sets the value of the position property.
	 * 
	 */
	public void setPosition(int value) {
		this.position = value;
	}

}

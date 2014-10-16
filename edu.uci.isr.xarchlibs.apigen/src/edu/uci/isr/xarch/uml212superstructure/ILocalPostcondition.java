/*
 * Copyright (c) 2000-2005 Regents of the University of California.
 * All rights reserved.
 *
 * This software was developed at the University of California, Irvine.
 *
 * Redistribution and use in source and binary forms are permitted
 * provided that the above copyright notice and this paragraph are
 * duplicated in all such forms and that any documentation,
 * advertising materials, and other materials related to such
 * distribution and use acknowledge that the software was developed
 * by the University of California, Irvine.  The name of the
 * University may not be used to endorse or promote products derived
 * from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED
 * WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */
package edu.uci.isr.xarch.uml212superstructure;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * LocalPostcondition <code>xsi:type</code> in the
 * uml212superstructure namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface ILocalPostcondition extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"uml212superstructure", "LocalPostcondition", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createAttribute("id", "instance", "Identifier", null, null),
			XArchPropertyMetadata.createElement("description", "instance", "Description", 1, 1)},
		new XArchActionMetadata[]{});

	/**
	 * Set the id attribute on this LocalPostcondition.
	 * @param id id
	 * @exception FixedValueException if the attribute has a fixed value
	 * and the value passed is not the fixed value.
	*/
	public void setId(String id);

	/**
	 * Remove the id attribute from this LocalPostcondition.
	 */
	public void clearId();

	/**
	 * Get the id attribute from this LocalPostcondition.
	 * if the attribute has a fixed value, this function will
	 * return that fixed value, even if it is not actually present
	 * in the XML document.
	 * @return id on this LocalPostcondition
	 */
	public String getId();

	/**
	 * Determine if the id attribute on this LocalPostcondition
	 * has the given value.
	 * @param id Attribute value to compare
	 * @return <code>true</code> if they match; <code>false</code>
	 * otherwise.
	 */
	public boolean hasId(String id);


	/**
	 * Set the description for this LocalPostcondition.
	 * @param value new description
	 */
	public void setDescription(edu.uci.isr.xarch.instance.IDescription value);

	/**
	 * Clear the description from this LocalPostcondition.
	 */
	public void clearDescription();

	/**
	 * Get the description from this LocalPostcondition.
	 * @return description
	 */
	public edu.uci.isr.xarch.instance.IDescription getDescription();

	/**
	 * Determine if this LocalPostcondition has the given description
	 * @param descriptionToCheck description to compare
	 * @return <code>true</code> if the descriptions are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasDescription(edu.uci.isr.xarch.instance.IDescription descriptionToCheck);
	/**
	 * Determine if another LocalPostcondition has the same
	 * id as this one.
	 * @param LocalPostconditionToCheck LocalPostcondition to compare with this
	 * one.
	 */
	public boolean isEqual(ILocalPostcondition LocalPostconditionToCheck);
	/**
	 * Determine if another LocalPostcondition is equivalent to this one, ignoring
	 * ID's.
	 * @param LocalPostconditionToCheck LocalPostcondition to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * LocalPostcondition are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(ILocalPostcondition LocalPostconditionToCheck);

}

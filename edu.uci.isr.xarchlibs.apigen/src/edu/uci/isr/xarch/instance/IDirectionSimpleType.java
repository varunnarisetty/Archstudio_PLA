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
package edu.uci.isr.xarch.instance;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * DirectionSimpleType <code>xsi:type</code> in the
 * instance namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IDirectionSimpleType extends edu.uci.isr.xarch.IXArchElement{
	/** Enumeration value for 'none' */
	public static final String ENUM_NONE = "none";
	/** Enumeration value for 'in' */
	public static final String ENUM_IN = "in";
	/** Enumeration value for 'out' */
	public static final String ENUM_OUT = "out";
	/** Enumeration value for 'inout' */
	public static final String ENUM_INOUT = "inout";

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"instance", "DirectionSimpleType", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createAttribute("value", "http://www.w3.org/2001/XMLSchema", "string", null, new String[]{ENUM_NONE, ENUM_IN, ENUM_OUT, ENUM_INOUT})},
		new XArchActionMetadata[]{});

	/** 
	 * Set the value for this DirectionSimpleType.
	 * @param value Value to set.
	 */
	public void setValue(String value);

	/** 
	 * Remove the value for this DirectionSimpleType.
	 */
	public void clearValue();

	/**
	 * Get the value for this DirectionSimpleType.
	 * @return value
	 */
	public String getValue();

	/**
	 * Determine if this DirectionSimpleType has the
	 * given value.  Matching is done by string
	 * equality.
	 * @return <code>true</code> if they match,
	 * <code>false</code> otherwise.
	 */
	public boolean hasValue(String value);

	/**
	 * Determine if another DirectionSimpleType is
	 * equivalent to this one.
	 * @param DirectionSimpleTypeToCompare DirectionSimpleType to compare against
	 * this one.
	 * @return <code>true</code> if their values are equivalent,
	 * <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IDirectionSimpleType DirectionSimpleTypeToCompare);


}

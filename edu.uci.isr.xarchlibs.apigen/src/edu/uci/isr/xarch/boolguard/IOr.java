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
package edu.uci.isr.xarch.boolguard;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * Or <code>xsi:type</code> in the
 * boolguard namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IOr extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"boolguard", "Or", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createElement("booleanExp1", "boolguard", "BooleanExp", 1, 1),
			XArchPropertyMetadata.createElement("booleanExp2", "boolguard", "BooleanExp", 1, 1)},
		new XArchActionMetadata[]{});

	/**
	 * Set the booleanExp1 for this Or.
	 * @param value new booleanExp1
	 */
	public void setBooleanExp1(IBooleanExp value);

	/**
	 * Clear the booleanExp1 from this Or.
	 */
	public void clearBooleanExp1();

	/**
	 * Get the booleanExp1 from this Or.
	 * @return booleanExp1
	 */
	public IBooleanExp getBooleanExp1();

	/**
	 * Determine if this Or has the given booleanExp1
	 * @param booleanExp1ToCheck booleanExp1 to compare
	 * @return <code>true</code> if the booleanExp1s are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasBooleanExp1(IBooleanExp booleanExp1ToCheck);

	/**
	 * Set the booleanExp2 for this Or.
	 * @param value new booleanExp2
	 */
	public void setBooleanExp2(IBooleanExp value);

	/**
	 * Clear the booleanExp2 from this Or.
	 */
	public void clearBooleanExp2();

	/**
	 * Get the booleanExp2 from this Or.
	 * @return booleanExp2
	 */
	public IBooleanExp getBooleanExp2();

	/**
	 * Determine if this Or has the given booleanExp2
	 * @param booleanExp2ToCheck booleanExp2 to compare
	 * @return <code>true</code> if the booleanExp2s are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasBooleanExp2(IBooleanExp booleanExp2ToCheck);
	/**
	 * Determine if another Or is equivalent to this one, ignoring
	 * ID's.
	 * @param OrToCheck Or to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * Or are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IOr OrToCheck);

}
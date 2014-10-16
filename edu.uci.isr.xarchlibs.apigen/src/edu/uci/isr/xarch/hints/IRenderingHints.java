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
package edu.uci.isr.xarch.hints;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * RenderingHints <code>xsi:type</code> in the
 * hints namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IRenderingHints extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"hints", "RenderingHints", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createElement("hints", "hints", "Hints", 0, XArchPropertyMetadata.UNBOUNDED)},
		new XArchActionMetadata[]{});

	/**
	 * Add a hints to this RenderingHints.
	 * @param newHints hints to add.
	 */
	public void addHints(IHints newHints);

	/**
	 * Add a collection of hintss to this RenderingHints.
	 * @param hintss hintss to add.
	 */
	public void addHintss(Collection hintss);

	/**
	 * Remove all hintss from this RenderingHints.
	 */
	public void clearHintss();

	/**
	 * Remove the given hints from this RenderingHints.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param hintsToRemove hints to remove.
	 */
	public void removeHints(IHints hintsToRemove);

	/**
	 * Remove all the given hintss from this RenderingHints.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param hintss hints to remove.
	 */
	public void removeHintss(Collection hintss);

	/**
	 * Get all the hintss from this RenderingHints.
	 * @return all hintss in this RenderingHints.
	 */
	public Collection getAllHintss();

	/**
	 * Determine if this RenderingHints contains a given hints.
	 * @return <code>true</code> if this RenderingHints contains the given
	 * hintsToCheck, <code>false</code> otherwise.
	 */
	public boolean hasHints(IHints hintsToCheck);

	/**
	 * Determine if this RenderingHints contains the given set of hintss.
	 * @param hintssToCheck hintss to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>hintss</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasHintss(Collection hintssToCheck);

	/**
	 * Determine if this RenderingHints contains each element in the 
	 * given set of hintss.
	 * @param hintssToCheck hintss to check for.
	 * @return <code>true</code> if every element in
	 * <code>hintss</code> is found in this RenderingHints,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllHintss(Collection hintssToCheck);

	/**
	 * Determine if another RenderingHints is equivalent to this one, ignoring
	 * ID's.
	 * @param RenderingHintsToCheck RenderingHints to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * RenderingHints are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IRenderingHints RenderingHintsToCheck);

}
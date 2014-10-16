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
package edu.uci.isr.xarch.changes;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * Changes <code>xsi:type</code> in the
 * changes namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IChanges extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"changes", "Changes", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createAttribute("id", "instance", "Identifier", null, null),
			XArchPropertyMetadata.createAttribute("status", "changes", "Status", null, null),
			XArchPropertyMetadata.createElement("description", "instance", "Description", 1, 1),
			XArchPropertyMetadata.createElement("componentChange", "changes", "ComponentChange", 0, XArchPropertyMetadata.UNBOUNDED),
			XArchPropertyMetadata.createElement("linkChange", "changes", "LinkChange", 0, XArchPropertyMetadata.UNBOUNDED),
			XArchPropertyMetadata.createElement("interactionChange", "changes", "InteractionChange", 0, XArchPropertyMetadata.UNBOUNDED),
			XArchPropertyMetadata.createElement("statechartChange", "changes", "StatechartChange", 0, XArchPropertyMetadata.UNBOUNDED)},
		new XArchActionMetadata[]{});

	/**
	 * Set the id attribute on this Changes.
	 * @param id id
	 * @exception FixedValueException if the attribute has a fixed value
	 * and the value passed is not the fixed value.
	*/
	public void setId(String id);

	/**
	 * Remove the id attribute from this Changes.
	 */
	public void clearId();

	/**
	 * Get the id attribute from this Changes.
	 * if the attribute has a fixed value, this function will
	 * return that fixed value, even if it is not actually present
	 * in the XML document.
	 * @return id on this Changes
	 */
	public String getId();

	/**
	 * Determine if the id attribute on this Changes
	 * has the given value.
	 * @param id Attribute value to compare
	 * @return <code>true</code> if they match; <code>false</code>
	 * otherwise.
	 */
	public boolean hasId(String id);


	/**
	 * Set the status attribute on this Changes.
	 * @param status status
	 * @exception FixedValueException if the attribute has a fixed value
	 * and the value passed is not the fixed value.
	*/
	public void setStatus(String status);

	/**
	 * Remove the status attribute from this Changes.
	 */
	public void clearStatus();

	/**
	 * Get the status attribute from this Changes.
	 * if the attribute has a fixed value, this function will
	 * return that fixed value, even if it is not actually present
	 * in the XML document.
	 * @return status on this Changes
	 */
	public String getStatus();

	/**
	 * Determine if the status attribute on this Changes
	 * has the given value.
	 * @param status Attribute value to compare
	 * @return <code>true</code> if they match; <code>false</code>
	 * otherwise.
	 */
	public boolean hasStatus(String status);


	/**
	 * Set the description for this Changes.
	 * @param value new description
	 */
	public void setDescription(edu.uci.isr.xarch.instance.IDescription value);

	/**
	 * Clear the description from this Changes.
	 */
	public void clearDescription();

	/**
	 * Get the description from this Changes.
	 * @return description
	 */
	public edu.uci.isr.xarch.instance.IDescription getDescription();

	/**
	 * Determine if this Changes has the given description
	 * @param descriptionToCheck description to compare
	 * @return <code>true</code> if the descriptions are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasDescription(edu.uci.isr.xarch.instance.IDescription descriptionToCheck);

	/**
	 * Add a componentChange to this Changes.
	 * @param newComponentChange componentChange to add.
	 */
	public void addComponentChange(IComponentChange newComponentChange);

	/**
	 * Add a collection of componentChanges to this Changes.
	 * @param componentChanges componentChanges to add.
	 */
	public void addComponentChanges(Collection componentChanges);

	/**
	 * Remove all componentChanges from this Changes.
	 */
	public void clearComponentChanges();

	/**
	 * Remove the given componentChange from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param componentChangeToRemove componentChange to remove.
	 */
	public void removeComponentChange(IComponentChange componentChangeToRemove);

	/**
	 * Remove all the given componentChanges from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param componentChanges componentChange to remove.
	 */
	public void removeComponentChanges(Collection componentChanges);

	/**
	 * Get all the componentChanges from this Changes.
	 * @return all componentChanges in this Changes.
	 */
	public Collection getAllComponentChanges();

	/**
	 * Determine if this Changes contains a given componentChange.
	 * @return <code>true</code> if this Changes contains the given
	 * componentChangeToCheck, <code>false</code> otherwise.
	 */
	public boolean hasComponentChange(IComponentChange componentChangeToCheck);

	/**
	 * Determine if this Changes contains the given set of componentChanges.
	 * @param componentChangesToCheck componentChanges to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>componentChanges</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasComponentChanges(Collection componentChangesToCheck);

	/**
	 * Determine if this Changes contains each element in the 
	 * given set of componentChanges.
	 * @param componentChangesToCheck componentChanges to check for.
	 * @return <code>true</code> if every element in
	 * <code>componentChanges</code> is found in this Changes,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllComponentChanges(Collection componentChangesToCheck);

	/**
	 * Gets the componentChange from this Changes with the given
	 * id.
	 * @param id ID to look for.
	 * @return componentChange with the given ID, or <code>null</code> if not found.
	 */
	public IComponentChange getComponentChange(String id);

	/**
	 * Gets the componentChanges from this Changes with the given
	 * ids.
	 * @param ids ID to look for.
	 * @return componentChanges with the given IDs.  If an element with a given
	 * ID was not found, that ID is ignored.
	 */
	public Collection getComponentChanges(Collection ids);


	/**
	 * Add a linkChange to this Changes.
	 * @param newLinkChange linkChange to add.
	 */
	public void addLinkChange(ILinkChange newLinkChange);

	/**
	 * Add a collection of linkChanges to this Changes.
	 * @param linkChanges linkChanges to add.
	 */
	public void addLinkChanges(Collection linkChanges);

	/**
	 * Remove all linkChanges from this Changes.
	 */
	public void clearLinkChanges();

	/**
	 * Remove the given linkChange from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param linkChangeToRemove linkChange to remove.
	 */
	public void removeLinkChange(ILinkChange linkChangeToRemove);

	/**
	 * Remove all the given linkChanges from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param linkChanges linkChange to remove.
	 */
	public void removeLinkChanges(Collection linkChanges);

	/**
	 * Get all the linkChanges from this Changes.
	 * @return all linkChanges in this Changes.
	 */
	public Collection getAllLinkChanges();

	/**
	 * Determine if this Changes contains a given linkChange.
	 * @return <code>true</code> if this Changes contains the given
	 * linkChangeToCheck, <code>false</code> otherwise.
	 */
	public boolean hasLinkChange(ILinkChange linkChangeToCheck);

	/**
	 * Determine if this Changes contains the given set of linkChanges.
	 * @param linkChangesToCheck linkChanges to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>linkChanges</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasLinkChanges(Collection linkChangesToCheck);

	/**
	 * Determine if this Changes contains each element in the 
	 * given set of linkChanges.
	 * @param linkChangesToCheck linkChanges to check for.
	 * @return <code>true</code> if every element in
	 * <code>linkChanges</code> is found in this Changes,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllLinkChanges(Collection linkChangesToCheck);

	/**
	 * Gets the linkChange from this Changes with the given
	 * id.
	 * @param id ID to look for.
	 * @return linkChange with the given ID, or <code>null</code> if not found.
	 */
	public ILinkChange getLinkChange(String id);

	/**
	 * Gets the linkChanges from this Changes with the given
	 * ids.
	 * @param ids ID to look for.
	 * @return linkChanges with the given IDs.  If an element with a given
	 * ID was not found, that ID is ignored.
	 */
	public Collection getLinkChanges(Collection ids);


	/**
	 * Add a interactionChange to this Changes.
	 * @param newInteractionChange interactionChange to add.
	 */
	public void addInteractionChange(IInteractionChange newInteractionChange);

	/**
	 * Add a collection of interactionChanges to this Changes.
	 * @param interactionChanges interactionChanges to add.
	 */
	public void addInteractionChanges(Collection interactionChanges);

	/**
	 * Remove all interactionChanges from this Changes.
	 */
	public void clearInteractionChanges();

	/**
	 * Remove the given interactionChange from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param interactionChangeToRemove interactionChange to remove.
	 */
	public void removeInteractionChange(IInteractionChange interactionChangeToRemove);

	/**
	 * Remove all the given interactionChanges from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param interactionChanges interactionChange to remove.
	 */
	public void removeInteractionChanges(Collection interactionChanges);

	/**
	 * Get all the interactionChanges from this Changes.
	 * @return all interactionChanges in this Changes.
	 */
	public Collection getAllInteractionChanges();

	/**
	 * Determine if this Changes contains a given interactionChange.
	 * @return <code>true</code> if this Changes contains the given
	 * interactionChangeToCheck, <code>false</code> otherwise.
	 */
	public boolean hasInteractionChange(IInteractionChange interactionChangeToCheck);

	/**
	 * Determine if this Changes contains the given set of interactionChanges.
	 * @param interactionChangesToCheck interactionChanges to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>interactionChanges</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasInteractionChanges(Collection interactionChangesToCheck);

	/**
	 * Determine if this Changes contains each element in the 
	 * given set of interactionChanges.
	 * @param interactionChangesToCheck interactionChanges to check for.
	 * @return <code>true</code> if every element in
	 * <code>interactionChanges</code> is found in this Changes,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllInteractionChanges(Collection interactionChangesToCheck);

	/**
	 * Gets the interactionChange from this Changes with the given
	 * id.
	 * @param id ID to look for.
	 * @return interactionChange with the given ID, or <code>null</code> if not found.
	 */
	public IInteractionChange getInteractionChange(String id);

	/**
	 * Gets the interactionChanges from this Changes with the given
	 * ids.
	 * @param ids ID to look for.
	 * @return interactionChanges with the given IDs.  If an element with a given
	 * ID was not found, that ID is ignored.
	 */
	public Collection getInteractionChanges(Collection ids);


	/**
	 * Add a statechartChange to this Changes.
	 * @param newStatechartChange statechartChange to add.
	 */
	public void addStatechartChange(IStatechartChange newStatechartChange);

	/**
	 * Add a collection of statechartChanges to this Changes.
	 * @param statechartChanges statechartChanges to add.
	 */
	public void addStatechartChanges(Collection statechartChanges);

	/**
	 * Remove all statechartChanges from this Changes.
	 */
	public void clearStatechartChanges();

	/**
	 * Remove the given statechartChange from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param statechartChangeToRemove statechartChange to remove.
	 */
	public void removeStatechartChange(IStatechartChange statechartChangeToRemove);

	/**
	 * Remove all the given statechartChanges from this Changes.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param statechartChanges statechartChange to remove.
	 */
	public void removeStatechartChanges(Collection statechartChanges);

	/**
	 * Get all the statechartChanges from this Changes.
	 * @return all statechartChanges in this Changes.
	 */
	public Collection getAllStatechartChanges();

	/**
	 * Determine if this Changes contains a given statechartChange.
	 * @return <code>true</code> if this Changes contains the given
	 * statechartChangeToCheck, <code>false</code> otherwise.
	 */
	public boolean hasStatechartChange(IStatechartChange statechartChangeToCheck);

	/**
	 * Determine if this Changes contains the given set of statechartChanges.
	 * @param statechartChangesToCheck statechartChanges to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>statechartChanges</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasStatechartChanges(Collection statechartChangesToCheck);

	/**
	 * Determine if this Changes contains each element in the 
	 * given set of statechartChanges.
	 * @param statechartChangesToCheck statechartChanges to check for.
	 * @return <code>true</code> if every element in
	 * <code>statechartChanges</code> is found in this Changes,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllStatechartChanges(Collection statechartChangesToCheck);

	/**
	 * Gets the statechartChange from this Changes with the given
	 * id.
	 * @param id ID to look for.
	 * @return statechartChange with the given ID, or <code>null</code> if not found.
	 */
	public IStatechartChange getStatechartChange(String id);

	/**
	 * Gets the statechartChanges from this Changes with the given
	 * ids.
	 * @param ids ID to look for.
	 * @return statechartChanges with the given IDs.  If an element with a given
	 * ID was not found, that ID is ignored.
	 */
	public Collection getStatechartChanges(Collection ids);

	/**
	 * Determine if another Changes has the same
	 * id as this one.
	 * @param ChangesToCheck Changes to compare with this
	 * one.
	 */
	public boolean isEqual(IChanges ChangesToCheck);
	/**
	 * Determine if another Changes is equivalent to this one, ignoring
	 * ID's.
	 * @param ChangesToCheck Changes to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * Changes are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IChanges ChangesToCheck);

}

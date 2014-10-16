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
package edu.uci.isr.xarch.changesets;

import org.w3c.dom.*;

import edu.uci.isr.xarch.*;

import java.util.*;

/**
 * DOM-Based implementation of the IOrRelationship interface.
 *
 * @author Automatically generated by xArch apigen.
 */
public class OrRelationshipImpl extends RelationshipImpl implements
IOrRelationship, IRelationship, DOMBased{
	
	public static final String XSD_TYPE_NSURI = ChangesetsConstants.NS_URI;
	public static final String XSD_TYPE_NAME = "OrRelationship";

	/** Tag name for orChangeSets in this object. */
	public static final String OR_CHANGE_SET_ELT_NAME = "orChangeSet";
	/** Tag name for orNotChangeSets in this object. */
	public static final String OR_NOT_CHANGE_SET_ELT_NAME = "orNotChangeSet";
	/** Tag name for impliesChangeSets in this object. */
	public static final String IMPLIES_CHANGE_SET_ELT_NAME = "impliesChangeSet";
	/** Tag name for impliesNotChangeSets in this object. */
	public static final String IMPLIES_NOT_CHANGE_SET_ELT_NAME = "impliesNotChangeSet";
	/** Tag name for andChangeSets in this object. */
	public static final String AND_CHANGE_SET_ELT_NAME = "andChangeSet";
	/** Tag name for andNotChangeSets in this object. */
	public static final String AND_NOT_CHANGE_SET_ELT_NAME = "andNotChangeSet";

	
	private static SequenceOrder seqOrderAppend = new SequenceOrder(
		new QName[]{
			new QName(ChangesetsConstants.NS_URI, OR_CHANGE_SET_ELT_NAME),
			new QName(ChangesetsConstants.NS_URI, OR_NOT_CHANGE_SET_ELT_NAME),
			new QName(ChangesetsConstants.NS_URI, IMPLIES_CHANGE_SET_ELT_NAME),
			new QName(ChangesetsConstants.NS_URI, IMPLIES_NOT_CHANGE_SET_ELT_NAME),
			new QName(ChangesetsConstants.NS_URI, AND_CHANGE_SET_ELT_NAME),
			new QName(ChangesetsConstants.NS_URI, AND_NOT_CHANGE_SET_ELT_NAME)
		}
	);
	
	public OrRelationshipImpl(Element elt){
		super(elt);
	}
	
	protected static SequenceOrder getSequenceOrder(){
		return new SequenceOrder(RelationshipImpl.getSequenceOrder(), seqOrderAppend);
	}

	public IXArchElement cloneElement(int depth){
		synchronized(DOMUtils.getDOMLock(elt)){
			Document doc = elt.getOwnerDocument();
			if(depth == 0){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				OrRelationshipImpl cloneImpl = new OrRelationshipImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
			else if(depth == 1){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				OrRelationshipImpl cloneImpl = new OrRelationshipImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				
				NodeList nl = elt.getChildNodes();
				int size = nl.getLength();
				for(int i = 0; i < size; i++){
					Node n = nl.item(i);
					Node cloneNode = (Node)n.cloneNode(false);
					cloneNode = doc.importNode(cloneNode, true);
					cloneElt.appendChild(cloneNode);
				}
				return cloneImpl;
			}
			else /* depth = infinity */{
				Element cloneElt = (Element)elt.cloneNode(true);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				OrRelationshipImpl cloneImpl = new OrRelationshipImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
		}
	}

	/**
	 * For internal use only.
	 */
	private static Object makeDerivedWrapper(Element elt, String baseTypeName){
		synchronized(DOMUtils.getDOMLock(elt)){
			QName typeName = XArchUtils.getXSIType(elt);
			if(typeName == null){
				return null;
			}
			else{
				if(!DOMUtils.hasXSIType(elt, "http://www.ics.uci.edu/pub/arch/xArch/changesets.xsd", baseTypeName)){
					try{
						String packageTitle = XArchUtils.getPackageTitle(typeName.getNamespaceURI());
						String packageName = XArchUtils.getPackageName(packageTitle);
						String implName = XArchUtils.getImplName(packageName, typeName.getName());
						Class c = Class.forName(implName);
						java.lang.reflect.Constructor con = c.getConstructor(new Class[]{Element.class});
						Object o = con.newInstance(new Object[]{elt});
						return o;
					}
					catch(Exception e){
						//Lots of bad things could happen, but this
						//is OK, because this is best-effort anyway.
					}
				}
				return null;
			}
		}
	}

	public XArchTypeMetadata getTypeMetadata(){
		return IOrRelationship.TYPE_METADATA;
	}

	public XArchInstanceMetadata getInstanceMetadata(){
		return new XArchInstanceMetadata(XArchUtils.getPackageTitle(elt.getNamespaceURI()));
	}
	public void addOrChangeSet(edu.uci.isr.xarch.instance.IXMLLink newOrChangeSet){
		if(!(newOrChangeSet instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newOrChangeSet).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, ChangesetsConstants.NS_URI, OR_CHANGE_SET_ELT_NAME);
		((DOMBased)newOrChangeSet).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"orChangeSet", newOrChangeSet,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addOrChangeSets(Collection orChangeSets){
		for(Iterator en = orChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			addOrChangeSet(elt);
		}
	}		
		
	public void clearOrChangeSets(){
		//DOMUtils.removeChildren(elt, ChangesetsConstants.NS_URI, OR_CHANGE_SET_ELT_NAME);
		Collection coll = getAllOrChangeSets();
		removeOrChangeSets(coll);
	}
	
	public void removeOrChangeSet(edu.uci.isr.xarch.instance.IXMLLink orChangeSetToRemove){
		if(!(orChangeSetToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, OR_CHANGE_SET_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)orChangeSetToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"orChangeSet", orChangeSetToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeOrChangeSets(Collection orChangeSets){
		for(Iterator en = orChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			removeOrChangeSet(elt);
		}
	}
	
	public Collection getAllOrChangeSets(){
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, OR_CHANGE_SET_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IXMLLink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "XMLLink");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IXMLLink)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasOrChangeSet(edu.uci.isr.xarch.instance.IXMLLink orChangeSetToCheck){
		Collection c = getAllOrChangeSets();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(elt.isEquivalent(orChangeSetToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasOrChangeSets(Collection orChangeSetsToCheck){
		Vector v = new Vector();
		for(Iterator en = orChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			v.addElement(new Boolean(hasOrChangeSet(elt)));
		}
		return v;
	}
		
	public boolean hasAllOrChangeSets(Collection orChangeSetsToCheck){
		for(Iterator en = orChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(!hasOrChangeSet(elt)){
				return false;
			}
		}
		return true;
	}
	public void addOrNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink newOrNotChangeSet){
		if(!(newOrNotChangeSet instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newOrNotChangeSet).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, ChangesetsConstants.NS_URI, OR_NOT_CHANGE_SET_ELT_NAME);
		((DOMBased)newOrNotChangeSet).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"orNotChangeSet", newOrNotChangeSet,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addOrNotChangeSets(Collection orNotChangeSets){
		for(Iterator en = orNotChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			addOrNotChangeSet(elt);
		}
	}		
		
	public void clearOrNotChangeSets(){
		//DOMUtils.removeChildren(elt, ChangesetsConstants.NS_URI, OR_NOT_CHANGE_SET_ELT_NAME);
		Collection coll = getAllOrNotChangeSets();
		removeOrNotChangeSets(coll);
	}
	
	public void removeOrNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink orNotChangeSetToRemove){
		if(!(orNotChangeSetToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, OR_NOT_CHANGE_SET_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)orNotChangeSetToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"orNotChangeSet", orNotChangeSetToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeOrNotChangeSets(Collection orNotChangeSets){
		for(Iterator en = orNotChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			removeOrNotChangeSet(elt);
		}
	}
	
	public Collection getAllOrNotChangeSets(){
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, OR_NOT_CHANGE_SET_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IXMLLink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "XMLLink");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IXMLLink)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasOrNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink orNotChangeSetToCheck){
		Collection c = getAllOrNotChangeSets();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(elt.isEquivalent(orNotChangeSetToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasOrNotChangeSets(Collection orNotChangeSetsToCheck){
		Vector v = new Vector();
		for(Iterator en = orNotChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			v.addElement(new Boolean(hasOrNotChangeSet(elt)));
		}
		return v;
	}
		
	public boolean hasAllOrNotChangeSets(Collection orNotChangeSetsToCheck){
		for(Iterator en = orNotChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(!hasOrNotChangeSet(elt)){
				return false;
			}
		}
		return true;
	}
	public void addImpliesChangeSet(edu.uci.isr.xarch.instance.IXMLLink newImpliesChangeSet){
		if(!(newImpliesChangeSet instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newImpliesChangeSet).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, ChangesetsConstants.NS_URI, IMPLIES_CHANGE_SET_ELT_NAME);
		((DOMBased)newImpliesChangeSet).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"impliesChangeSet", newImpliesChangeSet,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addImpliesChangeSets(Collection impliesChangeSets){
		for(Iterator en = impliesChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			addImpliesChangeSet(elt);
		}
	}		
		
	public void clearImpliesChangeSets(){
		//DOMUtils.removeChildren(elt, ChangesetsConstants.NS_URI, IMPLIES_CHANGE_SET_ELT_NAME);
		Collection coll = getAllImpliesChangeSets();
		removeImpliesChangeSets(coll);
	}
	
	public void removeImpliesChangeSet(edu.uci.isr.xarch.instance.IXMLLink impliesChangeSetToRemove){
		if(!(impliesChangeSetToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, IMPLIES_CHANGE_SET_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)impliesChangeSetToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"impliesChangeSet", impliesChangeSetToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeImpliesChangeSets(Collection impliesChangeSets){
		for(Iterator en = impliesChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			removeImpliesChangeSet(elt);
		}
	}
	
	public Collection getAllImpliesChangeSets(){
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, IMPLIES_CHANGE_SET_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IXMLLink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "XMLLink");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IXMLLink)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasImpliesChangeSet(edu.uci.isr.xarch.instance.IXMLLink impliesChangeSetToCheck){
		Collection c = getAllImpliesChangeSets();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(elt.isEquivalent(impliesChangeSetToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasImpliesChangeSets(Collection impliesChangeSetsToCheck){
		Vector v = new Vector();
		for(Iterator en = impliesChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			v.addElement(new Boolean(hasImpliesChangeSet(elt)));
		}
		return v;
	}
		
	public boolean hasAllImpliesChangeSets(Collection impliesChangeSetsToCheck){
		for(Iterator en = impliesChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(!hasImpliesChangeSet(elt)){
				return false;
			}
		}
		return true;
	}
	public void addImpliesNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink newImpliesNotChangeSet){
		if(!(newImpliesNotChangeSet instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newImpliesNotChangeSet).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, ChangesetsConstants.NS_URI, IMPLIES_NOT_CHANGE_SET_ELT_NAME);
		((DOMBased)newImpliesNotChangeSet).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"impliesNotChangeSet", newImpliesNotChangeSet,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addImpliesNotChangeSets(Collection impliesNotChangeSets){
		for(Iterator en = impliesNotChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			addImpliesNotChangeSet(elt);
		}
	}		
		
	public void clearImpliesNotChangeSets(){
		//DOMUtils.removeChildren(elt, ChangesetsConstants.NS_URI, IMPLIES_NOT_CHANGE_SET_ELT_NAME);
		Collection coll = getAllImpliesNotChangeSets();
		removeImpliesNotChangeSets(coll);
	}
	
	public void removeImpliesNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink impliesNotChangeSetToRemove){
		if(!(impliesNotChangeSetToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, IMPLIES_NOT_CHANGE_SET_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)impliesNotChangeSetToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"impliesNotChangeSet", impliesNotChangeSetToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeImpliesNotChangeSets(Collection impliesNotChangeSets){
		for(Iterator en = impliesNotChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			removeImpliesNotChangeSet(elt);
		}
	}
	
	public Collection getAllImpliesNotChangeSets(){
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, IMPLIES_NOT_CHANGE_SET_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IXMLLink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "XMLLink");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IXMLLink)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasImpliesNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink impliesNotChangeSetToCheck){
		Collection c = getAllImpliesNotChangeSets();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(elt.isEquivalent(impliesNotChangeSetToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasImpliesNotChangeSets(Collection impliesNotChangeSetsToCheck){
		Vector v = new Vector();
		for(Iterator en = impliesNotChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			v.addElement(new Boolean(hasImpliesNotChangeSet(elt)));
		}
		return v;
	}
		
	public boolean hasAllImpliesNotChangeSets(Collection impliesNotChangeSetsToCheck){
		for(Iterator en = impliesNotChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(!hasImpliesNotChangeSet(elt)){
				return false;
			}
		}
		return true;
	}
	public void addAndChangeSet(edu.uci.isr.xarch.instance.IXMLLink newAndChangeSet){
		if(!(newAndChangeSet instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newAndChangeSet).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, ChangesetsConstants.NS_URI, AND_CHANGE_SET_ELT_NAME);
		((DOMBased)newAndChangeSet).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"andChangeSet", newAndChangeSet,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addAndChangeSets(Collection andChangeSets){
		for(Iterator en = andChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			addAndChangeSet(elt);
		}
	}		
		
	public void clearAndChangeSets(){
		//DOMUtils.removeChildren(elt, ChangesetsConstants.NS_URI, AND_CHANGE_SET_ELT_NAME);
		Collection coll = getAllAndChangeSets();
		removeAndChangeSets(coll);
	}
	
	public void removeAndChangeSet(edu.uci.isr.xarch.instance.IXMLLink andChangeSetToRemove){
		if(!(andChangeSetToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, AND_CHANGE_SET_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)andChangeSetToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"andChangeSet", andChangeSetToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeAndChangeSets(Collection andChangeSets){
		for(Iterator en = andChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			removeAndChangeSet(elt);
		}
	}
	
	public Collection getAllAndChangeSets(){
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, AND_CHANGE_SET_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IXMLLink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "XMLLink");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IXMLLink)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasAndChangeSet(edu.uci.isr.xarch.instance.IXMLLink andChangeSetToCheck){
		Collection c = getAllAndChangeSets();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(elt.isEquivalent(andChangeSetToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasAndChangeSets(Collection andChangeSetsToCheck){
		Vector v = new Vector();
		for(Iterator en = andChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			v.addElement(new Boolean(hasAndChangeSet(elt)));
		}
		return v;
	}
		
	public boolean hasAllAndChangeSets(Collection andChangeSetsToCheck){
		for(Iterator en = andChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(!hasAndChangeSet(elt)){
				return false;
			}
		}
		return true;
	}
	public void addAndNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink newAndNotChangeSet){
		if(!(newAndNotChangeSet instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newAndNotChangeSet).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, ChangesetsConstants.NS_URI, AND_NOT_CHANGE_SET_ELT_NAME);
		((DOMBased)newAndNotChangeSet).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"andNotChangeSet", newAndNotChangeSet,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addAndNotChangeSets(Collection andNotChangeSets){
		for(Iterator en = andNotChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			addAndNotChangeSet(elt);
		}
	}		
		
	public void clearAndNotChangeSets(){
		//DOMUtils.removeChildren(elt, ChangesetsConstants.NS_URI, AND_NOT_CHANGE_SET_ELT_NAME);
		Collection coll = getAllAndNotChangeSets();
		removeAndNotChangeSets(coll);
	}
	
	public void removeAndNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink andNotChangeSetToRemove){
		if(!(andNotChangeSetToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, AND_NOT_CHANGE_SET_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)andNotChangeSetToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"andNotChangeSet", andNotChangeSetToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeAndNotChangeSets(Collection andNotChangeSets){
		for(Iterator en = andNotChangeSets.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			removeAndNotChangeSet(elt);
		}
	}
	
	public Collection getAllAndNotChangeSets(){
		NodeList nl = DOMUtils.getChildren(elt, ChangesetsConstants.NS_URI, AND_NOT_CHANGE_SET_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IXMLLink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "XMLLink");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IXMLLink)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.XMLLinkImpl eltImpl = new edu.uci.isr.xarch.instance.XMLLinkImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasAndNotChangeSet(edu.uci.isr.xarch.instance.IXMLLink andNotChangeSetToCheck){
		Collection c = getAllAndNotChangeSets();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(elt.isEquivalent(andNotChangeSetToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasAndNotChangeSets(Collection andNotChangeSetsToCheck){
		Vector v = new Vector();
		for(Iterator en = andNotChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			v.addElement(new Boolean(hasAndNotChangeSet(elt)));
		}
		return v;
	}
		
	public boolean hasAllAndNotChangeSets(Collection andNotChangeSetsToCheck){
		for(Iterator en = andNotChangeSetsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IXMLLink elt = (edu.uci.isr.xarch.instance.IXMLLink)en.next();
			if(!hasAndNotChangeSet(elt)){
				return false;
			}
		}
		return true;
	}
	public boolean isEquivalent(IOrRelationship c){
		return
			super.isEquivalent(c) &&
			hasAllOrChangeSets(c.getAllOrChangeSets()) &&
			c.hasAllOrChangeSets(getAllOrChangeSets()) &&
			hasAllOrNotChangeSets(c.getAllOrNotChangeSets()) &&
			c.hasAllOrNotChangeSets(getAllOrNotChangeSets()) &&
			hasAllImpliesChangeSets(c.getAllImpliesChangeSets()) &&
			c.hasAllImpliesChangeSets(getAllImpliesChangeSets()) &&
			hasAllImpliesNotChangeSets(c.getAllImpliesNotChangeSets()) &&
			c.hasAllImpliesNotChangeSets(getAllImpliesNotChangeSets()) &&
			hasAllAndChangeSets(c.getAllAndChangeSets()) &&
			c.hasAllAndChangeSets(getAllAndChangeSets()) &&
			hasAllAndNotChangeSets(c.getAllAndNotChangeSets()) &&
			c.hasAllAndNotChangeSets(getAllAndNotChangeSets()) ;
	}

}

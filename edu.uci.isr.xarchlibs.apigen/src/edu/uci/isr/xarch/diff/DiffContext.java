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
package edu.uci.isr.xarch.diff;

import java.util.*;

import edu.uci.isr.xarch.*;

import org.w3c.dom.*;

import edu.uci.isr.xarch.IXArch;
import edu.uci.isr.xarch.IXArchContext;

/**
 * The context object for the diff package.
 * This object is used to create objects that are used
 * in the diff namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public class DiffContext implements IDiffContext {

	protected static final String DEFAULT_ELT_NAME = "anonymousInstanceTag";
	protected Document doc;
	protected IXArch xArch;

	/**
	 * Create a new DiffContext for the given
	 * IXArch object.
	 * @param xArch XArch object to contextualize in this namespace.
	 */
	public DiffContext(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Node docRootNode = ((DOMBased)xArch).getDOMNode();
		synchronized(DOMUtils.getDOMLock(docRootNode)){
			this.doc = docRootNode.getOwnerDocument();
			xArch.addSchemaLocation("http://www.ics.uci.edu/pub/arch/xArch/diff.xsd", "http://www.isr.uci.edu/projects/xarchuci/ext/diff.xsd");
			this.xArch = xArch;
		}
	}

	public IXArch getXArch(){
		return xArch;
	}
	
	protected Element createElement(String name){
		synchronized(DOMUtils.getDOMLock(doc)){
			return doc.createElementNS(DiffConstants.NS_URI, name);
		}
	}

	public XArchTypeMetadata getTypeMetadata(){
		return IDiffContext.TYPE_METADATA;
	}
	/**
	 * Create an IAdd object in this namespace.
	 * @return New IAdd object.
	 */
	public IAdd createAdd(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, AddImpl.XSD_TYPE_NSURI, AddImpl.XSD_TYPE_NAME);
		AddImpl newElt = new AddImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IAdd object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IAdd recontextualizeAdd(IAdd value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.types.IComponent object in this namespace.
	 * @return New edu.uci.isr.xarch.types.IComponent object.
	 */
	public edu.uci.isr.xarch.types.IComponent createComponent(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.types.ComponentImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.types.ComponentImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.types.ComponentImpl newElt = new edu.uci.isr.xarch.types.ComponentImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.types.IComponent object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.types.IComponent recontextualizeComponent(edu.uci.isr.xarch.types.IComponent value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.types.IConnector object in this namespace.
	 * @return New edu.uci.isr.xarch.types.IConnector object.
	 */
	public edu.uci.isr.xarch.types.IConnector createConnector(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.types.ConnectorImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.types.ConnectorImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.types.ConnectorImpl newElt = new edu.uci.isr.xarch.types.ConnectorImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.types.IConnector object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.types.IConnector recontextualizeConnector(edu.uci.isr.xarch.types.IConnector value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.types.ILink object in this namespace.
	 * @return New edu.uci.isr.xarch.types.ILink object.
	 */
	public edu.uci.isr.xarch.types.ILink createLink(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.types.LinkImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.types.LinkImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.types.LinkImpl newElt = new edu.uci.isr.xarch.types.LinkImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.types.ILink object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.types.ILink recontextualizeLink(edu.uci.isr.xarch.types.ILink value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.instance.IGroup object in this namespace.
	 * @return New edu.uci.isr.xarch.instance.IGroup object.
	 */
	public edu.uci.isr.xarch.instance.IGroup createGroup(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.instance.GroupImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.instance.GroupImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.instance.GroupImpl newElt = new edu.uci.isr.xarch.instance.GroupImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.instance.IGroup object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.instance.IGroup recontextualizeGroup(edu.uci.isr.xarch.instance.IGroup value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.types.IComponentType object in this namespace.
	 * @return New edu.uci.isr.xarch.types.IComponentType object.
	 */
	public edu.uci.isr.xarch.types.IComponentType createComponentType(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.types.ComponentTypeImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.types.ComponentTypeImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.types.ComponentTypeImpl newElt = new edu.uci.isr.xarch.types.ComponentTypeImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.types.IComponentType object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.types.IComponentType recontextualizeComponentType(edu.uci.isr.xarch.types.IComponentType value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.types.IConnectorType object in this namespace.
	 * @return New edu.uci.isr.xarch.types.IConnectorType object.
	 */
	public edu.uci.isr.xarch.types.IConnectorType createConnectorType(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.types.ConnectorTypeImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.types.ConnectorTypeImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.types.ConnectorTypeImpl newElt = new edu.uci.isr.xarch.types.ConnectorTypeImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.types.IConnectorType object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.types.IConnectorType recontextualizeConnectorType(edu.uci.isr.xarch.types.IConnectorType value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.types.IInterfaceType object in this namespace.
	 * @return New edu.uci.isr.xarch.types.IInterfaceType object.
	 */
	public edu.uci.isr.xarch.types.IInterfaceType createInterfaceType(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.types.InterfaceTypeImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.types.InterfaceTypeImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.types.InterfaceTypeImpl newElt = new edu.uci.isr.xarch.types.InterfaceTypeImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.types.IInterfaceType object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.types.IInterfaceType recontextualizeInterfaceType(edu.uci.isr.xarch.types.IInterfaceType value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IRemove object in this namespace.
	 * @return New IRemove object.
	 */
	public IRemove createRemove(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, RemoveImpl.XSD_TYPE_NSURI, RemoveImpl.XSD_TYPE_NAME);
		RemoveImpl newElt = new RemoveImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IRemove object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IRemove recontextualizeRemove(IRemove value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IDiffPart object in this namespace.
	 * @return New IDiffPart object.
	 */
	public IDiffPart createDiffPart(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, DiffPartImpl.XSD_TYPE_NSURI, DiffPartImpl.XSD_TYPE_NAME);
		DiffPartImpl newElt = new DiffPartImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IDiffPart object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IDiffPart recontextualizeDiffPart(IDiffPart value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IDiff object in this namespace.
	 * @return New IDiff object.
	 */
	public IDiff createDiff(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, DiffImpl.XSD_TYPE_NSURI, DiffImpl.XSD_TYPE_NAME);
		DiffImpl newElt = new DiffImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IDiff object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IDiff recontextualizeDiff(IDiff value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, DiffConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, DiffConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create a top-level element of type <code>IDiff</code>.
	 * This function should be used in lieu of <code>createDiff</code>
	 * if the element is to be added as a sub-object of <code>IXArch</code>.
	 * @return new IDiff suitable for adding
	 * as a child of xArch.
	 */
	public IDiff createDiffElement(){
		Element elt = createElement("diff");
		DOMUtils.addXSIType(elt, DiffImpl.XSD_TYPE_NSURI, 
			DiffImpl.XSD_TYPE_NAME);
		DiffImpl newElt = new DiffImpl(elt);

		IXArch de = getXArch();
		newElt.setXArch(de);
		return newElt;
	}

	/**
	 * Gets the IDiff child from the given <code>IXArch</code>
	 * element.  If there are multiple matching children, this returns the first one.
	 * @param xArch <code>IXArch</code> object from which to get the child.
	 * @return <code>IDiff</code> that is the child
	 * of <code>xArch</code> or <code>null</code> if no such object exists.
	 */
	public IDiff getDiff(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Collection elementCollection = xArch.getAllObjects();
		for(Iterator en = elementCollection.iterator(); en.hasNext(); ){
			Object o = en.next();
			if(o instanceof IDiff){
				return (IDiff)o;
			}
			else if(o instanceof Element){
				Element elt = (Element)o;
				synchronized(DOMUtils.getDOMLock(elt)){
					String nsURI = elt.getNamespaceURI();
					String localName = elt.getLocalName();
					if((nsURI != null) && (nsURI.equals(DiffConstants.NS_URI))){
						if((localName != null) && (localName.equals("diff"))){
							DiffImpl newElt = new DiffImpl(elt);
							newElt.setXArch(this.getXArch());
							return newElt;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Gets all the IDiff children from the given 
	 * <code>IXArch</code> element.
	 * @param xArch <code>IXArch</code> object from which to get the children.
	 * @return Collection of <code>IDiff</code> that are 	
	 * the children of <code>xArch</code> or an empty collection if no such object exists.
	 */
	public Collection getAllDiffs(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Collection elementCollection = xArch.getAllObjects();
		Vector v = new Vector();

		for(Iterator en = elementCollection.iterator(); en.hasNext(); ){
			Object o = en.next();
			if(o instanceof IDiff){
				v.addElement(o);
			}
			else if(o instanceof Element){
				Element elt = (Element)o;
				synchronized(DOMUtils.getDOMLock(elt)){
					String nsURI = elt.getNamespaceURI();
					String localName = elt.getLocalName();
					if((nsURI != null) && (nsURI.equals(DiffConstants.NS_URI))){
						if((localName != null) && (localName.equals("diff"))){
							DiffImpl newElt = new DiffImpl(elt);
							newElt.setXArch(this.getXArch());
							v.addElement(newElt);
						}
					}
				}
			}
		}
		return v;
	}

}

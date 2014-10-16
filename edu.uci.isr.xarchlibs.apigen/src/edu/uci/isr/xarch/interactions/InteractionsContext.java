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
package edu.uci.isr.xarch.interactions;

import java.util.*;

import edu.uci.isr.xarch.*;

import org.w3c.dom.*;

import edu.uci.isr.xarch.IXArch;
import edu.uci.isr.xarch.IXArchContext;

/**
 * The context object for the interactions package.
 * This object is used to create objects that are used
 * in the interactions namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public class InteractionsContext implements IInteractionsContext {

	protected static final String DEFAULT_ELT_NAME = "anonymousInstanceTag";
	protected Document doc;
	protected IXArch xArch;

	/**
	 * Create a new InteractionsContext for the given
	 * IXArch object.
	 * @param xArch XArch object to contextualize in this namespace.
	 */
	public InteractionsContext(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Node docRootNode = ((DOMBased)xArch).getDOMNode();
		synchronized(DOMUtils.getDOMLock(docRootNode)){
			this.doc = docRootNode.getOwnerDocument();
			xArch.addSchemaLocation("http://www.ics.uci.edu/pub/arch/xArch/interactions.xsd", "http://www.ics.uci.edu/pub/arch/xArch/interactions.xsd");
			this.xArch = xArch;
		}
	}

	public IXArch getXArch(){
		return xArch;
	}
	
	protected Element createElement(String name){
		synchronized(DOMUtils.getDOMLock(doc)){
			return doc.createElementNS(InteractionsConstants.NS_URI, name);
		}
	}

	public XArchTypeMetadata getTypeMetadata(){
		return IInteractionsContext.TYPE_METADATA;
	}
	/**
	 * Create an IInteraction object in this namespace.
	 * @return New IInteraction object.
	 */
	public IInteraction createInteraction(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, InteractionImpl.XSD_TYPE_NSURI, InteractionImpl.XSD_TYPE_NAME);
		InteractionImpl newElt = new InteractionImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IInteraction object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInteraction recontextualizeInteraction(IInteraction value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.instance.IDescription object in this namespace.
	 * @return New edu.uci.isr.xarch.instance.IDescription object.
	 */
	public edu.uci.isr.xarch.instance.IDescription createDescription(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.instance.DescriptionImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.instance.DescriptionImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.instance.DescriptionImpl newElt = new edu.uci.isr.xarch.instance.DescriptionImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.instance.IDescription object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.instance.IDescription recontextualizeDescription(edu.uci.isr.xarch.instance.IDescription value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.instance.IXMLLink object in this namespace.
	 * @return New edu.uci.isr.xarch.instance.IXMLLink object.
	 */
	public edu.uci.isr.xarch.instance.IXMLLink createXMLLink(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.instance.XMLLinkImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.instance.XMLLinkImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.instance.XMLLinkImpl newElt = new edu.uci.isr.xarch.instance.XMLLinkImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.instance.IXMLLink object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.instance.IXMLLink recontextualizeXMLLink(edu.uci.isr.xarch.instance.IXMLLink value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an ILifeLine object in this namespace.
	 * @return New ILifeLine object.
	 */
	public ILifeLine createLifeLine(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, LifeLineImpl.XSD_TYPE_NSURI, LifeLineImpl.XSD_TYPE_NAME);
		LifeLineImpl newElt = new LifeLineImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an ILifeLine object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ILifeLine recontextualizeLifeLine(ILifeLine value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IMessage object in this namespace.
	 * @return New IMessage object.
	 */
	public IMessage createMessage(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, MessageImpl.XSD_TYPE_NSURI, MessageImpl.XSD_TYPE_NAME);
		MessageImpl newElt = new MessageImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IMessage object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IMessage recontextualizeMessage(IMessage value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an INote object in this namespace.
	 * @return New INote object.
	 */
	public INote createNote(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, NoteImpl.XSD_TYPE_NSURI, NoteImpl.XSD_TYPE_NAME);
		NoteImpl newElt = new NoteImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an INote object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public INote recontextualizeNote(INote value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IStringType object in this namespace.
	 * @return New IStringType object.
	 */
	public IStringType createStringType(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, StringTypeImpl.XSD_TYPE_NSURI, StringTypeImpl.XSD_TYPE_NAME);
		StringTypeImpl newElt = new StringTypeImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IStringType object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IStringType recontextualizeStringType(IStringType value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, InteractionsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, InteractionsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create a top-level element of type <code>IInteraction</code>.
	 * This function should be used in lieu of <code>createInteraction</code>
	 * if the element is to be added as a sub-object of <code>IXArch</code>.
	 * @return new IInteraction suitable for adding
	 * as a child of xArch.
	 */
	public IInteraction createInteractionElement(){
		Element elt = createElement("interaction");
		DOMUtils.addXSIType(elt, InteractionImpl.XSD_TYPE_NSURI, 
			InteractionImpl.XSD_TYPE_NAME);
		InteractionImpl newElt = new InteractionImpl(elt);

		IXArch de = getXArch();
		newElt.setXArch(de);
		return newElt;
	}

	/**
	 * Gets the IInteraction child from the given <code>IXArch</code>
	 * element.  If there are multiple matching children, this returns the first one.
	 * @param xArch <code>IXArch</code> object from which to get the child.
	 * @return <code>IInteraction</code> that is the child
	 * of <code>xArch</code> or <code>null</code> if no such object exists.
	 */
	public IInteraction getInteraction(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Collection elementCollection = xArch.getAllObjects();
		for(Iterator en = elementCollection.iterator(); en.hasNext(); ){
			Object o = en.next();
			if(o instanceof IInteraction){
				return (IInteraction)o;
			}
			else if(o instanceof Element){
				Element elt = (Element)o;
				synchronized(DOMUtils.getDOMLock(elt)){
					String nsURI = elt.getNamespaceURI();
					String localName = elt.getLocalName();
					if((nsURI != null) && (nsURI.equals(InteractionsConstants.NS_URI))){
						if((localName != null) && (localName.equals("interaction"))){
							InteractionImpl newElt = new InteractionImpl(elt);
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
	 * Gets all the IInteraction children from the given 
	 * <code>IXArch</code> element.
	 * @param xArch <code>IXArch</code> object from which to get the children.
	 * @return Collection of <code>IInteraction</code> that are 	
	 * the children of <code>xArch</code> or an empty collection if no such object exists.
	 */
	public Collection getAllInteractions(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Collection elementCollection = xArch.getAllObjects();
		Vector v = new Vector();

		for(Iterator en = elementCollection.iterator(); en.hasNext(); ){
			Object o = en.next();
			if(o instanceof IInteraction){
				v.addElement(o);
			}
			else if(o instanceof Element){
				Element elt = (Element)o;
				synchronized(DOMUtils.getDOMLock(elt)){
					String nsURI = elt.getNamespaceURI();
					String localName = elt.getLocalName();
					if((nsURI != null) && (nsURI.equals(InteractionsConstants.NS_URI))){
						if((localName != null) && (localName.equals("interaction"))){
							InteractionImpl newElt = new InteractionImpl(elt);
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

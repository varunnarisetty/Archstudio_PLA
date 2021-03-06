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
package edu.uci.isr.xarch.javasourcecode;

import org.w3c.dom.*;

import edu.uci.isr.xarch.*;

import java.util.*;

/**
 * DOM-Based implementation of the IJavaSourceFile interface.
 *
 * @author Automatically generated by xArch apigen.
 */
public class JavaSourceFileImpl implements IJavaSourceFile, DOMBased{
	
	public static final String XSD_TYPE_NSURI = JavasourcecodeConstants.NS_URI;
	public static final String XSD_TYPE_NAME = "JavaSourceFile";
	
	protected IXArch xArch;
	
	/** Tag name for fileNames in this object. */
	public static final String FILE_NAME_ATTR_NAME = "fileName";
	/** Tag name for paths in this object. */
	public static final String PATH_ATTR_NAME = "path";
	/** Tag name for repositoryLocations in this object. */
	public static final String REPOSITORY_LOCATION_ELT_NAME = "repositoryLocation";

	
	protected Element elt;
	
	private static SequenceOrder seqOrd = new SequenceOrder(
		new QName[]{
			new QName(JavasourcecodeConstants.NS_URI, REPOSITORY_LOCATION_ELT_NAME)
		}
	);
	
	public JavaSourceFileImpl(Element elt){
		if(elt == null){
			throw new IllegalArgumentException("Element cannot be null.");
		}
		this.elt = elt;
	}

	public Node getDOMNode(){
		return elt;
	}
	
	public void setDOMNode(Node node){
		if(node.getNodeType() != Node.ELEMENT_NODE){
			throw new IllegalArgumentException("Base DOM node of this type must be an Element.");
		}
		elt = (Element)node;
	}
	
	protected static SequenceOrder getSequenceOrder(){
		return seqOrd;
	}
	
	public void setXArch(IXArch xArch){
		this.xArch = xArch;
	}
	
	public IXArch getXArch(){
		return this.xArch;
	}

	public IXArchElement cloneElement(int depth){
		synchronized(DOMUtils.getDOMLock(elt)){
			Document doc = elt.getOwnerDocument();
			if(depth == 0){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				JavaSourceFileImpl cloneImpl = new JavaSourceFileImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
			else if(depth == 1){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				JavaSourceFileImpl cloneImpl = new JavaSourceFileImpl(cloneElt);
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
				JavaSourceFileImpl cloneImpl = new JavaSourceFileImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
		}
	}

	//Override 'equals' to be DOM-based...	
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(!(o instanceof DOMBased)){
			return super.equals(o);
		}
		DOMBased db = (DOMBased)o;
		Node dbNode = db.getDOMNode();
		return dbNode.equals(getDOMNode());
	}

	//Override 'hashCode' to be based on the underlying node
	public int hashCode(){
		return getDOMNode().hashCode();
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
				if(!DOMUtils.hasXSIType(elt, "http://www.ics.uci.edu/pub/arch/xArch/javasourcecode.xsd", baseTypeName)){
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
		return IJavaSourceFile.TYPE_METADATA;
	}

	public XArchInstanceMetadata getInstanceMetadata(){
		return new XArchInstanceMetadata(XArchUtils.getPackageTitle(elt.getNamespaceURI()));
	}
	/**
	 * Set the fileName attribute on this object.
	 * @param fileName attribute value.
	 */
	public void setFileName(String fileName){
		{
			String oldValue = getFileName();
			if(oldValue == null ? fileName == null : oldValue.equals(fileName))
				return;
			DOMUtils.removeAttribute(elt, JavasourcecodeConstants.NS_URI, FILE_NAME_ATTR_NAME);
			IXArch _x = getXArch();
			if(_x != null){
				_x.fireXArchEvent(
					new XArchEvent(this, 
					XArchEvent.CLEAR_EVENT,
					XArchEvent.ATTRIBUTE_CHANGED,
					"fileName", oldValue,
					XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this), true)
				);
			}
		}
		DOMUtils.setAttribute(elt, JavasourcecodeConstants.NS_URI, FILE_NAME_ATTR_NAME, fileName);
		IXArch _x = getXArch();
		if(_x != null){
			_x.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.SET_EVENT,
				XArchEvent.ATTRIBUTE_CHANGED,
				"fileName", fileName,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	/**
	 * Removes the fileName attribute from this object.
	 */
	public void clearFileName(){
		String oldValue = getFileName();
		if(oldValue == null)
			return;
		DOMUtils.removeAttribute(elt, JavasourcecodeConstants.NS_URI, FILE_NAME_ATTR_NAME);
		IXArch _x = getXArch();
		if(_x != null){
			_x.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.CLEAR_EVENT,
				XArchEvent.ATTRIBUTE_CHANGED,
				"fileName", oldValue,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	/**
	 * Gets the value of the fileName attribute on this object.
	 * @return fileName attribute's value or <code>null</code> if that
	 * attribute is not set.
	 */
	public String getFileName(){
		return DOMUtils.getAttributeValue(elt, JavasourcecodeConstants.NS_URI, FILE_NAME_ATTR_NAME);
	}
	
	/**
	 * Determines if this object's fileName attribute has the
	 * given value.
	 * @param fileName value to test.
	 * @return <code>true</code> if the values match, <code>false</code> otherwise.
	 * Matching is done by string-matching.
	 */
	public boolean hasFileName(String fileName){
		return DOMUtils.objNullEq(getFileName(), fileName);
	}

	/**
	 * Set the path attribute on this object.
	 * @param path attribute value.
	 */
	public void setPath(String path){
		{
			String oldValue = getPath();
			if(oldValue == null ? path == null : oldValue.equals(path))
				return;
			DOMUtils.removeAttribute(elt, JavasourcecodeConstants.NS_URI, PATH_ATTR_NAME);
			IXArch _x = getXArch();
			if(_x != null){
				_x.fireXArchEvent(
					new XArchEvent(this, 
					XArchEvent.CLEAR_EVENT,
					XArchEvent.ATTRIBUTE_CHANGED,
					"path", oldValue,
					XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this), true)
				);
			}
		}
		DOMUtils.setAttribute(elt, JavasourcecodeConstants.NS_URI, PATH_ATTR_NAME, path);
		IXArch _x = getXArch();
		if(_x != null){
			_x.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.SET_EVENT,
				XArchEvent.ATTRIBUTE_CHANGED,
				"path", path,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	/**
	 * Removes the path attribute from this object.
	 */
	public void clearPath(){
		String oldValue = getPath();
		if(oldValue == null)
			return;
		DOMUtils.removeAttribute(elt, JavasourcecodeConstants.NS_URI, PATH_ATTR_NAME);
		IXArch _x = getXArch();
		if(_x != null){
			_x.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.CLEAR_EVENT,
				XArchEvent.ATTRIBUTE_CHANGED,
				"path", oldValue,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	/**
	 * Gets the value of the path attribute on this object.
	 * @return path attribute's value or <code>null</code> if that
	 * attribute is not set.
	 */
	public String getPath(){
		return DOMUtils.getAttributeValue(elt, JavasourcecodeConstants.NS_URI, PATH_ATTR_NAME);
	}
	
	/**
	 * Determines if this object's path attribute has the
	 * given value.
	 * @param path value to test.
	 * @return <code>true</code> if the values match, <code>false</code> otherwise.
	 * Matching is done by string-matching.
	 */
	public boolean hasPath(String path){
		return DOMUtils.objNullEq(getPath(), path);
	}

	public void addRepositoryLocation(IRepositoryLocation newRepositoryLocation){
		if(!(newRepositoryLocation instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newRepositoryLocation).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, JavasourcecodeConstants.NS_URI, REPOSITORY_LOCATION_ELT_NAME);
		((DOMBased)newRepositoryLocation).setDOMNode(newChildElt);

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
				"repositoryLocation", newRepositoryLocation,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addRepositoryLocations(Collection repositoryLocations){
		for(Iterator en = repositoryLocations.iterator(); en.hasNext(); ){
			IRepositoryLocation elt = (IRepositoryLocation)en.next();
			addRepositoryLocation(elt);
		}
	}		
		
	public void clearRepositoryLocations(){
		//DOMUtils.removeChildren(elt, JavasourcecodeConstants.NS_URI, REPOSITORY_LOCATION_ELT_NAME);
		Collection coll = getAllRepositoryLocations();
		removeRepositoryLocations(coll);
	}
	
	public void removeRepositoryLocation(IRepositoryLocation repositoryLocationToRemove){
		if(!(repositoryLocationToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, JavasourcecodeConstants.NS_URI, REPOSITORY_LOCATION_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)repositoryLocationToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"repositoryLocation", repositoryLocationToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeRepositoryLocations(Collection repositoryLocations){
		for(Iterator en = repositoryLocations.iterator(); en.hasNext(); ){
			IRepositoryLocation elt = (IRepositoryLocation)en.next();
			removeRepositoryLocation(elt);
		}
	}
	
	public Collection getAllRepositoryLocations(){
		NodeList nl = DOMUtils.getChildren(elt, JavasourcecodeConstants.NS_URI, REPOSITORY_LOCATION_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((IRepositoryLocation)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "RepositoryLocation");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((IRepositoryLocation)o);
					}
					catch(Exception e){
						RepositoryLocationImpl eltImpl = new RepositoryLocationImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					RepositoryLocationImpl eltImpl = new RepositoryLocationImpl((Element)nl.item(i));
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

	public boolean hasRepositoryLocation(IRepositoryLocation repositoryLocationToCheck){
		Collection c = getAllRepositoryLocations();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			IRepositoryLocation elt = (IRepositoryLocation)en.next();
			if(elt.isEquivalent(repositoryLocationToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasRepositoryLocations(Collection repositoryLocationsToCheck){
		Vector v = new Vector();
		for(Iterator en = repositoryLocationsToCheck.iterator(); en.hasNext(); ){
			IRepositoryLocation elt = (IRepositoryLocation)en.next();
			v.addElement(new Boolean(hasRepositoryLocation(elt)));
		}
		return v;
	}
		
	public boolean hasAllRepositoryLocations(Collection repositoryLocationsToCheck){
		for(Iterator en = repositoryLocationsToCheck.iterator(); en.hasNext(); ){
			IRepositoryLocation elt = (IRepositoryLocation)en.next();
			if(!hasRepositoryLocation(elt)){
				return false;
			}
		}
		return true;
	}
	public boolean isEquivalent(IJavaSourceFile c){
		return (getClass().equals(c.getClass())) &&
		hasFileName(c.getFileName()) &&
		hasPath(c.getPath()) &&
			hasAllRepositoryLocations(c.getAllRepositoryLocations()) &&
			c.hasAllRepositoryLocations(getAllRepositoryLocations()) ;
	}

}

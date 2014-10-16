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
package edu.uci.isr.xarch.options;

import java.util.*;

import edu.uci.isr.xarch.*;

import org.w3c.dom.*;

import edu.uci.isr.xarch.IXArch;
import edu.uci.isr.xarch.IXArchContext;

/**
 * The context interface for the options package.
 * This interface is used to create objects that are used
 * in the options namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public interface IOptionsContext extends IXArchContext{

	/**
	 * Create an IGuard object in this namespace.
	 * @return New IGuard object.
	 */
	public IGuard createGuard();

	/**
	 * Brings an IGuard object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IGuard recontextualizeGuard(IGuard value);

	/**
	 * Create an IOptional object in this namespace.
	 * @return New IOptional object.
	 */
	public IOptional createOptional();

	/**
	 * Brings an IOptional object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptional recontextualizeOptional(IOptional value);

	/**
	 * Create an IOptionalComponent object in this namespace.
	 * @return New IOptionalComponent object.
	 */
	public IOptionalComponent createOptionalComponent();

	/**
	 * Brings an IOptionalComponent object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptionalComponent recontextualizeOptionalComponent(IOptionalComponent value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.types.IComponent</code>
	 * to one of type <code>IOptionalComponent</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.types.IComponent</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IOptionalComponent promoteToOptionalComponent(
	edu.uci.isr.xarch.types.IComponent value);

	/**
	 * Create an IOptionalConnector object in this namespace.
	 * @return New IOptionalConnector object.
	 */
	public IOptionalConnector createOptionalConnector();

	/**
	 * Brings an IOptionalConnector object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptionalConnector recontextualizeOptionalConnector(IOptionalConnector value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.types.IConnector</code>
	 * to one of type <code>IOptionalConnector</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.types.IConnector</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IOptionalConnector promoteToOptionalConnector(
	edu.uci.isr.xarch.types.IConnector value);

	/**
	 * Create an IOptionalLink object in this namespace.
	 * @return New IOptionalLink object.
	 */
	public IOptionalLink createOptionalLink();

	/**
	 * Brings an IOptionalLink object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptionalLink recontextualizeOptionalLink(IOptionalLink value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.types.ILink</code>
	 * to one of type <code>IOptionalLink</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.types.ILink</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IOptionalLink promoteToOptionalLink(
	edu.uci.isr.xarch.types.ILink value);

	/**
	 * Create an IOptionalInterface object in this namespace.
	 * @return New IOptionalInterface object.
	 */
	public IOptionalInterface createOptionalInterface();

	/**
	 * Brings an IOptionalInterface object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptionalInterface recontextualizeOptionalInterface(IOptionalInterface value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.types.IInterface</code>
	 * to one of type <code>IOptionalInterface</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.types.IInterface</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IOptionalInterface promoteToOptionalInterface(
	edu.uci.isr.xarch.types.IInterface value);

	/**
	 * Create an IOptionalSignature object in this namespace.
	 * @return New IOptionalSignature object.
	 */
	public IOptionalSignature createOptionalSignature();

	/**
	 * Brings an IOptionalSignature object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptionalSignature recontextualizeOptionalSignature(IOptionalSignature value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.types.ISignature</code>
	 * to one of type <code>IOptionalSignature</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.types.ISignature</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IOptionalSignature promoteToOptionalSignature(
	edu.uci.isr.xarch.types.ISignature value);

	/**
	 * Create an IOptionalSignatureInterfaceMapping object in this namespace.
	 * @return New IOptionalSignatureInterfaceMapping object.
	 */
	public IOptionalSignatureInterfaceMapping createOptionalSignatureInterfaceMapping();

	/**
	 * Brings an IOptionalSignatureInterfaceMapping object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOptionalSignatureInterfaceMapping recontextualizeOptionalSignatureInterfaceMapping(IOptionalSignatureInterfaceMapping value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.types.ISignatureInterfaceMapping</code>
	 * to one of type <code>IOptionalSignatureInterfaceMapping</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.types.ISignatureInterfaceMapping</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IOptionalSignatureInterfaceMapping promoteToOptionalSignatureInterfaceMapping(
	edu.uci.isr.xarch.types.ISignatureInterfaceMapping value);


	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_CONTEXT,
		"options", null, null,
		new XArchPropertyMetadata[]{},
		new XArchActionMetadata[]{
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IGuard.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IGuard.TYPE_METADATA, IGuard.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptional.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptional.TYPE_METADATA, IOptional.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptionalComponent.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptionalComponent.TYPE_METADATA, IOptionalComponent.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.types.IComponent.TYPE_METADATA, IOptionalComponent.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptionalConnector.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptionalConnector.TYPE_METADATA, IOptionalConnector.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.types.IConnector.TYPE_METADATA, IOptionalConnector.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptionalLink.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptionalLink.TYPE_METADATA, IOptionalLink.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.types.ILink.TYPE_METADATA, IOptionalLink.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptionalInterface.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptionalInterface.TYPE_METADATA, IOptionalInterface.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.types.IInterface.TYPE_METADATA, IOptionalInterface.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptionalSignature.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptionalSignature.TYPE_METADATA, IOptionalSignature.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.types.ISignature.TYPE_METADATA, IOptionalSignature.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOptionalSignatureInterfaceMapping.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOptionalSignatureInterfaceMapping.TYPE_METADATA, IOptionalSignatureInterfaceMapping.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.types.ISignatureInterfaceMapping.TYPE_METADATA, IOptionalSignatureInterfaceMapping.TYPE_METADATA)});

}


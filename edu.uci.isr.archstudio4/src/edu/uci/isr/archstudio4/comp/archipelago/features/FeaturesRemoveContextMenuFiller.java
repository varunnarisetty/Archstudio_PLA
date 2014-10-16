package edu.uci.isr.archstudio4.comp.archipelago.features;

import org.eclipse.jface.viewers.TreeViewer;

import edu.uci.isr.archstudio4.comp.archipelago.ArchipelagoServices;
import edu.uci.isr.archstudio4.comp.archipelago.util.AbstractRemoveContextMenuFiller;
import edu.uci.isr.xarchflat.IXArchPropertyMetadata;
import edu.uci.isr.xarchflat.ObjRef;

public class FeaturesRemoveContextMenuFiller  extends AbstractRemoveContextMenuFiller{

	public FeaturesRemoveContextMenuFiller(TreeViewer viewer, ArchipelagoServices services, ObjRef xArchRef){
		super(viewer, services, xArchRef);
	}
	
	protected boolean matches(Object node){
		if(node != null){
			if(node instanceof ObjRef){
				ObjRef targetRef = (ObjRef)node;
				if(AS.xarch.isInstanceOf(targetRef, "features#Feature")){
					return true;
				}else if(AS.xarch.isInstanceOf(targetRef, "features#Varient")){
					return true;
				}
			}
		}
		return false;
	}
	
	protected void remove(ObjRef targetRef){
		if(targetRef != null){
			if(AS.xarch.isInstanceOf(targetRef, "features#OptionalFeature")){
				
				removeOptionalFeature(targetRef);
				
			}else if(AS.xarch.isInstanceOf(targetRef, "features#AlternativeFeature")){
				removeAlternativeFeature(targetRef);
			}else if(AS.xarch.isInstanceOf(targetRef, "features#Varient")){
				removeVarient(targetRef);
			}
		}
		super.remove(targetRef);
	}

	private void removeVarient(ObjRef targetRef) {

		ObjRef featureElement = (ObjRef) AS.xarch.get(targetRef, "featureElements");
		if(featureElement == null){
			ObjRef parent = AS.xarch.getParent(targetRef);
			
			AS.xarch.remove(parent, "Varient", targetRef);
			return;
		}
		ObjRef[] archElementRef = AS.xarch.getAll(featureElement, "archElement");
		
		for (int i = 0; i < archElementRef.length; i++) {
			//String id =
			ObjRef archElementLink = archElementRef[i];
			
			String id = (String) AS.xarch.get(archElementLink, "href");
			id = id.substring(1); //we need to remove # infront of the element ids
			System.out.println(id);
			
			ObjRef compRef = AS.xarch.getByID(id);
			if(compRef != null){
			String tagName = AS.xarch.getElementName(compRef);
			if(tagName != null){
				ObjRef parentRef = AS.xarch.getParent(compRef);
				if(parentRef != null){
					AS.xarch.remove(parentRef, tagName, compRef);
				}
			}
			}
		
			 
			
		}
	

		ObjRef parent = AS.xarch.getParent(targetRef);
		
		AS.xarch.remove(parent, "Varient", targetRef);
		
	
		
	}

	private void removeAlternativeFeature(ObjRef targetRef) {
		
		ObjRef featureVarientsRef = (ObjRef) AS.xarch.get(targetRef, "FeatureVarients");
		if(featureVarientsRef == null){
			ObjRef parent = AS.xarch.getParent(targetRef);
			
			AS.xarch.remove(parent, "Feature", targetRef);
			return;
		}
		ObjRef[] varientRef = AS.xarch.getAll(featureVarientsRef, "Varient"); 
		for(int j = 0; j < varientRef.length;j++){
			ObjRef featureElement = (ObjRef) AS.xarch.get(varientRef[j], "featureElements");
			if(featureElement == null){
				continue;
			}
			ObjRef[] archElementRef = AS.xarch.getAll(featureElement, "archElement");
			
			for (int i = 0; i < archElementRef.length; i++) {
				//String id =
				ObjRef archElementLink = archElementRef[i];
				
				String id = (String) AS.xarch.get(archElementLink, "href");
				id = id.substring(1); //we need to remove # infront of the element ids
				System.out.println(id);
				
				
				
				
				
				ObjRef compRef = AS.xarch.getByID(id);
				if(compRef != null){
				String tagName = AS.xarch.getElementName(compRef);
				if(tagName != null){
					ObjRef parentRef = AS.xarch.getParent(compRef);
					if(parentRef != null){
						AS.xarch.remove(parentRef, tagName, compRef);
					}
				}
				}
			
				 
				
			}
		}
		
		
		
		ObjRef parent = AS.xarch.getParent(targetRef);
		
		AS.xarch.remove(parent, "Feature", targetRef);
		
		
		
		return;
		
	}

	private void removeOptionalFeature(ObjRef targetRef) {
		//ObjRef featureContextRef = AS.xarch.createContext(xArchRef, "features");
		//ObjRef featureRef = AS.xarch.getByID(selectedFeature);
		//ObjRef featureElements = AS.xarch.getElement(targetRef, "featureElements",xArchRef );
		ObjRef featureElementsRef = (ObjRef) AS.xarch.get(targetRef, "featureElements");
		ObjRef[] archElementRef = AS.xarch.getAll(featureElementsRef, "archElement"); 
		
		for (int i = 0; i < archElementRef.length; i++) {
			//String id =
			ObjRef archElementLink = archElementRef[i];
			
			String id = (String) AS.xarch.get(archElementLink, "href");
			id = id.substring(1); //we need to remove # infront of the element ids
			System.out.println(id);
			
			
			
			
			
			ObjRef compRef = AS.xarch.getByID(id);
			if(compRef != null){
			String tagName = AS.xarch.getElementName(compRef);
			if(tagName != null){
				ObjRef parentRef = AS.xarch.getParent(compRef);
				if(parentRef != null){
					AS.xarch.remove(parentRef, tagName, compRef);
				}
			}
			}
		
			 
			
		}
		
		ObjRef parent = AS.xarch.getParent(targetRef);
		
		AS.xarch.remove(parent, "Feature", targetRef);
		
		
		
		return;
		
	}
}


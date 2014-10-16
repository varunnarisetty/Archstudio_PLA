package edu.uci.isr.archstudio4.comp.archipelago.features;

import edu.uci.isr.archstudio4.comp.archipelago.ArchipelagoServices;
import edu.uci.isr.archstudio4.comp.archipelago.util.AbstractEditDescriptionCellModifier;
import edu.uci.isr.xarchflat.ObjRef;

public class FeaturesEditDescriptionCellModifier  extends AbstractEditDescriptionCellModifier{

	public FeaturesEditDescriptionCellModifier(ArchipelagoServices services, ObjRef xArchRef){
		super(services, xArchRef);
	}
	
	public boolean canModify(Object element, String property){
		if((element != null) && (element instanceof ObjRef)){
			ObjRef targetRef = (ObjRef)element;
			if(AS.xarch.isInstanceOf(targetRef, "features#Feature")  || AS.xarch.isInstanceOf(targetRef, "features#Varient") ){
				return true;
			}
		}
		return false;
	}
}
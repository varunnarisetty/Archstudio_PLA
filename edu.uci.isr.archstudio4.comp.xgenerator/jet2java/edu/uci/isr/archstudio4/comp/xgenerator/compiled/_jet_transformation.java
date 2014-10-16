package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(9);
    static {
        pathToTemplateOrdinalMap.put("templates/abstract_st.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/comparch.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/comparch_sc.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/compimp.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/concrete_st.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/icomp.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/main-bak.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(8));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/abstract_st.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_abstract_st();
            case 1: // templates/comparch.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_comparch();
            case 2: // templates/comparch_sc.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_comparch_sc();
            case 3: // templates/compimp.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_compimp();
            case 4: // templates/concrete_st.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_concrete_st();
            case 5: // templates/dump.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_dump();
            case 6: // templates/icomp.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_icomp();
            case 7: // templates/main-bak.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_mainbak();
            case 8: // templates/main.jet
                return new edu.uci.isr.archstudio4.comp.xgenerator.compiled._jet_main();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}

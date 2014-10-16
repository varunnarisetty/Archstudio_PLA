package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_10_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_17_1 = new TagInfo("ws:project", //$NON-NLS-1$
            17, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/xArch/archStructure/component[@id=$compid]", //$NON-NLS-1$
                "currComp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_23_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/xArch", //$NON-NLS-1$
                "xarch", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "removeWhitespace(packageName(string($archPrescribedClass)))", //$NON-NLS-1$
                "archDefinedPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "removeWhitespace(className(string($archPrescribedClass)))", //$NON-NLS-1$
                "archDefinedClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_26_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "removeWhitespace(packageName(string($userDefinedClass)))", //$NON-NLS-1$
                "userDefinedPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "removeWhitespace(className(string($userDefinedClass)))", //$NON-NLS-1$
                "userDefinedClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "concat('I', removeWhitespace(string($currComp/description)), 'Imp')", //$NON-NLS-1$
                "iPrimitives", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$archDefinedPackage", //$NON-NLS-1$
                "iPrimitivesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_30_2 = new TagInfo("c:choose", //$NON-NLS-1$
            30, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_31_3 = new TagInfo("c:when", //$NON-NLS-1$
            31, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "/xArch/statechart/linkedComp[substring(string(@href),2)=$compid]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/xArch/statechart[substring(string(linkedComp/@href),2)=$compid]", //$NON-NLS-1$
                "scRef", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_34_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            34, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "removeWhitespace($currComp/description)", //$NON-NLS-1$
                "compDesp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_35_4 = new TagInfo("ws:project", //$NON-NLS-1$
            35, 4,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$prjName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_36_6 = new TagInfo("ws:folder", //$NON-NLS-1$
            36, 6,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "src", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_37_8 = new TagInfo("java:class", //$NON-NLS-1$
            37, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$archDefinedPackage}", //$NON-NLS-1$
                "{$archDefinedClass}", //$NON-NLS-1$
                "templates/comparch_sc.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_41_8 = new TagInfo("java:class", //$NON-NLS-1$
            41, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$archDefinedPackage}", //$NON-NLS-1$
                "{$compDesp}State", //$NON-NLS-1$
                "templates/abstract_st.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_45_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$scRef/state[@stateType='state']", //$NON-NLS-1$
                "currState", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_46_9 = new TagInfo("c:setVariable", //$NON-NLS-1$
            46, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "removeWhitespace($currState/description)", //$NON-NLS-1$
                "stateDesp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_47_8 = new TagInfo("java:class", //$NON-NLS-1$
            47, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$archDefinedPackage}", //$NON-NLS-1$
                "{$compDesp}{$stateDesp}State", //$NON-NLS-1$
                "templates/concrete_st.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_52_8 = new TagInfo("java:class", //$NON-NLS-1$
            52, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "{$userDefinedPackage}", //$NON-NLS-1$
                "{$userDefinedClass}", //$NON-NLS-1$
                "templates/compimp.jet", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_57_8 = new TagInfo("java:class", //$NON-NLS-1$
            57, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$iPrimitivesPackage}", //$NON-NLS-1$
                "{$iPrimitives}", //$NON-NLS-1$
                "templates/icomp.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_64_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            64, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_ws_project_66_4 = new TagInfo("ws:project", //$NON-NLS-1$
            66, 4,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$prjName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_67_6 = new TagInfo("ws:folder", //$NON-NLS-1$
            67, 6,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "src", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_68_8 = new TagInfo("java:class", //$NON-NLS-1$
            68, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$archDefinedPackage}", //$NON-NLS-1$
                "{$archDefinedClass}", //$NON-NLS-1$
                "templates/comparch.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_72_8 = new TagInfo("java:class", //$NON-NLS-1$
            72, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "{$userDefinedPackage}", //$NON-NLS-1$
                "{$userDefinedClass}", //$NON-NLS-1$
                "templates/compimp.jet", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_77_8 = new TagInfo("java:class", //$NON-NLS-1$
            77, 8,
            new String[] {
                "package", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$iPrimitivesPackage}", //$NON-NLS-1$
                "{$iPrimitives}", //$NON-NLS-1$
                "templates/icomp.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for edu.uci.isr.archstudio4.comp.xgenerator 
        out.write(NL);         
        // 
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
        RuntimeTagElement _jettag_c_setVariable_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_10_1.setRuntimeParent(null);
        _jettag_c_setVariable_10_1.setTagInfo(_td_c_setVariable_10_1);
        _jettag_c_setVariable_10_1.doStart(context, out);
        _jettag_c_setVariable_10_1.doEnd();
        out.write(NL);         
        // 
        //TODO: traverse input model, performing calculations and storing 
        //the results as model annotations via c:set tag 
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_17_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_17_1.setRuntimeParent(null);
        _jettag_ws_project_17_1.setTagInfo(_td_ws_project_17_1);
        _jettag_ws_project_17_1.doStart(context, out);
        while (_jettag_ws_project_17_1.okToProcessBody()) {
            //Calculate and store values needed by the templates
            //		1. Reference to the component to be generated: currComp
            //		2. Pakcage name can class name of generated files, including archDefinedFile and userDefinedFile.
            //	
            RuntimeTagElement _jettag_c_setVariable_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_22_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_22_2.setTagInfo(_td_c_setVariable_22_2);
            _jettag_c_setVariable_22_2.doStart(context, out);
            _jettag_c_setVariable_22_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_23_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_23_2.setTagInfo(_td_c_setVariable_23_2);
            _jettag_c_setVariable_23_2.doStart(context, out);
            _jettag_c_setVariable_23_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_24_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_24_2.setTagInfo(_td_c_setVariable_24_2);
            _jettag_c_setVariable_24_2.doStart(context, out);
            _jettag_c_setVariable_24_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_25_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_25_2.setTagInfo(_td_c_setVariable_25_2);
            _jettag_c_setVariable_25_2.doStart(context, out);
            _jettag_c_setVariable_25_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_26_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_26_2.setTagInfo(_td_c_setVariable_26_2);
            _jettag_c_setVariable_26_2.doStart(context, out);
            _jettag_c_setVariable_26_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_27_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_27_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_27_2.setTagInfo(_td_c_setVariable_27_2);
            _jettag_c_setVariable_27_2.doStart(context, out);
            _jettag_c_setVariable_27_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_28_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_28_2.setTagInfo(_td_c_setVariable_28_2);
            _jettag_c_setVariable_28_2.doStart(context, out);
            _jettag_c_setVariable_28_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_29_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_setVariable_29_2.setTagInfo(_td_c_setVariable_29_2);
            _jettag_c_setVariable_29_2.doStart(context, out);
            _jettag_c_setVariable_29_2.doEnd();
            RuntimeTagElement _jettag_c_choose_30_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_30_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_30_2.setRuntimeParent(_jettag_ws_project_17_1);
            _jettag_c_choose_30_2.setTagInfo(_td_c_choose_30_2);
            _jettag_c_choose_30_2.doStart(context, out);
            JET2Writer _jettag_c_choose_30_2_saved_out = out;
            while (_jettag_c_choose_30_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_31_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_31_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_31_3.setRuntimeParent(_jettag_c_choose_30_2);
                _jettag_c_when_31_3.setTagInfo(_td_c_when_31_3);
                _jettag_c_when_31_3.doStart(context, out);
                JET2Writer _jettag_c_when_31_3_saved_out = out;
                while (_jettag_c_when_31_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //A state chart is defined for the component
                    RuntimeTagElement _jettag_c_setVariable_33_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_33_4.setRuntimeParent(_jettag_c_when_31_3);
                    _jettag_c_setVariable_33_4.setTagInfo(_td_c_setVariable_33_4);
                    _jettag_c_setVariable_33_4.doStart(context, out);
                    _jettag_c_setVariable_33_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_34_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_34_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_34_4.setRuntimeParent(_jettag_c_when_31_3);
                    _jettag_c_setVariable_34_4.setTagInfo(_td_c_setVariable_34_4);
                    _jettag_c_setVariable_34_4.doStart(context, out);
                    _jettag_c_setVariable_34_4.doEnd();
                    RuntimeTagElement _jettag_ws_project_35_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_35_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_project_35_4.setRuntimeParent(_jettag_c_when_31_3);
                    _jettag_ws_project_35_4.setTagInfo(_td_ws_project_35_4);
                    _jettag_ws_project_35_4.doStart(context, out);
                    while (_jettag_ws_project_35_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_ws_folder_36_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_36_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_folder_36_6.setRuntimeParent(_jettag_ws_project_35_4);
                        _jettag_ws_folder_36_6.setTagInfo(_td_ws_folder_36_6);
                        _jettag_ws_folder_36_6.doStart(context, out);
                        while (_jettag_ws_folder_36_6.okToProcessBody()) {
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_37_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_37_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_37_8.setRuntimeParent(_jettag_ws_folder_36_6);
                            _jettag_java_class_37_8.setTagInfo(_td_java_class_37_8);
                            _jettag_java_class_37_8.doStart(context, out);
                            _jettag_java_class_37_8.doEnd();
                            out.write(NL);         
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_41_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_41_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_41_8.setRuntimeParent(_jettag_ws_folder_36_6);
                            _jettag_java_class_41_8.setTagInfo(_td_java_class_41_8);
                            _jettag_java_class_41_8.doStart(context, out);
                            _jettag_java_class_41_8.doEnd();
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_iterate_45_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_45_9.setRuntimeParent(_jettag_ws_folder_36_6);
                            _jettag_c_iterate_45_9.setTagInfo(_td_c_iterate_45_9);
                            _jettag_c_iterate_45_9.doStart(context, out);
                            while (_jettag_c_iterate_45_9.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_46_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_46_9); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_46_9.setRuntimeParent(_jettag_c_iterate_45_9);
                                _jettag_c_setVariable_46_9.setTagInfo(_td_c_setVariable_46_9);
                                _jettag_c_setVariable_46_9.doStart(context, out);
                                _jettag_c_setVariable_46_9.doEnd();
                                out.write("    \t\t\t");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_java_class_47_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_47_8); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_java_class_47_8.setRuntimeParent(_jettag_c_iterate_45_9);
                                _jettag_java_class_47_8.setTagInfo(_td_java_class_47_8);
                                _jettag_java_class_47_8.doStart(context, out);
                                _jettag_java_class_47_8.doEnd();
                                out.write(NL);         
                                _jettag_c_iterate_45_9.handleBodyContent(out);
                            }
                            _jettag_c_iterate_45_9.doEnd();
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_52_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_52_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_52_8.setRuntimeParent(_jettag_ws_folder_36_6);
                            _jettag_java_class_52_8.setTagInfo(_td_java_class_52_8);
                            _jettag_java_class_52_8.doStart(context, out);
                            _jettag_java_class_52_8.doEnd();
                            out.write(NL);         
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_57_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_57_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_57_8.setRuntimeParent(_jettag_ws_folder_36_6);
                            _jettag_java_class_57_8.setTagInfo(_td_java_class_57_8);
                            _jettag_java_class_57_8.doStart(context, out);
                            _jettag_java_class_57_8.doEnd();
                            out.write(NL);         
                            _jettag_ws_folder_36_6.handleBodyContent(out);
                        }
                        _jettag_ws_folder_36_6.doEnd();
                        _jettag_ws_project_35_4.handleBodyContent(out);
                    }
                    _jettag_ws_project_35_4.doEnd();
                    _jettag_c_when_31_3.handleBodyContent(out);
                }
                out = _jettag_c_when_31_3_saved_out;
                _jettag_c_when_31_3.doEnd();
                RuntimeTagElement _jettag_c_otherwise_64_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_64_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_64_3.setRuntimeParent(_jettag_c_choose_30_2);
                _jettag_c_otherwise_64_3.setTagInfo(_td_c_otherwise_64_3);
                _jettag_c_otherwise_64_3.doStart(context, out);
                JET2Writer _jettag_c_otherwise_64_3_saved_out = out;
                while (_jettag_c_otherwise_64_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //Invoke the templates to generate code
                    RuntimeTagElement _jettag_ws_project_66_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_66_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_project_66_4.setRuntimeParent(_jettag_c_otherwise_64_3);
                    _jettag_ws_project_66_4.setTagInfo(_td_ws_project_66_4);
                    _jettag_ws_project_66_4.doStart(context, out);
                    while (_jettag_ws_project_66_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_ws_folder_67_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_67_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_folder_67_6.setRuntimeParent(_jettag_ws_project_66_4);
                        _jettag_ws_folder_67_6.setTagInfo(_td_ws_folder_67_6);
                        _jettag_ws_folder_67_6.doStart(context, out);
                        while (_jettag_ws_folder_67_6.okToProcessBody()) {
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_68_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_68_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_68_8.setRuntimeParent(_jettag_ws_folder_67_6);
                            _jettag_java_class_68_8.setTagInfo(_td_java_class_68_8);
                            _jettag_java_class_68_8.doStart(context, out);
                            _jettag_java_class_68_8.doEnd();
                            out.write(NL);         
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_72_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_72_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_72_8.setRuntimeParent(_jettag_ws_folder_67_6);
                            _jettag_java_class_72_8.setTagInfo(_td_java_class_72_8);
                            _jettag_java_class_72_8.doStart(context, out);
                            _jettag_java_class_72_8.doEnd();
                            out.write(NL);         
                            out.write("    \t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_java_class_77_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_77_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_class_77_8.setRuntimeParent(_jettag_ws_folder_67_6);
                            _jettag_java_class_77_8.setTagInfo(_td_java_class_77_8);
                            _jettag_java_class_77_8.doStart(context, out);
                            _jettag_java_class_77_8.doEnd();
                            out.write(NL);         
                            _jettag_ws_folder_67_6.handleBodyContent(out);
                        }
                        _jettag_ws_folder_67_6.doEnd();
                        _jettag_ws_project_66_4.handleBodyContent(out);
                    }
                    _jettag_ws_project_66_4.doEnd();
                    _jettag_c_otherwise_64_3.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_64_3_saved_out;
                _jettag_c_otherwise_64_3.doEnd();
                _jettag_c_choose_30_2.handleBodyContent(out);
            }
            out = _jettag_c_choose_30_2_saved_out;
            _jettag_c_choose_30_2.doEnd();
            _jettag_ws_project_17_1.handleBodyContent(out);
        }
        _jettag_ws_project_17_1.doEnd();
    }
}

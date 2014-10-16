package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_comparch_sc implements JET2Template {
    private static final String _jetns_mytag = "edu.uci.isr.mytaglib.myTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_comparch_sc() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$archDefinedPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_3_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            3, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "{$archDefinedPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_14 = new TagInfo("c:get", //$NON-NLS-1$
            5, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$archDefinedClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_59 = new TagInfo("java:import", //$NON-NLS-1$
            5, 59,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_5_127 = new TagInfo("c:if", //$NON-NLS-1$
            5, 127,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "cardinality($currComp/interface[direction='in']/type , '1M')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_220 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 220,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_314 = new TagInfo("java:import", //$NON-NLS-1$
            5, 314,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_5_327 = new TagInfo("c:get", //$NON-NLS-1$
            5, 327,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$scRef/state[@stateType='state']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_20_3 = new TagInfo("c:with", //$NON-NLS-1$
            20, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_21_25 = new TagInfo("java:import", //$NON-NLS-1$
            21, 25,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_21_118 = new TagInfo("java:import", //$NON-NLS-1$
            21, 118,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_28_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='out']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_29_3 = new TagInfo("c:with", //$NON-NLS-1$
            29, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_30_12 = new TagInfo("java:import", //$NON-NLS-1$
            30, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_37_9 = new TagInfo("java:import", //$NON-NLS-1$
            37, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_49_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$scRef/state[@stateType='state']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_52_1 = new TagInfo("c:with", //$NON-NLS-1$
            52, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$scRef/transition[substring(string(fromState/@href),2)=$scRef/state[@stateType='initial']/@id]/toState/@href", //$NON-NLS-1$
                "firstStateId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_66_15 = new TagInfo("java:import", //$NON-NLS-1$
            66, 15,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_82_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='out']", //$NON-NLS-1$
                "interface", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_83_3 = new TagInfo("c:with", //$NON-NLS-1$
            83, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$interface/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_84_5 = new TagInfo("c:with", //$NON-NLS-1$
            84, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_105_33 = new TagInfo("java:import", //$NON-NLS-1$
            105, 33,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_106_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            106, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_107_3 = new TagInfo("c:with", //$NON-NLS-1$
            107, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_121_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            121, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mytag_loadClass_123_3 = new TagInfo("mytag:loadClass", //$NON-NLS-1$
            123, 3,
            new String[] {
                "project", //$NON-NLS-1$
                "fqn", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}", //$NON-NLS-1$
                "{//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName}", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_125_5 = new TagInfo("c:with", //$NON-NLS-1$
            125, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_125_95 = new TagInfo("c:iterate", //$NON-NLS-1$
            125, 95,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_125_175 = new TagInfo("java:import", //$NON-NLS-1$
            125, 175,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_127_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            127, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//bodyDeclarations[@nodeType = 'MethodDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_128_63 = new TagInfo("c:iterate", //$NON-NLS-1$
            128, 63,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_128_126 = new TagInfo("c:with", //$NON-NLS-1$
            128, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_128_202 = new TagInfo("c:iterate", //$NON-NLS-1$
            128, 202,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_129_3 = new TagInfo("c:if", //$NON-NLS-1$
            129, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "returnType2/@nodeType!='PrimitiveType' or returnType2/@primitiveTypeCode!='void'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_129_139 = new TagInfo("c:iterate", //$NON-NLS-1$
            129, 139,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_3_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_3_1.setRuntimeParent(null);
        _jettag_java_importsLocation_3_1.setTagInfo(_td_java_importsLocation_3_1);
        _jettag_java_importsLocation_3_1.doStart(context, out);
        _jettag_java_importsLocation_3_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_14.setRuntimeParent(null);
        _jettag_c_get_5_14.setTagInfo(_td_c_get_5_14);
        _jettag_c_get_5_14.doStart(context, out);
        _jettag_c_get_5_14.doEnd();
        out.write(" extends ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_5_59 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_5_59.setRuntimeParent(null);
        _jettag_java_import_5_59.setTagInfo(_td_java_import_5_59);
        _jettag_java_import_5_59.doStart(context, out);
        JET2Writer _jettag_java_import_5_59_saved_out = out;
        while (_jettag_java_import_5_59.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("edu.uci.isr.myx.fw.AbstractMyxSimpleBrick");  //$NON-NLS-1$        
            _jettag_java_import_5_59.handleBodyContent(out);
        }
        out = _jettag_java_import_5_59_saved_out;
        _jettag_java_import_5_59.doEnd();
        RuntimeTagElement _jettag_c_if_5_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_127); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_127.setRuntimeParent(null);
        _jettag_c_if_5_127.setTagInfo(_td_c_if_5_127);
        _jettag_c_if_5_127.doStart(context, out);
        while (_jettag_c_if_5_127.okToProcessBody()) {
            out.write(" implements ");  //$NON-NLS-1$        
            _jettag_c_if_5_127.handleBodyContent(out);
        }
        _jettag_c_if_5_127.doEnd();
        RuntimeTagElement _jettag_c_iterate_5_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_220); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_220.setRuntimeParent(null);
        _jettag_c_iterate_5_220.setTagInfo(_td_c_iterate_5_220);
        _jettag_c_iterate_5_220.doStart(context, out);
        while (_jettag_c_iterate_5_220.okToProcessBody()) {
            RuntimeTagElement _jettag_java_import_5_314 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_314); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_5_314.setRuntimeParent(_jettag_c_iterate_5_220);
            _jettag_java_import_5_314.setTagInfo(_td_java_import_5_314);
            _jettag_java_import_5_314.doStart(context, out);
            JET2Writer _jettag_java_import_5_314_saved_out = out;
            while (_jettag_java_import_5_314.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_5_327 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_327); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_327.setRuntimeParent(_jettag_java_import_5_314);
                _jettag_c_get_5_327.setTagInfo(_td_c_get_5_327);
                _jettag_c_get_5_327.doStart(context, out);
                _jettag_c_get_5_327.doEnd();
                _jettag_java_import_5_314.handleBodyContent(out);
            }
            out = _jettag_java_import_5_314_saved_out;
            _jettag_java_import_5_314.doEnd();
            _jettag_c_iterate_5_220.handleBodyContent(out);
        }
        _jettag_c_iterate_5_220.doEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //  State variables
        out.write("\tprivate ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$compDesp}", 11, 10)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State m_state = null;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_12_1.setRuntimeParent(null);
        _jettag_c_iterate_12_1.setTagInfo(_td_c_iterate_12_1);
        _jettag_c_iterate_12_1.doStart(context, out);
        while (_jettag_c_iterate_12_1.okToProcessBody()) {
            out.write("\tpublic ");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$compDesp}", 13, 9)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write("State ");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${removeWhitespace(description)}", 13, 27)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write("State;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_12_1.handleBodyContent(out);
        }
        _jettag_c_iterate_12_1.doEnd();
        out.write(NL);         
        //
        //  This is to generate Myx-related variables.
        RuntimeTagElement _jettag_c_iterate_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_19_1.setRuntimeParent(null);
        _jettag_c_iterate_19_1.setTagInfo(_td_c_iterate_19_1);
        _jettag_c_iterate_19_1.doStart(context, out);
        while (_jettag_c_iterate_19_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_20_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_20_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_20_3.setRuntimeParent(_jettag_c_iterate_19_1);
            _jettag_c_with_20_3.setTagInfo(_td_c_with_20_3);
            _jettag_c_with_20_3.doStart(context, out);
            while (_jettag_c_with_20_3.okToProcessBody()) {
                out.write("    public static final ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_21_25 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_25.setRuntimeParent(_jettag_c_with_20_3);
                _jettag_java_import_21_25.setTagInfo(_td_java_import_21_25);
                _jettag_java_import_21_25.doStart(context, out);
                JET2Writer _jettag_java_import_21_25_saved_out = out;
                while (_jettag_java_import_21_25.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("edu.uci.isr.myx.fw.IMyxName");  //$NON-NLS-1$        
                    _jettag_java_import_21_25.handleBodyContent(out);
                }
                out = _jettag_java_import_21_25_saved_out;
                _jettag_java_import_21_25.doEnd();
                out.write(" msg_");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 21, 84)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_21_118 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_118); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_118.setRuntimeParent(_jettag_c_with_20_3);
                _jettag_java_import_21_118.setTagInfo(_td_java_import_21_118);
                _jettag_java_import_21_118.doStart(context, out);
                JET2Writer _jettag_java_import_21_118_saved_out = out;
                while (_jettag_java_import_21_118.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("edu.uci.isr.myx.fw.MyxUtils");  //$NON-NLS-1$        
                    _jettag_java_import_21_118.handleBodyContent(out);
                }
                out = _jettag_java_import_21_118_saved_out;
                _jettag_java_import_21_118.doEnd();
                out.write(".createName(\"");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${$intfName}", 21, 185)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_with_20_3.handleBodyContent(out);
            }
            _jettag_c_with_20_3.doEnd();
            _jettag_c_iterate_19_1.handleBodyContent(out);
        }
        _jettag_c_iterate_19_1.doEnd();
        out.write(NL);         
        //
        //  For each "out" interface, declare a variable "OUT_XXX" of that interface type.
        RuntimeTagElement _jettag_c_iterate_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_28_1.setRuntimeParent(null);
        _jettag_c_iterate_28_1.setTagInfo(_td_c_iterate_28_1);
        _jettag_c_iterate_28_1.doStart(context, out);
        while (_jettag_c_iterate_28_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_29_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_29_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_29_3.setRuntimeParent(_jettag_c_iterate_28_1);
            _jettag_c_with_29_3.setTagInfo(_td_c_with_29_3);
            _jettag_c_with_29_3.doStart(context, out);
            while (_jettag_c_with_29_3.okToProcessBody()) {
                out.write("    public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_30_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_30_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_30_12.setRuntimeParent(_jettag_c_with_29_3);
                _jettag_java_import_30_12.setTagInfo(_td_java_import_30_12);
                _jettag_java_import_30_12.doStart(context, out);
                JET2Writer _jettag_java_import_30_12_saved_out = out;
                while (_jettag_java_import_30_12.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${$intfName}", 30, 25)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_30_12.handleBodyContent(out);
                }
                out = _jettag_java_import_30_12_saved_out;
                _jettag_java_import_30_12.doEnd();
                out.write(" OUT_");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 30, 56)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_with_29_3.handleBodyContent(out);
            }
            _jettag_c_with_29_3.doEnd();
            _jettag_c_iterate_28_1.handleBodyContent(out);
        }
        _jettag_c_iterate_28_1.doEnd();
        out.write(NL);         
        //
        //  Implementation reference
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_37_9 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_37_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_37_9.setRuntimeParent(null);
        _jettag_java_import_37_9.setTagInfo(_td_java_import_37_9);
        _jettag_java_import_37_9.doStart(context, out);
        JET2Writer _jettag_java_import_37_9_saved_out = out;
        while (_jettag_java_import_37_9.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$iPrimitivesPackage}", 37, 22)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$iPrimitives}", 37, 45)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_37_9.handleBodyContent(out);
        }
        out = _jettag_java_import_37_9_saved_out;
        _jettag_java_import_37_9.doEnd();
        out.write(" _imp;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //  Constructor
        out.write("    public ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 42, 12)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" (){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_imp = getImplementation();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (_imp != null){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t_imp.setArch(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSystem.exit(1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_49_1.setRuntimeParent(null);
        _jettag_c_iterate_49_1.setTagInfo(_td_c_iterate_49_1);
        _jettag_c_iterate_49_1.doStart(context, out);
        while (_jettag_c_iterate_49_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${removeWhitespace(description)}", 50, 3)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write("State = new ");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$compDesp}", 50, 47)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(context.embeddedExpressionAsString("${removeWhitespace(description)}", 50, 59)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write("State(this);");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_49_1.handleBodyContent(out);
        }
        _jettag_c_iterate_49_1.doEnd();
        RuntimeTagElement _jettag_c_with_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_with_52_1.setRuntimeParent(null);
        _jettag_c_with_52_1.setTagInfo(_td_c_with_52_1);
        _jettag_c_with_52_1.doStart(context, out);
        while (_jettag_c_with_52_1.okToProcessBody()) {
            out.write("\t\tsetState(");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${removeWhitespace($scRef/state[@id=substring(string($firstStateId),2)]/description)}", 53, 12)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write("State);");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_with_52_1.handleBodyContent(out);
        }
        _jettag_c_with_52_1.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setState(");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$compDesp}", 57, 23)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State newState){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tm_state = newState;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        //
        //  To obtain an instance of user-defined implementation.
        out.write("    protected ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$iPrimitives}", 64, 15)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" getImplementation(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_66_15 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_66_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_66_15.setRuntimeParent(null);
        _jettag_java_import_66_15.setTagInfo(_td_java_import_66_15);
        _jettag_java_import_66_15.doStart(context, out);
        JET2Writer _jettag_java_import_66_15_saved_out = out;
        while (_jettag_java_import_66_15.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$userDefinedPackage}", 66, 28)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$userDefinedClass}", 66, 51)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_66_15.handleBodyContent(out);
        }
        out = _jettag_java_import_66_15_saved_out;
        _jettag_java_import_66_15.doEnd();
        out.write("();    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } catch (Exception e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            System.err.println(e.getMessage());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //  This is to generate Myx-realted Methods: init(), begin(), ...
        out.write("    public void init(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        _imp.init();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public void begin(){");  //$NON-NLS-1$        
        out.write(NL);         
        //Initialize "out" interfaces
        RuntimeTagElement _jettag_c_iterate_82_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_82_1.setRuntimeParent(null);
        _jettag_c_iterate_82_1.setTagInfo(_td_c_iterate_82_1);
        _jettag_c_iterate_82_1.doStart(context, out);
        while (_jettag_c_iterate_82_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_83_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_83_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_83_3.setRuntimeParent(_jettag_c_iterate_82_1);
            _jettag_c_with_83_3.setTagInfo(_td_c_with_83_3);
            _jettag_c_with_83_3.doStart(context, out);
            while (_jettag_c_with_83_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_with_84_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_84_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_with_84_5.setRuntimeParent(_jettag_c_with_83_3);
                _jettag_c_with_84_5.setTagInfo(_td_c_with_84_5);
                _jettag_c_with_84_5.doStart(context, out);
                while (_jettag_c_with_84_5.okToProcessBody()) {
                    out.write("        OUT_");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 85, 13)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" = (");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 85, 48)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(") MyxUtils.getFirstRequiredServiceObject(this,msg_");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 85, 129)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        if (OUT_");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 86, 17)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" == null){");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(" \t\t\tSystem.err.println(\"Error: Interface ");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${$intfName}", 87, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" returned null\");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn;       ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        }");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_with_84_5.handleBodyContent(out);
                }
                _jettag_c_with_84_5.doEnd();
                _jettag_c_with_83_3.handleBodyContent(out);
            }
            _jettag_c_with_83_3.doEnd();
            _jettag_c_iterate_82_1.handleBodyContent(out);
        }
        _jettag_c_iterate_82_1.doEnd();
        out.write("        _imp.begin();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public void end(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        _imp.end();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public void destroy(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        _imp.destroy();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        //Return "in" interface objects
        out.write("\tpublic Object getServiceObject(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_105_33 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_105_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_105_33.setRuntimeParent(null);
        _jettag_java_import_105_33.setTagInfo(_td_java_import_105_33);
        _jettag_java_import_105_33.doStart(context, out);
        JET2Writer _jettag_java_import_105_33_saved_out = out;
        while (_jettag_java_import_105_33.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("edu.uci.isr.myx.fw.IMyxName");  //$NON-NLS-1$        
            _jettag_java_import_105_33.handleBodyContent(out);
        }
        out = _jettag_java_import_105_33_saved_out;
        _jettag_java_import_105_33.doEnd();
        out.write(" arg0) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_106_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_106_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_106_1.setRuntimeParent(null);
        _jettag_c_iterate_106_1.setTagInfo(_td_c_iterate_106_1);
        _jettag_c_iterate_106_1.doStart(context, out);
        while (_jettag_c_iterate_106_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_107_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_107_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_107_3.setRuntimeParent(_jettag_c_iterate_106_1);
            _jettag_c_with_107_3.setTagInfo(_td_c_with_107_3);
            _jettag_c_with_107_3.doStart(context, out);
            while (_jettag_c_with_107_3.okToProcessBody()) {
                out.write("\t\tif (arg0.equals(msg_");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 108, 23)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(")){");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn this;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}        ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_with_107_3.handleBodyContent(out);
            }
            _jettag_c_with_107_3.doEnd();
            _jettag_c_iterate_106_1.handleBodyContent(out);
        }
        _jettag_c_iterate_106_1.doEnd();
        out.write("\t\treturn null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        //
        //  For each "in" interface, do the following.
        //  Step 0: load the interface java file.
        //  Step 1: import what is explictly imported in the interface file.
        //  Step 2: implement the methods declared in the interface by forwarding whatever requests to the implementor.
        RuntimeTagElement _jettag_c_iterate_121_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_121_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_121_1.setRuntimeParent(null);
        _jettag_c_iterate_121_1.setTagInfo(_td_c_iterate_121_1);
        _jettag_c_iterate_121_1.doStart(context, out);
        while (_jettag_c_iterate_121_1.okToProcessBody()) {
            //Step 0
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mytag_loadClass_123_3 = context.getTagFactory().createRuntimeTag(_jetns_mytag, "loadClass", "mytag:loadClass", _td_mytag_loadClass_123_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mytag_loadClass_123_3.setRuntimeParent(_jettag_c_iterate_121_1);
            _jettag_mytag_loadClass_123_3.setTagInfo(_td_mytag_loadClass_123_3);
            _jettag_mytag_loadClass_123_3.doStart(context, out);
            _jettag_mytag_loadClass_123_3.doEnd();
            out.write(NL);         
            //Step 1
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_with_125_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_125_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_125_5.setRuntimeParent(_jettag_c_iterate_121_1);
            _jettag_c_with_125_5.setTagInfo(_td_c_with_125_5);
            _jettag_c_with_125_5.doStart(context, out);
            while (_jettag_c_with_125_5.okToProcessBody()) {
                out.write("//To be imported: ");  //$NON-NLS-1$        
                _jettag_c_with_125_5.handleBodyContent(out);
            }
            _jettag_c_with_125_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_125_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_125_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_125_95.setRuntimeParent(_jettag_c_iterate_121_1);
            _jettag_c_iterate_125_95.setTagInfo(_td_c_iterate_125_95);
            _jettag_c_iterate_125_95.doStart(context, out);
            while (_jettag_c_iterate_125_95.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_125_175 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_125_175); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_125_175.setRuntimeParent(_jettag_c_iterate_125_95);
                _jettag_java_import_125_175.setTagInfo(_td_java_import_125_175);
                _jettag_java_import_125_175.doStart(context, out);
                JET2Writer _jettag_java_import_125_175_saved_out = out;
                while (_jettag_java_import_125_175.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${name[@nodeType='QualifiedName']}", 125, 188)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_125_175.handleBodyContent(out);
                }
                out = _jettag_java_import_125_175_saved_out;
                _jettag_java_import_125_175.doEnd();
                _jettag_c_iterate_125_95.handleBodyContent(out);
            }
            _jettag_c_iterate_125_95.doEnd();
            out.write(NL);         
            //Step 2
            RuntimeTagElement _jettag_c_iterate_127_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_127_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_127_5.setRuntimeParent(_jettag_c_iterate_121_1);
            _jettag_c_iterate_127_5.setTagInfo(_td_c_iterate_127_5);
            _jettag_c_iterate_127_5.doStart(context, out);
            while (_jettag_c_iterate_127_5.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${modifiers/@keyword}", 128, 5)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" ");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${returnType2}", 128, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" ");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${name/@identifier}", 128, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" (");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_128_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_128_63.setRuntimeParent(_jettag_c_iterate_127_5);
                _jettag_c_iterate_128_63.setTagInfo(_td_c_iterate_128_63);
                _jettag_c_iterate_128_63.doStart(context, out);
                while (_jettag_c_iterate_128_63.okToProcessBody()) {
                    out.write(context.embeddedExpressionAsString("${.}", 128, 108)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_128_63.handleBodyContent(out);
                }
                _jettag_c_iterate_128_63.doEnd();
                out.write(") ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_with_128_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_128_126); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_with_128_126.setRuntimeParent(_jettag_c_iterate_127_5);
                _jettag_c_with_128_126.setTagInfo(_td_c_with_128_126);
                _jettag_c_with_128_126.doStart(context, out);
                while (_jettag_c_with_128_126.okToProcessBody()) {
                    out.write("throws");  //$NON-NLS-1$        
                    _jettag_c_with_128_126.handleBodyContent(out);
                }
                _jettag_c_with_128_126.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_128_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_202); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_128_202.setRuntimeParent(_jettag_c_iterate_127_5);
                _jettag_c_iterate_128_202.setTagInfo(_td_c_iterate_128_202);
                _jettag_c_iterate_128_202.doStart(context, out);
                while (_jettag_c_iterate_128_202.okToProcessBody()) {
                    out.write(context.embeddedExpressionAsString("${@identifier}", 128, 279)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_128_202.handleBodyContent(out);
                }
                _jettag_c_iterate_128_202.doEnd();
                out.write(" {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_129_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_129_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_129_3.setRuntimeParent(_jettag_c_iterate_127_5);
                _jettag_c_if_129_3.setTagInfo(_td_c_if_129_3);
                _jettag_c_if_129_3.doStart(context, out);
                while (_jettag_c_if_129_3.okToProcessBody()) {
                    out.write("return ");  //$NON-NLS-1$        
                    _jettag_c_if_129_3.handleBodyContent(out);
                }
                _jettag_c_if_129_3.doEnd();
                out.write("m_state.");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${name/@identifier}", 129, 119)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_129_139 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_129_139); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_129_139.setRuntimeParent(_jettag_c_iterate_127_5);
                _jettag_c_iterate_129_139.setTagInfo(_td_c_iterate_129_139);
                _jettag_c_iterate_129_139.doStart(context, out);
                while (_jettag_c_iterate_129_139.okToProcessBody()) {
                    out.write(context.embeddedExpressionAsString("${name/@identifier}", 129, 184)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_129_139.handleBodyContent(out);
                }
                _jettag_c_iterate_129_139.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    }    ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_127_5.handleBodyContent(out);
            }
            _jettag_c_iterate_127_5.doEnd();
            _jettag_c_iterate_121_1.handleBodyContent(out);
        }
        _jettag_c_iterate_121_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
    }
}

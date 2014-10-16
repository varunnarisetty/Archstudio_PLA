package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_comparch implements JET2Template {
    private static final String _jetns_mytag = "edu.uci.isr.mytaglib.myTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_comparch() {
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
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_11_3 = new TagInfo("c:with", //$NON-NLS-1$
            11, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_25 = new TagInfo("java:import", //$NON-NLS-1$
            12, 25,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_12_118 = new TagInfo("java:import", //$NON-NLS-1$
            12, 118,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_19_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='out']/type/@href", //$NON-NLS-1$
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
    private static final TagInfo _td_java_import_21_12 = new TagInfo("java:import", //$NON-NLS-1$
            21, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_28_10 = new TagInfo("java:import", //$NON-NLS-1$
            28, 10,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_47_15 = new TagInfo("java:import", //$NON-NLS-1$
            47, 15,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_63_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='out']", //$NON-NLS-1$
                "interface", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_64_3 = new TagInfo("c:with", //$NON-NLS-1$
            64, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$interface/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_65_5 = new TagInfo("c:with", //$NON-NLS-1$
            65, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_86_33 = new TagInfo("java:import", //$NON-NLS-1$
            86, 33,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_87_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            87, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_88_3 = new TagInfo("c:with", //$NON-NLS-1$
            88, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceType[@id=substring(string($typeID),2)]/implementation/mainClass/javaClassName", //$NON-NLS-1$
                "intfName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_102_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            102, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mytag_loadClass_104_3 = new TagInfo("mytag:loadClass", //$NON-NLS-1$
            104, 3,
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
    private static final TagInfo _td_c_with_106_5 = new TagInfo("c:with", //$NON-NLS-1$
            106, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_106_95 = new TagInfo("c:iterate", //$NON-NLS-1$
            106, 95,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_106_175 = new TagInfo("java:import", //$NON-NLS-1$
            106, 175,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_108_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            108, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//bodyDeclarations[@nodeType = 'MethodDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_109_5 = new TagInfo("c:choose", //$NON-NLS-1$
            109, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_111_5 = new TagInfo("c:when", //$NON-NLS-1$
            111, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "javadoc/tags[1]//@tagName='@see'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_112_63 = new TagInfo("c:iterate", //$NON-NLS-1$
            112, 63,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_112_126 = new TagInfo("c:with", //$NON-NLS-1$
            112, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_112_202 = new TagInfo("c:iterate", //$NON-NLS-1$
            112, 202,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_113_7 = new TagInfo("c:with", //$NON-NLS-1$
            113, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "javadoc/tags[1]//fragments[@nodeType='TextElement']/@text", //$NON-NLS-1$
                "interactionId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_114_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            114, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xarch/interaction[@id=trimWhitespace($interactionId)]/message", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_116_7 = new TagInfo("c:choose", //$NON-NLS-1$
            116, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_117_7 = new TagInfo("c:when", //$NON-NLS-1$
            117, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "interfaceClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_118_7 = new TagInfo("c:choose", //$NON-NLS-1$
            118, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_119_7 = new TagInfo("c:when", //$NON-NLS-1$
            119, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "contains(string(description),'=')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_122_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            122, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_otherwise_127_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            127, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_otherwise_137_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            137, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_138_63 = new TagInfo("c:iterate", //$NON-NLS-1$
            138, 63,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_138_126 = new TagInfo("c:with", //$NON-NLS-1$
            138, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_138_202 = new TagInfo("c:iterate", //$NON-NLS-1$
            138, 202,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_139_3 = new TagInfo("c:if", //$NON-NLS-1$
            139, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "returnType2/@nodeType!='PrimitiveType' or returnType2/@primitiveTypeCode!='void'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_139_136 = new TagInfo("c:iterate", //$NON-NLS-1$
            139, 136,
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
        //
        //  This is to generate Myx-related variables.
        RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_1.setRuntimeParent(null);
        _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
        _jettag_c_iterate_10_1.doStart(context, out);
        while (_jettag_c_iterate_10_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_11_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_11_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_11_3.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_with_11_3.setTagInfo(_td_c_with_11_3);
            _jettag_c_with_11_3.doStart(context, out);
            while (_jettag_c_with_11_3.okToProcessBody()) {
                out.write("    public static final ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_12_25 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_12_25.setRuntimeParent(_jettag_c_with_11_3);
                _jettag_java_import_12_25.setTagInfo(_td_java_import_12_25);
                _jettag_java_import_12_25.doStart(context, out);
                JET2Writer _jettag_java_import_12_25_saved_out = out;
                while (_jettag_java_import_12_25.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("edu.uci.isr.myx.fw.IMyxName");  //$NON-NLS-1$        
                    _jettag_java_import_12_25.handleBodyContent(out);
                }
                out = _jettag_java_import_12_25_saved_out;
                _jettag_java_import_12_25.doEnd();
                out.write(" msg_");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 12, 84)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_12_118 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_118); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_12_118.setRuntimeParent(_jettag_c_with_11_3);
                _jettag_java_import_12_118.setTagInfo(_td_java_import_12_118);
                _jettag_java_import_12_118.doStart(context, out);
                JET2Writer _jettag_java_import_12_118_saved_out = out;
                while (_jettag_java_import_12_118.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("edu.uci.isr.myx.fw.MyxUtils");  //$NON-NLS-1$        
                    _jettag_java_import_12_118.handleBodyContent(out);
                }
                out = _jettag_java_import_12_118_saved_out;
                _jettag_java_import_12_118.doEnd();
                out.write(".createName(\"");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${$intfName}", 12, 185)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_with_11_3.handleBodyContent(out);
            }
            _jettag_c_with_11_3.doEnd();
            _jettag_c_iterate_10_1.handleBodyContent(out);
        }
        _jettag_c_iterate_10_1.doEnd();
        out.write(NL);         
        //
        //  For each "out" interface, declare a variable "OUT_XXX" of that interface type.
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
                out.write("    public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_21_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_12.setRuntimeParent(_jettag_c_with_20_3);
                _jettag_java_import_21_12.setTagInfo(_td_java_import_21_12);
                _jettag_java_import_21_12.doStart(context, out);
                JET2Writer _jettag_java_import_21_12_saved_out = out;
                while (_jettag_java_import_21_12.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${$intfName}", 21, 25)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_21_12.handleBodyContent(out);
                }
                out = _jettag_java_import_21_12_saved_out;
                _jettag_java_import_21_12.doEnd();
                out.write(" OUT_");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 21, 56)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_with_20_3.handleBodyContent(out);
            }
            _jettag_c_with_20_3.doEnd();
            _jettag_c_iterate_19_1.handleBodyContent(out);
        }
        _jettag_c_iterate_19_1.doEnd();
        out.write(NL);         
        //
        //  Implementation reference
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_28_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_28_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_28_10.setRuntimeParent(null);
        _jettag_java_import_28_10.setTagInfo(_td_java_import_28_10);
        _jettag_java_import_28_10.doStart(context, out);
        JET2Writer _jettag_java_import_28_10_saved_out = out;
        while (_jettag_java_import_28_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$iPrimitivesPackage}", 28, 23)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$iPrimitives}", 28, 46)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_28_10.handleBodyContent(out);
        }
        out = _jettag_java_import_28_10_saved_out;
        _jettag_java_import_28_10.doEnd();
        out.write(" _imp;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //  Constructor
        out.write("    public ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 33, 12)); //$NON-NLS-1$ //$NON-NLS-2$
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
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        //
        //  To obtain an instance of user-defined implementation.
        out.write("    protected ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$iPrimitives}", 45, 15)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" getImplementation(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        try{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_47_15 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_47_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_47_15.setRuntimeParent(null);
        _jettag_java_import_47_15.setTagInfo(_td_java_import_47_15);
        _jettag_java_import_47_15.doStart(context, out);
        JET2Writer _jettag_java_import_47_15_saved_out = out;
        while (_jettag_java_import_47_15.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$userDefinedPackage}", 47, 28)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$userDefinedClass}", 47, 51)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_47_15.handleBodyContent(out);
        }
        out = _jettag_java_import_47_15_saved_out;
        _jettag_java_import_47_15.doEnd();
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
        RuntimeTagElement _jettag_c_iterate_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_63_1.setRuntimeParent(null);
        _jettag_c_iterate_63_1.setTagInfo(_td_c_iterate_63_1);
        _jettag_c_iterate_63_1.doStart(context, out);
        while (_jettag_c_iterate_63_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_64_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_64_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_64_3.setRuntimeParent(_jettag_c_iterate_63_1);
            _jettag_c_with_64_3.setTagInfo(_td_c_with_64_3);
            _jettag_c_with_64_3.doStart(context, out);
            while (_jettag_c_with_64_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_with_65_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_65_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_with_65_5.setRuntimeParent(_jettag_c_with_64_3);
                _jettag_c_with_65_5.setTagInfo(_td_c_with_65_5);
                _jettag_c_with_65_5.doStart(context, out);
                while (_jettag_c_with_65_5.okToProcessBody()) {
                    out.write("        OUT_");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 66, 13)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" = (");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 66, 48)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(") MyxUtils.getFirstRequiredServiceObject(this,msg_");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 66, 129)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        if (OUT_");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 67, 17)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" == null){");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(" \t\t\tSystem.err.println(\"Error: Interface ");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${$intfName}", 68, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" returned null\");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn;       ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        }");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_with_65_5.handleBodyContent(out);
                }
                _jettag_c_with_65_5.doEnd();
                _jettag_c_with_64_3.handleBodyContent(out);
            }
            _jettag_c_with_64_3.doEnd();
            _jettag_c_iterate_63_1.handleBodyContent(out);
        }
        _jettag_c_iterate_63_1.doEnd();
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
        RuntimeTagElement _jettag_java_import_86_33 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_86_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_86_33.setRuntimeParent(null);
        _jettag_java_import_86_33.setTagInfo(_td_java_import_86_33);
        _jettag_java_import_86_33.doStart(context, out);
        JET2Writer _jettag_java_import_86_33_saved_out = out;
        while (_jettag_java_import_86_33.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("edu.uci.isr.myx.fw.IMyxName");  //$NON-NLS-1$        
            _jettag_java_import_86_33.handleBodyContent(out);
        }
        out = _jettag_java_import_86_33_saved_out;
        _jettag_java_import_86_33.doEnd();
        out.write(" arg0) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_87_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_87_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_87_1.setRuntimeParent(null);
        _jettag_c_iterate_87_1.setTagInfo(_td_c_iterate_87_1);
        _jettag_c_iterate_87_1.doStart(context, out);
        while (_jettag_c_iterate_87_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_with_88_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_88_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_88_3.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_with_88_3.setTagInfo(_td_c_with_88_3);
            _jettag_c_with_88_3.doStart(context, out);
            while (_jettag_c_with_88_3.okToProcessBody()) {
                out.write("\t\tif (arg0.equals(msg_");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${className(string($intfName))}", 89, 23)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(")){");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\treturn this;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}        ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_with_88_3.handleBodyContent(out);
            }
            _jettag_c_with_88_3.doEnd();
            _jettag_c_iterate_87_1.handleBodyContent(out);
        }
        _jettag_c_iterate_87_1.doEnd();
        out.write("\t\treturn null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        //
        //  For each "in" interface, do the following.
        //  Step 0: load the interface java file.
        //  Step 1: import what is explictly imported in the interface file.
        //  Step 2: implement the methods declared in the interface by forwarding whatever requests to the implementor.
        RuntimeTagElement _jettag_c_iterate_102_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_102_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_102_1.setRuntimeParent(null);
        _jettag_c_iterate_102_1.setTagInfo(_td_c_iterate_102_1);
        _jettag_c_iterate_102_1.doStart(context, out);
        while (_jettag_c_iterate_102_1.okToProcessBody()) {
            //Step 0
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mytag_loadClass_104_3 = context.getTagFactory().createRuntimeTag(_jetns_mytag, "loadClass", "mytag:loadClass", _td_mytag_loadClass_104_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mytag_loadClass_104_3.setRuntimeParent(_jettag_c_iterate_102_1);
            _jettag_mytag_loadClass_104_3.setTagInfo(_td_mytag_loadClass_104_3);
            _jettag_mytag_loadClass_104_3.doStart(context, out);
            _jettag_mytag_loadClass_104_3.doEnd();
            out.write(NL);         
            //Step 1
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_with_106_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_106_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_106_5.setRuntimeParent(_jettag_c_iterate_102_1);
            _jettag_c_with_106_5.setTagInfo(_td_c_with_106_5);
            _jettag_c_with_106_5.doStart(context, out);
            while (_jettag_c_with_106_5.okToProcessBody()) {
                out.write("//To be imported: ");  //$NON-NLS-1$        
                _jettag_c_with_106_5.handleBodyContent(out);
            }
            _jettag_c_with_106_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_106_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_106_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_106_95.setRuntimeParent(_jettag_c_iterate_102_1);
            _jettag_c_iterate_106_95.setTagInfo(_td_c_iterate_106_95);
            _jettag_c_iterate_106_95.doStart(context, out);
            while (_jettag_c_iterate_106_95.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_106_175 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_106_175); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_106_175.setRuntimeParent(_jettag_c_iterate_106_95);
                _jettag_java_import_106_175.setTagInfo(_td_java_import_106_175);
                _jettag_java_import_106_175.doStart(context, out);
                JET2Writer _jettag_java_import_106_175_saved_out = out;
                while (_jettag_java_import_106_175.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${name[@nodeType='QualifiedName']}", 106, 188)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_106_175.handleBodyContent(out);
                }
                out = _jettag_java_import_106_175_saved_out;
                _jettag_java_import_106_175.doEnd();
                _jettag_c_iterate_106_95.handleBodyContent(out);
            }
            _jettag_c_iterate_106_95.doEnd();
            out.write(NL);         
            //Step 2
            RuntimeTagElement _jettag_c_iterate_108_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_108_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_108_5.setRuntimeParent(_jettag_c_iterate_102_1);
            _jettag_c_iterate_108_5.setTagInfo(_td_c_iterate_108_5);
            _jettag_c_iterate_108_5.doStart(context, out);
            while (_jettag_c_iterate_108_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_choose_109_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_109_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_109_5.setRuntimeParent(_jettag_c_iterate_108_5);
                _jettag_c_choose_109_5.setTagInfo(_td_c_choose_109_5);
                _jettag_c_choose_109_5.doStart(context, out);
                JET2Writer _jettag_c_choose_109_5_saved_out = out;
                while (_jettag_c_choose_109_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //Methods that are defined by interaction diagrams
                    RuntimeTagElement _jettag_c_when_111_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_111_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_111_5.setRuntimeParent(_jettag_c_choose_109_5);
                    _jettag_c_when_111_5.setTagInfo(_td_c_when_111_5);
                    _jettag_c_when_111_5.doStart(context, out);
                    JET2Writer _jettag_c_when_111_5_saved_out = out;
                    while (_jettag_c_when_111_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${modifiers/@keyword}", 112, 5)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${returnType2}", 112, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 112, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" (");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_112_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_112_63); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_112_63.setRuntimeParent(_jettag_c_when_111_5);
                        _jettag_c_iterate_112_63.setTagInfo(_td_c_iterate_112_63);
                        _jettag_c_iterate_112_63.doStart(context, out);
                        while (_jettag_c_iterate_112_63.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${.}", 112, 108)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_112_63.handleBodyContent(out);
                        }
                        _jettag_c_iterate_112_63.doEnd();
                        out.write(") ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_with_112_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_112_126); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_112_126.setRuntimeParent(_jettag_c_when_111_5);
                        _jettag_c_with_112_126.setTagInfo(_td_c_with_112_126);
                        _jettag_c_with_112_126.doStart(context, out);
                        while (_jettag_c_with_112_126.okToProcessBody()) {
                            out.write("throws");  //$NON-NLS-1$        
                            _jettag_c_with_112_126.handleBodyContent(out);
                        }
                        _jettag_c_with_112_126.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_112_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_112_202); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_112_202.setRuntimeParent(_jettag_c_when_111_5);
                        _jettag_c_iterate_112_202.setTagInfo(_td_c_iterate_112_202);
                        _jettag_c_iterate_112_202.doStart(context, out);
                        while (_jettag_c_iterate_112_202.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${@identifier}", 112, 279)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_112_202.handleBodyContent(out);
                        }
                        _jettag_c_iterate_112_202.doEnd();
                        out.write(" {");  //$NON-NLS-1$        
                        out.write(NL);         
                        RuntimeTagElement _jettag_c_with_113_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_113_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_113_7.setRuntimeParent(_jettag_c_when_111_5);
                        _jettag_c_with_113_7.setTagInfo(_td_c_with_113_7);
                        _jettag_c_with_113_7.doStart(context, out);
                        while (_jettag_c_with_113_7.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_iterate_114_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_114_7); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_114_7.setRuntimeParent(_jettag_c_with_113_7);
                            _jettag_c_iterate_114_7.setTagInfo(_td_c_iterate_114_7);
                            _jettag_c_iterate_114_7.doStart(context, out);
                            while (_jettag_c_iterate_114_7.okToProcessBody()) {
                                //A little bit tricky below: just to add implementation decisions in
                                RuntimeTagElement _jettag_c_choose_116_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_116_7); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_116_7.setRuntimeParent(_jettag_c_iterate_114_7);
                                _jettag_c_choose_116_7.setTagInfo(_td_c_choose_116_7);
                                _jettag_c_choose_116_7.doStart(context, out);
                                JET2Writer _jettag_c_choose_116_7_saved_out = out;
                                while (_jettag_c_choose_116_7.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_117_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_117_7); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_117_7.setRuntimeParent(_jettag_c_choose_116_7);
                                    _jettag_c_when_117_7.setTagInfo(_td_c_when_117_7);
                                    _jettag_c_when_117_7.doStart(context, out);
                                    JET2Writer _jettag_c_when_117_7_saved_out = out;
                                    while (_jettag_c_when_117_7.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_choose_118_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_118_7); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_118_7.setRuntimeParent(_jettag_c_when_117_7);
                                        _jettag_c_choose_118_7.setTagInfo(_td_c_choose_118_7);
                                        _jettag_c_choose_118_7.doStart(context, out);
                                        JET2Writer _jettag_c_choose_118_7_saved_out = out;
                                        while (_jettag_c_choose_118_7.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_119_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_119_7); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_119_7.setRuntimeParent(_jettag_c_choose_118_7);
                                            _jettag_c_when_119_7.setTagInfo(_td_c_when_119_7);
                                            _jettag_c_when_119_7.doStart(context, out);
                                            JET2Writer _jettag_c_when_119_7_saved_out = out;
                                            while (_jettag_c_when_119_7.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\t");  //$NON-NLS-1$        
                                                out.write(context.embeddedExpressionAsString("${substring-before(string(description),'=')}", 120, 3)); //$NON-NLS-1$ //$NON-NLS-2$
                                                out.write(" = OUT_");  //$NON-NLS-1$        
                                                out.write(context.embeddedExpressionAsString("${concat(className(string(interfaceClassName)), '.', trimWhitespace(substring-after(string(description),'=')))}", 120, 54)); //$NON-NLS-1$ //$NON-NLS-2$
                                                out.write(";");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_when_119_7.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_119_7_saved_out;
                                            _jettag_c_when_119_7.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_122_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_122_7); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_122_7.setRuntimeParent(_jettag_c_choose_118_7);
                                            _jettag_c_otherwise_122_7.setTagInfo(_td_c_otherwise_122_7);
                                            _jettag_c_otherwise_122_7.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_122_7_saved_out = out;
                                            while (_jettag_c_otherwise_122_7.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\tOUT_");  //$NON-NLS-1$        
                                                out.write(context.embeddedExpressionAsString("${concat(className(string(interfaceClassName)), '.', trimWhitespace(string(description)))}", 123, 7)); //$NON-NLS-1$ //$NON-NLS-2$
                                                out.write(";");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_122_7.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_122_7_saved_out;
                                            _jettag_c_otherwise_122_7.doEnd();
                                            _jettag_c_choose_118_7.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_118_7_saved_out;
                                        _jettag_c_choose_118_7.doEnd();
                                        _jettag_c_when_117_7.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_117_7_saved_out;
                                    _jettag_c_when_117_7.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_127_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_127_7); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_127_7.setRuntimeParent(_jettag_c_choose_116_7);
                                    _jettag_c_otherwise_127_7.setTagInfo(_td_c_otherwise_127_7);
                                    _jettag_c_otherwise_127_7.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_127_7_saved_out = out;
                                    while (_jettag_c_otherwise_127_7.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t");  //$NON-NLS-1$        
                                        out.write(context.embeddedExpressionAsString("${description}", 128, 3)); //$NON-NLS-1$ //$NON-NLS-2$
                                        out.write(";");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_127_7.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_127_7_saved_out;
                                    _jettag_c_otherwise_127_7.doEnd();
                                    _jettag_c_choose_116_7.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_116_7_saved_out;
                                _jettag_c_choose_116_7.doEnd();
                                //tricky ends here
                                _jettag_c_iterate_114_7.handleBodyContent(out);
                            }
                            _jettag_c_iterate_114_7.doEnd();
                            _jettag_c_with_113_7.handleBodyContent(out);
                        }
                        _jettag_c_with_113_7.doEnd();
                        out.write("    }    ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_111_5.handleBodyContent(out);
                    }
                    out = _jettag_c_when_111_5_saved_out;
                    _jettag_c_when_111_5.doEnd();
                    //Other Methods
                    RuntimeTagElement _jettag_c_otherwise_137_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_137_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_137_5.setRuntimeParent(_jettag_c_choose_109_5);
                    _jettag_c_otherwise_137_5.setTagInfo(_td_c_otherwise_137_5);
                    _jettag_c_otherwise_137_5.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_137_5_saved_out = out;
                    while (_jettag_c_otherwise_137_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${modifiers/@keyword}", 138, 5)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${returnType2}", 138, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 138, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" (");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_138_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_138_63); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_138_63.setRuntimeParent(_jettag_c_otherwise_137_5);
                        _jettag_c_iterate_138_63.setTagInfo(_td_c_iterate_138_63);
                        _jettag_c_iterate_138_63.doStart(context, out);
                        while (_jettag_c_iterate_138_63.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${.}", 138, 108)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_138_63.handleBodyContent(out);
                        }
                        _jettag_c_iterate_138_63.doEnd();
                        out.write(") ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_with_138_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_138_126); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_138_126.setRuntimeParent(_jettag_c_otherwise_137_5);
                        _jettag_c_with_138_126.setTagInfo(_td_c_with_138_126);
                        _jettag_c_with_138_126.doStart(context, out);
                        while (_jettag_c_with_138_126.okToProcessBody()) {
                            out.write("throws");  //$NON-NLS-1$        
                            _jettag_c_with_138_126.handleBodyContent(out);
                        }
                        _jettag_c_with_138_126.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_138_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_138_202); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_138_202.setRuntimeParent(_jettag_c_otherwise_137_5);
                        _jettag_c_iterate_138_202.setTagInfo(_td_c_iterate_138_202);
                        _jettag_c_iterate_138_202.doStart(context, out);
                        while (_jettag_c_iterate_138_202.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${@identifier}", 138, 279)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_138_202.handleBodyContent(out);
                        }
                        _jettag_c_iterate_138_202.doEnd();
                        out.write(" {");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_139_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_139_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_139_3.setRuntimeParent(_jettag_c_otherwise_137_5);
                        _jettag_c_if_139_3.setTagInfo(_td_c_if_139_3);
                        _jettag_c_if_139_3.doStart(context, out);
                        while (_jettag_c_if_139_3.okToProcessBody()) {
                            out.write("return ");  //$NON-NLS-1$        
                            _jettag_c_if_139_3.handleBodyContent(out);
                        }
                        _jettag_c_if_139_3.doEnd();
                        out.write("_imp.");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 139, 116)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write("(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_139_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_139_136); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_139_136.setRuntimeParent(_jettag_c_otherwise_137_5);
                        _jettag_c_iterate_139_136.setTagInfo(_td_c_iterate_139_136);
                        _jettag_c_iterate_139_136.doStart(context, out);
                        while (_jettag_c_iterate_139_136.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${name/@identifier}", 139, 181)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_139_136.handleBodyContent(out);
                        }
                        _jettag_c_iterate_139_136.doEnd();
                        out.write(");");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("    }    ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_137_5.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_137_5_saved_out;
                    _jettag_c_otherwise_137_5.doEnd();
                    _jettag_c_choose_109_5.handleBodyContent(out);
                }
                out = _jettag_c_choose_109_5_saved_out;
                _jettag_c_choose_109_5.doEnd();
                _jettag_c_iterate_108_5.handleBodyContent(out);
            }
            _jettag_c_iterate_108_5.doEnd();
            _jettag_c_iterate_102_1.handleBodyContent(out);
        }
        _jettag_c_iterate_102_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
    }
}

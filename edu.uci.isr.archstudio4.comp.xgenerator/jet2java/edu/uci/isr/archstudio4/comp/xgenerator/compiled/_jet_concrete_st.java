package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_concrete_st implements JET2Template {
    private static final String _jetns_mytag = "edu.uci.isr.mytaglib.myTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_concrete_st() {
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
    private static final TagInfo _td_c_iterate_17_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mytag_loadClass_19_3 = new TagInfo("mytag:loadClass", //$NON-NLS-1$
            19, 3,
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
    private static final TagInfo _td_c_with_21_5 = new TagInfo("c:with", //$NON-NLS-1$
            21, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_95 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 95,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_21_175 = new TagInfo("java:import", //$NON-NLS-1$
            21, 175,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_23_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//bodyDeclarations[@nodeType = 'MethodDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_24_5 = new TagInfo("c:choose", //$NON-NLS-1$
            24, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_26_5 = new TagInfo("c:when", //$NON-NLS-1$
            26, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "javadoc/tags[1]//@tagName='@see'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_63 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 63,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_27_126 = new TagInfo("c:with", //$NON-NLS-1$
            27, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_202 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 202,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_28_7 = new TagInfo("c:with", //$NON-NLS-1$
            28, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "javadoc/tags[1]//fragments[@nodeType='TextElement']/@text", //$NON-NLS-1$
                "interactionId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xarch/interaction[@id=trimWhitespace($interactionId)]/message", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_31_7 = new TagInfo("c:choose", //$NON-NLS-1$
            31, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_32_7 = new TagInfo("c:when", //$NON-NLS-1$
            32, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "interfaceClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_33_7 = new TagInfo("c:choose", //$NON-NLS-1$
            33, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_34_7 = new TagInfo("c:when", //$NON-NLS-1$
            34, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "contains(string(description),'=')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_37_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            37, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_otherwise_42_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            42, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_52_5 = new TagInfo("c:when", //$NON-NLS-1$
            52, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$scRef/transition[substring(string(fromState/@href),2)=$currState/@id]/trigger=name/@identifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_63 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 63,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_53_126 = new TagInfo("c:with", //$NON-NLS-1$
            53, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_202 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 202,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "name/@identifier", //$NON-NLS-1$
                "mthdName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_55_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            55, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$scRef/transition[(substring(string(fromState/@href),2)=$currState/@id) and (trigger=$mthdName)]", //$NON-NLS-1$
                "tran", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_3 = new TagInfo("c:if", //$NON-NLS-1$
            56, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$tran/effect", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_3 = new TagInfo("c:if", //$NON-NLS-1$
            59, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string($tran/fromState/@href)!=string($tran/toState/@href)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_62_3 = new TagInfo("c:if", //$NON-NLS-1$
            62, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "returnType2/@nodeType!='PrimitiveType' or returnType2/@primitiveTypeCode!='void'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_62_142 = new TagInfo("c:iterate", //$NON-NLS-1$
            62, 142,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_66_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            66, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_67_63 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 63,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_67_126 = new TagInfo("c:with", //$NON-NLS-1$
            67, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_202 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 202,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_68_3 = new TagInfo("c:if", //$NON-NLS-1$
            68, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "returnType2/@nodeType!='PrimitiveType' or returnType2/@primitiveTypeCode!='void'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_68_142 = new TagInfo("c:iterate", //$NON-NLS-1$
            68, 142,
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
        out.write(context.embeddedExpressionAsString("${$compDesp}", 5, 14)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(context.embeddedExpressionAsString("${$stateDesp}", 5, 26)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State extends ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$compDesp}", 5, 53)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$compDesp}", 7, 9)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(context.embeddedExpressionAsString("${$stateDesp}", 7, 21)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State(");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 7, 40)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" host){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper(host);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //  For each "in" interface, do the following.
        //  Step 0: load the interface java file.
        //  Step 1: import what is explictly imported in the interface file.
        //  Step 2: implement the methods declared in the interface by forwarding whatever requests to the implementor.
        RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_17_1.setRuntimeParent(null);
        _jettag_c_iterate_17_1.setTagInfo(_td_c_iterate_17_1);
        _jettag_c_iterate_17_1.doStart(context, out);
        while (_jettag_c_iterate_17_1.okToProcessBody()) {
            //Step 0
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mytag_loadClass_19_3 = context.getTagFactory().createRuntimeTag(_jetns_mytag, "loadClass", "mytag:loadClass", _td_mytag_loadClass_19_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mytag_loadClass_19_3.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_mytag_loadClass_19_3.setTagInfo(_td_mytag_loadClass_19_3);
            _jettag_mytag_loadClass_19_3.doStart(context, out);
            _jettag_mytag_loadClass_19_3.doEnd();
            out.write(NL);         
            //Step 1
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_with_21_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_21_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_21_5.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_with_21_5.setTagInfo(_td_c_with_21_5);
            _jettag_c_with_21_5.doStart(context, out);
            while (_jettag_c_with_21_5.okToProcessBody()) {
                out.write("//To be imported: ");  //$NON-NLS-1$        
                _jettag_c_with_21_5.handleBodyContent(out);
            }
            _jettag_c_with_21_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_21_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_21_95.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_iterate_21_95.setTagInfo(_td_c_iterate_21_95);
            _jettag_c_iterate_21_95.doStart(context, out);
            while (_jettag_c_iterate_21_95.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_21_175 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_175); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_175.setRuntimeParent(_jettag_c_iterate_21_95);
                _jettag_java_import_21_175.setTagInfo(_td_java_import_21_175);
                _jettag_java_import_21_175.doStart(context, out);
                JET2Writer _jettag_java_import_21_175_saved_out = out;
                while (_jettag_java_import_21_175.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${name[@nodeType='QualifiedName']}", 21, 188)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_21_175.handleBodyContent(out);
                }
                out = _jettag_java_import_21_175_saved_out;
                _jettag_java_import_21_175.doEnd();
                _jettag_c_iterate_21_95.handleBodyContent(out);
            }
            _jettag_c_iterate_21_95.doEnd();
            out.write(NL);         
            //Step 2
            RuntimeTagElement _jettag_c_iterate_23_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_23_5.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_iterate_23_5.setTagInfo(_td_c_iterate_23_5);
            _jettag_c_iterate_23_5.doStart(context, out);
            while (_jettag_c_iterate_23_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_choose_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_24_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_24_5.setRuntimeParent(_jettag_c_iterate_23_5);
                _jettag_c_choose_24_5.setTagInfo(_td_c_choose_24_5);
                _jettag_c_choose_24_5.doStart(context, out);
                JET2Writer _jettag_c_choose_24_5_saved_out = out;
                while (_jettag_c_choose_24_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //Methods that are defined by interaction diagrams
                    RuntimeTagElement _jettag_c_when_26_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_26_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_26_5.setRuntimeParent(_jettag_c_choose_24_5);
                    _jettag_c_when_26_5.setTagInfo(_td_c_when_26_5);
                    _jettag_c_when_26_5.doStart(context, out);
                    JET2Writer _jettag_c_when_26_5_saved_out = out;
                    while (_jettag_c_when_26_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${modifiers/@keyword}", 27, 5)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${returnType2}", 27, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 27, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" (");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_27_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_63); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_27_63.setRuntimeParent(_jettag_c_when_26_5);
                        _jettag_c_iterate_27_63.setTagInfo(_td_c_iterate_27_63);
                        _jettag_c_iterate_27_63.doStart(context, out);
                        while (_jettag_c_iterate_27_63.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${.}", 27, 108)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_27_63.handleBodyContent(out);
                        }
                        _jettag_c_iterate_27_63.doEnd();
                        out.write(") ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_with_27_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_27_126); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_27_126.setRuntimeParent(_jettag_c_when_26_5);
                        _jettag_c_with_27_126.setTagInfo(_td_c_with_27_126);
                        _jettag_c_with_27_126.doStart(context, out);
                        while (_jettag_c_with_27_126.okToProcessBody()) {
                            out.write("throws");  //$NON-NLS-1$        
                            _jettag_c_with_27_126.handleBodyContent(out);
                        }
                        _jettag_c_with_27_126.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_27_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_202); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_27_202.setRuntimeParent(_jettag_c_when_26_5);
                        _jettag_c_iterate_27_202.setTagInfo(_td_c_iterate_27_202);
                        _jettag_c_iterate_27_202.doStart(context, out);
                        while (_jettag_c_iterate_27_202.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${@identifier}", 27, 279)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_27_202.handleBodyContent(out);
                        }
                        _jettag_c_iterate_27_202.doEnd();
                        out.write(" {");  //$NON-NLS-1$        
                        out.write(NL);         
                        RuntimeTagElement _jettag_c_with_28_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_28_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_28_7.setRuntimeParent(_jettag_c_when_26_5);
                        _jettag_c_with_28_7.setTagInfo(_td_c_with_28_7);
                        _jettag_c_with_28_7.doStart(context, out);
                        while (_jettag_c_with_28_7.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_iterate_29_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_7); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_29_7.setRuntimeParent(_jettag_c_with_28_7);
                            _jettag_c_iterate_29_7.setTagInfo(_td_c_iterate_29_7);
                            _jettag_c_iterate_29_7.doStart(context, out);
                            while (_jettag_c_iterate_29_7.okToProcessBody()) {
                                //A little bit tricky below: just to add implementation decisions in
                                RuntimeTagElement _jettag_c_choose_31_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_31_7); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_31_7.setRuntimeParent(_jettag_c_iterate_29_7);
                                _jettag_c_choose_31_7.setTagInfo(_td_c_choose_31_7);
                                _jettag_c_choose_31_7.doStart(context, out);
                                JET2Writer _jettag_c_choose_31_7_saved_out = out;
                                while (_jettag_c_choose_31_7.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_32_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_32_7); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_32_7.setRuntimeParent(_jettag_c_choose_31_7);
                                    _jettag_c_when_32_7.setTagInfo(_td_c_when_32_7);
                                    _jettag_c_when_32_7.doStart(context, out);
                                    JET2Writer _jettag_c_when_32_7_saved_out = out;
                                    while (_jettag_c_when_32_7.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_choose_33_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_33_7); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_33_7.setRuntimeParent(_jettag_c_when_32_7);
                                        _jettag_c_choose_33_7.setTagInfo(_td_c_choose_33_7);
                                        _jettag_c_choose_33_7.doStart(context, out);
                                        JET2Writer _jettag_c_choose_33_7_saved_out = out;
                                        while (_jettag_c_choose_33_7.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_34_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_34_7); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_34_7.setRuntimeParent(_jettag_c_choose_33_7);
                                            _jettag_c_when_34_7.setTagInfo(_td_c_when_34_7);
                                            _jettag_c_when_34_7.doStart(context, out);
                                            JET2Writer _jettag_c_when_34_7_saved_out = out;
                                            while (_jettag_c_when_34_7.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\t");  //$NON-NLS-1$        
                                                out.write(context.embeddedExpressionAsString("${substring-before(string(description),'=')}", 35, 3)); //$NON-NLS-1$ //$NON-NLS-2$
                                                out.write(" = _host.OUT_");  //$NON-NLS-1$        
                                                out.write(context.embeddedExpressionAsString("${concat(className(string(interfaceClassName)), '.', trimWhitespace(substring-after(string(description),'=')))}", 35, 60)); //$NON-NLS-1$ //$NON-NLS-2$
                                                out.write(";");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_when_34_7.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_34_7_saved_out;
                                            _jettag_c_when_34_7.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_37_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_37_7); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_37_7.setRuntimeParent(_jettag_c_choose_33_7);
                                            _jettag_c_otherwise_37_7.setTagInfo(_td_c_otherwise_37_7);
                                            _jettag_c_otherwise_37_7.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_37_7_saved_out = out;
                                            while (_jettag_c_otherwise_37_7.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\t_host.OUT_");  //$NON-NLS-1$        
                                                out.write(context.embeddedExpressionAsString("${concat(className(string(interfaceClassName)), '.', trimWhitespace(string(description)))}", 38, 13)); //$NON-NLS-1$ //$NON-NLS-2$
                                                out.write(";");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_37_7.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_37_7_saved_out;
                                            _jettag_c_otherwise_37_7.doEnd();
                                            _jettag_c_choose_33_7.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_33_7_saved_out;
                                        _jettag_c_choose_33_7.doEnd();
                                        _jettag_c_when_32_7.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_32_7_saved_out;
                                    _jettag_c_when_32_7.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_42_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_42_7); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_42_7.setRuntimeParent(_jettag_c_choose_31_7);
                                    _jettag_c_otherwise_42_7.setTagInfo(_td_c_otherwise_42_7);
                                    _jettag_c_otherwise_42_7.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_42_7_saved_out = out;
                                    while (_jettag_c_otherwise_42_7.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t");  //$NON-NLS-1$        
                                        out.write(context.embeddedExpressionAsString("${description}", 43, 3)); //$NON-NLS-1$ //$NON-NLS-2$
                                        out.write(";");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_42_7.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_42_7_saved_out;
                                    _jettag_c_otherwise_42_7.doEnd();
                                    _jettag_c_choose_31_7.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_31_7_saved_out;
                                _jettag_c_choose_31_7.doEnd();
                                //tricky ends here
                                _jettag_c_iterate_29_7.handleBodyContent(out);
                            }
                            _jettag_c_iterate_29_7.doEnd();
                            _jettag_c_with_28_7.handleBodyContent(out);
                        }
                        _jettag_c_with_28_7.doEnd();
                        out.write("    }    ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_26_5.handleBodyContent(out);
                    }
                    out = _jettag_c_when_26_5_saved_out;
                    _jettag_c_when_26_5.doEnd();
                    //Trigger Events
                    RuntimeTagElement _jettag_c_when_52_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_52_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_52_5.setRuntimeParent(_jettag_c_choose_24_5);
                    _jettag_c_when_52_5.setTagInfo(_td_c_when_52_5);
                    _jettag_c_when_52_5.doStart(context, out);
                    JET2Writer _jettag_c_when_52_5_saved_out = out;
                    while (_jettag_c_when_52_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${modifiers/@keyword}", 53, 5)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${returnType2}", 53, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 53, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" (");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_53_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_63); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_53_63.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_iterate_53_63.setTagInfo(_td_c_iterate_53_63);
                        _jettag_c_iterate_53_63.doStart(context, out);
                        while (_jettag_c_iterate_53_63.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${.}", 53, 108)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_53_63.handleBodyContent(out);
                        }
                        _jettag_c_iterate_53_63.doEnd();
                        out.write(") ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_with_53_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_53_126); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_53_126.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_with_53_126.setTagInfo(_td_c_with_53_126);
                        _jettag_c_with_53_126.doStart(context, out);
                        while (_jettag_c_with_53_126.okToProcessBody()) {
                            out.write("throws");  //$NON-NLS-1$        
                            _jettag_c_with_53_126.handleBodyContent(out);
                        }
                        _jettag_c_with_53_126.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_53_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_202); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_53_202.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_iterate_53_202.setTagInfo(_td_c_iterate_53_202);
                        _jettag_c_iterate_53_202.doStart(context, out);
                        while (_jettag_c_iterate_53_202.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${@identifier}", 53, 279)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_53_202.handleBodyContent(out);
                        }
                        _jettag_c_iterate_53_202.doEnd();
                        out.write(" {");  //$NON-NLS-1$        
                        out.write(NL);         
                        RuntimeTagElement _jettag_c_setVariable_54_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_54_3.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_setVariable_54_3.setTagInfo(_td_c_setVariable_54_3);
                        _jettag_c_setVariable_54_3.doStart(context, out);
                        _jettag_c_setVariable_54_3.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_55_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_55_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_55_3.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_setVariable_55_3.setTagInfo(_td_c_setVariable_55_3);
                        _jettag_c_setVariable_55_3.doStart(context, out);
                        _jettag_c_setVariable_55_3.doEnd();
                        RuntimeTagElement _jettag_c_if_56_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_56_3.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_if_56_3.setTagInfo(_td_c_if_56_3);
                        _jettag_c_if_56_3.doStart(context, out);
                        while (_jettag_c_if_56_3.okToProcessBody()) {
                            out.write("\t\t");  //$NON-NLS-1$        
                            out.write(context.embeddedExpressionAsString("${$tran/effect}", 57, 3)); //$NON-NLS-1$ //$NON-NLS-2$
                            out.write(";\t\t");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_56_3.handleBodyContent(out);
                        }
                        _jettag_c_if_56_3.doEnd();
                        RuntimeTagElement _jettag_c_if_59_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_59_3.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_if_59_3.setTagInfo(_td_c_if_59_3);
                        _jettag_c_if_59_3.doStart(context, out);
                        while (_jettag_c_if_59_3.okToProcessBody()) {
                            out.write("\t\t_host.setState(_host.");  //$NON-NLS-1$        
                            out.write(context.embeddedExpressionAsString("${removeWhitespace($scRef/state[@id=substring(string($tran/toState/@href),2)]/description)}", 60, 24)); //$NON-NLS-1$ //$NON-NLS-2$
                            out.write("State);");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_59_3.handleBodyContent(out);
                        }
                        _jettag_c_if_59_3.doEnd();
                        out.write("\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_62_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_62_3.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_if_62_3.setTagInfo(_td_c_if_62_3);
                        _jettag_c_if_62_3.doStart(context, out);
                        while (_jettag_c_if_62_3.okToProcessBody()) {
                            out.write("return ");  //$NON-NLS-1$        
                            _jettag_c_if_62_3.handleBodyContent(out);
                        }
                        _jettag_c_if_62_3.doEnd();
                        out.write("_host._imp.");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 62, 122)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write("(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_62_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_62_142); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_62_142.setRuntimeParent(_jettag_c_when_52_5);
                        _jettag_c_iterate_62_142.setTagInfo(_td_c_iterate_62_142);
                        _jettag_c_iterate_62_142.doStart(context, out);
                        while (_jettag_c_iterate_62_142.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${name/@identifier}", 62, 187)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_62_142.handleBodyContent(out);
                        }
                        _jettag_c_iterate_62_142.doEnd();
                        out.write(");");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("    }");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_52_5.handleBodyContent(out);
                    }
                    out = _jettag_c_when_52_5_saved_out;
                    _jettag_c_when_52_5.doEnd();
                    //Other Methods
                    RuntimeTagElement _jettag_c_otherwise_66_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_66_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_66_5.setRuntimeParent(_jettag_c_choose_24_5);
                    _jettag_c_otherwise_66_5.setTagInfo(_td_c_otherwise_66_5);
                    _jettag_c_otherwise_66_5.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_66_5_saved_out = out;
                    while (_jettag_c_otherwise_66_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${modifiers/@keyword}", 67, 5)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${returnType2}", 67, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" ");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 67, 42)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write(" (");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_67_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_63); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_67_63.setRuntimeParent(_jettag_c_otherwise_66_5);
                        _jettag_c_iterate_67_63.setTagInfo(_td_c_iterate_67_63);
                        _jettag_c_iterate_67_63.doStart(context, out);
                        while (_jettag_c_iterate_67_63.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${.}", 67, 108)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_67_63.handleBodyContent(out);
                        }
                        _jettag_c_iterate_67_63.doEnd();
                        out.write(") ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_with_67_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_67_126); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_with_67_126.setRuntimeParent(_jettag_c_otherwise_66_5);
                        _jettag_c_with_67_126.setTagInfo(_td_c_with_67_126);
                        _jettag_c_with_67_126.doStart(context, out);
                        while (_jettag_c_with_67_126.okToProcessBody()) {
                            out.write("throws");  //$NON-NLS-1$        
                            _jettag_c_with_67_126.handleBodyContent(out);
                        }
                        _jettag_c_with_67_126.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_67_202 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_202); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_67_202.setRuntimeParent(_jettag_c_otherwise_66_5);
                        _jettag_c_iterate_67_202.setTagInfo(_td_c_iterate_67_202);
                        _jettag_c_iterate_67_202.doStart(context, out);
                        while (_jettag_c_iterate_67_202.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${@identifier}", 67, 279)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_67_202.handleBodyContent(out);
                        }
                        _jettag_c_iterate_67_202.doEnd();
                        out.write(" {");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_68_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_68_3.setRuntimeParent(_jettag_c_otherwise_66_5);
                        _jettag_c_if_68_3.setTagInfo(_td_c_if_68_3);
                        _jettag_c_if_68_3.doStart(context, out);
                        while (_jettag_c_if_68_3.okToProcessBody()) {
                            out.write("return ");  //$NON-NLS-1$        
                            _jettag_c_if_68_3.handleBodyContent(out);
                        }
                        _jettag_c_if_68_3.doEnd();
                        out.write("_host._imp.");  //$NON-NLS-1$        
                        out.write(context.embeddedExpressionAsString("${name/@identifier}", 68, 122)); //$NON-NLS-1$ //$NON-NLS-2$
                        out.write("(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_68_142 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_68_142); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_68_142.setRuntimeParent(_jettag_c_otherwise_66_5);
                        _jettag_c_iterate_68_142.setTagInfo(_td_c_iterate_68_142);
                        _jettag_c_iterate_68_142.doStart(context, out);
                        while (_jettag_c_iterate_68_142.okToProcessBody()) {
                            out.write(context.embeddedExpressionAsString("${name/@identifier}", 68, 187)); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_68_142.handleBodyContent(out);
                        }
                        _jettag_c_iterate_68_142.doEnd();
                        out.write(");");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("    }    ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_66_5.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_66_5_saved_out;
                    _jettag_c_otherwise_66_5.doEnd();
                    _jettag_c_choose_24_5.handleBodyContent(out);
                }
                out = _jettag_c_choose_24_5_saved_out;
                _jettag_c_choose_24_5.doEnd();
                _jettag_c_iterate_23_5.handleBodyContent(out);
            }
            _jettag_c_iterate_23_5.doEnd();
            _jettag_c_iterate_17_1.handleBodyContent(out);
        }
        _jettag_c_iterate_17_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}

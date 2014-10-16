package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_compimp implements JET2Template {
    private static final String _jetns_mytag = "edu.uci.isr.mytaglib.myTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_compimp() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userDefinedPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_3_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            3, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "{$userDefinedPackage}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_14 = new TagInfo("c:get", //$NON-NLS-1$
            5, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userDefinedClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_62 = new TagInfo("java:import", //$NON-NLS-1$
            5, 62,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_10_10 = new TagInfo("java:import", //$NON-NLS-1$
            10, 10,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_45_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mytag_loadClass_47_3 = new TagInfo("mytag:loadClass", //$NON-NLS-1$
            47, 3,
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
    private static final TagInfo _td_c_with_49_5 = new TagInfo("c:with", //$NON-NLS-1$
            49, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_95 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 95,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_49_175 = new TagInfo("java:import", //$NON-NLS-1$
            49, 175,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_51_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//bodyDeclarations[@nodeType = 'MethodDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_5 = new TagInfo("c:if", //$NON-NLS-1$
            52, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not(javadoc/tags[1]//@tagName='@see')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_48 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 48,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_53_111 = new TagInfo("c:with", //$NON-NLS-1$
            53, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_187 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 187,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_55_3 = new TagInfo("c:choose", //$NON-NLS-1$
            55, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "returnType2/@nodeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_55_44 = new TagInfo("c:when", //$NON-NLS-1$
            55, 44,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "'PrimitiveType'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_55_75 = new TagInfo("c:choose", //$NON-NLS-1$
            55, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "returnType2/@primitiveTypeCode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_55_125 = new TagInfo("c:when", //$NON-NLS-1$
            55, 125,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "'int'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_55_164 = new TagInfo("c:when", //$NON-NLS-1$
            55, 164,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "'double'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_55_206 = new TagInfo("c:when", //$NON-NLS-1$
            55, 206,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "'boolean'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_55_273 = new TagInfo("c:otherwise", //$NON-NLS-1$
            55, 273,
            new String[] {
            },
            new String[] {
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
        out.write(" implements ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_5_62 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_5_62.setRuntimeParent(null);
        _jettag_java_import_5_62.setTagInfo(_td_java_import_5_62);
        _jettag_java_import_5_62.doStart(context, out);
        JET2Writer _jettag_java_import_5_62_saved_out = out;
        while (_jettag_java_import_5_62.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$iPrimitivesPackage}", 5, 75)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$iPrimitives}", 5, 98)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_5_62.handleBodyContent(out);
        }
        out = _jettag_java_import_5_62_saved_out;
        _jettag_java_import_5_62.doEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        //
        //  Architecture Reference
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_10_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_10_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_10_10.setRuntimeParent(null);
        _jettag_java_import_10_10.setTagInfo(_td_java_import_10_10);
        _jettag_java_import_10_10.doStart(context, out);
        JET2Writer _jettag_java_import_10_10_saved_out = out;
        while (_jettag_java_import_10_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$archDefinedPackage}", 10, 23)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 10, 46)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_10_10.handleBodyContent(out);
        }
        out = _jettag_java_import_10_10_saved_out;
        _jettag_java_import_10_10.doEnd();
        out.write(" _arch;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //
        //  Constructor
        out.write("    public ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$userDefinedClass}", 15, 12)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" (){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setArch(");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 18, 22)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" arch){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_arch = arch;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 21, 9)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" getArch(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn _arch;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t  Myx Lifecycle Methods: these methods are called automatically by the framework");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t  as the bricks are created, attached, detached, and destroyed respectively.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t*/\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void init(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    //TODO Auto-generated method stub");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void begin(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//TODO Auto-generated method stub");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void end(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//TODO Auto-generated method stub");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void destroy(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//TODO Auto-generated method stub");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t  Implementation primitives required by the architecture");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t*/");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_45_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_45_1.setRuntimeParent(null);
        _jettag_c_iterate_45_1.setTagInfo(_td_c_iterate_45_1);
        _jettag_c_iterate_45_1.doStart(context, out);
        while (_jettag_c_iterate_45_1.okToProcessBody()) {
            //Step 0
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mytag_loadClass_47_3 = context.getTagFactory().createRuntimeTag(_jetns_mytag, "loadClass", "mytag:loadClass", _td_mytag_loadClass_47_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mytag_loadClass_47_3.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_mytag_loadClass_47_3.setTagInfo(_td_mytag_loadClass_47_3);
            _jettag_mytag_loadClass_47_3.doStart(context, out);
            _jettag_mytag_loadClass_47_3.doEnd();
            out.write(NL);         
            //Step 1
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_with_49_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_49_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_49_5.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_with_49_5.setTagInfo(_td_c_with_49_5);
            _jettag_c_with_49_5.doStart(context, out);
            while (_jettag_c_with_49_5.okToProcessBody()) {
                out.write("//To be imported: ");  //$NON-NLS-1$        
                _jettag_c_with_49_5.handleBodyContent(out);
            }
            _jettag_c_with_49_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_49_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_49_95.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_iterate_49_95.setTagInfo(_td_c_iterate_49_95);
            _jettag_c_iterate_49_95.doStart(context, out);
            while (_jettag_c_iterate_49_95.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_49_175 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_49_175); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_49_175.setRuntimeParent(_jettag_c_iterate_49_95);
                _jettag_java_import_49_175.setTagInfo(_td_java_import_49_175);
                _jettag_java_import_49_175.doStart(context, out);
                JET2Writer _jettag_java_import_49_175_saved_out = out;
                while (_jettag_java_import_49_175.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${name[@nodeType='QualifiedName']}", 49, 188)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_49_175.handleBodyContent(out);
                }
                out = _jettag_java_import_49_175_saved_out;
                _jettag_java_import_49_175.doEnd();
                _jettag_c_iterate_49_95.handleBodyContent(out);
            }
            _jettag_c_iterate_49_95.doEnd();
            out.write(NL);         
            //Step 2
            RuntimeTagElement _jettag_c_iterate_51_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_51_5.setRuntimeParent(_jettag_c_iterate_45_1);
            _jettag_c_iterate_51_5.setTagInfo(_td_c_iterate_51_5);
            _jettag_c_iterate_51_5.doStart(context, out);
            while (_jettag_c_iterate_51_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_52_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_52_5.setRuntimeParent(_jettag_c_iterate_51_5);
                _jettag_c_if_52_5.setTagInfo(_td_c_if_52_5);
                _jettag_c_if_52_5.doStart(context, out);
                while (_jettag_c_if_52_5.okToProcessBody()) {
                    out.write("    public ");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${returnType2}", 53, 12)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${name/@identifier}", 53, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_53_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_53_48.setRuntimeParent(_jettag_c_if_52_5);
                    _jettag_c_iterate_53_48.setTagInfo(_td_c_iterate_53_48);
                    _jettag_c_iterate_53_48.doStart(context, out);
                    while (_jettag_c_iterate_53_48.okToProcessBody()) {
                        out.write(context.embeddedExpressionAsString("${.}", 53, 93)); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_53_48.handleBodyContent(out);
                    }
                    _jettag_c_iterate_53_48.doEnd();
                    out.write(") ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_with_53_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_53_111); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_with_53_111.setRuntimeParent(_jettag_c_if_52_5);
                    _jettag_c_with_53_111.setTagInfo(_td_c_with_53_111);
                    _jettag_c_with_53_111.doStart(context, out);
                    while (_jettag_c_with_53_111.okToProcessBody()) {
                        out.write("throws");  //$NON-NLS-1$        
                        _jettag_c_with_53_111.handleBodyContent(out);
                    }
                    _jettag_c_with_53_111.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_53_187 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_187); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_53_187.setRuntimeParent(_jettag_c_if_52_5);
                    _jettag_c_iterate_53_187.setTagInfo(_td_c_iterate_53_187);
                    _jettag_c_iterate_53_187.doStart(context, out);
                    while (_jettag_c_iterate_53_187.okToProcessBody()) {
                        out.write(context.embeddedExpressionAsString("${@identifier}", 53, 264)); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_53_187.handleBodyContent(out);
                    }
                    _jettag_c_iterate_53_187.doEnd();
                    out.write(" {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t//TODO Auto-generated method stub");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_choose_55_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_55_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_55_3.setRuntimeParent(_jettag_c_if_52_5);
                    _jettag_c_choose_55_3.setTagInfo(_td_c_choose_55_3);
                    _jettag_c_choose_55_3.doStart(context, out);
                    JET2Writer _jettag_c_choose_55_3_saved_out = out;
                    while (_jettag_c_choose_55_3.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_55_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_55_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_55_44.setRuntimeParent(_jettag_c_choose_55_3);
                        _jettag_c_when_55_44.setTagInfo(_td_c_when_55_44);
                        _jettag_c_when_55_44.doStart(context, out);
                        JET2Writer _jettag_c_when_55_44_saved_out = out;
                        while (_jettag_c_when_55_44.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_choose_55_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_55_75); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_55_75.setRuntimeParent(_jettag_c_when_55_44);
                            _jettag_c_choose_55_75.setTagInfo(_td_c_choose_55_75);
                            _jettag_c_choose_55_75.doStart(context, out);
                            JET2Writer _jettag_c_choose_55_75_saved_out = out;
                            while (_jettag_c_choose_55_75.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_55_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_55_125); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_55_125.setRuntimeParent(_jettag_c_choose_55_75);
                                _jettag_c_when_55_125.setTagInfo(_td_c_when_55_125);
                                _jettag_c_when_55_125.doStart(context, out);
                                JET2Writer _jettag_c_when_55_125_saved_out = out;
                                while (_jettag_c_when_55_125.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("return 0;");  //$NON-NLS-1$        
                                    _jettag_c_when_55_125.handleBodyContent(out);
                                }
                                out = _jettag_c_when_55_125_saved_out;
                                _jettag_c_when_55_125.doEnd();
                                RuntimeTagElement _jettag_c_when_55_164 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_55_164); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_55_164.setRuntimeParent(_jettag_c_choose_55_75);
                                _jettag_c_when_55_164.setTagInfo(_td_c_when_55_164);
                                _jettag_c_when_55_164.doStart(context, out);
                                JET2Writer _jettag_c_when_55_164_saved_out = out;
                                while (_jettag_c_when_55_164.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("return 0;");  //$NON-NLS-1$        
                                    _jettag_c_when_55_164.handleBodyContent(out);
                                }
                                out = _jettag_c_when_55_164_saved_out;
                                _jettag_c_when_55_164.doEnd();
                                RuntimeTagElement _jettag_c_when_55_206 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_55_206); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_55_206.setRuntimeParent(_jettag_c_choose_55_75);
                                _jettag_c_when_55_206.setTagInfo(_td_c_when_55_206);
                                _jettag_c_when_55_206.doStart(context, out);
                                JET2Writer _jettag_c_when_55_206_saved_out = out;
                                while (_jettag_c_when_55_206.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("return false;");  //$NON-NLS-1$        
                                    _jettag_c_when_55_206.handleBodyContent(out);
                                }
                                out = _jettag_c_when_55_206_saved_out;
                                _jettag_c_when_55_206.doEnd();
                                _jettag_c_choose_55_75.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_55_75_saved_out;
                            _jettag_c_choose_55_75.doEnd();
                            _jettag_c_when_55_44.handleBodyContent(out);
                        }
                        out = _jettag_c_when_55_44_saved_out;
                        _jettag_c_when_55_44.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_55_273 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_55_273); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_55_273.setRuntimeParent(_jettag_c_choose_55_3);
                        _jettag_c_otherwise_55_273.setTagInfo(_td_c_otherwise_55_273);
                        _jettag_c_otherwise_55_273.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_55_273_saved_out = out;
                        while (_jettag_c_otherwise_55_273.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("return null;");  //$NON-NLS-1$        
                            _jettag_c_otherwise_55_273.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_55_273_saved_out;
                        _jettag_c_otherwise_55_273.doEnd();
                        _jettag_c_choose_55_3.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_55_3_saved_out;
                    _jettag_c_choose_55_3.doEnd();
                    out.write(NL);         
                    out.write("    }");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_52_5.handleBodyContent(out);
                }
                _jettag_c_if_52_5.doEnd();
                _jettag_c_iterate_51_5.handleBodyContent(out);
            }
            _jettag_c_iterate_51_5.doEnd();
            _jettag_c_iterate_45_1.handleBodyContent(out);
        }
        _jettag_c_iterate_45_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
    }
}

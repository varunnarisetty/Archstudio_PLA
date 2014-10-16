package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_icomp implements JET2Template {
    private static final String _jetns_mytag = "edu.uci.isr.mytaglib.myTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_icomp() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$iPrimitivesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_3_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            3, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "$iPrimitivesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_11_26 = new TagInfo("java:import", //$NON-NLS-1$
            11, 26,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_26_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mytag_loadClass_27_3 = new TagInfo("mytag:loadClass", //$NON-NLS-1$
            27, 3,
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
    private static final TagInfo _td_c_with_28_5 = new TagInfo("c:with", //$NON-NLS-1$
            28, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_95 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 95,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_28_175 = new TagInfo("java:import", //$NON-NLS-1$
            28, 175,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_29_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//bodyDeclarations[@nodeType = 'MethodDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_5 = new TagInfo("c:if", //$NON-NLS-1$
            30, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not(javadoc/tags[1]//@tagName='@see')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_48 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 48,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_31_111 = new TagInfo("c:with", //$NON-NLS-1$
            31, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_187 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 187,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
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
        out.write("public interface ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$iPrimitives}", 5, 18)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t  Getter and Setter of architecture reference");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t*/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    public void setArch (");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_11_26 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_11_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_11_26.setRuntimeParent(null);
        _jettag_java_import_11_26.setTagInfo(_td_java_import_11_26);
        _jettag_java_import_11_26.doStart(context, out);
        JET2Writer _jettag_java_import_11_26_saved_out = out;
        while (_jettag_java_import_11_26.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$archDefinedPackage}", 11, 39)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 11, 62)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_11_26.handleBodyContent(out);
        }
        out = _jettag_java_import_11_26_saved_out;
        _jettag_java_import_11_26.doEnd();
        out.write(" arch);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 12, 9)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" getArch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t  Myx Lifecycle Methods: these methods are called automatically by the framework");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t  as the bricks are created, attached, detached, and destroyed respectively.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t*/\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void init();\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void begin();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void end();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void destroy();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t  Implementation primitives required by the architecture");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t*/");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_26_1.setRuntimeParent(null);
        _jettag_c_iterate_26_1.setTagInfo(_td_c_iterate_26_1);
        _jettag_c_iterate_26_1.doStart(context, out);
        while (_jettag_c_iterate_26_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mytag_loadClass_27_3 = context.getTagFactory().createRuntimeTag(_jetns_mytag, "loadClass", "mytag:loadClass", _td_mytag_loadClass_27_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mytag_loadClass_27_3.setRuntimeParent(_jettag_c_iterate_26_1);
            _jettag_mytag_loadClass_27_3.setTagInfo(_td_mytag_loadClass_27_3);
            _jettag_mytag_loadClass_27_3.doStart(context, out);
            _jettag_mytag_loadClass_27_3.doEnd();
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_with_28_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_28_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_28_5.setRuntimeParent(_jettag_c_iterate_26_1);
            _jettag_c_with_28_5.setTagInfo(_td_c_with_28_5);
            _jettag_c_with_28_5.doStart(context, out);
            while (_jettag_c_with_28_5.okToProcessBody()) {
                out.write("//To be imported: ");  //$NON-NLS-1$        
                _jettag_c_with_28_5.handleBodyContent(out);
            }
            _jettag_c_with_28_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_28_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_28_95.setRuntimeParent(_jettag_c_iterate_26_1);
            _jettag_c_iterate_28_95.setTagInfo(_td_c_iterate_28_95);
            _jettag_c_iterate_28_95.doStart(context, out);
            while (_jettag_c_iterate_28_95.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_28_175 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_28_175); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_28_175.setRuntimeParent(_jettag_c_iterate_28_95);
                _jettag_java_import_28_175.setTagInfo(_td_java_import_28_175);
                _jettag_java_import_28_175.doStart(context, out);
                JET2Writer _jettag_java_import_28_175_saved_out = out;
                while (_jettag_java_import_28_175.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${name[@nodeType='QualifiedName']}", 28, 188)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_28_175.handleBodyContent(out);
                }
                out = _jettag_java_import_28_175_saved_out;
                _jettag_java_import_28_175.doEnd();
                _jettag_c_iterate_28_95.handleBodyContent(out);
            }
            _jettag_c_iterate_28_95.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_29_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_29_5.setRuntimeParent(_jettag_c_iterate_26_1);
            _jettag_c_iterate_29_5.setTagInfo(_td_c_iterate_29_5);
            _jettag_c_iterate_29_5.doStart(context, out);
            while (_jettag_c_iterate_29_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_30_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_5.setRuntimeParent(_jettag_c_iterate_29_5);
                _jettag_c_if_30_5.setTagInfo(_td_c_if_30_5);
                _jettag_c_if_30_5.doStart(context, out);
                while (_jettag_c_if_30_5.okToProcessBody()) {
                    out.write("    public ");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${returnType2}", 31, 12)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(context.embeddedExpressionAsString("${name/@identifier}", 31, 27)); //$NON-NLS-1$ //$NON-NLS-2$
                    out.write(" (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_31_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_31_48.setRuntimeParent(_jettag_c_if_30_5);
                    _jettag_c_iterate_31_48.setTagInfo(_td_c_iterate_31_48);
                    _jettag_c_iterate_31_48.doStart(context, out);
                    while (_jettag_c_iterate_31_48.okToProcessBody()) {
                        out.write(context.embeddedExpressionAsString("${.}", 31, 93)); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_31_48.handleBodyContent(out);
                    }
                    _jettag_c_iterate_31_48.doEnd();
                    out.write(") ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_with_31_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_31_111); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_with_31_111.setRuntimeParent(_jettag_c_if_30_5);
                    _jettag_c_with_31_111.setTagInfo(_td_c_with_31_111);
                    _jettag_c_with_31_111.doStart(context, out);
                    while (_jettag_c_with_31_111.okToProcessBody()) {
                        out.write("throws");  //$NON-NLS-1$        
                        _jettag_c_with_31_111.handleBodyContent(out);
                    }
                    _jettag_c_with_31_111.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_31_187 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_187); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_31_187.setRuntimeParent(_jettag_c_if_30_5);
                    _jettag_c_iterate_31_187.setTagInfo(_td_c_iterate_31_187);
                    _jettag_c_iterate_31_187.doStart(context, out);
                    while (_jettag_c_iterate_31_187.okToProcessBody()) {
                        out.write(context.embeddedExpressionAsString("${@identifier}", 31, 264)); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_31_187.handleBodyContent(out);
                    }
                    _jettag_c_iterate_31_187.doEnd();
                    out.write(";        ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_30_5.handleBodyContent(out);
                }
                _jettag_c_if_30_5.doEnd();
                _jettag_c_iterate_29_5.handleBodyContent(out);
            }
            _jettag_c_iterate_29_5.doEnd();
            _jettag_c_iterate_26_1.handleBodyContent(out);
        }
        _jettag_c_iterate_26_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
    }
}

package edu.uci.isr.archstudio4.comp.xgenerator.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_abstract_st implements JET2Template {
    private static final String _jetns_mytag = "edu.uci.isr.mytaglib.myTags"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_abstract_st() {
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
    private static final TagInfo _td_java_import_7_12 = new TagInfo("java:import", //$NON-NLS-1$
            7, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_13_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$currComp/interface[direction='in']/type/@href", //$NON-NLS-1$
                "typeID", //$NON-NLS-1$
            } );
    private static final TagInfo _td_mytag_loadClass_14_3 = new TagInfo("mytag:loadClass", //$NON-NLS-1$
            14, 3,
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
    private static final TagInfo _td_c_with_15_5 = new TagInfo("c:with", //$NON-NLS-1$
            15, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_95 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 95,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$root//imports[@nodeType='ImportDeclaration']", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_15_175 = new TagInfo("java:import", //$NON-NLS-1$
            15, 175,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_16_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root//bodyDeclarations[@nodeType = 'MethodDeclaration']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_57 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 57,
            new String[] {
                "select", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "parameters", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_with_17_120 = new TagInfo("c:with", //$NON-NLS-1$
            17, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "thrownExceptions[@nodeType = 'SimpleName']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_196 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 196,
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
        out.write("public abstract class ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$compDesp}", 5, 23)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_7_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_7_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_7_12.setRuntimeParent(null);
        _jettag_java_import_7_12.setTagInfo(_td_java_import_7_12);
        _jettag_java_import_7_12.doStart(context, out);
        JET2Writer _jettag_java_import_7_12_saved_out = out;
        while (_jettag_java_import_7_12.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(context.embeddedExpressionAsString("${$archDefinedPackage}", 7, 25)); //$NON-NLS-1$ //$NON-NLS-2$
            out.write(".");  //$NON-NLS-1$        
            out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 7, 48)); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_7_12.handleBodyContent(out);
        }
        out = _jettag_java_import_7_12_saved_out;
        _jettag_java_import_7_12.doEnd();
        out.write(" _host;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$compDesp}", 9, 9)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write("State (");  //$NON-NLS-1$        
        out.write(context.embeddedExpressionAsString("${$archDefinedClass}", 9, 28)); //$NON-NLS-1$ //$NON-NLS-2$
        out.write(" host){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis._host = host;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_13_1.setRuntimeParent(null);
        _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
        _jettag_c_iterate_13_1.doStart(context, out);
        while (_jettag_c_iterate_13_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_mytag_loadClass_14_3 = context.getTagFactory().createRuntimeTag(_jetns_mytag, "loadClass", "mytag:loadClass", _td_mytag_loadClass_14_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_mytag_loadClass_14_3.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_mytag_loadClass_14_3.setTagInfo(_td_mytag_loadClass_14_3);
            _jettag_mytag_loadClass_14_3.doStart(context, out);
            _jettag_mytag_loadClass_14_3.doEnd();
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_with_15_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_15_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_with_15_5.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_with_15_5.setTagInfo(_td_c_with_15_5);
            _jettag_c_with_15_5.doStart(context, out);
            while (_jettag_c_with_15_5.okToProcessBody()) {
                out.write("//To be imported: ");  //$NON-NLS-1$        
                _jettag_c_with_15_5.handleBodyContent(out);
            }
            _jettag_c_with_15_5.doEnd();
            RuntimeTagElement _jettag_c_iterate_15_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_95.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_iterate_15_95.setTagInfo(_td_c_iterate_15_95);
            _jettag_c_iterate_15_95.doStart(context, out);
            while (_jettag_c_iterate_15_95.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_15_175 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_15_175); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_15_175.setRuntimeParent(_jettag_c_iterate_15_95);
                _jettag_java_import_15_175.setTagInfo(_td_java_import_15_175);
                _jettag_java_import_15_175.doStart(context, out);
                JET2Writer _jettag_java_import_15_175_saved_out = out;
                while (_jettag_java_import_15_175.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(context.embeddedExpressionAsString("${name[@nodeType='QualifiedName']}", 15, 188)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_15_175.handleBodyContent(out);
                }
                out = _jettag_java_import_15_175_saved_out;
                _jettag_java_import_15_175.doEnd();
                _jettag_c_iterate_15_95.handleBodyContent(out);
            }
            _jettag_c_iterate_15_95.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_16_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_16_5.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_c_iterate_16_5.setTagInfo(_td_c_iterate_16_5);
            _jettag_c_iterate_16_5.doStart(context, out);
            while (_jettag_c_iterate_16_5.okToProcessBody()) {
                out.write("    public abstract ");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${returnType2}", 17, 21)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" ");  //$NON-NLS-1$        
                out.write(context.embeddedExpressionAsString("${name/@identifier}", 17, 36)); //$NON-NLS-1$ //$NON-NLS-2$
                out.write(" (");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_17_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_17_57.setRuntimeParent(_jettag_c_iterate_16_5);
                _jettag_c_iterate_17_57.setTagInfo(_td_c_iterate_17_57);
                _jettag_c_iterate_17_57.doStart(context, out);
                while (_jettag_c_iterate_17_57.okToProcessBody()) {
                    out.write(context.embeddedExpressionAsString("${.}", 17, 102)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_17_57.handleBodyContent(out);
                }
                _jettag_c_iterate_17_57.doEnd();
                out.write(") ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_with_17_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "with", "c:with", _td_c_with_17_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_with_17_120.setRuntimeParent(_jettag_c_iterate_16_5);
                _jettag_c_with_17_120.setTagInfo(_td_c_with_17_120);
                _jettag_c_with_17_120.doStart(context, out);
                while (_jettag_c_with_17_120.okToProcessBody()) {
                    out.write("throws");  //$NON-NLS-1$        
                    _jettag_c_with_17_120.handleBodyContent(out);
                }
                _jettag_c_with_17_120.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_17_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_196); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_17_196.setRuntimeParent(_jettag_c_iterate_16_5);
                _jettag_c_iterate_17_196.setTagInfo(_td_c_iterate_17_196);
                _jettag_c_iterate_17_196.doStart(context, out);
                while (_jettag_c_iterate_17_196.okToProcessBody()) {
                    out.write(context.embeddedExpressionAsString("${@identifier}", 17, 273)); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_17_196.handleBodyContent(out);
                }
                _jettag_c_iterate_17_196.doEnd();
                out.write(";        ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_16_5.handleBodyContent(out);
            }
            _jettag_c_iterate_16_5.doEnd();
            _jettag_c_iterate_13_1.handleBodyContent(out);
        }
        _jettag_c_iterate_13_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}

package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class JavadocFuncTest {
    @Test(timeout = 10000)
    public void testOnClass() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JPackage pkg = cm._package("foo");
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (pkg)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (pkg)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (pkg)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (pkg)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (pkg)).isPackage());
        Assert.assertFalse(((JPackage) (pkg)).isClass());
        Assert.assertFalse(((JPackage) (pkg)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (pkg)).getAllResourceFiles())).isEmpty());
        final JDefinedClass cls = pkg._class(((JMod.PUBLIC) | (JMod.FINAL)), "Dummy");
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(foo.Dummy)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        boolean o_testOnClass__7 = cls.javadoc().add("Class comment");
        Assert.assertTrue(o_testOnClass__7);
        boolean o_testOnClass__9 = cls.javadoc().addAuthor().add("JavadocFuncTest");
        Assert.assertTrue(o_testOnClass__9);
        final JMethod method = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), String.class, "getPlusX");
        Assert.assertFalse(((JMethod) (method)).isConstructor());
        Assert.assertTrue(((JMethod) (method)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (method)).hasVarArgs());
        final JVar aParam = method.param(String.class, "any");
        Assert.assertEquals(-1828307552, ((int) (((JVar) (aParam)).hashCode())));
        method.body()._return(aParam.plus("X"));
        boolean o_testOnClass__19 = method.javadoc().add("Description");
        Assert.assertTrue(o_testOnClass__19);
        boolean o_testOnClass__21 = method.javadoc().addParam(aParam).add("Input value");
        Assert.assertTrue(o_testOnClass__21);
        boolean o_testOnClass__24 = method.javadoc().addReturn().add("Input value plus \"X\".");
        Assert.assertTrue(o_testOnClass__24);
        boolean o_testOnClass__27 = method.javadoc().addThrows(NullPointerException.class).add("If input is null");
        Assert.assertTrue(o_testOnClass__27);
        boolean o_testOnClass__30 = method.javadoc().addTag("since").add("JCodeModel 2.8.5");
        Assert.assertTrue(o_testOnClass__30);
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (pkg)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (pkg)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (pkg)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (pkg)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (pkg)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (pkg)).isPackage());
        Assert.assertFalse(((JPackage) (pkg)).isClass());
        Assert.assertFalse(((JPackage) (pkg)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (pkg)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(foo.Dummy)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertTrue(o_testOnClass__7);
        Assert.assertTrue(o_testOnClass__9);
        Assert.assertFalse(((JMethod) (method)).isConstructor());
        Assert.assertTrue(((JMethod) (method)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (method)).hasVarArgs());
        Assert.assertEquals(-1828307552, ((int) (((JVar) (aParam)).hashCode())));
        Assert.assertTrue(o_testOnClass__19);
        Assert.assertTrue(o_testOnClass__21);
        Assert.assertTrue(o_testOnClass__24);
        Assert.assertTrue(o_testOnClass__27);
        Assert.assertTrue(o_testOnClass__30);
    }
}


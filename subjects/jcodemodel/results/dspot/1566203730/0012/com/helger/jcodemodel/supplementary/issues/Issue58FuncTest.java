package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.JVar;
import java.util.Collection;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public final class Issue58FuncTest {
    @Test(timeout = 10000)
    public void testIssue() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue__7)).hashCode())));
        JMethod o_testIssue__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue__9)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue__7)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testIssue_mg67() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg67__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg67__7)).hashCode())));
        JMethod o_testIssue_mg67__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg67__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).isConstructor());
        Collection<JAnnotationUse> o_testIssue_mg67__11 = aClass.annotations();
        Assert.assertTrue(o_testIssue_mg67__11.isEmpty());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg67__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg67__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg104() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg104__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg104__7)).hashCode())));
        JMethod o_testIssue_mg104__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg104__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).isConstructor());
        AbstractJType o_testIssue_mg104__11 = aMethod.type();
        Assert.assertTrue(((JPrimitiveType) (o_testIssue_mg104__11)).isPrimitive());
        Assert.assertFalse(((JPrimitiveType) (o_testIssue_mg104__11)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testIssue_mg104__11)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testIssue_mg104__11)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testIssue_mg104__11)).isError());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg104__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg104__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg48() throws Exception {
        String __DSPOT_sName_4 = "i*OdwpauR%h1,xavU[1R";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg48__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg48__8)).hashCode())));
        JMethod o_testIssue_mg48__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg48__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg48__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg48__10)).isConstructor());
        JPackage o_testIssue_mg48__12 = generator._package(__DSPOT_sName_4);
        Assert.assertFalse(((JPackage) (o_testIssue_mg48__12)).isUnnamed());
        Assert.assertFalse(((JPackage) (o_testIssue_mg48__12)).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIssue_mg48__12)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_mg48__12)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testIssue_mg48__12)).isPackage());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg48__8)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg48__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg48__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg48__10)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssuenull107_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, null);
            aMethod.param(generator.ref("test.UnknownClass"), "p");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            org.junit.Assert.fail("testIssuenull107 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg101() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg101__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg101__7)).hashCode())));
        JMethod o_testIssue_mg101__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg101__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).isConstructor());
        JDefinedClass o_testIssue_mg101__11 = aMethod.owningClass();
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isHidden());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testIssue_mg101__11)).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isInterface());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isPackage());
        Assert.assertNull(((JDefinedClass) (o_testIssue_mg101__11)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testIssue_mg101__11)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(test.Test)", ((JDefinedClass) (o_testIssue_mg101__11)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testIssue_mg101__11)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (o_testIssue_mg101__11)).isReference());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isError());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg101__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg101__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_rv123() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar __DSPOT_invoc_7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_rv123__11 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_rv123__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv123__11)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv123__11)).isConstructor());
        AbstractJType o_testIssue_rv123__13 = __DSPOT_invoc_7.type();
        Assert.assertEquals(-608273898, ((int) (((JDirectClass) (o_testIssue_rv123__13)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isAbstract());
        Assert.assertNull(((JDirectClass) (o_testIssue_rv123__13)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testIssue_rv123__13)).isClass());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testIssue_rv123__13)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_rv123__13)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(test.UnknownClass)", ((JDirectClass) (o_testIssue_rv123__13)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_rv123__13)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDirectClass) (o_testIssue_rv123__13)).isReference());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testIssue_rv123__13)).isError());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv123__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv123__11)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv123__11)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg63() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg63__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg63__7)).hashCode())));
        JMethod o_testIssue_mg63__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg63__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).isConstructor());
        AbstractJClass o_testIssue_mg63__11 = generator.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isError());
        Assert.assertNull(((JTypeWildcard) (o_testIssue_mg63__11)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg63__11)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testIssue_mg63__11)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg63__11)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testIssue_mg63__11)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isPrimitive());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg63__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg63__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg88() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg88__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg88__7)).hashCode())));
        JMethod o_testIssue_mg88__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg88__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).isConstructor());
        Collection<JAnnotationUse> o_testIssue_mg88__11 = aMethod.annotations();
        Assert.assertTrue(o_testIssue_mg88__11.isEmpty());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg88__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg88__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_rv120() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar __DSPOT_invoc_7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_rv120__11 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_rv120__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).isConstructor());
        JMods o_testIssue_rv120__13 = __DSPOT_invoc_7.mods();
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isStrictFP());
        Assert.assertEquals(0, ((int) (((JMods) (o_testIssue_rv120__13)).getValue())));
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isAbstract());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isDefault());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isStatic());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isNative());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isSynchronized());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv120__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString32_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, "name");
            aMethod.param(generator.ref("test.UnknownClass"), "+");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            org.junit.Assert.fail("testIssue_literalMutationString32 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'+\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_rv122_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_37 = "N`nJW,ftS}%g/mS6TE0=";
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, "name");
            JVar __DSPOT_invoc_7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            __DSPOT_invoc_7.name(__DSPOT_sName_37);
            org.junit.Assert.fail("testIssue_rv122 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg69_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_20 = -169851362;
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, "name");
            aMethod.param(generator.ref("test.UnknownClass"), "p");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            aClass.constructor(__DSPOT_nMods_20);
            org.junit.Assert.fail("testIssue_mg69 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg102_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_32 = -445612720;
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, "name");
            aMethod.param(generator.ref("test.UnknownClass"), "p");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            aMethod.paramAtIndex(__DSPOT_nIndex_32);
            org.junit.Assert.fail("testIssue_mg102 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-445612720", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg62() throws Exception {
        String __DSPOT_sNewLine_19 = "?56TtKz.F5M(E@of6;bU";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg62__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg62__8)).hashCode())));
        JMethod o_testIssue_mg62__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg62__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg62__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg62__10)).isConstructor());
        JCodeModel o_testIssue_mg62__12 = generator.setBuildingNewLine(__DSPOT_sNewLine_19);
        Assert.assertNull(((JCodeModel) (o_testIssue_mg62__12)).getBuildingCharset());
        Assert.assertEquals("?56TtKz.F5M(E@of6;bU", ((JCodeModel) (o_testIssue_mg62__12)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (o_testIssue_mg62__12)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testIssue_mg62__12)).getAllPackages())).isEmpty());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg62__8)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg62__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg62__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg62__10)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg57() throws Exception {
        String __DSPOT_sName_16 = "nkib%A@IY:Wo-9M/^zOC";
        String __DSPOT_sMessage_15 = "{+DN-eV8<Or;(?xw0]W#";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg57__9 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg57__9)).hashCode())));
        JMethod o_testIssue_mg57__11 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg57__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).isConstructor());
        JErrorClass o_testIssue_mg57__13 = generator.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isAbstract());
        Assert.assertEquals("{+DN-eV8<Or;(?xw0]W#", ((JErrorClass) (o_testIssue_mg57__13)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg57__13)).isError());
        Assert.assertNull(((JErrorClass) (o_testIssue_mg57__13)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg57__13)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg57__13)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg57__13)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isPrimitive());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg57__9)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg57__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg56() throws Exception {
        String __DSPOT_sMessage_14 = "fl<xJgehgad?HCt1H=N6";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg56__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg56__8)).hashCode())));
        JMethod o_testIssue_mg56__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg56__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).isConstructor());
        JErrorClass o_testIssue_mg56__12 = generator.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isAbstract());
        Assert.assertEquals("fl<xJgehgad?HCt1H=N6", ((JErrorClass) (o_testIssue_mg56__12)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg56__12)).isError());
        Assert.assertNull(((JErrorClass) (o_testIssue_mg56__12)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg56__12)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg56__12)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg56__12)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isPrimitive());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg56__8)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg56__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg53() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg53__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg53__7)).hashCode())));
        JMethod o_testIssue_mg53__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg53__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).isConstructor());
        boolean o_testIssue_mg53__11 = generator.buildsErrorTypeRefs();
        Assert.assertFalse(o_testIssue_mg53__11);
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg53__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg53__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg75() throws Exception {
        String __DSPOT_sName_24 = "4=uV!aV(v6Iw9b>c1NAn";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg75__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg75__8)).hashCode())));
        JMethod o_testIssue_mg75__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg75__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).isConstructor());
        JEnumConstant o_testIssue_mg75__12 = aClass.enumConstant(__DSPOT_sName_24);
        Assert.assertFalse(((JEnumConstant) (o_testIssue_mg75__12)).hasArgs());
        Assert.assertEquals(1928237426, ((int) (((JEnumConstant) (o_testIssue_mg75__12)).hashCode())));
        Assert.assertEquals("test.Test.4=uV!aV(v6Iw9b>c1NAn", ((JEnumConstant) (o_testIssue_mg75__12)).getName());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg75__8)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg75__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg76() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg76__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg76__7)).hashCode())));
        JMethod o_testIssue_mg76__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg76__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).isConstructor());
        Map<String, JFieldVar> o_testIssue_mg76__11 = aClass.fields();
        Assert.assertTrue(o_testIssue_mg76__11.isEmpty());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg76__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg76__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg54() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg54__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg54__7)).hashCode())));
        JMethod o_testIssue_mg54__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg54__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).isConstructor());
        int o_testIssue_mg54__11 = generator.countArtifacts();
        Assert.assertEquals(1, ((int) (o_testIssue_mg54__11)));
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg54__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg54__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_rv116() throws Exception {
        Object __DSPOT_o_35 = new Object();
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar __DSPOT_invoc_7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_rv116__13 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_rv116__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).isConstructor());
        boolean o_testIssue_rv116__15 = __DSPOT_invoc_7.equals(__DSPOT_o_35);
        Assert.assertFalse(o_testIssue_rv116__15);
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv116__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString39() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_literalMutationString39__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_literalMutationString39__7)).hashCode())));
        JMethod o_testIssue_literalMutationString39__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("") });
        Assert.assertNull(o_testIssue_literalMutationString39__9);
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_literalMutationString39__7)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testIssue_remove7() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JMethod o_testIssue_remove7__7 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertNull(o_testIssue_remove7__7);
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg71() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg71__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg71__7)).hashCode())));
        JMethod o_testIssue_mg71__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg71__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).isConstructor());
        boolean o_testIssue_mg71__11 = aClass.containsErrorTypes();
        Assert.assertFalse(o_testIssue_mg71__11);
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg71__7)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg71__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssuenull109_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, "name");
            aMethod.param(generator.ref("test.UnknownClass"), null);
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            org.junit.Assert.fail("testIssuenull109 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg72() throws Exception {
        String __DSPOT_sName_21 = "J;!9+7]6k!Ld8U4ryn<3";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        JVar o_testIssue_mg72__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg72__8)).hashCode())));
        JMethod o_testIssue_mg72__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertTrue(((JMethod) (o_testIssue_mg72__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).isConstructor());
        boolean o_testIssue_mg72__12 = aClass.containsField(__DSPOT_sName_21);
        Assert.assertFalse(o_testIssue_mg72__12);
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg72__8)).hashCode())));
        Assert.assertTrue(((JMethod) (o_testIssue_mg72__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testIssue_mg59_mg14383() throws Exception {
        String __DSPOT_sName_17 = "xu?!rIXp5pNO|oPq,r5>";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        JVar o_testIssue_mg59__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_mg59__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        AbstractJType o_testIssue_mg59__12 = generator.parseType(__DSPOT_sName_17);
        AbstractJType o_testIssue_mg59_mg14383__19 = o_testIssue_mg59__12.declarable();
        Assert.assertEquals(84125129, ((int) (((JDirectClass) (o_testIssue_mg59_mg14383__19)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isAbstract());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg59_mg14383__19)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isClass());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isPackage());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isParameterized());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg59_mg14383__19)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg59_mg14383__19)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(xu)", ((JDirectClass) (o_testIssue_mg59_mg14383__19)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg59_mg14383__19)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isReference());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg59_mg14383__19)).isError());
    }

    @Test(timeout = 10000)
    public void testIssue_mg80_mg17343_mg38491() throws Exception {
        boolean __DSPOT_bSingleLineMode_10629 = false;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        JVar o_testIssue_mg80__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_mg80__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        JDocComment o_testIssue_mg80__11 = aClass.headerComment();
        JDocComment o_testIssue_mg80_mg17343__18 = aMethod.javadoc();
        JDocComment o_testIssue_mg80_mg17343_mg38491__22 = o_testIssue_mg80_mg17343__18.setSingleLineMode(__DSPOT_bSingleLineMode_10629);
        Assert.assertTrue(o_testIssue_mg80_mg17343_mg38491__22.isEmpty());
    }
}

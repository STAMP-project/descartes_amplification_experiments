package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
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
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue__7)).hashCode())));
        JMethod o_testIssue__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue__9)).hasVarArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue__7)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testIssue_mg67() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg67__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg67__7)).hashCode())));
        JMethod o_testIssue_mg67__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg67__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).hasVarArgs());
        Collection<JAnnotationUse> o_testIssue_mg67__11 = aClass.annotations();
        Assert.assertTrue(o_testIssue_mg67__11.isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg67__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg67__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg67__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg104() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg104__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg104__7)).hashCode())));
        JMethod o_testIssue_mg104__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg104__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).hasVarArgs());
        AbstractJType o_testIssue_mg104__11 = aMethod.type();
        Assert.assertTrue(((JPrimitiveType) (o_testIssue_mg104__11)).isPrimitive());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testIssue_mg104__11)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testIssue_mg104__11)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testIssue_mg104__11)).isError());
        Assert.assertFalse(((JPrimitiveType) (o_testIssue_mg104__11)).isReference());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg104__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg104__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg104__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString25() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_literalMutationString25__7 = aMethod.param(generator.ref("xx"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_literalMutationString25__7)).hashCode())));
        JMethod o_testIssue_literalMutationString25__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertNull(o_testIssue_literalMutationString25__9);
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_literalMutationString25__7)).hashCode())));
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
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg101__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg101__7)).hashCode())));
        JMethod o_testIssue_mg101__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg101__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).hasVarArgs());
        JDefinedClass o_testIssue_mg101__11 = aMethod.owningClass();
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isHidden());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testIssue_mg101__11)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testIssue_mg101__11)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testIssue_mg101__11)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(test.Test)", ((JDefinedClass) (o_testIssue_mg101__11)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testIssue_mg101__11)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isParameterized());
        Assert.assertNull(((JDefinedClass) (o_testIssue_mg101__11)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testIssue_mg101__11)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testIssue_mg101__11)).isError());
        Assert.assertTrue(((JDefinedClass) (o_testIssue_mg101__11)).isReference());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg101__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg101__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg101__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg100() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg100__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg100__7)).hashCode())));
        JMethod o_testIssue_mg100__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg100__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg100__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg100__9)).hasVarArgs());
        JCodeModel o_testIssue_mg100__11 = aMethod.owner();
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testIssue_mg100__11)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (o_testIssue_mg100__11)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (o_testIssue_mg100__11)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (o_testIssue_mg100__11)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg100__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg100__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg100__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg100__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg63() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg63__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg63__7)).hashCode())));
        JMethod o_testIssue_mg63__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg63__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).hasVarArgs());
        AbstractJClass o_testIssue_mg63__11 = generator.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testIssue_mg63__11)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg63__11)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isParameterized());
        Assert.assertNull(((JTypeWildcard) (o_testIssue_mg63__11)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg63__11)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg63__11)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testIssue_mg63__11)).isReference());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg63__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg63__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg63__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg88() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg88__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg88__7)).hashCode())));
        JMethod o_testIssue_mg88__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg88__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).hasVarArgs());
        Collection<JAnnotationUse> o_testIssue_mg88__11 = aMethod.annotations();
        Assert.assertTrue(o_testIssue_mg88__11.isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg88__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg88__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg88__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_rv120() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar __DSPOT_invoc_7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_rv120__11 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv120__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).hasVarArgs());
        JMods o_testIssue_rv120__13 = __DSPOT_invoc_7.mods();
        Assert.assertEquals(0, ((int) (((JMods) (o_testIssue_rv120__13)).getValue())));
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isAbstract());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isDefault());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isStatic());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isNative());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isSynchronized());
        Assert.assertFalse(((JMods) (o_testIssue_rv120__13)).isStrictFP());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv120__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv120__11)).hasVarArgs());
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
    public void testIssue_literalMutationString30_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(0, generator.VOID, "name");
            aMethod.param(generator.ref("test.UnknownClass"), "");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            org.junit.Assert.fail("testIssue_literalMutationString30 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
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
    public void testIssue_mg61() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg61__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg61__7)).hashCode())));
        JMethod o_testIssue_mg61__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg61__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg61__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg61__9)).hasVarArgs());
        JPackage o_testIssue_mg61__11 = generator.rootPackage();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIssue_mg61__11)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testIssue_mg61__11)).isPackage());
        Assert.assertFalse(((JPackage) (o_testIssue_mg61__11)).isClass());
        Assert.assertTrue(((JPackage) (o_testIssue_mg61__11)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIssue_mg61__11)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg61__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg61__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg61__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg61__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg57() throws Exception {
        String __DSPOT_sName_16 = "nkib%A@IY:Wo-9M/^zOC";
        String __DSPOT_sMessage_15 = "{+DN-eV8<Or;(?xw0]W#";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg57__9 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg57__9)).hashCode())));
        JMethod o_testIssue_mg57__11 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg57__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).hasVarArgs());
        JErrorClass o_testIssue_mg57__13 = generator.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isAbstract());
        Assert.assertEquals("{+DN-eV8<Or;(?xw0]W#", ((JErrorClass) (o_testIssue_mg57__13)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg57__13)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg57__13)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testIssue_mg57__13)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg57__13)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg57__13)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg57__13)).isReference());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg57__9)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg57__11)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg57__11)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg56() throws Exception {
        String __DSPOT_sMessage_14 = "fl<xJgehgad?HCt1H=N6";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg56__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg56__8)).hashCode())));
        JMethod o_testIssue_mg56__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg56__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).hasVarArgs());
        JErrorClass o_testIssue_mg56__12 = generator.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isAbstract());
        Assert.assertEquals("fl<xJgehgad?HCt1H=N6", ((JErrorClass) (o_testIssue_mg56__12)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg56__12)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg56__12)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testIssue_mg56__12)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg56__12)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg56__12)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg56__12)).isReference());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg56__8)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg56__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg56__10)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg53() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg53__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg53__7)).hashCode())));
        JMethod o_testIssue_mg53__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg53__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).hasVarArgs());
        boolean o_testIssue_mg53__11 = generator.buildsErrorTypeRefs();
        Assert.assertFalse(o_testIssue_mg53__11);
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg53__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg53__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg53__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg75() throws Exception {
        String __DSPOT_sName_24 = "4=uV!aV(v6Iw9b>c1NAn";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg75__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg75__8)).hashCode())));
        JMethod o_testIssue_mg75__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg75__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).hasVarArgs());
        JEnumConstant o_testIssue_mg75__12 = aClass.enumConstant(__DSPOT_sName_24);
        Assert.assertEquals(1928237426, ((int) (((JEnumConstant) (o_testIssue_mg75__12)).hashCode())));
        Assert.assertEquals("test.Test.4=uV!aV(v6Iw9b>c1NAn", ((JEnumConstant) (o_testIssue_mg75__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testIssue_mg75__12)).hasArgs());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg75__8)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg75__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg75__10)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg76() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg76__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg76__7)).hashCode())));
        JMethod o_testIssue_mg76__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg76__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).hasVarArgs());
        Map<String, JFieldVar> o_testIssue_mg76__11 = aClass.fields();
        Assert.assertTrue(o_testIssue_mg76__11.isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg76__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg76__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg76__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg54() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg54__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg54__7)).hashCode())));
        JMethod o_testIssue_mg54__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg54__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).hasVarArgs());
        int o_testIssue_mg54__11 = generator.countArtifacts();
        Assert.assertEquals(1, ((int) (o_testIssue_mg54__11)));
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg54__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg54__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg54__9)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_rv116() throws Exception {
        Object __DSPOT_o_35 = new Object();
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar __DSPOT_invoc_7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_rv116__13 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv116__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).hasVarArgs());
        boolean o_testIssue_rv116__15 = __DSPOT_invoc_7.equals(__DSPOT_o_35);
        Assert.assertFalse(o_testIssue_rv116__15);
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_rv116__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_rv116__13)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationNumber15_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aClass = generator._class("test.Test");
            final JMethod aMethod = aClass.method(-1, generator.VOID, "name");
            aMethod.param(generator.ref("test.UnknownClass"), "p");
            aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
            org.junit.Assert.fail("testIssue_literalMutationNumber15 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_remove7() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JMethod o_testIssue_remove7__7 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertNull(o_testIssue_remove7__7);
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_mg71() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg71__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg71__7)).hashCode())));
        JMethod o_testIssue_mg71__9 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg71__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).hasVarArgs());
        boolean o_testIssue_mg71__11 = aClass.containsErrorTypes();
        Assert.assertFalse(o_testIssue_mg71__11);
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg71__7)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg71__9)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg71__9)).hasVarArgs());
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
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        JVar o_testIssue_mg72__8 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg72__8)).hashCode())));
        JMethod o_testIssue_mg72__10 = aClass.getMethod("name", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg72__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).hasVarArgs());
        boolean o_testIssue_mg72__12 = aClass.containsField(__DSPOT_sName_21);
        Assert.assertFalse(o_testIssue_mg72__12);
        Assert.assertFalse(((JMethod) (aMethod)).isConstructor());
        Assert.assertTrue(((JMethod) (aMethod)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethod)).hasVarArgs());
        Assert.assertEquals(-1828404188, ((int) (((JVar) (o_testIssue_mg72__8)).hashCode())));
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testIssue_mg72__10)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testIssue_mg72__10)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString38_mg14052_mg39128() throws Exception {
        String __DSPOT_sName_3699 = "&D0O492rNv(n[nKDP`UR";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aClass = generator._class("test.Test");
        final JMethod aMethod = aClass.method(0, generator.VOID, "name");
        JVar o_testIssue_literalMutationString38__7 = aMethod.param(generator.ref("test.UnknownClass"), "p");
        JMethod o_testIssue_literalMutationString38__9 = aClass.getMethod("nme", new AbstractJType[]{ generator.ref("test.UnknownClass") });
        AbstractJType o_testIssue_literalMutationString38_mg14052__16 = generator.parseType(__DSPOT_sName_3699);
        AbstractJType o_testIssue_literalMutationString38_mg14052_mg39128__19 = o_testIssue_literalMutationString38_mg14052__16.declarable();
        Assert.assertEquals(84121292, ((int) (((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass()", ((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isParameterized());
        Assert.assertNull(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isError());
        Assert.assertTrue(((JDirectClass) (o_testIssue_literalMutationString38_mg14052_mg39128__19)).isReference());
    }
}


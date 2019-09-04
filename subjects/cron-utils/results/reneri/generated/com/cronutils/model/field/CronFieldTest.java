package com.cronutils.model.field;


/* Copyright 2015 jmrozanec
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
public class CronFieldTest {
    private com.cronutils.model.field.CronField result;

    private com.cronutils.model.field.CronFieldName cronFieldName;

    @org.mockito.Mock
    private com.cronutils.model.field.expression.FieldExpression mockFieldExpression;

    @org.junit.Before
    public void setUp() {
        org.mockito.MockitoAnnotations.initMocks(this);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, (cronFieldName = com.cronutils.model.field.CronFieldName.SECOND));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|setUp()|5", com.cronutils.model.field.CronField.class, (result = new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|setUp()|1", com.cronutils.model.field.CronFieldName.class, cronFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.CronFieldTest|setUp()|2", com.cronutils.model.field.expression.FieldExpression.class, mockFieldExpression), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.field.CronFieldTest|setUp()|4", com.cronutils.model.field.constraint.FieldConstraints.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.field.CronFieldTest|setUp()|3", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).createConstraintsInstance()))));
    }

    @org.junit.Test
    public void testGetField() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testGetField()|0", com.cronutils.model.field.CronFieldName.class, cronFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testGetField()|2", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testGetField()|1", com.cronutils.model.field.CronField.class, result).getField()));
    }

    @org.junit.Test
    public void testGetExpression() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.CronFieldTest|testGetExpression()|0", com.cronutils.model.field.expression.FieldExpression.class, mockFieldExpression), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.field.CronFieldTest|testGetExpression()|2", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testGetExpression()|1", com.cronutils.model.field.CronField.class, result).getExpression()));
    }

    @org.junit.Test
    public void testCreateFieldComparator() throws java.lang.Exception {
        java.util.Comparator<com.cronutils.model.field.CronField> comparator = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Comparator<com.cronutils.model.field.CronField>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|0", java.util.Comparator.class, com.cronutils.model.field.CronField.createFieldComparator());
        com.cronutils.model.field.CronField mockResult1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|1", com.cronutils.model.field.CronField.class, org.mockito.Mockito.mock(com.cronutils.model.field.CronField.class));
        com.cronutils.model.field.CronFieldName cronFieldName1 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|2", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.SECOND);
        com.cronutils.model.field.CronField mockResult2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|3", com.cronutils.model.field.CronField.class, org.mockito.Mockito.mock(com.cronutils.model.field.CronField.class));
        com.cronutils.model.field.CronFieldName cronFieldName2 = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|4", com.cronutils.model.field.CronFieldName.class, cronFieldName1);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|9", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|7", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|6", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|5", com.cronutils.model.field.CronField.class, mockResult1).getField()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|8", com.cronutils.model.field.CronFieldName.class, cronFieldName1)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|14", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|12", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|11", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|10", com.cronutils.model.field.CronField.class, mockResult2).getField()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|13", com.cronutils.model.field.CronFieldName.class, cronFieldName2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|15", com.cronutils.model.field.CronFieldName.class, cronFieldName1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|16", com.cronutils.model.field.CronFieldName.class, cronFieldName2));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Comparator<com.cronutils.model.field.CronField>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|17", java.util.Comparator.class, comparator).compare(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|18", com.cronutils.model.field.CronField.class, mockResult1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|19", com.cronutils.model.field.CronField.class, mockResult2))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|21", com.cronutils.model.field.CronFieldName.class, (cronFieldName2 = com.cronutils.model.field.CronFieldName.MINUTE));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|26", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|24", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|23", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|22", com.cronutils.model.field.CronField.class, mockResult1).getField()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|25", com.cronutils.model.field.CronFieldName.class, cronFieldName1)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|31", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|29", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|28", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|27", com.cronutils.model.field.CronField.class, mockResult2).getField()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|30", com.cronutils.model.field.CronFieldName.class, cronFieldName2)));
        org.junit.Assert.assertNotEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|32", com.cronutils.model.field.CronFieldName.class, cronFieldName1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|33", com.cronutils.model.field.CronFieldName.class, cronFieldName2));
        org.junit.Assert.assertTrue((0 != (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|37", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Comparator<com.cronutils.model.field.CronField>>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|34", java.util.Comparator.class, comparator).compare(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|35", com.cronutils.model.field.CronField.class, mockResult1), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.field.CronFieldTest|testCreateFieldComparator()|36", com.cronutils.model.field.CronField.class, mockResult2))))));
    }
}

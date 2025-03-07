/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 30 12:14:07 GMT 2019
 */

package org.owasp.html;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TagBalancingHtmlStreamEventReceiver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.owasp.html.TagBalancingHtmlStreamEventReceiver"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/java-html-sanitizer/results/evosuite/1564488380/0007"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TagBalancingHtmlStreamEventReceiver_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableMultimap$Itr",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.MapMaker$NullComputingConcurrentMap",
      "com.google.common.collect.ComputingConcurrentHashMap",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.ImmutableSet$Indexed",
      "org.owasp.html.AbstractTokenStream",
      "org.owasp.html.HtmlElementTables$HtmlElementNames",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.Platform",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.google.common.collect.ByFunctionOrdering",
      "org.owasp.html.HtmlElementTables$DenseElementSet",
      "com.google.common.collect.RegularImmutableMultiset$ElementSet",
      "org.owasp.html.HtmlElementTables$1",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.collect.ImmutableSet$Indexed$1",
      "org.owasp.html.HtmlElementTables$DenseElementBinaryMatrix",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.RegularImmutableMultiset$NonTerminalEntry",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.base.Equivalence$Wrapper",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ComputingConcurrentHashMap$ComputingSegment",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.MapMaker$ComputingMapAdapter",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.MapMakerInternalMap$ValueReference",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "org.owasp.html.HtmlSanitizer$Policy",
      "com.google.common.collect.ImmutableCollection",
      "org.owasp.html.HtmlElementTables$SparseElementMultitable",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.ImmutableMapValues$1",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.ImmutableMapValues$2",
      "org.owasp.html.IntVector",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.collect.ComputingConcurrentHashMap$ComputingValueReference",
      "org.owasp.html.HtmlStreamEventReceiver",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "org.owasp.html.Handler",
      "org.owasp.html.HtmlTokenType",
      "com.google.common.collect.MapMakerInternalMap$ReferenceEntry",
      "org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy",
      "org.owasp.html.HtmlStreamRenderer",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.MapMaker$RemovalListener",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "org.owasp.html.HtmlToken",
      "com.google.common.collect.NaturalOrdering",
      "org.owasp.html.HtmlTextEscapingMode",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.collect.AllEqualOrdering",
      "org.owasp.html.HtmlElementTables$FreeWrapper",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.FunctionalEquivalence",
      "org.owasp.html.TagBalancingHtmlStreamEventReceiver",
      "com.google.common.collect.ComputationException",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableMap$SerializedForm",
      "com.google.common.base.Optional",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "org.owasp.html.HtmlElementTables$SparseElementToElements",
      "com.google.common.collect.ImmutableMapKeySet",
      "org.owasp.html.Strings",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "com.google.common.base.Ticker",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.MapMaker$NullConcurrentMap",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.base.Present",
      "com.google.common.collect.ImmutableMultimap$2",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.MapMaker$RemovalCause$4",
      "com.google.common.collect.MapMaker$RemovalCause$5",
      "com.google.common.collect.MapMaker$RemovalCause$2",
      "com.google.common.collect.MapMaker$RemovalCause$3",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.owasp.html.HtmlStreamRenderer$CloseableHtmlStreamRenderer",
      "com.google.common.collect.MapMaker$RemovalCause$1",
      "org.owasp.html.HtmlElementTablesCanned",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.GenericMapMaker",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet$1",
      "com.google.common.collect.MapMaker$RemovalNotification",
      "com.google.common.collect.MapMaker$RemovalCause",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.owasp.html.Handler$2",
      "org.owasp.html.Handler$1",
      "org.owasp.html.HtmlElementTables",
      "com.google.common.collect.SingletonImmutableList",
      "org.owasp.html.HtmlLexer",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.owasp.html.HtmlElementTables$TextContentModelBit",
      "com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Multiset$Entry",
      "com.google.common.collect.MapMakerInternalMap$Strength$3",
      "org.owasp.html.ElementAndAttributePolicies",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.ImmutableList$Builder",
      "org.owasp.html.TokenStream",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "com.google.common.collect.ImmutableMultiset$1",
      "com.google.common.collect.MapMakerInternalMap$2",
      "com.google.common.collect.MapMakerInternalMap$1",
      "com.google.common.base.Equivalence",
      "org.owasp.html.HtmlElementTables$TextContentModel",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.SetMultimap",
      "org.owasp.html.AutoCloseableHtmlStreamRenderer",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.owasp.html.Handler", false, TagBalancingHtmlStreamEventReceiver_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TagBalancingHtmlStreamEventReceiver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.owasp.html.HtmlElementTables$1",
      "org.owasp.html.HtmlElementTables",
      "org.owasp.html.HtmlElementTables$HtmlElementNames",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "org.owasp.html.HtmlElementTables$DenseElementBinaryMatrix",
      "com.google.common.base.Preconditions",
      "org.owasp.html.HtmlElementTables$SparseElementToElements",
      "org.owasp.html.HtmlElementTables$SparseElementMultitable",
      "org.owasp.html.HtmlElementTables$TextContentModel",
      "org.owasp.html.HtmlElementTables$DenseElementSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Platform",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.Lists",
      "org.owasp.html.HtmlElementTables$FreeWrapper",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$11",
      "org.owasp.html.HtmlElementTablesCanned",
      "org.owasp.html.TagBalancingHtmlStreamEventReceiver",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "org.owasp.html.Strings",
      "org.owasp.html.HtmlTextEscapingMode",
      "org.owasp.html.HtmlStreamRenderer",
      "org.owasp.html.AbstractTokenStream",
      "org.owasp.html.HtmlLexer",
      "org.owasp.html.HtmlStreamRenderer$CloseableHtmlStreamRenderer",
      "org.owasp.html.IntVector",
      "org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy"
    );
  }
}

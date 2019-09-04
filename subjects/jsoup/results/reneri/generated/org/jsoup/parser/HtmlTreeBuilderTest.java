package org.jsoup.parser;


public class HtmlTreeBuilderTest {
    @org.junit.Test
    public void ensureSearchArraysAreSorted() {
        java.lang.String[][] arrays = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|7", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|0", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|1", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagSearchList), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|2", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagSearchButton), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|3", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|4", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|5", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|6", java.lang.String[].class, org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial) });
        for (java.lang.String[] array : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|8", java.lang.String[][].class, arrays)) {
            java.lang.String[] copy = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|12", java.lang.String[].class, java.util.Arrays.copyOf(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|9", java.lang.String[].class, array), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|10", java.lang.String[].class, array).length)));
            java.util.Arrays.sort(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|13", java.lang.String[].class, array));
            org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|14", java.lang.String[].class, array), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.parser.HtmlTreeBuilderTest|ensureSearchArraysAreSorted()|15", java.lang.String[].class, copy));
        }
    }
}

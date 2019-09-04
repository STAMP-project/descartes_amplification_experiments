package org.jsoup.helper;


public class DataUtilTest {
    @org.junit.Test
    public void testCharset() {
        org.junit.Assert.assertEquals("utf-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testCharset()|0", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html;charset=utf-8 ")));
        org.junit.Assert.assertEquals("UTF-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testCharset()|1", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=UTF-8")));
        org.junit.Assert.assertEquals("ISO-8859-1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testCharset()|2", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1")));
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testCharset()|3", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html")));
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testCharset()|4", org.jsoup.helper.DataUtil.getCharsetFromContentType(null)));
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testCharset()|5", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html;charset=Unknown")));
    }

    @org.junit.Test
    public void testQuotedCharset() {
        org.junit.Assert.assertEquals("utf-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testQuotedCharset()|0", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\"")));
        org.junit.Assert.assertEquals("UTF-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testQuotedCharset()|1", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html;charset=\"UTF-8\"")));
        org.junit.Assert.assertEquals("ISO-8859-1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testQuotedCharset()|2", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\"")));
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testQuotedCharset()|3", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=\"Unsupported\"")));
        org.junit.Assert.assertEquals("UTF-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|testQuotedCharset()|4", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'")));
    }

    private java.io.InputStream stream(java.lang.String data) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.jsoup.helper.DataUtilTest|stream(java.lang.String)|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.jsoup.helper.DataUtilTest|stream(java.lang.String)|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|stream(java.lang.String)|0", data).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.jsoup.helper.DataUtilTest|stream(java.lang.String)|1", java.nio.charset.Charset.class, java.nio.charset.StandardCharsets.UTF_8)))));
    }

    private java.io.InputStream stream(java.lang.String data, java.lang.String charset) {
        try {
            return eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.jsoup.helper.DataUtilTest|stream(java.lang.String,java.lang.String)|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.jsoup.helper.DataUtilTest|stream(java.lang.String,java.lang.String)|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|stream(java.lang.String,java.lang.String)|0", data).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|stream(java.lang.String,java.lang.String)|1", charset)))));
        } catch (java.io.UnsupportedEncodingException e) {
            org.junit.Assert.fail();
        }
        return null;
    }

    @org.junit.Test
    public void discardsSpuriousByteOrderMark() throws java.io.IOException {
        java.lang.String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|3", org.jsoup.nodes.Document.class, org.jsoup.helper.DataUtil.parseInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|1", java.io.InputStream.class, stream(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|0", html))), "UTF-8", "http://foo.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Parser>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|2", org.jsoup.parser.Parser.class, org.jsoup.parser.Parser.htmlParser())));
        org.junit.Assert.assertEquals("One", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|5", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMark()|4", org.jsoup.nodes.Document.class, doc).head()).text()));
    }

    @org.junit.Test
    public void discardsSpuriousByteOrderMarkWhenNoCharsetSet() throws java.io.IOException {
        java.lang.String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|3", org.jsoup.nodes.Document.class, org.jsoup.helper.DataUtil.parseInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|1", java.io.InputStream.class, stream(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|0", html))), null, "http://foo.com/", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Parser>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|2", org.jsoup.parser.Parser.class, org.jsoup.parser.Parser.htmlParser())));
        org.junit.Assert.assertEquals("One", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|5", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|4", org.jsoup.nodes.Document.class, doc).head()).text()));
        org.junit.Assert.assertEquals("UTF-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|9", java.nio.charset.Charset.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document.OutputSettings>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|8", org.jsoup.nodes.Document.OutputSettings.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|discardsSpuriousByteOrderMarkWhenNoCharsetSet()|7", org.jsoup.nodes.Document.class, doc).outputSettings()).charset()).displayName()));
    }

    @org.junit.Test
    public void shouldNotThrowExceptionOnEmptyCharset() {
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|shouldNotThrowExceptionOnEmptyCharset()|0", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=")));
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|shouldNotThrowExceptionOnEmptyCharset()|1", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=;")));
    }

    @org.junit.Test
    public void shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags() {
        org.junit.Assert.assertEquals("ISO-8859-1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags()|0", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1, charset=1251")));
    }

    @org.junit.Test
    public void shouldCorrectCharsetForDuplicateCharsetString() {
        org.junit.Assert.assertEquals("iso-8859-1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|shouldCorrectCharsetForDuplicateCharsetString()|0", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=charset=iso-8859-1")));
    }

    @org.junit.Test
    public void shouldReturnNullForIllegalCharsetNames() {
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|shouldReturnNullForIllegalCharsetNames()|0", org.jsoup.helper.DataUtil.getCharsetFromContentType("text/html; charset=$HJKDF§$/(")));
    }

    @org.junit.Test
    public void generatesMimeBoundaries() {
        java.lang.String m1 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|0", org.jsoup.helper.DataUtil.mimeBoundary());
        java.lang.String m2 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|1", org.jsoup.helper.DataUtil.mimeBoundary());
        org.junit.Assert.assertEquals(org.jsoup.helper.DataUtil.boundaryLength, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|2", m1).length()));
        org.junit.Assert.assertEquals(org.jsoup.helper.DataUtil.boundaryLength, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|4", m2).length()));
        org.junit.Assert.assertNotSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|6", m1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|generatesMimeBoundaries()|7", m2));
    }

    @org.junit.Test
    public void wrongMetaCharsetFallback() throws java.io.IOException {
        java.lang.String html = "<html><head><meta charset=iso-8></head><body></body></html>";
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|3", org.jsoup.nodes.Document.class, org.jsoup.helper.DataUtil.parseInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|1", java.io.InputStream.class, stream(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|0", html))), null, "http://example.com", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Parser>observeState("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|2", org.jsoup.parser.Parser.class, org.jsoup.parser.Parser.htmlParser())));
        final java.lang.String expected = "<html>\n" + ((((" <head>\n" + "  <meta charset=\"iso-8\">\n") + " </head>\n") + " <body></body>\n") + "</html>");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|4", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|wrongMetaCharsetFallback()|5", org.jsoup.nodes.Document.class, doc).toString()));
    }

    @org.junit.Test
    public void secondMetaElementWithContentTypeContainsCharsetParameter() throws java.lang.Exception {
        java.lang.String html = "<html><head>" + (("<meta http-equiv=\"Content-Type\" content=\"text/html\">" + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">") + "</head><body>한국어</body></html>");
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|3", org.jsoup.nodes.Document.class, org.jsoup.helper.DataUtil.parseInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|1", java.io.InputStream.class, stream(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|0", html), "euc-kr")), null, "http://example.com", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Parser>observeState("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|2", org.jsoup.parser.Parser.class, org.jsoup.parser.Parser.htmlParser())));
        org.junit.Assert.assertEquals("한국어", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|5", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|secondMetaElementWithContentTypeContainsCharsetParameter()|4", org.jsoup.nodes.Document.class, doc).body()).text()));
    }

    @org.junit.Test
    public void firstMetaElementWithCharsetShouldBeUsedForDecoding() throws java.lang.Exception {
        java.lang.String html = "<html><head>" + (("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">" + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=koi8-u\">") + "</head><body>Übergrößenträger</body></html>");
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|3", org.jsoup.nodes.Document.class, org.jsoup.helper.DataUtil.parseInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|1", java.io.InputStream.class, stream(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|0", html), "iso-8859-1")), null, "http://example.com", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Parser>observeState("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|2", org.jsoup.parser.Parser.class, org.jsoup.parser.Parser.htmlParser())));
        org.junit.Assert.assertEquals("Übergrößenträger", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|5", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|firstMetaElementWithCharsetShouldBeUsedForDecoding()|4", org.jsoup.nodes.Document.class, doc).body()).text()));
    }

    @org.junit.Test
    public void supportsBOMinFiles() throws java.io.IOException {
        // test files from http://www.i18nl10n.com/korean/utftest/
        java.io.File in = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|0", java.io.File.class, org.jsoup.integration.ParseTest.getFile("/bomtests/bom_utf16be.html"));
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|2", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|1", java.io.File.class, in), null, "http://example.com"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|3", org.jsoup.nodes.Document.class, doc).title()).contains("UTF-16BE")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|6", org.jsoup.nodes.Document.class, doc).text()).contains("가각갂갃간갅")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|9", java.io.File.class, (in = org.jsoup.integration.ParseTest.getFile("/bomtests/bom_utf16le.html")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|11", org.jsoup.nodes.Document.class, (doc = org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|10", java.io.File.class, in), null, "http://example.com")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|14", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|12", org.jsoup.nodes.Document.class, doc).title()).contains("UTF-16LE")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|17", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|15", org.jsoup.nodes.Document.class, doc).text()).contains("가각갂갃간갅")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|18", java.io.File.class, (in = org.jsoup.integration.ParseTest.getFile("/bomtests/bom_utf32be.html")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|20", org.jsoup.nodes.Document.class, (doc = org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|19", java.io.File.class, in), null, "http://example.com")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|23", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|21", org.jsoup.nodes.Document.class, doc).title()).contains("UTF-32BE")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|26", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|24", org.jsoup.nodes.Document.class, doc).text()).contains("가각갂갃간갅")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|27", java.io.File.class, (in = org.jsoup.integration.ParseTest.getFile("/bomtests/bom_utf32le.html")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|29", org.jsoup.nodes.Document.class, (doc = org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|28", java.io.File.class, in), null, "http://example.com")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|32", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|31", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|30", org.jsoup.nodes.Document.class, doc).title()).contains("UTF-32LE")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|35", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|34", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsBOMinFiles()|33", org.jsoup.nodes.Document.class, doc).text()).contains("가각갂갃간갅")));
    }

    @org.junit.Test
    public void supportsUTF8BOM() throws java.io.IOException {
        java.io.File in = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|0", java.io.File.class, org.jsoup.integration.ParseTest.getFile("/bomtests/bom_utf8.html"));
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|2", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|1", java.io.File.class, in), null, "http://example.com"));
        org.junit.Assert.assertEquals("OK", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|5", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|4", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsUTF8BOM()|3", org.jsoup.nodes.Document.class, doc).head()).select("title")).text()));
    }

    @org.junit.Test
    public void supportsXmlCharsetDeclaration() throws java.io.IOException {
        java.lang.String encoding = "iso-8859-1";
        java.io.InputStream soup = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|1", byte[].class, ("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|0", encoding)))));
        org.jsoup.nodes.Document doc = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|4", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|3", java.io.InputStream.class, soup), null, ""));
        org.junit.Assert.assertEquals("Hellö Wörld!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|6", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.helper.DataUtilTest|supportsXmlCharsetDeclaration()|5", org.jsoup.nodes.Document.class, doc).body()).text()));
    }
}

package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class ElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test(timeout = 10000)
    public void testPrependNewHtml() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml__5)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg82() throws Exception {
        String __DSPOT_value_30 = "ODA!L#vK5WR{oE1L&q_{";
        String __DSPOT_key_29 = "Me!@y;s?/OCDfviVTx>D";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg82__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg82__7)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg82__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg82__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg82__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg82__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg82__18 = div.getElementsByAttributeValueNot(__DSPOT_key_29, __DSPOT_value_30);
        Assert.assertFalse(o_testPrependNewHtml_mg82__18.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg82__7)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg82__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg82__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg82__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg82__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv206() throws Exception {
        String __DSPOT_valueSuffix_107 = "T/V7TZG5qmr`1s$.raz`";
        String __DSPOT_key_106 = ";uS9b&r5!GQi?`Oiw0F]";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv206__20 = __DSPOT_invoc_5.getElementsByAttributeValueEnding(__DSPOT_key_106, __DSPOT_valueSuffix_107);
        Assert.assertTrue(o_testPrependNewHtml_rv206__20.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv217() throws Exception {
        String __DSPOT_regex_121 = "Z%ds TuK*Yo^mgdhAD^|";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv217__19 = __DSPOT_invoc_5.getElementsMatchingOwnText(__DSPOT_regex_121);
        Assert.assertFalse(o_testPrependNewHtml_rv217__19.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg90() throws Exception {
        String __DSPOT_searchText_39 = "6fdF&0xT!&b-W-(y_V1a";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg90__6 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg90__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg90__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg90__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg90__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg90__6)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg90__17 = div.getElementsContainingText(__DSPOT_searchText_39);
        Assert.assertTrue(o_testPrependNewHtml_mg90__17.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg90__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg90__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg90__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg90__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg90__6)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv207_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_109 = "T]e_+S#i]w!maZJcf{Y<";
            String __DSPOT_key_108 = "39dL#}_3(,uc,zul%aS[";
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            for (int i = 0; i < (ps.size()); i++) {
            }
            __DSPOT_invoc_5.getElementsByAttributeValueMatching(__DSPOT_key_108, __DSPOT_regex_109);
            org.junit.Assert.fail("testPrependNewHtml_rv207 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: T]e_+S#i]w!maZJcf{Y<", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg89() throws Exception {
        String __DSPOT_searchText_38 = "s%=])JWOM_4gdsL9rC)A";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg89__6 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg89__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg89__6)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg89__17 = div.getElementsContainingOwnText(__DSPOT_searchText_38);
        Assert.assertTrue(o_testPrependNewHtml_mg89__17.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg89__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg89__6)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg85() throws Exception {
        int __DSPOT_index_34 = -2077728141;
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg85__6 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg85__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg85__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg85__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg85__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg85__6)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg85__17 = div.getElementsByIndexEquals(__DSPOT_index_34);
        Assert.assertTrue(o_testPrependNewHtml_mg85__17.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg85__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg85__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg85__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg85__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg85__6)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv209() throws Exception {
        String __DSPOT_valuePrefix_113 = "kvd|>op3F[UUbDcpS ]x";
        String __DSPOT_key_112 = ">ua@F;_a&4Bc{vs!b(f2";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv209__20 = __DSPOT_invoc_5.getElementsByAttributeValueStarting(__DSPOT_key_112, __DSPOT_valuePrefix_113);
        Assert.assertTrue(o_testPrependNewHtml_rv209__20.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg43() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg43__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg43__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg43__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Parser o_testPrependNewHtml_mg43__16 = doc.parser();
        Assert.assertFalse(((Parser) (o_testPrependNewHtml_mg43__16)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testPrependNewHtml_mg43__16)).getErrors())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg43__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg43__5)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg92_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_41 = "1H=N6{+DN-eV8<Or;(?x";
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            for (int i = 0; i < (ps.size()); i++) {
            }
            div.getElementsMatchingText(__DSPOT_regex_41);
            org.junit.Assert.fail("testPrependNewHtml_mg92 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 1H=N6{+DN-eV8<Or;(?x", expected.getMessage());
        }
    }
}


package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;


public class TextNodeTest {
    @Test(timeout = 10000)
    public void testSplitAnEmbolden() throws Exception {
        Document doc = Jsoup.parse("<div>Hello there</div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello there\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.select("div").first();
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertEquals("<div>\n Hello there\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        TextNode tn = ((TextNode) (div.childNode(0)));
        Assert.assertEquals("\nHello there", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello there", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        TextNode tail = tn.splitText(6);
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Node o_testSplitAnEmbolden__10 = tail.wrap("<b></b>");
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden__10)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden__10)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden__10)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden__10)).hasParent());
        TextUtil.stripNewlines(div.html());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertEquals("<div>\n Hello \n <b>there</b>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("\nHello ", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello ", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden__10)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden__10)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden__10)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden__10)).hasParent());
    }

    @Test(timeout = 10000)
    public void testSplitAnEmbolden_mg48() throws Exception {
        Document doc = Jsoup.parse("<div>Hello there</div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello there\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.select("div").first();
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello there\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        TextNode tn = ((TextNode) (div.childNode(0)));
        Assert.assertEquals("\nHello there", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello there", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        TextNode tail = tn.splitText(6);
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Node o_testSplitAnEmbolden_mg48__10 = tail.wrap("<b></b>");
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg48__10)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden_mg48__10)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg48__10)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden_mg48__10)).hasParent());
        TextUtil.stripNewlines(div.html());
        Parser o_testSplitAnEmbolden_mg48__13 = doc.parser();
        Assert.assertFalse(((Parser) (o_testSplitAnEmbolden_mg48__13)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSplitAnEmbolden_mg48__13)).getErrors())).isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello \n <b>there</b>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("\nHello ", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello ", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg48__10)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden_mg48__10)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg48__10)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden_mg48__10)).hasParent());
    }

    @Test(timeout = 10000)
    public void testSplitAnEmbolden_rv145() throws Exception {
        String __DSPOT_attributeKey_64 = "CMs-NCPSNsen+,yJLZTg";
        Document doc = Jsoup.parse("<div>Hello there</div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello there\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.select("div").first();
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello there\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        TextNode tn = ((TextNode) (div.childNode(0)));
        Assert.assertEquals("\nHello there", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello there", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        TextNode tail = tn.splitText(6);
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Node __DSPOT_invoc_10 = tail.wrap("<b></b>");
        TextUtil.stripNewlines(div.html());
        String o_testSplitAnEmbolden_rv145__16 = __DSPOT_invoc_10.absUrl(__DSPOT_attributeKey_64);
        Assert.assertEquals("", o_testSplitAnEmbolden_rv145__16);
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello \n <b>there</b>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("\nHello ", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello ", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
    }

    @Test(timeout = 10000)
    public void testSplitAnEmbolden_rv156() throws Exception {
        String __DSPOT_attributeKey_72 = "Y3Pe#L360:}[gYFUICnc";
        Document doc = Jsoup.parse("<div>Hello there</div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello there\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.select("div").first();
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello there\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        TextNode tn = ((TextNode) (div.childNode(0)));
        Assert.assertEquals("\nHello there", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello there", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        TextNode tail = tn.splitText(6);
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Node __DSPOT_invoc_10 = tail.wrap("<b></b>");
        TextUtil.stripNewlines(div.html());
        boolean o_testSplitAnEmbolden_rv156__16 = __DSPOT_invoc_10.hasAttr(__DSPOT_attributeKey_72);
        Assert.assertFalse(o_testSplitAnEmbolden_rv156__16);
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello \n <b>there</b>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("\nHello ", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello ", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
    }

    @Test(timeout = 10000)
    public void testSplitAnEmbolden_mg44() throws Exception {
        Document doc = Jsoup.parse("<div>Hello there</div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello there\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.select("div").first();
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello there\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        TextNode tn = ((TextNode) (div.childNode(0)));
        Assert.assertEquals("\nHello there", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello there", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        TextNode tail = tn.splitText(6);
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Node o_testSplitAnEmbolden_mg44__10 = tail.wrap("<b></b>");
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg44__10)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden_mg44__10)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg44__10)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden_mg44__10)).hasParent());
        TextUtil.stripNewlines(div.html());
        Document o_testSplitAnEmbolden_mg44__13 = doc.normalise();
        Assert.assertFalse(((Collection) (((Document) (o_testSplitAnEmbolden_mg44__13)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testSplitAnEmbolden_mg44__13)).hasText());
        Assert.assertFalse(((Document) (o_testSplitAnEmbolden_mg44__13)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (o_testSplitAnEmbolden_mg44__13)).toString());
        Assert.assertFalse(((Document) (o_testSplitAnEmbolden_mg44__13)).hasParent());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello \n <b>there</b>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("\nHello ", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello ", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg44__10)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden_mg44__10)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_mg44__10)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden_mg44__10)).hasParent());
    }

    @Test(timeout = 10000)
    public void testSplitAnEmbolden_rv166() throws Exception {
        String __DSPOT_attributeKey_74 = "SU7EvLBHp9HIW?9U-1%h";
        Document doc = Jsoup.parse("<div>Hello there</div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello there\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.select("div").first();
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello there\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        TextNode tn = ((TextNode) (div.childNode(0)));
        Assert.assertEquals("\nHello there", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello there", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        TextNode tail = tn.splitText(6);
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
        Node __DSPOT_invoc_10 = tail.wrap("<b></b>");
        TextUtil.stripNewlines(div.html());
        Node o_testSplitAnEmbolden_rv166__16 = __DSPOT_invoc_10.removeAttr(__DSPOT_attributeKey_74);
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_rv166__16)).toString());
        Assert.assertFalse(((TextNode) (o_testSplitAnEmbolden_rv166__16)).isBlank());
        Assert.assertEquals("there", ((TextNode) (o_testSplitAnEmbolden_rv166__16)).getWholeText());
        Assert.assertTrue(((TextNode) (o_testSplitAnEmbolden_rv166__16)).hasParent());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   Hello \n   <b>there</b>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div>\n Hello \n <b>there</b>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("\nHello ", ((TextNode) (tn)).toString());
        Assert.assertFalse(((TextNode) (tn)).isBlank());
        Assert.assertEquals("Hello ", ((TextNode) (tn)).getWholeText());
        Assert.assertTrue(((TextNode) (tn)).hasParent());
        Assert.assertEquals("there", ((TextNode) (tail)).toString());
        Assert.assertFalse(((TextNode) (tail)).isBlank());
        Assert.assertEquals("there", ((TextNode) (tail)).getWholeText());
        Assert.assertTrue(((TextNode) (tail)).hasParent());
    }
}


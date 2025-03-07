package org.jsoup.parser;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class HtmlParserTest {
    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg43() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg43__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        String o_handlesUnclosedTitle_mg43__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg43__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg43__14 = two.body();
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg43__14)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedTitle_mg43__14)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg43__14)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg43__14)).hasParent());
        Assert.assertEquals("<body>\n <b>Two <p>Test</p></b>\n</body>", ((Element) (o_handlesUnclosedTitle_mg43__14)).toString());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg54() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg54__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg54__4);
        String o_handlesUnclosedTitle_mg54__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg54__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg54__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg54__11);
        two.body().html();
        Parser o_handlesUnclosedTitle_mg54__14 = two.parser();
        Assert.assertFalse(((Parser) (o_handlesUnclosedTitle_mg54__14)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedTitle_mg54__14)).getErrors())).isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg54__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg54__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg54__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg50() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg50__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg50__4);
        String o_handlesUnclosedTitle_mg50__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg50__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg50__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg50__11);
        two.body().html();
        Document o_handlesUnclosedTitle_mg50__14 = two.normalise();
        Assert.assertFalse(((Document) (o_handlesUnclosedTitle_mg50__14)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_handlesUnclosedTitle_mg50__14)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_handlesUnclosedTitle_mg50__14)).hasText());
        Assert.assertFalse(((Document) (o_handlesUnclosedTitle_mg50__14)).hasParent());
        Assert.assertEquals("<html>\n <head>\n  <title>One</title>\n </head>\n <body>\n  <b>Two <p>Test</p></b>\n </body>\n</html>", ((Document) (o_handlesUnclosedTitle_mg50__14)).toString());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg50__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg50__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg50__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg28_mg1488() throws Exception {
        String __DSPOT_keyPrefix_386 = "<hmVC>o#s`XAqXgdI1tl";
        String __DSPOT_tagName_0 = "L`A=SO/woO!OKS@Rl&{h";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg28__5 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        String o_handlesUnclosedTitle_mg28__6 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg28__12 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
        two.body().html();
        Element o_handlesUnclosedTitle_mg28__15 = one.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedTitle_mg28_mg1488__25 = o_handlesUnclosedTitle_mg28__15.getElementsByAttributeStarting(__DSPOT_keyPrefix_386);
        Assert.assertTrue(o_handlesUnclosedTitle_mg28_mg1488__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg47_mg1141() throws Exception {
        String __DSPOT_searchText_302 = "/q[NKD[/hFAO[^U-(XuV";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg47__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg47__4);
        String o_handlesUnclosedTitle_mg47__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg47__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg47__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg47__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg47__14 = two.head();
        Elements o_handlesUnclosedTitle_mg47_mg1141__24 = o_handlesUnclosedTitle_mg47__14.getElementsContainingOwnText(__DSPOT_searchText_302);
        Assert.assertTrue(o_handlesUnclosedTitle_mg47_mg1141__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg47__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg47__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg47__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg43_mg4689() throws Exception {
        String __DSPOT_regex_1087 = "qK2v/<C*&?]6}7rckzfm";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg43__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        String o_handlesUnclosedTitle_mg43__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg43__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg43__14 = two.body();
        Elements o_handlesUnclosedTitle_mg43_mg4689__24 = o_handlesUnclosedTitle_mg43__14.getElementsMatchingText(__DSPOT_regex_1087);
        Assert.assertTrue(o_handlesUnclosedTitle_mg43_mg4689__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg43_mg4674() throws Exception {
        String __DSPOT_valueSuffix_1072 = "2bH5)!K2?H7f (c$*&U!";
        String __DSPOT_key_1071 = "1&x#LaHAzB|sTDCK4;`C";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg43__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        String o_handlesUnclosedTitle_mg43__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg43__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg43__14 = two.body();
        Elements o_handlesUnclosedTitle_mg43_mg4674__25 = o_handlesUnclosedTitle_mg43__14.getElementsByAttributeValueEnding(__DSPOT_key_1071, __DSPOT_valueSuffix_1072);
        Assert.assertTrue(o_handlesUnclosedTitle_mg43_mg4674__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
    }
}


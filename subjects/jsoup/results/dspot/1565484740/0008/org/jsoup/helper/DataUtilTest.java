package org.jsoup.helper;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class DataUtilTest {
    private InputStream stream(String data) {
        return new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
    }

    private InputStream stream(String data, String charset) {
        try {
            return new ByteArrayInputStream(data.getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            Assert.fail();
        }
        return null;
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36() throws IOException {
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Assert.assertTrue(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).hasText());
        Assert.assertTrue(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).hasParent());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg39() throws IOException {
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg39__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg39__7);
        Document o_supportsXmlCharsetDeclaration_mg39__9 = doc.normalise();
        Assert.assertFalse(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).hasText());
        Assert.assertFalse(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).hasParent());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg39__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg43() throws IOException {
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg43__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg43__7);
        Parser o_supportsXmlCharsetDeclaration_mg43__9 = doc.parser();
        Assert.assertTrue(((Collection) (((Parser) (o_supportsXmlCharsetDeclaration_mg43__9)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (o_supportsXmlCharsetDeclaration_mg43__9)).isTrackErrors());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg43__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_mg2390() throws IOException {
        String __DSPOT_valueSuffix_290 = "@&-]*#]GeIg,x4}FGSf]";
        String __DSPOT_key_289 = "1MzQ{7GYUUf/}m35:6>T";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Elements o_supportsXmlCharsetDeclaration_mg36_mg2390__16 = o_supportsXmlCharsetDeclaration_mg36__9.getElementsByAttributeValueEnding(__DSPOT_key_289, __DSPOT_valueSuffix_290);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg36_mg2390__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }
}

package j2html.tags;


import j2html.TagCreator;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class TagTest {
    @Test(timeout = 10000)
    public void testEquals_mg93() throws Exception {
        Tag __DSPOT_obj_83 = null;
        Tag tagOne = TagCreator.tag("p").withClass("class").withText("Test");
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagOne)).getNumChildren())));
        Assert.assertEquals("p", ((ContainerTag) (tagOne)).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isHidden())).getTagName());
        Tag tagTwo = TagCreator.p("Test").withClass("class");
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagTwo)).getNumChildren())));
        Assert.assertEquals("p", ((ContainerTag) (tagTwo)).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isHidden())).getTagName());
        MatcherAssert.assertThat(tagOne.equals(tagTwo), Matchers.is(true));
        boolean o_testEquals_mg93__12 = tagTwo.equals(__DSPOT_obj_83);
        Assert.assertFalse(o_testEquals_mg93__12);
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagOne)).getNumChildren())));
        Assert.assertEquals("p", ((ContainerTag) (tagOne)).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagTwo)).getNumChildren())));
        Assert.assertEquals("p", ((ContainerTag) (tagTwo)).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isHidden())).getTagName());
    }

    @Test(timeout = 10000)
    public void testEquals_add3_mg2311() throws Exception {
        DomContent[] __DSPOT_children_533 = new DomContent[0];
        boolean __DSPOT_condition_532 = true;
        ContainerTag o_testEquals_add3__1 = TagCreator.tag("p");
        Assert.assertEquals(0, ((int) (((ContainerTag) (o_testEquals_add3__1)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (o_testEquals_add3__1)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isHidden())).getTagName());
        Tag tagOne = TagCreator.tag("p").withClass("class").withText("Test");
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagOne)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagOne)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isHidden())).getTagName());
        Tag tagTwo = TagCreator.p("Test").withClass("class");
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagTwo)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagTwo)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isHidden())).getTagName());
        MatcherAssert.assertThat(tagOne.equals(tagTwo), Matchers.is(true));
        ContainerTag o_testEquals_add3_mg2311__16 = o_testEquals_add3__1.condWith(__DSPOT_condition_532, __DSPOT_children_533);
        Assert.assertEquals(0, ((int) (((ContainerTag) (o_testEquals_add3_mg2311__16)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (o_testEquals_add3_mg2311__16)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3_mg2311__16)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals(0, ((int) (((ContainerTag) (o_testEquals_add3__1)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (o_testEquals_add3__1)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (o_testEquals_add3__1)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagOne)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagOne)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagOne)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagOne)).isHidden())).isHidden())).getTagName());
        Assert.assertEquals(1, ((int) (((ContainerTag) (tagTwo)).getNumChildren())));
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isRequired())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoFocus())).isHidden())).getTagName());
        Assert.assertEquals("p", ((ContainerTag) (tagTwo)).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isAutoComplete())).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isRequired())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoFocus())).getTagName());
        Assert.assertEquals("p", ((Tag) (((ContainerTag) (tagTwo)).isHidden())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isAutoComplete())).getTagName());
        Assert.assertEquals("p", ((Tag) (((Tag) (((ContainerTag) (tagTwo)).isHidden())).isHidden())).getTagName());
    }
}

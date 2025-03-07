package org.apache.commons.codec.binary;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BaseNCodecTest {
    BaseNCodec codec;

    @Before
    public void setUp() {
        codec = new BaseNCodec(0, 0, 0, 0) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final BaseNCodec.Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final BaseNCodec.Context context) {
            }
        };
    }

    @Test(timeout = 10000)
    public void testIsInAlphabetStringnull13_failAssert0() throws Exception {
        try {
            codec.isInAlphabet("OK");
            codec.isInAlphabet(null);
            org.junit.Assert.fail("testIsInAlphabetStringnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}


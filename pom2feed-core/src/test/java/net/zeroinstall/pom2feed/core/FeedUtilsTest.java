package net.zeroinstall.pom2feed.core;

import org.junit.*;
import static org.junit.Assert.*;
import static net.zeroinstall.pom2feed.core.FeedUtils.*;

public class FeedUtilsTest {

    @Test
    public void testGetSha1ManifestDigest() {
        assertEquals(
                "67600f59b06e4a3857e696f165d9dae02dc8a772",
                getSha1ManifestDigest("123abc", 1024, "filename.jar"));
    }

    @Test
    public void testConvertToAsciiNumbers() {
        assertEquals("097098099", convertToAsciiNumbers("abc"));
    }
}

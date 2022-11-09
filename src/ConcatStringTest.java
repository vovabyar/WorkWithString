import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConcatStringTest {

    @Test
    void concatString() {
        String str1 = ConcatString.ConcatString("abc", "def");
        String str2 = ConcatString.ConcatString("", "");
        String str3 = ConcatString.ConcatString(" ", "");
        List<String> actual = new ArrayList<>();
        actual.add(str1);
        actual.add(str2);
        actual.add(str3);


        List<String> expected = new ArrayList<>();
        expected.add("abcdef");
        expected.add("");
        expected.add(" ");
        Assert.assertEquals(expected, actual);
    }
}
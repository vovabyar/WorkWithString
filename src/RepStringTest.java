import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepStringTest {

    @Test
    void repString() {
        String str1 = RepString.RepString("abc", 2);
        String str2 = RepString.RepString("", 0);
        String str3 = RepString.RepString("", 2);
        String str4 = RepString.RepString(" ", 5);
        List<String> actual = new ArrayList<>();
        actual.add(str1);
        actual.add(str2);
        actual.add(str3);
        actual.add(str4);


        List<String> expected = new ArrayList<>();
        expected.add("abcabc");
        expected.add("");
        expected.add("");
        expected.add("     ");
        Assert.assertEquals(expected, actual);
    }
}
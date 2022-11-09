import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    void converter() {
        String str1 = StringConverter.Converter("abc", "abc", 0, 1);
        String str2 = StringConverter.Converter("abc", "", 2, 2);
        String str3 = StringConverter.Converter("", "abc", 999, 2);
        String str4 = StringConverter.Converter(" ", "abc", 2, 2);

        List<String> actual = new ArrayList<>();
        actual.add(str1);
        actual.add(str2);
        actual.add(str3);
        actual.add(str4);

        List<String> expected = new ArrayList<>();
        expected.add("abcabc");
        expected.add("abcabc");
        expected.add("");
        expected.add("  ");
        Assert.assertEquals(expected, actual);

        assertThrows(ArgumentAccessException.class, () -> {
            StringConverter.Converter(" ", "abc", 2, 3);
        });
    }
}
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

public class StringConverter {
    String str1 = "";
    String str2 = "";
    int count = 0;
    int type = 0;


    public static String Converter(String str1, String str2, int count, int type) {
        str1 = str1;
        str2 = str2;
        count = count;
        type = type;

        if (type < 1 || type > 2){
            throw new ArgumentAccessException("Type cannot be < 1 or > 2");
        }

        else if (type == 1) {
            return ConcatString.ConcatString(str1, str2);
        }
        return RepString.RepString(str1, count);
    }

}
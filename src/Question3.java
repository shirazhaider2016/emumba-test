import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shiraz on 4/4/2020.
 */
public class Question3 {
    public static String stringXML1 = "<a><b property='value'>This is some text</b></a>";
    public static final String stringXML2 = "<a><b property>This is some text</a>";
    public static final String stringXML3 = "<a>>This is some text</a>";

    public static void main(String[] a) {
        List<String> xmlList = Arrays.asList(stringXML1, stringXML2, stringXML3);
        for (String temp : xmlList) {
            try {
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(temp)));
                System.out.println(temp);
                System.out.println(1);
            } catch (Exception e) {
                System.out.println(temp);
                System.out.println(0);
            }
        }
    }
}

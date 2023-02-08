import java.util.Locale;
public class StringLowerExample2{
    public static void main(String[] args) {
        String s = "JAVA HELLO stRIng";
        String eng = s.toLowerCase(Locale.ENGLISH);
        System.out.println(eng);
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(turkish);
    }
}


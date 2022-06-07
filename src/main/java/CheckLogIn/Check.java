package CheckLogIn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static boolean email(String email) {
        Pattern compile = Pattern.compile("^[\\w\\-_.]+@[\\w\\-_]+(\\.[\\w\\-_]+){1,2}$");
        Matcher matcher = compile.matcher(email);
        return matcher.find();
    }

    public static boolean password(String password) {
        return password.length() >= 6 && password.length() <= 12;
    }
}

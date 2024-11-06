import java.util.regex.Pattern;
class Solution {
    private static final Pattern EXPONENT_PATTERN = Pattern.compile(".+[eE]{1}.+");
    private static final Pattern INTEGER_PATTERN = Pattern.compile("^[+-]?[\\d]+$");
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("^[+-]?[\\d]*[.]?[\\d]*");
    private static final Pattern DIGITS_PATTERN = Pattern.compile("[\\d]+");
    public boolean isNumber(String s) {
        if (EXPONENT_PATTERN.matcher(s).matches()) {
            String[] strings = s.split("[eE]");
            if (strings.length>2) {
                return false;
            } else if (strings.length==2) {
                return (isInteger(strings[0]) || isDecimal(strings[0])) && isInteger(strings[1]);
            } else {
                System.out.println("somethins's wrong");
            }
        }
        return isInteger(s) || isDecimal(s);
    }

    private boolean isInteger(String s) {
        System.out.println("integer");
        return INTEGER_PATTERN.matcher(s).matches();
    }

    private boolean isDecimal(String s) {
        System.out.println("decimal");
        if (!DIGITS_PATTERN.matcher(s).find()) {
            System.out.println("dd");
            return false;
        }
        return DECIMAL_PATTERN.matcher(s).matches();
        // String[] strings = s.split(".");
        // if (strings.length>2) {
        //     return false;
        // } else if (strings.length==2) {

        // }
        // return isInteger(strings[0]);
    }
}
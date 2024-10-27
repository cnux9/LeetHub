import java.util.regex.Pattern;
import java.util.stream.Stream;

class Solution {
    private static final Pattern PRICE_PATTERN = Pattern.compile("^\\$[\\d]+$");

    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        for (int i=0;i<words.length;i++) {
            String word = words[i];
            if (isPrice(word)) {
                words[i] = discountString(word, discount);
            }
        }
        return String.join(" ", words);
    }

    private boolean isPrice(String word) {
        return PRICE_PATTERN.matcher(word).matches();
    }

    private String discountString(String word, int discount) {
        double price = Double.parseDouble(word.substring(1));
        double discountedPrice = price*(100-discount)/100;
        System.out.println(price + " " + discountedPrice);
        return "$"+String.format("%.2f", discountedPrice);
    }
}
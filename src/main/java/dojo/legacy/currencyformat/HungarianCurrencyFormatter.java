package dojo.legacy.currencyformat;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class HungarianCurrencyFormatter {

    private static Locale HUN = new Locale("hu", "HU");

    public String format(String number) {
        NumberFormat currencyFormatter =
            NumberFormat.getCurrencyInstance(HUN);

        String currencyFormattedNumber =
            currencyFormatter.format(Double.parseDouble(number));

        String formattedNumberWithProperGroupSeparator =
            replaceLocaleSpecificGroupSeparatorWithSpace(currencyFormattedNumber);

        return removeFtSuffix(formattedNumberWithProperGroupSeparator);
    }

    private String removeFtSuffix(String number) {
        return number.substring(0, number.indexOf(" Ft"));
    }

    private String replaceLocaleSpecificGroupSeparatorWithSpace(String number) {
        char separator = DecimalFormatSymbols.getInstance(HUN).getGroupingSeparator();
        return number.replace(separator, ' ');
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            HungarianCurrencyFormatter formatter = new HungarianCurrencyFormatter();
            System.out.printf("Your number (%s) is written like this in Hungarian: \"%s\"%n",
            args[0], formatter.format(args[0]));
        }
    }
}

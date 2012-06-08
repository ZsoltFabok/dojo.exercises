package dojo.legacy.currencyformat;

public class HungarianCurrencyFormatter {

    public static void main(String[] args) {
        if (args.length == 1)
        if (!args[0].contains(".")) {
            char[] n = args[0].toCharArray();
            final StringBuilder sb = new StringBuilder(String.copyValueOf(n));
            for (int j = 1; j <= (n.length/3); j++)
                if (n.length - 3 * j != 0) {
                  sb.insert(n.length - 3 * j, " ");
            }
            System.out.println("Your number (" + args[0] + ") is written like this in Hungarian: \"" + sb.toString() + "\"");
        } else {
            StringBuffer sb = new StringBuffer();
            final StringBuffer sb_2 = new StringBuffer(args[0].split("\\.")[0]);
            for (int i = 1; i <= (args[0].split("\\.")[0].length() / 3); i++) {
              if (args[0].split("\\.")[0].length() - 3 * i !=0)
               sb_2.insert(args[0].split("\\.")[0].length()-3*(i), " ");
            }
            System.out.println("Your number (" + args[0] + ") is written like this in Hungarian: \"" + sb.append(sb_2.toString()).append(",").append(args[0].split("\\.")[1]).toString() + "\"");
            return;
        }
    }
}

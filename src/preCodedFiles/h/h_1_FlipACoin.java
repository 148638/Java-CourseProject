package preCodedFiles.h;

public class h_1_FlipACoin {
    public static String coinValue;
    public static String headsOrTales;

    public static void main(String[] args) {
        flip();
        System.out.println(headsOrTales);
    }

    public static String flip() {
        int minValue = 0;
        int maxValue = 1;
        float randMath = (float) Math.random();
        int roundMath = Math.toIntExact(Math.round(randMath));
        coinValue = String.valueOf(randMath) + "\n" + String.valueOf(roundMath);

        if (roundMath == 0) {
            headsOrTales = "tails";
        }
        else if (roundMath == 1) {
            headsOrTales = "heads";
        }

        return coinValue + headsOrTales;
    }
}

/*
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
 * Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/
class cards {
    static int c1 = 0;
    static int c2 = 0;

    public static int blackjack(int c1, int c2) {
        if (c1 < 21  && c2 < 21) {

        } else {
            if (c1 > c2 && c1 <= 21 && c2 <= 21) {
                return c1;
            }
            if (c1 < c2 && c1 <= 21 && c1 <= 21) {
                return c2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.print(blackjack(c1, c2));

    }
}
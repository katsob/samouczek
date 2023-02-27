/*Given four ints, a b c d, return true if it is possible to add three of the ints to get the fourth.

threeAsOne(1, 2,  0, 3) → true
threeAsOne(3, 2, -1, 4) → true
threeAsOne(3, 2, 3, 2) → false */

class threeAsOne {
    int a = 3;
    int b = 2;
    int c = 3;
    int d = 2;

}

public class check {
    public static void main(String[] args) {

        threeAsOne three = new threeAsOne();

        int Ans = three.a + three.b + three.c; // sum of 3 first variables

        if (Ans == three.d) {
            System.out.println("true");
            return boolean true;
        } else {
            System.out.println("false");
            return boolean false;
        }

    }
}

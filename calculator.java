/*Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.
Examples(Operator, value1, value2) --> output
('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7 */

public class calculator {

    static char Operator = '/';
    static int value1 = 49;
    static int value2 = 7;

    public static int calc(int value1, int value2) {
      if(Operator = '/' || Operator ='+' || Operator = '-' || Operator = '*' ){
        switch (Operator) {
            case '+':
                return value1 + value2;

            case '-':
                return value1 - value2;

            case '*':
                return value1 * value2;

            case '/':
            if(value2 = 0){
            return "Can't divide by 0";
            }
            else{
            return value1 / value2;
            }
        }  
        }
        else {
            return "Please enter valid operation sign, such as (+, -, /, *).";
        }
        return value1;
    }

    public static void main(String[] args) {
        System.out.println(calc(value1, value2));
    }
}

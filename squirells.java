/*The squirrels in Palo Alto spend most of the day playing. 
In particular, they play if the temperature is between 60 and 90 (inclusive). 
Unless it is summer, then the upper limit is 100 instead of 90. 
Given an int temperature and a boolean isSummer, 
return true if the squirrels play and false otherwise.


squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true*/

class squirrelPlay {

    static int Temperature = 101;
    static boolean isSummer = false;

    public static boolean summer(boolean isSummer) {
        if (Temperature < 60) {
            return isSummer = false;
        }
        if (Temperature > 60 && Temperature <= 90) {
            return isSummer = true;
        }

        if (Temperature > 90 && Temperature <= 100 && isSummer == true) {
            return isSummer = true;
        }
        if (Temperature > 100) {
            return isSummer = false;
        }
        return isSummer;
    }

    public static void main(String[] args) {
        System.out.println(summer(isSummer));
        System.out.println(Temperature);

    }
}

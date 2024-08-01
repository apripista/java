package chapter_01.part_02;

// MATHEMATICS IN JAVA
/*
    In java, The java Math class has more and many methods that allows java programmers like you to perform
    mathematical tasks on numbers the math class has methods to find minimum, maximum and square root of a number
    It also allow you to find the random number, to determine the absolute value of a number. it also allow you to deal
    with Trigonometry numbers

*/

// Minimum mumber
// To find the minimum number you can use a min() Method of the Math class. consider the example below
public class Mathematics {
    public static void main(String[] args){
        System.out.println("Math Class in Java");
        System.out.println("Minimum number using min() Method");
        int age = 34;
        int marks = 56;
        System.out.println("The minimum number is: " + Math.max(age, marks)); // 56:  the min number among the options

        // Maximum number
        // The max() Method is used to find the maximum number among the options. look at this example below
        System.out.println(""); // Blank line for readability on print.
        System.out.println("Maximum number using max() Method");
        float income = 45.98f;
        float balance = 1009.79f;
        System.out.println("The maximum number is: " + Math.max(income, balance)); //1009.79

        // Square root of a Number
        // to find the square root of a given number in java, The sqrt() Method is used.

        int numeral = 64;
        System.out.println(""); // Blank line for readability on print.
        System.out.println("The square root of 64 is: " + Math.sqrt(numeral)); // 8.0
        System.out.println("Square root of 144 is: " + Math.sqrt(144)); //12.0

        // Absolute value of a number
        int x = -6;
        System.out.println(""); // Blank line for readability on print.
        System.out.println("Absolute Values of Numbers");
        System.out.println("The absolute value of -6 is: " + Math.abs(x)); // 6

        // Random numbers in Java
        System.out.println("Random numbers in Java");
        // Math.random returns a random number between initial number (inclusive) and final number (exclusive)
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        System.out.println(Math.random()); // The result will be between 0.0 and 1.0(exclusive
        // What if you want more control of the random numbers for example from 0 to 40
        // Now you can use the following formula
        int random_number = (int)(Math.random() * 41); // 0 40
        System.out.println("Random number between 0 and 40 is: " + random_number); // The number will change everytime

        // Power of a number
        // The power() Method is used to calculate the power of a number and it takes two parameter a base and exponent
        double base = 2;
        double exponent = 3;
        System.out.println(""); // Blank line for readability on print.
        System.out.println("Power of Numbers");
        System.out.println("2 raised to power of 3 is: " + Math.pow(base, exponent)); // 8.0

        // roundig of a number
        // The round() Method is used to approximate/round a floating-point to a nearest integer
        double salary = 56.986;
        System.out.println(""); // Blank line for readability on print.
        System.out.println("Rounding Number is Java");
        System.out.println("Rounded value of " + salary + "is: " + Math.round(salary));

        // Sometimes you have to round numbers to nearest 10 or 100
        // Rounding to nearest ten
        double number = 456.987;
        System.out.println("");
        System.out.println("Rounding to Nearest ten");
        double rounded_to_ten = Math.round(number/10) * 10;
        System.out.println("Rounded to nearest ten: " + rounded_to_ten);

        // Rounding to near decimal Place
        // Rounding a number to near two decimal place
        double rounded_number = Math.round(number * 100.0 ) / 100.0;
        System.out.println("Rounded to two decimal place: " + rounded_number);
    /*
    We first multiply the number by 100 to shift the decimal point two places to the right, making the decimal part a
    whole number. We then use Math.round() to round the result to the nearest whole number.
    Finally, we divide the rounded result by 100.0 to shift the decimal point back two places to the left, resulting in
    the desired rounded number with two decimal places.
    */
        // Rounding to nearest hundred
        double rounded_to_hundred = Math.round(number / 100) * 100;
        System.out.println("Rounded to nearest hundred: " + rounded_to_hundred);

        double integer = 123.456789;

        // Round to four decimal places
        double roundedToFourDecimalPlaces = Math.round(integer * 10000.0) / 10000.0;
        System.out.println("Rounded to four decimal places: " + roundedToFourDecimalPlaces); // Output: 123.4568

        // Round to three decimal places
        double roundedToThreeDecimalPlaces = Math.round(integer * 1000.0) / 1000.0;
        System.out.println("Rounded to three decimal places: " + roundedToThreeDecimalPlaces); // Output: 123.457

        /*
         To round 123.456789 to four decimal places, we multiply it by 10000, round the result, and then divide by 10000.
         To round it to three decimal places, we multiply it by 1000, round the result, and then divide by 1000.
        */
        // Trigonometric functions
        double angle = Math.PI / 3; // Angle in radians (60 degrees)
        System.out.println(""); // Blank line for readability on print.
        System.out.println("Sine of 60 degrees is: " + Math.sin(angle)); // 0.866 (approximately)
        System.out.println("Cosine of 60 degrees is: " + Math.cos(angle)); // 0.5 (approximately)
        System.out.println("Tangent of 60 degrees is: " + Math.tan(angle)); // 1.732 (approximately)

        // Ceiling and floor
        double value = 7.25;
        System.out.println(""); // Blank line for readability on print.
        System.out.println("Ceiling of 7.25 is: " + Math.ceil(value)); // 8.0
        System.out.println("Floor of 7.25 is: " + Math.floor(value)); // 7.0
    }
}
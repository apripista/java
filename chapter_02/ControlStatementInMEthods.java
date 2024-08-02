// METHODS AND CONTROL STATEMENTS IN JAVA.

public class ControlStatementInMEthods {
    // Method to check access based on age
    static void Checker(int age) {
        // Print the age being checked
        System.out.println("My age is: " + age);

        // Check if the age is less than 18
        if (age < 18) {
            // If age is less than 18, print "access denied"
            System.out.println("access denied");
        } else {
            // If age is 18 or older, print "access granted"
            System.out.println("access granted");
        }
    }

    // Main method to demonstrate the usage of the Checker method
    public static void main(String[] args){
        // Calling the Checker method with an age of 4
        Checker(4);
    }
}

/*
    The Checker method takes an integer parameter age.
    It prints the age being checked and then checks if the age is less than 18.

    If the age is less than 18, it prints "access denied". Otherwise, it prints "access granted".

    The main method is provided to demonstrate the usage of the Checker method.
    In this example, it calls the Checker method with an age of 4.

    When you run this program, it will print "My age is: 4" and "access denied" because the age is less than 18.

Overall, this code demonstrates a simple access checking mechanism based on age.
If the age provided is less than 18, access is denied; otherwise, access is granted.
 */
// SPECIAL CHARACTER IN JAVA

/*
    Because strings must or can be written within quotes, Java may misunderstand certain characters, leading to errors
    To include special characters within strings, Java provides escape characters, which are preceded by a backslash (\):

    Escape character   Result      Description
    \'                 '           Single quote
    \"                 "           Double quote
    \\                 \           Backslash
    \n                 Newline     Inserts a newline
    \t                 Tab         Inserts a tab
    \r                 Carriage    Inserts a carriage return

    The sequence \" inserts a double quote in a string:
*/
public class SpecialCharacter {
    public static void main(String[] args){
        String text = "We are the so-called \"Vikings\" from the north.";
        System.out.println(text);

        // The sequence \' inserts a single quote in a string:
        String question = "It\'s okay";
        System.out.println(question);

        // The sequence \\ inserts a single backslash in a string:
        String backslash = "The character \\ is called backslash.";
        System.out.println(backslash);

        // Newline and Tab examples:
        String multiLine = "Line 1\nLine 2\nLine 3";
        System.out.println("Multi-line text:\n" + multiLine);

        String tabbedText = "Name:\tJohn\nAge:\t25";
        System.out.println("Tabbed text:\n" + tabbedText);

        // Table for visual representation of special characters:
        System.out.println("\nSpecial Character Table:");
        System.out.println("+------------------+-------------------------+");
        System.out.println("| Escape character | Result                  |");
        System.out.println("+------------------+-------------------------+");
        System.out.println("|      \\'          |      '                  |");
        System.out.println("|      \\\"          |      \"                |");
        System.out.println("|      \\\\          |      \\                |");
        System.out.println("|      \\n          |      Newline            |");
        System.out.println("|      \\t          |      Tab                |");
        System.out.println("|      \\r          |      Carriage           |");
        System.out.println("+------------------+--------------------------+");
    }
}

import javax.script.ScriptEngine;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Enter a word");

        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        int digitCount=0;
        int letterCount=0;
        for (int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isAlphabetic(c))
                letterCount++;
            if(Character.isDigit(c))
                digitCount++;
        }
        System.out.println("has a"+letterCount+" letters "+digitCount+" digits");
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text");
        String text=input.nextLine();
        if(isPalindrome(text))
            System.out.println(" is palindrome");
        else
            System.out.println("  is not palindrome");
    }
    private static boolean isPalindrome(String text)
    {
        String filteredText=filterText(text);
        String reversedText=reverseString(filteredText);
        return filteredText.equalsIgnoreCase(reversedText);

    }
    private  static String reverseString(String text)
    {
        StringBuilder reversedText=new StringBuilder(text);
        reversedText.reverse();
        return reversedText.toString();
    }
    private  static String filterText(String text)
    {
        StringBuilder filteredText=new StringBuilder();
        for (int i=0;i<text.length();i++)
            if(Character.isLetterOrDigit(text.charAt(i)));
        return filteredText.toString();
    }
}
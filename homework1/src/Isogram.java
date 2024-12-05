public class Isogram {
        //Numara:1030510309
        //İsim:Ahmet Faruk Erdem
        //eruvisual@gmail.com
    /*
    An isogram is a word that contains no repeating letters.
    For example, the word “visual” is an isogram
    because each letter in the word appears exactly once,
    but the word “programming” is not because ‘r’, ‘g’ and ‘m’ appear twice.
    Your job is to write a method to check whether a string is an isogram or not.
    */
        public static void main(String[] args) {
            String word1="Visual";
            System.out.println(isIsogram(word1));
            String word2="Programming";
            System.out.println(isIsogram(word2));
            String word3="JavA";
            System.out.println(isIsogram(word3));
            String word4="uncopyrightable";
            System.out.println(isIsogram(word4));   //true
        }

        private static boolean isIsogram(String word) {
            word = word.toLowerCase();
            int len = word.length();
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] == arr[i + 1])
                    return false;
            }
            return true;

        }
}

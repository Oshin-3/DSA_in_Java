public class Pangram {

    public static boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z')
            {
                index = sentence.charAt(i) - 'a';
            }

            alphabet[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if(alphabet[i] == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean output = checkIfPangram("thequickbrownpsoverthelazydog");
        System.out.println("Output: " + output);
    }
}

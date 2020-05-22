public class Solution {
    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number
        RKA(txt, pat, q);
    }

    public static void RKA(String text, String pattern, int prime){
        int decimal= 26;
        int patLen = pattern.length();
        int textLen = text.length();
        int patHash =0;
        int textHash = 0;
        int firstCharRemovePower = 1;

        for(int i=0; i<patLen-1; i++) {
            firstCharRemovePower = (firstCharRemovePower * decimal) % prime;
        }

        for(int i=0; i<patLen; i++){
            patHash = (decimal* patHash + pattern.charAt(i)) % prime;
            textHash = (decimal * textHash + text.charAt(i)) % prime;
        }

        //pointer for window sliding
        int start=0;
        int end = patLen;
        while (start <= textLen-patLen){

            // check if hash value matches
            if(textHash == patHash){
                int matchpointer =0;

                //match string chars one by one
                while( matchpointer < patLen){
                    if(text.charAt(start+matchpointer) != pattern.charAt(matchpointer))
                        break;
                    matchpointer++;
                }

                //if match found then print
                if(matchpointer == patLen){
                    System.out.println("String match found at start index:"+ start);
                }
            }

            if ( start < textLen-patLen) {
                // if hash doesnt match then slide window and update hash accordingly
                //remove first char in window
                textHash = textHash - text.charAt(start) * firstCharRemovePower;
                //shift result by decimal position and add next char
                textHash = (textHash * decimal + text.charAt(end++)) % prime;

                // We might get negative value of t, converting it
                // to positive
                if (textHash < 0)
                    textHash = (textHash + prime);
            }
            start++;
        }
    }
}

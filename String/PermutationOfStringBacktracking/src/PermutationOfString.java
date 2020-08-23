import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String s ="abc";
        List<String> res = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
 //       StringBuilder sb = new StringBuilder();
        permutation(s, res, temp);

        for(String a: res){
            System.out.println(a);
        }
    }

    private static void permutation(String s, List<String> res, List<Character> temp) {
        if(temp.size() == s.length()){
            // create object of StringBuilder class
            StringBuilder sb = new StringBuilder();

            // Appends characters one by one
            for (Character ch : temp) {
                sb.append(ch);
            }
            res.add(sb.toString());
            return;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(temp.contains(c))
                continue;

            temp.add(c);
            permutation(s, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}

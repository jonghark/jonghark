package examples.programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution_12903 {

    public static String solution(String s){
        String answer = "";
        if(s.length()%2==0){
            return answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
            return answer = Character.toString(s.charAt(s.length()/2));
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "qwer";
        List<String> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);

        for(String data : arr){
            solution(data);
        }
    }

}

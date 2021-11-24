package examples.programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution_12916 {
    public static void main(String[] args) {
        String s1 = "pPoooyY";
        String s2 = "Pyy";
        List<String> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        solution(s1);
    }

    public static boolean solution(String s){
        boolean answer = true;
        s = s.toLowerCase();

        String arrS[] = s.split("(?!^)");
        int pCnt = 0;
        int yCnt = 0;
        for(String data : arrS){
            if(data.equals("y")){
                yCnt++;
            }
            if(data.equals("p")){
                pCnt++;
            }
        }
        if(yCnt == pCnt){
            answer = true;
        }else{
            answer =false;
        }
        return answer;
    }
}


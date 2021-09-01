package examples;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> pHash = new HashMap<>();
        String answer = "";
/*
1,2 통과 3 불통
        int i =0;
        for(String str:completion){
            pHash.put(str,pHash.containsKey(str)==true?pHash.get(str)+1:0);
            System.out.println("i = " + i + ", str = " + str  + " , containsKey:"+pHash.containsKey(str) + " , value = "+ pHash.get(str));
            i++;
        }

        i = 0;
        for(String str:participant){
            System.out.println("i = " + i + ", str = " + str  + " , containsKey:"+pHash.containsKey(str) + " , value = "+ pHash.get(str));
            if(pHash.containsKey(str) == false){
                return str;
            }
            if(pHash.get(str) > 0){
                return str;
            }
            i++;
        }

 */
        int i=0;
        for(String str:participant){
            System.out.println(str);

            i++;
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] participant1 = new String[]{"leo", "kiki", "eden"};
        String[] completion1 = new String[] {"eden", "kiki"};

        String[] participant2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};

        String[] participant3 = new String[]{"mislav","stanko","mislav","ana"};
        String[] completion3 = new String[]{"stanko", "ana", "mislav"};

        ArrayList<String[]> arr = new ArrayList<>();
        ArrayList<String[]> arr2 = new ArrayList<>();
        arr.add(participant1);
        arr.add(participant2);
        arr.add(participant3);
        arr2.add(completion1);
        arr2.add(completion2);
        arr2.add(completion3);
        for (int i=0; i< arr.size(); i++){
            System.out.println("answer = "+ i + " ====== "+ solution(arr.get(i),arr2.get(i)));
        }


        for(int i=1; i< 4; i++){
//            System.out.println("answer = "+ solution(participant1,completion1));
        }

    }
}

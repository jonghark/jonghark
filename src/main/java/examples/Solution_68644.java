package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_68644 {
    public static int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList();

        for(int i=0; i< numbers.length; i++){
            for(int b=0; b<numbers.length; b++){
                if(i!=b) {
                    if(!arr.contains((numbers[i] + numbers[b]))){
                        arr.add((numbers[i] + numbers[b]));
                    }
                }
            }
        }
        Collections.sort(arr);
        int[] answer = new int[arr.size()];
        for(int a=0; a< arr.size(); a++){
            answer[a] =arr.get(a);
        }
        return answer;
    }

    public static void main(String[] args) {
        int numbers1[] = {2,1,3,4,1};
        int numbers2[] = {5,0,2,7};
        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(numbers1);
        arr.add(numbers2);
        for (int i=0; i< arr.size(); i++){
            System.out.println("answer = "+ i + " ====== "+ solution(arr.get(i)));
        }
    }
}

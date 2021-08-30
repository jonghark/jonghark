package example;

import java.util.ArrayList;
import java.util.List;

public class Solution_42840_x {
    public static int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = {};
        int[] totalanswer = new int[3];
        for(int i=0; i<answers.length; i++){
//            if(student1[i%5] == answers[i%5]) {
//                System.out.println(i%5 + " : " + i%5);
//            }

            System.out.println(student2[i%8] + " : " + answers[i%8]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answers_1 = {1,2,3,4,5};
        int[] answers_2 = {1,3,2,4,2};

        List<int[]> arr = new ArrayList<>();
        arr.add(answers_1);
        arr.add(answers_2);

        solution(answers_1);

        //System.out.println(7%5);
    }
}


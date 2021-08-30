package example;/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다.
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */
import java.util.ArrayList;

public class Solution_42576 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i=0; i< participant.length; i++){
            answer += participant[i];
        }
        for(int a=0; a< completion.length; a++){
            answer = answer.replaceFirst(completion[a],"");
        }
        return answer;
    }

    public static void main(String[] args) {
        String participant1[] = {"leo", "kiki", "eden"};
        String completion1[] = {"eden", "kiki"};

        String participant2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String completion2[] = {"josipa", "filipa", "marina", "nikola"};

        String participant3[] = {"mislav", "stanko", "mislav", "ana"};
        String completion3[] = {"stanko", "ana", "mislav"};

        ArrayList<String[]> arrParticipant = new ArrayList<>();
        arrParticipant.add(participant1);
        arrParticipant.add(participant2);
        arrParticipant.add(participant3);

        ArrayList<String[]> arrCompletion = new ArrayList<>();
        arrCompletion.add(completion1);
        arrCompletion.add(completion2);
        arrCompletion.add(completion3);

        int i=0;
        for(String[] data : arrCompletion){
            System.out.println(solution(arrParticipant.get(i),arrCompletion.get(i)));
            i++;
        }

//        solution(participant1, completion1);


    }

}

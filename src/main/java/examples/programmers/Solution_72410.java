package examples.programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution_72410 {
    public static String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase(); //new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String arrAnswer[] = answer.split("(?!^)");
        answer = "";
        for (String data: arrAnswer){
            if(data.matches("[0-9|a-z|\\-|_|.]*")){
                answer = answer + data;
            }
            //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
            answer = answer.replace("..",".");
        }

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(answer.length() > 0) {
            if (answer.substring(answer.length() - 1, answer.length()).equals(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        if(answer.length() > 0){
            //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
            if (answer.substring(0, 1).equals(".")) {
                answer = answer.substring(1, answer.length());
            }
        }

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.length() == 0){
            /*
            for (String data: arrAnswer){
                answer = answer+"a";
            }
            */
            answer = "a";
        }
        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(answer.length() > 15){
            answer = answer.substring(0,15);
        }
        if(answer.length() > 0){
            if(answer.substring(answer.length()-1,answer.length()).equals(".")){
                answer = answer.substring(0,answer.length()-1);
            }
        }



        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(answer.length()< 3 && answer.length() >0){
            String arrAnswer2[] = answer.split("(?!^)");
            //answer = "";

            String lastStr = answer.substring(answer.length()-1);

            for(int i=0; i<3; i++){

                answer += lastStr;
                if(answer.length() >= 3) break;
                /*
                if(i<2 ){
                    answer = answer + arrAnswer2[i];
                }else{
                    answer = answer + arrAnswer2[arrAnswer2.length-1];
                }
                */
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String new_id_1 = "...!@BaT#*..y.abcdefghijklm";
        String new_id_2 = "z-+.^.";
        String new_id_3 = "=.=";
        String new_id_4 = "123_.def";
        String new_id_5 = "abcdefghijklmn.p";

        List<String> arrNewId = new ArrayList<>();
        arrNewId.add(new_id_1);
        arrNewId.add(new_id_2);
        arrNewId.add(new_id_3);
        arrNewId.add(new_id_4);
        arrNewId.add(new_id_5);

        String new_id_24 = "abcdefghijklnmoptqrsvwxyz";
        for(String data:arrNewId){
//            System.out.println(solution(data));
            solution(data);
        }
//        System.out.println(solution(new_id_24));
//
    }
}

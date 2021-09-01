package examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
 */
public class Solution_12933 {
    public static long solution(long n){
        List<String> list = new LinkedList<>();
        String[] arrN = Long.toString(n).split("(?!^)");
        for(int i=0; i<arrN.length; i++){
            list.add(arrN[i]);
        }
        Arrays.sort(arrN, Comparator.reverseOrder());
        String rtn = "";
        for(String data: arrN){
            rtn += data;
        }
        return Long.parseLong(rtn);
    }

    public static void main(String[] args) {
        long n = 118372;
        solution(n);
    }
}

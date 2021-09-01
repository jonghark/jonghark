package examples;

import java.util.Arrays;

/*자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.*/
public class SolutionLevel1_1 {
    public static int[] solution(long n){
        int[] answer = new int[String.valueOf(n).length()]; // 넘어온 값이 int,long등 숫자라서 문자로 변환해서 자릿수를 구해서 answer라는 int배열의 값을 설정한다
        int tmp =0;
        for(int i=0; i< answer.length; i++){
            tmp = (int)(n%10); // 나머지를 구한다 12345/10의 나머지는 5 그래서 마지막은 5
            n = n/10; //나머지를 뺸 자연수만 그래서 1234
            answer[i] = tmp;
        }

        System.out.println(Arrays.toString(answer)); //배열값 string으로 출력
        return answer;
    }

    public static void main(String[] args) {
        long arg1 = 12345;
        solution(arg1);

    }
}

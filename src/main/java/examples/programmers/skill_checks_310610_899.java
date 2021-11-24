package examples.programmers;
/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class skill_checks_310610_899 {
    public static void main(String[] args) {
        int arr[] = {2, 36, 1, 3};
        int divisor = 1;
        Arrays.sort(arr);
        List list = new ArrayList();
        for(int i=0; i< arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        int answer[] = new int[list.size()];
        for(int a=0; a< list.size(); a++){

            answer[a] = (Integer)list.get(a);
        }
    }
}

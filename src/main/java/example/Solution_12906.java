package example;

import java.util.ArrayList;
import java.util.List;

/*
문제 설명
배열 arr가 주어집니다.
배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 */
public class Solution_12906 {

    public static void main(String[] args) {
        int arr1[] = {1,1,3,3,0,1,1};
        int arr2[] = {4,4,4,3,3};
        int arr3[] = {1,0,0,0};

        List<int[]> arr = new ArrayList<>();
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        solution(arr3);
    }
    public static int[] solution(int []arr){
        List<Integer> rtn = new ArrayList<>();
        int tmp = arr[0];
        rtn.add(tmp);
        for(int i=1; i< arr.length; i++){
            if(tmp != arr[i]){
                rtn.add(arr[i]);
            }
            tmp = arr[i];
        }
        int[] answer = new int[rtn.size()];
        for(int a=0; a< rtn.size(); a++){
            answer[a] = rtn.get(a);
        }
        return answer;
    }

}

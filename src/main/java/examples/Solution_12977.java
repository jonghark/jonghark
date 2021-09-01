package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_12977 {

    public static int solution(int[] nums) {
        int numSum = 0;
        String numSumStr = "";
        int[] tmpArrNums = new int[3];
        List<Integer> arrNums = new ArrayList<>();
        List<String> arrNumsStr = new ArrayList<>();
        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums.length; b++) {
                for (int c = 0; c < nums.length; c++) {
                    if ((a != b) && (a != c) & (b != c)) {
                        tmpArrNums[0] = nums[a];
                        tmpArrNums[1] = nums[b];
                        tmpArrNums[2] = nums[c];
                        Arrays.sort(tmpArrNums);
                        numSum = nums[a] + nums[b] + nums[c];
                        numSumStr = tmpArrNums[0] +""+tmpArrNums[1]+""+ tmpArrNums[2];
                        if(isPrime(numSum)){
                            if (!arrNumsStr.contains(numSumStr)) {
                                arrNumsStr.add(numSumStr);
                                arrNums.add(numSum);
                            }
                        }
                    }
                }
            }
        }
//        System.out.println(arrNums.toString());
//        System.out.println(arrNums.size());
        return arrNums.size();
    }
    //소수 구하기
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 4};
        int nums2[] = {1, 2, 7, 6, 4};
        int nums3[] = {1,2,4,15,13};

        List<int[]> arr = new ArrayList<>();
        arr.add(nums1);
        arr.add(nums2);
        arr.add(nums3);;
        for (int[] data : arr) {
            System.out.println(solution(data));
//            solution(data);
        }

//        solution(nums3);

    }
}

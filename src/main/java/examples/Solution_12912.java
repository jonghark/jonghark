package examples;

public class Solution_12912 {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int max=a;
        int min=b;
        if(max == min){
            System.out.println(max);
        }
        if(a < b){
            max = b;
            min = a;
        }
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println(Long.valueOf(sum));
    }
}

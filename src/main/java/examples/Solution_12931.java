package examples;

public class Solution_12931 {
    public static void main(String[] args) {
        int n = 123;
        String[] arrN = Integer.toString(n).split("(?!^)");
        int sum = 0;
        for(int i=0; i< arrN.length; i++){
            sum += Integer.parseInt(arrN[i]);
        }
        System.out.println(sum);

    }
}

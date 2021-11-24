package examples.programmers;

import java.util.ArrayList;

public class Solution2 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
//        for(int a=0; a< phone_book.length; a++) {
//            for (int i = 0; i < phone_book.length; i++) {
//                if(phone_book[i].indexOf(phone_book[a]) !=-1 && i!=a){
//                    answer = false;
//                }
//            }
//        }
//        ArrayList<String> arr = new ArrayList<>(Arrays.asList(phone_book));
//.
//        Collections.sort(arr);
//        for (int i = 0; i < phone_book.length; i++) {
//            if(phone_book[i].indexOf(phone_book[0]) !=-1 && i>0){
//                System.out.println("::::"+ phone_book[0] + " ::::" + phone_book[i]);
//                answer = false;
//            }
//        }




        return answer;
    }


    public static void main(String[] args) {
        String[] phone_book1 = new String[]{"119", "97674223", "1195524421"};
        String[] phone_book2 = new String[]{"123","456","789"};
        String[] phone_book3 = new String[]{"12","123","1235","567","88"};
        ArrayList<String[]> arr = new ArrayList<>();
        arr.add(phone_book1);
        arr.add(phone_book2);
        arr.add(phone_book3);


//        for(int i=0; i < arr.size(); i++){
//            System.out.println("phone_book === "+ solution(arr.get(i)));
//        }

//        System.out.println("========="+ solution(phone_book1));
//        solution(phone_book2);
        String answer = "";
        String s = "try hello world";
        String[] sArr = s.split("");
        System.out.println(sArr);
        for(int i=0; i< sArr.length; i++){
            if(i%2 != 0){
                answer = answer.concat(sArr[i].toLowerCase());
            }else{
                answer = answer.concat(sArr[i].toUpperCase());
            }

        }

//        int a = 3;
//        int b = 5;
//
//        long answer = 0;
//        if(a > b){
//            answer = b;
//            for(int i = b; i< a; i++){
//                answer =+ i+1;
//            }
//        }else{
//            answer = a;
//            for(int i = a; i< b; i++){
//                answer += i+1;
//            }
//        }

//        for(int i=1; i< 10; i++){
//            for(int a=1; a< 10; a++){
//                System.out.println(i+"단"+i+"x"+a +"="+i*a);
//            }
//        }

//        int a=0;
//        for(int i=1; i<101; i++){
//            if(i%3==0){
//                a= a+i;
//            }
//        }
//        System.out.println(a);
//        int[] answer = {};
//        long testNumber = 12345;
//
//        ArrayList<String> sort = new ArrayList<>();
//        for(int i=0; i< Long.toString(testNumber).length();i++){
//            sort.add(Long.toString(testNumber).split("")[i]);
//        }
//        Collections.reverse(sort);
//
//        System.out.println(sort);


    }
}

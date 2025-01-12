package examples.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example_stream {
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println("===>" + num);
        }

        String[] str = new String[]{"a", "b", "c"};
        Arrays.stream(str).collect(Collectors.joining());
        //a,b,c
        int[] num_list = new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        Arrays.stream(num_list).reduce(1, (x, y) -> x * y); //전체 곱하기
        Arrays.stream(num_list).sum();//전체 더하기
        //start end 순차적으로 추가
        int start = 1;
        int end = 2;
        IntStream.rangeClosed(start, end).toArray();
        IntStream.range(end, start + 1).map(i -> end + (start - i))
                .forEach(System.out::println);

        IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
        Arrays.toString(Arrays.stream(num_list).sorted().skip(5).toArray());//skip 5
        int n = 15;
        int k = 5; //n/k만큼
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray()));
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();

        int b = 3;
        int[] bb = {1, 2, 3, 4, 5};
        int a = IntStream.of(bb).filter(s -> s == b).findAny().isPresent() ? 1 : 0;
        int aa = IntStream.of(bb).anyMatch(s -> s == b) ? 1 : 0;
        System.out.println(a);
        int number = 60;
        int answer = 0;
        System.out.println(number%3);
        if (number % 2 == 0 && number % 3 == 0) {
            answer = 1;
        } else if (number % 5 == 0 && number % 10 != 0) {
            answer = 0;
        }
        System.out.println(number % 10);
        System.out.println("answer = "+answer);
        String sAsnwer = "";
        a = 10;
        if(a % 2 == 0){
            sAsnwer = a+" is even" ;
                }else{
            sAsnwer = a+" is odd";
                }
        System.out.println(sAsnwer);

        String[] ttt = {"abc", "def", "ghi"};
        String iii = "ef";
        String aaaa="";
        String aaa = Arrays.stream(ttt).filter(s->s.indexOf(iii) < 0).collect(Collectors.joining());
        System.out.println(aaa);
        String a1 = "abc";
        String a2 = "abcd";
        System.out.println(a1.contains(a2)?1:0);

        int[] a3 = {293, 1000, 395, 678, 94};
        int[] a4 = {94, 777, 104, 1000, 1, 12};

        Arrays.stream(a3).filter(v-> Arrays.stream(a4).noneMatch(v4->v4 == v)).toArray();


String num = "1000000";

        //System.out.println(IntStream.range(0,num.toCharArray().length+1).sum());
        num.chars().map(Character::getNumericValue).sum();
        double ddd = 1.42;
        System.out.println(">>>>");

    }
}

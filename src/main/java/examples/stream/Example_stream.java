package examples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example_stream {
    public static void main(String[] arg){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            System.out.println("===>" + num);
        }

        String[] str = new String[]{"a","b","c"};
        Arrays.stream(str).collect(Collectors.joining());
        //a,b,c
        int[] num_list = new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        Arrays.stream(num_list).reduce(1,(x,y) ->x*y); //전체 곱하기 
        Arrays.stream(num_list).sum();//전체 더하기
        //start end 순차적으로 추가
        int start = 1;
        int end = 2;
        IntStream.rangeClosed(start, end).toArray();
        IntStream.range(end,start+1).map(i->end + (start-i))
                .forEach(System.out::println);

        IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
        Arrays.toString(Arrays.stream(num_list).sorted().skip(5).toArray());//skip 5
        int n = 15;
        int k = 5; //n/k만큼
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray()));
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
        //test
    }
}

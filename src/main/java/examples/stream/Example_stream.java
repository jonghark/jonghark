package examples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

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
    }
}

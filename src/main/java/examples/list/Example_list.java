package examples.list;

import java.util.*;

public class Example_list {
    public static void main(String[] args){
        String[] arrStr = {"1","2","4","5","3"};
        for(String data : arrStr){
            System.out.println("data = " + data);
        }
        List<String> list = new ArrayList<>(Arrays.asList(arrStr));

        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("sort list = " + list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("reverseSort = " + list);
        System.out.println(list.remove("3"));
    }

    public void test(){

    }

    public void test2(){

    }

    public void test3(){

    }
}

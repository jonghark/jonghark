package examples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example_stream {
    public static void main(String[] arg){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            System.out.println("===>" + num);
        }
    }
}

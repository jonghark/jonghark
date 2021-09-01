package examples;

import java.util.ArrayList;

public class testClass {
    public static void main(String[] args) {
        String input = "Zbcdefg";
        //gfedcbZ
        String alphabet[] = {"z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a","Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};
        String orderBy[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52"};
        String arrInput[] = input.split("");
        ArrayList list = new ArrayList<>();
        for (int i = 1; i < arrInput.length; i++) {
            for (int a = 0; a < alphabet.length; a++) {
                if (arrInput[i].equals(alphabet[a])) {
                    list.add(orderBy[a]);
                    System.out.println();
                }
            }
        }
//        list.sort(null);
        System.out.println(list);
        String rtn = "";
        for (int a = 0; a < list.size(); a++) {
            //rtn += alphabet[Integer.parseInt((String) list.get(a))];
            System.out.println(list.get(a));
        }
        System.out.println(rtn);
    }
}

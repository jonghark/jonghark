package examples.string;

public class Example_stringbuffer {

    public static void main(String[] arg){
        String s = new String("s");
        StringBuffer sbuffer = new StringBuffer("SB");
        sbuffer.append(" add");
        sbuffer.insert(0, "kkkk");
        System.out.println("sbuffer =" + sbuffer);

        //멀티스레드에서만 사용한다는데....
        StringBuilder sbuilder = new StringBuilder("SS");
        sbuilder.append(" add");
        sbuilder.insert(0, "kkkk");
        System.out.println("sbuilder =" + sbuilder);
    }
}

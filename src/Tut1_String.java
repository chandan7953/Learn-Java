import java.util.*;
public class Tut1_String {
    public static void main(String[] args) {
        String s = "Chandan";
        StringBuilder ans = reverseString(s);
        System.out.println("reverse String -> "+ ans);
        System.out.println();


        StringBuilder str = new StringBuilder("i learn");
//        insert at end character or string
        str.append(' ');
        str.append("C++");
        System.out.println("append the char or string at end->" + str);
        System.out.println();

//        insert at index char or string
        int index = 7;
        str.insert(index, " java");
        System.out.println("insert at index -> " + str);
        System.out.println();

//        displaying  Character at index
        System.out.println("showing char at index 2 -> " + str.charAt(2));
        System.out.println();

//        updating character
        str.setCharAt(0, 'I');
        System.out.println("updating i to I ->" + str);
        System.out.println();

//        length
        System.out.println("Str length -> " + str.length());

//        Delete character
        str.deleteCharAt(13);
        System.out.println("after delete c is deleted -> " + str);

//        delete string
        System.out.println("Str length -> " + str.length());
        str.delete(12, 15);
        System.out.println(str);



//        ***************************Important function *****************************************
        String strTemp = "Chandan7953@gmail.com";

        //split
        String arr[] = strTemp.split("@");
        System.out.println(Arrays.toString(arr));

        //replace
        String temp = "HelloHelloHello";
        System.out.println(temp.replace("ll", "chandan"));

        //substring
        System.out.println(temp.substring(1));
        System.out.println(temp.substring(1, 9));

        //trim
        String t = "    Chandan       ";
        System.out.println(t);
        System.out.println(t.trim());

        




    }

    private static StringBuilder reverseString(String str) {
        StringBuilder ans = new StringBuilder(str);
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            char temp = ans.charAt(i);
            ans.setCharAt(i++, str.charAt(j));
            ans.setCharAt(j--, temp);
        }

        return ans;
    }
}

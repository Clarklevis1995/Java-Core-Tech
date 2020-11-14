package 基本程序设计结构;

public class StringTest {
    public static void main(String[] args) {
        String all = String.join(",", "S","T","R");
        //System.out.println(all);
        String greetings = "Hello";
        //求字符串的码点数量
        int cpCount = greetings.codePointCount(0,greetings.length());
        System.out.println(cpCount);

        int index = greetings.offsetByCodePoints(0,3);
        System.out.println(index);
        System.out.println(greetings.codePointAt(index));
        System.out.println((int)'l');

        char[] chars = Character.toChars(0x1d546);
        String s = new String(chars);
        System.out.println(s);

        String s1 = "Hello";
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("e"));


        //利用各种方式进行匹配，输出的总是子串在整个字符串中的位置索引
        String s2 = "abcdefghigklmn";
        int index1 = s2.indexOf("lmn");
        System.out.println(index1);
        int index2 = s2.indexOf("lmn",4);
        System.out.println(index2);
        int index3 = s2.lastIndexOf("lmn");
        System.out.println(index3);

        String s3 = "aaa bbb sss ddd";
        String result = s3.replace(" ","");
        System.out.println(result);//aaabbbsssddd

        String s4 = "ABC";
        System.out.println(s4.equalsIgnoreCase("abc"));
    }
}

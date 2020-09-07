package String;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //字节转换为字符串
        byte[] bytes={97,98,99,100};
        String str=new String(bytes);
        System.out.println(str);

        String str2="abcd";
        byte[] bytes1=str2.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }



    public static boolean isNumber(String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main5(String[] args) {
        String str="hello";
        System.out.println(isNumber(str));
    }
    public static void main4(String[] args) {
        char[] value={'a','b','c','d'};
        String str=new String(value);
        System.out.println("字符串："+str);
        //offset和count一定不要越界
        String str2=new String(value,1,2);
        System.out.println(str2);
        //字符串-》字符
        String str3="hello";
        char ch=str3.charAt(0);
        System.out.println(ch);

        char[] chars=str3.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
    public static void main3(String[] args) {
        //intern方法
        String str1="hello";
        String str2=new String("hello").intern();
        System.out.println(str1==str2);
    }
    public static void main2(String[] args) {
        String str1="abcdef";
        String str2="abcerf";
        System.out.println(str1.compareTo(str2));
    }
    public static void main1(String[] args) {
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);
        String str3=new String("hello");
        System.out.println(str1==str3);
        String str4="he"+"llo";
        System.out.println(str1==str4);
        String str5="he"+new String("llo");
        System.out.println(str1==str5);

    }
}

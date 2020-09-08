package String;

import java.util.Arrays;
import java.util.Scanner;
//StringBuffer和StringBuilder的区别
//1.StringBuffer是用于多线程的，StringBuilder是用于单线程的
//2.string和StringBuilder都是用于单线程
//（String通过加号进行拼接的时候，底层被优化成了StringBuilder）
//3.String和stringBuffer最大的区别在于：String的内容无法修改而StringBuffer的内容可以修改
//如果频繁修改内容的话考虑使用StringBuffer
public class Test {
    public static void main(String[] args) {
        String str="abcd";
        StringBuffer stringBuffer=new StringBuffer("abcd");
        StringBuilder stringBuilder=new StringBuilder("abcd");
        System.out.println(stringBuffer.append("fc"));
    }


    public static String reverse(String str,int begin,int end){
      char[] chars=str.toCharArray();
        while (begin<end){
            char temp=chars[begin];
            chars[begin]=chars[end];
            chars[end]=temp;
            begin++;
            end--;
        }

        return new String(chars);
    }
// 输入3  abcdef 输出defabc
    public static void main14(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个整数");
        int size=scanner.nextInt();
        System.out.println("输入一个字符串");
        String str=scanner.next();
        if (str==null||size<=0||size>=str.length()){
            return ;
        }
        String ret=reverse(str,0,size-1);
        ret=reverse(ret,size,str.length()-1);
        ret=reverse(ret,0,str.length()-1);
        System.out.println(ret);
    }
    public static void main13(String[] args) {
        String str="abcdef";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
    public static void main12(String[] args) {
        String str="   abcd dfsad   ";
        //去掉字符串左右的空格
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        String str2="AOIASD";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.concat("fc"));
        System.out.println(str2.substring(0, 3));
    }
    public static String ping(String str){
        String ret="";
        String [] strings=str.split(" ");
        for (String ss:strings) {
            ret+=ss;
        }
        return ret;
    }
    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=scanner.nextLine();

        System.out.println(ping(ping(str1)));

    }
    public static void main10(String[] args) {
        String str="192-168-0-1";
        String[] strings=str.split("-");
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        String str2="hello world";
        String[] strings1=str2.split(" ",2);
        for (String s:strings1) {
            System.out.println(s);
        }
    }
    public static void main9(String[] args) {
        String str="abcdefab";
        System.out.println(str.replaceAll("ab", "gg"));
        System.out.println(str.replaceFirst("ab","gg"));
    }
    public static void main8(String[] args) {
        String str="abcdef";
        System.out.println(str.contains("abc"));
        //从头开始找  找到第一个
        System.out.println(str.indexOf("cde"));
        //从最后开始找  找到第一个
        System.out.println(str.lastIndexOf("cde"));
        //判断是否以**开始
        System.out.println(str.startsWith("ab"));
        //判断是否以**结束
        System.out.println(str.endsWith("ef"));
    }
    public static void main7(String[] args) {
        String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
    }

    public static void main6(String[] args) {
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

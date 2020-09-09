package Exception;
class MyException extends RuntimeException{

}
public class Test {
    public static void func() throws MyException{
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            func();
        }catch (MyException e){
            System.out.println("捕获了MyException");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }




    public static void testThrow(int a) throws RuntimeException{
        if(a==10){
            throw new RuntimeException("a==10");
        }
    }
    public static void main3(String[] args) {
        try {
            testThrow(10);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("hhhhhh");
    }



    public static int TestFinally(){
        int a=10;
        try {
            return 4;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            return a;
            //最后被执行，用来释放资源
            //不建议使用return

        }
    }
    public static void main2(String[] args) {
        System.out.println(TestFinally());
    }
    public static void main1(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }
    }
}

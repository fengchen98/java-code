import java.util.Scanner;

public class Test {
    //获取一个二进制序列中所有的奇数位和偶数位
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=scanner.nextInt();
        System.out.print("奇数位：");
        for (int i = 31; i >=1 ; i-=2) {
            System.out.print(((num>>i)&1)+" ");
        }
        System.out.println();
        System.out.print("偶数位：");
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print(((num>>i)&1)+" ");
        }
    }
}
    /*//写一个函数返回参数二进制中1的个数   方法1
    public static int retOne(int n) {
        int count = 0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=scanner.nextInt();
        System.out.println(retOne(num));
    }
}*/

    /*//写一个函数返回参数二进制中1的个数   方法1
    public static int retOne(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=scanner.nextInt();
        System.out.println(retOne(num));
    }
}*/

/*    //输出一个整数的每一位
    public static void print(int n){
        while(n!=0) {
            if (n < 10) {
                System.out.println(n);
            } else {
                System.out.print(n % 10 + " ");
            }
            n = n / 10;
        }
    }
    public static void main(String[] args) {
        print(15345);
    }
}*/
 /*   //模拟三次密码输入的场景
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int count=3;
        while(count!=0) {
            System.out.println("请输入密码：");
            String str=scanner.nextLine();
            if(str.equals("123456")){
                System.out.println("登录成功！！！");
                break;
            }else {
                count--;
                System.out.println("输入错误，你还有"+count+"次机会");
            }
        }
    }
}*/
/*    //求出0-999之间的水仙花数
    public static void daffodilsNum(int n){
        int flag=0;
        int x=n;
        int sum=0;
        while(x!=0){
            flag++;
            x=x/10;
        }
        x=n;
        while (x!=0){
            sum+=Math.pow(x%10,flag);
            x/=10;
        }
        if(sum==n){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <=999 ; i++) {
            daffodilsNum(i);
        }
    }
}*/
/*    //数出1-100之间有多少个9
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%10==9){
                sum++;
            }
            if(i/10==9){
                sum++;
            }
        }
        System.out.println(sum);
    }
}*/
/*    //计算1/1-1/2+1/3-1/4......+1/100的值
    public static void main(String[] args) {
       int i=1;
       int flag=1;
       double sum=0.0;
        for (; i <=100 ; i++) {
           sum+=1.0/i*flag;
           flag=-flag;
        }
        System.out.println(sum);
    }
}*/
/*//求两个正整数的最大公约数
    public static int maxDiv(int a,int b){
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
    public static void main(String[] args) {
       int a=18;
       int b=24;
        System.out.println(maxDiv(a,b));
    }
}*/
/*    //输出乘法口诀表
    public static void main(String[] args) {
      int i=1;
      for(;i<=9;i++){
          int j=1;
          for(;j<=i;j++){
              System.out.print(j+"*"+i+"="+j*i+"  ");
          }
          System.out.println();
      }
    }
}*/
/*//输出1000-2000之间的闰年
    public static void print(int n){
        if (n%4==0&&n%100!=0||n%400==0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int i=1000;
        for (; i <2000 ; i++) {
            print(i);
        }
    }
}*/
    /*//判定一个数字是否为素数
    public static void isSu(int n){
        if(n==1||n==2){
            System.out.println("不是素数！");
        }
        int i=2;
     for (;i<=Math.sqrt(n);i++){
         if(n%i==0){
             System.out.println(n+"不是素数");
             break;
         }
     }
      if(i>Math.sqrt(n)){
          System.out.println(n+"是素数");
      }
    }
    public static void main(String[] args) {
        isSu(9);
    }
    }*/

import java.util.Scanner;
import java.util.Random;
//猜数字游戏
public class test{
     public static void main(String []args){
     Random ran=new Random();
     int random=ran.nextInt(100)+1; 
    while(true){
   System.out.println("请输入你要猜的数字：");
   Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
    if(n<random) {
     System.out.println("猜小了！");
        }else  if (n==random){
     System.out.println("猜对了！");
     break;
}else {
System.out.println("猜大了！");
}
 
}
}
}
//代码1   判断一个数的正负
//Scanner scan=new Scanner(System.in);
  // int num=scan.nextInt();
  // if(num>0){
 // System.out.println(num +"是正数");
//}else{
// System.out.println(num +"是负数");
//}
//代码2    求出1-100之间所有奇数和所有偶数的和
// int num=1;
//    int sum1=0;
 //   int sum2=0;
//    while(num<=100){
//     if(num%2==0)    {
 //      sum1+=num;
//}else{
//      sum2+=num;
//}
   //  num++;
//}
 //System.out.println("所有奇数的和为" + sum2);
//System.out.println("所有偶数的和为" + sum1);
//代码3   求出1!+2!+3!+4!+5!的和
//   int num=1;
//   int sum=0;
//   while(num<=5){
//   int i=1;
//   int ret=1;
//    while(i<=num){
//   ret*=i;
//   i++;
//}
//sum+=ret;
//num++;
//}
//System.out.println("1!+2!+3!+4!+5!="+sum);
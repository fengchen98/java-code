import java.util.Scanner;
public  class Test{
public static void main(String[] args){
 
  }
}
//代码1   判断一个数是不是素数
//  Scanner scan=new Scanner(System.in);
 //    int num=scan.nextInt();
  //   int i=2;
 //    if(num==2){
//System.out.println(num+"既不是素数也不是质数");
//}else{
//for(;i<=Math.sqrt(num);i++)
//{
// if(num%i==0){
//System.out.println(num+"不是素数");
//break;
//}
//}
//if(i>Math.sqrt(num)){
//System.out.println(num+"是素数");
//}
//}
//代码2    输出1000-2000年之间的闰年
 //for(int i=1000;i<=2000;i++){
 //     if(i%4==0&&i%100!=0||i%400==0){
 //  System.out.println(i+"是闰年！");
//}
//}
//代码3   打印乘法口诀表
 //  int i=1;
 //  for(;i<=9;i++){
//       int j=1;
 //         for(;j<=i;j++){
 //           System.out.print(j+"*" +i+"=" +j*i+"  ");
//}
//System.out.println();
//}
//代码4  最大公约数（辗转相除法）
//int a=24;
//int b=18;
//int c=a%b;
//while(c!=0){
//a=b;
//b=c;
//c=a%b;
//}   
//System.out.println(b);
//代码5  求1/1-1/2+1/3-........+1/n
 //int  i= 1;
 //  int  flag=1;  
  // double  sum=0.0;
 //   for(;i<=100;i++){
 //   sum+=1.0/i*flag;
 //  flag=-flag;
//}
//System.out.println(sum);
//代码6   计算1-100之间9的个数
// int flag=0;
//for(int i=1;i<=100;i++){
 //   if(i/10==9){
  //     flag++;
  //   }
// if(i%10==9){
  //      flag++;
//}
//}
//System.out.println(flag);
//代码7   求幂数
  //Scanner scan=new Scanner(System.in);
  // int num=scan.nextInt();
 // for(int i=1;i<=num;i++){
 //     int temp=i;
   //   int count=0;
 //  while(temp!=0){
 //       count++;
 //      temp=temp/10;
  //    }
  //  temp=i;
  // int  sum=0;
//while(temp!=0){
  //   sum+=Math.pow(temp%10,count);
 //     temp/=10;
//}
//if(sum==i){
//System.out.println(i); 
//}
// }
//代码8   模拟登录
//   int count =3;
//  Scanner scan=new Scanner(System.in);
//while(count!=0){
 // System.out.println("请输入你的密码：");
 // String password=scan.nextLine();
//  if(password.equals("123")){
 //   System.out.println("登录成功！！！");
 //    break;
//}else{
//   count--;
 //  System.out.println("输入错误，你还有"+count+"次机会！！！");
//}
 //   }
//代码9  输出数字的每一位
//Scanner scan=new Scanner(System.in);
//   int num=scan.nextInt();
// while(num!=0){
//System.out.print(num%10+ " ");
//num=num/10;
//}
//代码10  求出二进制数中1的个数
 // Scanner scan=new Scanner(System.in);
 //  int num=scan.nextInt();
 //   int count=0;
//while(num !=0){
//count++;
//num=num&(num-1);
//}
//System.out.println(count);
//代码11   输出二进制数中奇数位和偶数位
//Scanner scan=new Scanner(System.in);
 //  int num=scan.nextInt();
 //     for(int i=31;i>=0;i-=2){
 //       System.out.print(((num>>i)&1)+" ");
 //   }
//  System.out.println();
//       for(int i=30;i>=0;i-=2){
 //       System.out.print(((num>>i)&1)+" ");
 //   }
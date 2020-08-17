import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class test {

}
 //汉诺塔游戏
    /*    public static void move(char pos1,char pos2){
         System.out.print(pos1+"->"+pos2+" ");
     }
     public static void hanota(int n,char pos1,char pos2,char pos3){
         if(n==1){
             move(pos1,pos3);
         }else{
             hanota(n-1,pos1,pos3,pos2);
             move(pos1,pos3);
             hanota(n-1,pos2,pos1,pos3);
         }

     }

    public static void main(String[] args) {
        hanota(3,'A','B','C');
    }
}*/
//使用迭代实现斐波那契数列
    /*public static int febonaci(int n){
    if(n==1||n==2){
        return 1;
    }
    return febonaci(n-1)+febonaci(n-2);
}

    public static void main(String[] args) {
        System.out.println(febonaci(6));
    }
}*/
//求出组成数字的每一位之和
/*    public static int sum1(int n){
        if(n<10){
            return n;
        }
        return n%10+sum1(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sum1(1723));
    }
}*/
/*    求出1+2+3.....+10的值
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}*/
    /*按顺序打印数字的每一位
    public static void func(int n){
        if(n>9){
            func(n/10);
        }
        System.out.print(n%10+" ");

    }
    public static void main(String[] args) {
        func(1234);
    }
}*/
 //斐波那契数列
    /*   public static int fibonaci(int n){
        if(n<=0){
            return -1;
        }
        if(n==1||n==2){
            return 1;
        }
        int f1=1;
        int f2=1;
        int f3=0;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(fibonaci(6));
    }
}*/
/*    public static int max2(int a,int b){
        return  a>b?a:b;
    }
    public static int max3(int a,int b,int c){
        return max2(max2(a,b),c);
    }
    public static void main(String[] args) {
     int a=1;
     int b=2;
     int c=3;
        System.out.println("最大值是："+max3(a,b,c));
    }

}*/
//交换使得奇数 在偶数前面
 /*   public static void swap(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while (i<j&&j%2==0){
                j--;
            }
            while (i<j&&i%2!=0){
                i++;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}*/
    //   找出只出现一次的这个数字
/*
    public static void main(String[] args) {
        int []arr={1,2,3,3,2};
        System.out.println(findOne(arr));
    }


   public static int findOne(int[] arr) {
       int ret = 0;
       for (int i = 0; i < arr.length; i++) {
           ret ^= arr[i];
       }
       return ret;

   }
}*/

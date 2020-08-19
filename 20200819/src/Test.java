import java.util.Arrays;

public class Test {

}
    //二分查找也可以通过Arrays.binarySearch();
   /* public static void main(String[] args) {
        int[] arr={1,3,6,9,12,17,20};
        System.out.println(Arrays.binarySearch(arr,20));
    }
}*/
   //二分查找
    //排序可以使用Arrays.sort();
   /* public static int binarySearch(int[] arr,int n){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]<n){
            left=mid+1;
        }
        else if(arr[mid]>n){
            right=mid-1;
        }
        else {
            return mid;
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,6,9,12,17,20};
        System.out.println(binarySearch(arr,20));
    }
}*/
 /*   //找出数组中一个数字的索引值
    public static int getNum(int[] arr,int num){
        if(arr.length==0||arr==null){
            return -1;
        }
        int i=0;
        for(;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(getNum(arr,6));
    }
}*/
/* //求一个数组的最大值
    public static int getMax(int[] arr){
     if(arr.length==0||arr==null){
         return -1;
     }
     int max=arr[0];
     for(int i=1;i<arr.length;i++){
         if(arr[i]>max){
             max=arr[i];
         }
     }
     return max;
 }
 //求一个数组的平均值
 public static double getAvg(int[] arr){
     double sum=0.0;
     for(int i=0;i<arr.length;i++){
         sum+=arr[i];
         }
     double avg=sum/arr.length;
     return avg;
 }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        System.out.println(getMax(arr));
        System.out.println(getAvg(arr));
    }
}*/
/*    //数组拷贝   方式4   arr.clone();
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2=arr.clone();
        System.out.println(Arrays.toString(arr2));
    }
}*/
/*   //数组拷贝   方式3   System.arraycopy(arr,0,arr2,0,arr.length);  速度最快
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2=new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}*/
 /*   //数组拷贝  方式2   Arrays.copyOf(arr,arr.length);
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}*/
 /*  //数组拷贝   方式1
    public static int[] copyArray(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2=copyArray(arr);
        System.out.println(Arrays.toString(arr2));
    }
}*/
 /*  //写一个方法 实现tostring的功能
    public static String myString(int[] arr){
        if(arr==null){
            return null;
        }
        String str="[";
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                str=str+arr[i]+", ";
            }else {
                str=str+arr[i];
            }
        }
        str=str+"]";
        return str;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        String ret=myString(arr);
        System.out.println(ret);
    }

}*/
 /*   //使用方法交换两个数字的值
    public static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);

    }
}*/
//青蛙跳台阶
    /*    public static int jumpFloor(int n){
        if(n<=0){
            return -1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return jumpFloor(n-1)+jumpFloor(n-2);
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(4));
    }
}*/

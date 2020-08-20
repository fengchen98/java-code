import java.util.Arrays;

public class Test {
    
}
    /*//反转数组
public static void reverseArr(int[] arr){
    int i=0;
    int j=arr.length-1;
    while (i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/
 /*   //冒泡排序
    public static void bubbleSort(int[] arr){
        boolean flag=false;
        for (int i=0; i <arr.length-1 ; i++) {
            flag=false;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,6,4,9,7,3,8,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/
 /*   //判断数组是否有序
    public static boolean isSorted(int[] arr){
        if(arr==null||arr.length==0){
            return false;
        }
        int i=0;
        for (; i <arr.length-1; i++) {
            if(i<arr.length){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr));
    }
}*/

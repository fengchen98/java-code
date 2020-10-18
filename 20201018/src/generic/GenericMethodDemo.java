package generic;

import java.util.Arrays;
import java.util.Comparator;

public class GenericMethodDemo {
    public static void bubbleSort(int[] arr){
        int i=0;
        for (;i<arr.length-1;i++){
            int j=0;
            for (;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            int j = 0;
            for (; j < arr.length - 1 - i; j++) {
                int ret = comparator.compare(arr[j], arr[j + 1]);
                if (ret > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,5,63,7,96,4,13,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        {
            Teacher[] teachers = {
                    new Teacher("张三",14,180),
                    new Teacher("李四",18,175),
                    new Teacher("王麻子",30,170),
                    new Teacher("高五",14,176)
            };
            System.out.println("排序前：");
            System.out.println(Arrays.toString(teachers));
            Comparator<Teacher> byAge=new TeacherByAgeComparator();
            Comparator<Teacher> byHeight=new TeacherByHeightComparator();


            System.out.println("按年龄排序：");
           bubbleSort(teachers,byAge);
            System.out.println(Arrays.toString(teachers));

            System.out.println("按身高排：");
           bubbleSort(teachers,byHeight);
            System.out.println(Arrays.toString(teachers));


        }
    }
}

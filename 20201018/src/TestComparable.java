class Teacher2 implements Comparable<Teacher2>{
    String name;
    int age;
    int hight;
    int weight;

    public Teacher2(String name, int age, int hight, int weight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }

    @Override
    public int compareTo(Teacher2 o) {
        if (this.age<o.age){
            return -1;
        }else if (this.age==o.age){
            return 0;
        }else {
            return 1;
        }
    }
}
public class TestComparable {
    public static void main(String[] args) {
        Teacher2 t1=new Teacher2("张三",18,180,75);
        Teacher2 t2=new Teacher2("李四",23,175,80);
        int ret=t1.compareTo(t2);
        if (ret<0){
            System.out.println("张三 小于 李四");
        }else if (ret==0){
            System.out.println("张三 等于 李四");
        }else {
            System.out.println("张三 大于 李四");
        }
    }
}

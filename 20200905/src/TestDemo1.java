import java.util.Arrays;

class Student2 implements Comparable<Student2>{
    public String name;
    public int age;
    public double score;

    public Student2(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.age>o.age){
            return 1;
        }else if (this.age==o.age) {
            return 0;
        }else {
            return -1;
        }

    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Student2 [] student2s = new Student2[3];
        student2s[0]=new Student2("张三",18,78);
        student2s[1]=new Student2("李四",13,88);
        student2s[2]=new Student2("王麻子",22,96);
        System.out.println(Arrays.toString(student2s));
        Arrays.sort(student2s);
        System.out.println("排序后：：");
        System.out.println(Arrays.toString(student2s));
    }
}

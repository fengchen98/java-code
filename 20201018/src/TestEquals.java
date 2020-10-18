import java.util.Objects;

class Teacher{

    String name;
    Teacher(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (o==null){
            return false;
        }
        if (!(o instanceof Teacher)){
            return false;
        }
        Teacher t=(Teacher)o;
        return this.name.equals(t.name);
    }

}
public class TestEquals {
    public static void main(String[] args) {
        Teacher t1=new Teacher("张三");
        Teacher t2=new Teacher("张三");
        Teacher t3=new Teacher("李四");
        Teacher t4=new Teacher("李四");
        //t1指向的对象和t2指向的对象是否代表了同一个现实的事务
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));

    }

}

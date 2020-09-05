abstract class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("person eat:::");
    }
    public abstract void func();
}
class Student extends Person{
    public Student(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("student eat:::");
    }

    @Override
    public void func() {
        System.out.println("Test Abstract!");
    }
}
public class TestAbstract {
    public static void main(String[] args) {
        Person person=new Student("张三");
        person.eat();
        person.func();
    }
}

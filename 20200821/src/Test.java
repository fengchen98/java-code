class Person{
    private String name;
    private int age=11;
    public static int count=666;
    {
        age=12;
    }
    static {
        count=999;
    }
    public Person(){
    //this("bit",10);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Person person=new Person();
      /*  person.setAge(22);
        person.setName("fengchen");*/
        System.out.println(person);
        System.out.println(Person.count);

    }
}

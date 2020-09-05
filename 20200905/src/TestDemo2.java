import javax.jws.Oneway;
class  Money implements Cloneable{
    public double money=12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
//Cloneable是一个空接口
//用做标记接口，
class Person2 implements Cloneable{
    public String name;
    public Money m;
    public Person2(String name) {
        this.name = name;
        this.m=new Money();
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         Person2 person2=(Person2) super.clone();
         person2.m=(Money) this.m.clone();
         return person2;
    }
}
public class TestDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person2 person=new Person2("fc");
        Person2 person2=(Person2)person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        person2.m.money=18.9;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);


    }


}

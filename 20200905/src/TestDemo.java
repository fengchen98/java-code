
class Animal{
   protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name+"正在吃");
    }
}
class Cat extends Animal{
    public int age;
    public Cat(String name){
        super(name);
    }
    //方法重写
    //1.方法名相同
    //2.参数列表相同
    //3.返回值也要相同
    //注：要重写的方法是不能被private所修饰的
    //被final修饰的方法不能被重写
    //需要重写的方法的访问修饰限定符，子类权限必须大于等于父类权限
    public void eat(){

        System.out.println(this.name+"吃的是猫粮");
    }
    public void jump(){

        System.out.println(this.name+"正在跳");
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //向下转型
        //转型的时候一定要判断animal是否可以转换为Bird
        Animal animal=new Cat("咪咪");
        animal.eat();
        if (animal instanceof Bird){
            Bird bird=(Bird)animal;
            bird.fly();
        }
    }
        public static void func(Animal animal){
            animal.eat();
        }
        public static Animal func2(){
            Cat cat=new Cat("二米");
            return cat;
        }
        public static void main1(String[] args) {
            //多态
            //向上转型
            //第一种方式:直接赋值
            Animal animal=new Cat("咪咪");
            //第二种方式：方法的传参
            Bird bird=new Bird("八哥");
            func(bird);
            //第三种方式：返回值
            func2();

        }
    }



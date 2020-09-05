class Animal2{
    protected String name;

    public Animal2(String name) {
        this.name = name;
    }
}

interface IFlying{
    void fly();
}

interface IRunning{
    void run();
}

interface ISwimming{
    void swim();
}

class Cat1 extends Animal2 implements IRunning{
    public Cat1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用四条腿跑");
    }
}
class Fish extends Animal2 implements ISwimming{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在用尾巴游泳");
    }
}
class Frog extends Animal2 implements IRunning,ISwimming{
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在往前跳");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在蹬腿游泳");
    }

}
class Robot implements IRunning{
    @Override
    public void run() {
        System.out.println("我是机器人 我在跑");
    }
}
//接口也可以发生向上转型
public class TestInterface2 {
    public static void walk(IRunning iRunning){
        iRunning.run();
    }
    public static void main(String[] args) {
        IRunning iRunning=new Robot();
        IRunning iRunning1=new Frog("青蛙");
        IRunning iRunning2=new Cat1("咪咪");
        walk(iRunning);
        walk(iRunning1);
        walk(iRunning2);
        /*IRunning iRunning=new Robot();
        iRunning.run();
        IRunning iRunning1=new Frog("青蛙");
        iRunning1.run();
        IRunning iRunning2=new Cat1("咪咪");
        iRunning2.run();*/

    }

}

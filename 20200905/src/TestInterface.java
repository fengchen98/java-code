interface Shape2{
    void draw();
    //jdk1.8的新特性   被default修饰的方法可以有实现
    default void func(){
        System.out.println("default::func()");
    }
}
class Cycle2 implements Shape2{
    @Override
    public void draw() {
        System.out.println("Cycle::⚪");
    }
}
class Rect2 implements Shape2{
    @Override
    public void draw() {
        System.out.println("Rect::□");
    }
}
public class TestInterface {
    public static void drawMap(Shape2 shape2){
        shape2.draw();
    }
    public static void main(String[] args) {
        Shape2 shape2=new Cycle2();
        Shape2 shape21=new Rect2();
        drawMap(shape2);
        drawMap(shape21);

    }
}

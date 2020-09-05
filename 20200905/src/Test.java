class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class Test {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new Rect();
        Shape shape3=new Flower();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);

    }
}

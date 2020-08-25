public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.display();
        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.search(5));
        System.out.println(myArrayList.getPos(5));
        myArrayList.remove(6);
        myArrayList.display();

    }
}

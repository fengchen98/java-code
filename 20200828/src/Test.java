public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(1);
        myLinkedList.dispaly();
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.dispaly();
        myLinkedList.addIndex(3,1);
        myLinkedList.dispaly();
        myLinkedList.delete(6);
        myLinkedList.dispaly();
        System.out.println(myLinkedList.contains(7));
        myLinkedList.deleteAllKey(1);
        myLinkedList.dispaly();
      /*  Node newHead=myLinkedList.reverse();
        myLinkedList.dispaly2(newHead);*/
        Node ret=myLinkedList.findKthNode(3);
        System.out.println(ret.data);
    }
}

public class ListReverse {
    public  static Node reverse(Node head){
        Node cur=head;
        Node curPrev=null;
        Node temp=null;

        while(cur!=null){
            if (cur.next==null){
                temp=cur;
            }
            Node curNext=cur.next;
            cur.next=curPrev;
            curPrev=cur;
            cur=curNext;

        }
    return temp;
    }

    public static void main(String[] args) {
        Node head=new Node();
        head.val=1;

        head.next=new Node();
        head.next.val=2;

        head.next.next=new Node();
        head.next.next.val=3;

        head.next.next.next=new Node();
        head.next.next.next.val=4;

        Node reverseHead=reverse(head);

        Node cur=reverseHead;
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
}

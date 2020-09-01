public class Test {
    public static Node getIntersectionNode(Node headA,Node headB){
        if (headA==null||headB==null){
            return null;
        }
        //分别求出两个链表的长度
        Node pl=headA;
        Node ps=headB;
        int lenA=0;
        int lenB=0;
        while (pl!=null){
            lenA++;
            pl=pl.next;
        }
        while (ps!=null){
            lenB++;
            ps=ps.next;
        }
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if (len<0){
            ps=headA;
            pl=headB;
            len=lenB-lenA;
        }

        //让长的链表先走差值步
       while (len>0){
           pl=pl.next;
           len--;
       }

        while (pl != null && ps != null && pl != ps){
            pl=pl.next;
            ps=ps.next;
        }
        if (pl==ps && pl!=null){
            return pl;
        }
        return null;
    }
    public static void createCut(Node headA,Node headB){
        headA.next=headB.next.next;
    }
    //合并两个有序的单链表
    public static Node mergeTwoLists(Node headA,Node headB){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        //两个链表当前都有数据
        while (headA!=null && headB != null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else {
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
            }
        }
        if (headA!=null){
            //headA剩下的所有数据都是比headB里面的数据大的
            tmp.next=headA;
        }
        if (headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
       /* myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(1);*/
       /* myLinkedList.dispaly();*/
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.dispaly();
       /* myLinkedList.addIndex(3,1);
        myLinkedList.dispaly();
        myLinkedList.delete(6);
        myLinkedList.dispaly();
        System.out.println(myLinkedList.contains(7));
        myLinkedList.deleteAllKey(1);
        myLinkedList.dispaly();*/
      /*  Node newHead=myLinkedList.reverse();
        myLinkedList.dispaly2(newHead);*/
        //Node ret=myLinkedList.findKthNode(3);
       // System.out.println(ret.data);
        MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(58);
        myLinkedList2.addLast(76);
        myLinkedList2.addLast(83);
        myLinkedList2.dispaly();
        /*createCut(myLinkedList2.head,myLinkedList2.head);
        Node ret=getIntersectionNode(myLinkedList2.head,myLinkedList2.head);
        System.out.println(ret.data);*/
        Node ret=mergeTwoLists(myLinkedList2.head,myLinkedList2.head);
        myLinkedList.dispaly2(ret);
    }
}

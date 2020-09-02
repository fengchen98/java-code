class ListNode{
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
    }

}
public class RealLinkedList {
    public ListNode head;
    public ListNode tail;
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if (head==null){
            head=node;
            tail=node;
        }else {
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if (head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }

    public void display(){
        ListNode cur=head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //求链表长度
    public int size(){
        ListNode cur=head;
        int count=0;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }

    //返回下标为index的节点
    public ListNode searchIndex(int index){
        ListNode cur=head;
        while (index>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        ListNode node=new ListNode(data);
        if (index<0||index>size()){
            return ;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if (index==size()){
            addLast(data);
            return;
        }
        ListNode cur=searchIndex(index);
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;

    }
         public void remove(int key){
             ListNode cur=head;
             while (cur!=null){
                if(cur.data==key)
                {
                    if (cur==head){
                        head=head.next;
                        head.prev=null;
                    }else {
                        cur.prev.next=cur.next;
                        if (cur.next!=null){
                            cur.next.prev=cur.prev;
                        }else
                        tail=tail.prev;
                    }
                    return;
                }else
                    cur=cur.next;
                }
             }
    public void removeAll(int key){
        ListNode cur=head;
        while (cur!=null){
            if(cur.data==key)
            {
                if (cur==head){
                    head=head.next;
                    head.prev=null;
                }else {
                    cur.prev.next=cur.next;
                    if (cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else
                        tail=tail.prev;
                }
            }
                cur=cur.next;
        }
    }
    public void clear(){
        ListNode cur=head;
        while (cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur.prev=null;
            cur=curNext;
        }
        head=null;
        tail=null;
    }
}


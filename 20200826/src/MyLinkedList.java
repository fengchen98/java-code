class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=head;
        this.head=node;
    }
    public void dispaly(){
         Node cur=this.head;
         while (cur!=null){
             System.out.print(cur.data+" ");
             cur=cur.next;
         }
        System.out.println();
    }
    public void  addLast(int data){
        Node node=new Node(data);
        if(head==null){
             this.head=node;
         }else{
            Node cur=this.head;
             while (cur.next!=null){
                 cur=cur.next;
             }
             cur.next=node;
         }
    }
    public int getlength(){
       int count=0;
       Node cur=this.head;
       while (cur!=null){
           count++;
           cur=cur.next;
       }
       return count;
    }
    //查找index-1的位置
    public Node searchPrev(int index){
        Node cur=this.head;
        int count=0;
        while (count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        if(index<0||index>getlength()){
            System.out.println("下标不合法！");
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if (index==getlength()){
            addLast(data);
            return;
        }
        Node cur=searchPrev(index);
        Node node=new Node(data);
        node.next=cur.next;
        cur.next=node;
    }
//找要删除的结点的前驱节点
    public Node searchPrveNode(int key){
        Node cur=this.head;
        while (cur.next!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public void delete(int key){
          if (this.head==null){
              return;
          }
          if(this.head.data==key){
              head=this.head.next;
              return;
          }
          Node cur=searchPrveNode(key);
          if (cur==null){
              System.out.println("没有你要删除的数字！");
              return;
          }
          Node del=cur.next;
          cur.next=del.next;

    }
}

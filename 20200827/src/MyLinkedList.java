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
    //查找是否包含关键字key在当前链表中
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public void deleteAllKey(int key){
        Node prev=this.head;
        Node cur=prev.next;
        if (this.head==null){
            return;
        }
        while (cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.data==key){
            head=head.next;
        }
    }
    public void clear(){
        this.head=null;
    }
    public void dispaly2(Node newHead){
        Node cur=newHead;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public Node reverse(){
        Node newHead=null;
        Node prev=null;
        Node cur=this.head;
        while (cur!=null){
            Node curNext=cur.next;
            if (curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //求出链表的中间节点
    public Node middleNode(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //找出倒数第K个节点
    public Node findKthNode(int k){
        if(k<=0 || head==null){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        while (k-1>0){
           if (fast.next!=null){
               fast=fast.next;
               k--;
           }else {
               System.out.println("k值过大！");
               return null;
           }
        }
        while (fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}

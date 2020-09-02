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
    public Node partition(int x){
        Node bs=null;
        Node be=null;

        Node as=null;
        Node ae=null;

        Node cur=this.head;
        while (cur!=null){
            if(cur.data<x){
                if (bs==null){
                    bs=cur;
                    be=cur;
                }else {
                    be.next=cur;
                    be=cur;
                }
            }else {
                if (as==null){
                    as=cur;
                    ae=cur;
                }else {
                    ae.next=cur;
                    ae=cur;
                }
            }
            cur=cur.next;
        }
        if(bs==null){
           return as;
        }
        be.next=as;
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }
    public Node delDuplication(){
        Node newHead=new Node(-1);
        Node temp=newHead;
        Node cur=this.head;
        while (cur!=null){
            if (cur.next != null &&cur.data == cur.next.data ) {
               while (cur.next!=null&&cur.data == cur.next.data){
                   cur=cur.next;
               }
               cur=cur.next;
            }else{
                temp.next=cur;
                temp=cur;
                cur=cur.next;
            }
            }
        temp.next=null;
        return newHead.next;
        }
        //检查是否是回文序列
    public boolean chkPalindrome(){
        if(this.head==null){
            return false;
        }
        if (this.head.next==null){
            return true;
        }
        //1.找到中间节点
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //2.反转
        Node cur=slow.next;
        while (cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //3.判断data是否相等一个从前往后走，一个从后往前走
         while (this.head!=slow){
             if (head.data!=slow.data){
                return false;
             }
             //判断偶数节点
             if (head.next==slow){
                return true;
             }
             head=head.next;
             slow=slow.next;
         }
         return  true;
    }
    //判断链表中是否有环
    public boolean hasCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    //如果一个链表有环，返回入口点，否则返回null
    public Node detectCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                break;
            }
        }
        if (fast==null||fast.next==null){
             return null;
        }
        slow=this.head;
        while (slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }
    }


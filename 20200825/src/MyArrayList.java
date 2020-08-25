import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public MyArrayList(){
        this.elem=new int[5];
        this.usedSize=0;
    }
    public void add(int pos ,int data){
        if (pos<0||pos>this.usedSize){
            System.out.println("该位置不合法！！！");
        }
        if(this.usedSize==this.elem.length){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        int i=this.usedSize-1;
            while (i>=pos){
                this.elem[i+1]=this .elem[i];
                i--;
            }
            this.elem[pos]=data;
            this.usedSize++;
        }

    public void display(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //判定是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i <this.usedSize; i++) {
            if(elem[i]==toFind)
                return true;
        }
       return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i <this.usedSize; i++) {
            if(elem[i]==toFind){
                return  i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if (pos<0||pos>=this.usedSize){
            System.out.println("该位置不合法！！！");
            return -1;
        }
        return this.elem[pos];
    }
    //给pos位置的元素设置为value
    public void setPos(int pos,int value){
        if (pos<0||pos>this.usedSize){
            System.out.println("该位置不合法！！！");
        }
        elem[pos]=value;
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int i=search(toRemove);
        if(i==-1){
            System.out.println("没有该数字！");
            return;
        }
            for (;i<usedSize-1;i++){
                elem[i]=elem[i+1];
            }
            this.usedSize--;
    }
    //清空顺序表
    public void clear(){
       this.usedSize=0;
    }
}

class TwoStack{
    int arr[];
    int capacity;
    int top1;
    int top2;
    TwoStack(int capacity){
        this.capacity = capacity;
        arr = new int[this.capacity];
        top1 = -1;   //left to right
        top2 = capacity;   //right to left



    }
    void push1(int val){
        if(top1<top2-1){
     //left to right push
     top1++;
     arr[top1] = val;
        }
    }
    void push2(int val){
      //right to left push
       if(top1<top2-1){
        top2--;
        arr[top2] = val;
       }
    }
    int pop1(){
        if(top1>=0){
            int val = arr[top1];
            top1--;
            return val;
        }
        else{
            throw new RuntimeException("Stack is Empty");
        }
    }
    int pop2(){
        if(top2<capacity){
            int val = arr[top2];
            top2++;
            return val;
        }
        else{
            throw new RuntimeException("Stack2 is Empty");
        }
    }
    void peek1(){
          for(int i=top1; i>=0; i--){
            System.out.print(arr[i]);
          }
    }
    void peek2(){
        for(int i=top2; i<capacity; i++){
            System.out.print(arr[i]);
        }
    }
}


public class ImplementTwoStackinOneArray {

    public static void main(String args[]){
       TwoStack obj = new TwoStack(10);
       obj.push1(10);
       obj.push1(20);
       obj.push1(30);
       obj.push2(40);
       obj.push2(100);
       obj.push2(300);
       obj.pop1();
       obj.pop2();
       obj.peek1();
       System.out.println("********************");
       obj.peek2();

    }
}

 class KStackClass {
    int arr[];
    int top[];
    int next[];
    int kSize;
    int capacity;
    int freeTop;


    KStackClass(int kSize,int n){
        this.kSize = kSize;
        this.capacity = n;
        arr = new int[capacity];
        top = new int[kSize];
        next = new int[capacity];
        freeTop = 0;
        topFill();
        nextFill();
    }

    void topFill(){
        for(int i=0;i<kSize;i++){
            top[i] = -1;
        }
    }
    void nextFill(){
        for(int i=0; i<capacity-1; i++){
         next[i] = i+1;
        }
        next[capacity-1] = -1;
    }
    void push(int element,int stackNumber){
        int index = freeTop; //current top index default on 0
        freeTop = next[index]; //get the next index and store in free top
        next[index] = top[stackNumber];
        top[stackNumber] = index;
        arr[index] = element;


    }

    int pop(int stackNumber){
        int index = top[stackNumber]; //top element index according to index
        top[stackNumber] = next[index]; //previous element index store in top 
        next[index] = freeTop; //free top index store in next
        freeTop = index; //free top index store in free top
        return arr[index];
    }
}

public class KStack{
    public static void main(String[] args){
      KStackClass kStack = new KStackClass(3,10);
      kStack.push(10,0);
      kStack.push(20,0);
      kStack.push(30,0);
      kStack.push(100,1);
      kStack.push(200,1);
      kStack.push(300,2);
      System.out.println(kStack.pop(0));
      System.out.println(kStack.pop(1));
      System.out.println(kStack.pop(2));
    }
}


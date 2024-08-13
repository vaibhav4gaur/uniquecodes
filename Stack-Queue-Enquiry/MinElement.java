import java.util.Stack;
class MinStack{
    Stack<Integer> stack = new Stack<>();
   int min = 0;
    void push(int element){
      if(stack.isEmpty()){
        min = element;
        stack.push(element);
      }
      else if(element<min){
        stack.push(element-min);
        min = element;
      }
      else{
        stack.push(element);
      }
    }
    int getMin(){
        return min;
    }
    int pop(){
        int element = stack.pop();
        if(element<0){
            int result = min;
            min = min - element;
            return result;
        }
        else{
            return element;
        }
    }
}

public class MinElement {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(10);
        minStack.push(20);
        minStack.push(2);
        minStack.push(7);
        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());

    }
}

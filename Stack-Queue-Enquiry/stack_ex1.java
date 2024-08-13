 import java.util.Stack;
 public class stack_ex1{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        System.out.println(st.peek());
        st.push(400);
        System.out.println(st.peek());
        int ele = st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.size());

 }
}
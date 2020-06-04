import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        sortStack(stack);

        for(int i: stack){
            System.out.println(i);
        }
    }

    private static void  sortStack(Stack<Integer> stack) {
        if(stack.isEmpty())
            return;
        int x =  stack.pop();
        sortStack(stack);
        insertAtBottom(stack, x);
        return;
    }

    private static void insertAtBottom(Stack<Integer> stack, int x) {
        if(stack.isEmpty() || stack.peek()<x){
            stack.push(x);
            return;
        }

        int temp= stack.pop();
        insertAtBottom(stack, x);
        stack.push(temp);
    }
}

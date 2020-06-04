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
        stack = sortStsack(stack);

        for(int i: stack){
            System.out.println(i);
        }
    }

    private static Stack<Integer> sortStsack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while(! stack.isEmpty()) {
            int curr = stack.pop();

            while (! tempStack.isEmpty() && tempStack.peek() > curr) {
                int temp = tempStack.pop();
                stack.push(temp);
            }


            tempStack.push(curr);

        }
        return tempStack;
    }
}

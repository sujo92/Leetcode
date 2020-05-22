public class Main {
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(20);
        ms.push(20);
        ms.push(10);
        ms.push(30);
        ms.push(5);
        ms.push(40);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }
}

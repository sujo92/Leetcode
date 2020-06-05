import java.util.Stack;

public class CelebrityProblem {
    static int[][] matrix = new int[][]{{0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}};

    public static void main(String[] args) {
        int numPersons = matrix.length;
        System.out.println((findCelebrity(numPersons)));
    }

    public static boolean knows(int a, int b){
        return (matrix[a][b]==1);
    }

    public static int findCelebrity(int count){
        Stack<Integer>  stack = new Stack<>();

        for(int i=0; i<count; i++){
            stack.push(i);
        }

        while(stack.size() > 1){
            int a= stack.pop();
            int b= stack.pop();

            if(knows(a,b)){
                stack.push(b);
            }else{
                stack.push(a);
            }
        }
        int c = stack.pop();

        for(int i=0; i<count; i++){
            if( c != i && (knows(c,i) || ! knows(i,c))){
                return -1;
            }
        }

        return c;
    }
}

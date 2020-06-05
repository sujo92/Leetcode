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

    //returns true if a know b
    public static boolean knows(int a, int b){
        return (matrix[a][b]==1);
    }

    public static int findCelebrity(int count){
        Stack<Integer>  stack = new Stack<>();

        //put all person on stack first
        for(int i=0; i<count; i++){
            stack.push(i);
        }

        //pop two elements until final element is left and put possible celebrity among two on stack
        while(stack.size() > 1){
            int a= stack.pop();
            int b= stack.pop();

            if(knows(a,b)){
                stack.push(b);
            }else{
                stack.push(a);
            }
        }

        //pop final person
        int c = stack.pop();

        //check if final person is celebrity by comparing rest of people
        for(int i=0; i<count; i++){
            //if  last person knows other person OR other person doesnt know last person then last person couldn't be celebrity
            if( c != i && (knows(c,i) || ! knows(i,c))){
                return -1;
            }
        }

        //if comparison with other people is successful that means this last person is celebrity
        return c;
    }
}


public class Stack{
    static final int MAX = 5;
    int top;
    int[] stack = new int[MAX];
    Stack(){
        top = -1;
    }

    //push method
    public long push(int x){
        if (top != (MAX -1)) {
            stack[++top] = x;
        } return x;
    }

    //pop method
    public long pop(){
        return stack[top--];
    }

    //isEmpty method
    public boolean isEmpty(){
        return (top == -1);
    }


}

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        int length = Stack.MAX;

        while (stack.isEmpty()){
            for (int x=0; x < length; x++){
                long itemInserted = stack.push(x);
                System.out.println("Inserted Item: " + itemInserted);
            }
        }

        if (!stack.isEmpty()){
            for (int i= stack.top; i<= stack.top && i > -1; i--){
                long itemRemoved = stack.pop();
                System.out.println("Removed Item: " + itemRemoved);
            }
        }

    }

}

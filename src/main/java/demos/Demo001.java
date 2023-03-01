package demos;

//模拟入栈和出栈
public class Demo001 {
    public static void main(String[] args) {
        ArrayStackDemo as=new ArrayStackDemo(3);
        as.push(0);
        as.push(1);
        as.push(2);

        System.out.println(as.pop());

        as.traverse();
    }
}

class ArrayStackDemo{
    private int maxSize;
    private int top=-1;
    private int bottom;
    private int[] stack;

    public ArrayStackDemo(int maxSize) {
        this.maxSize = maxSize;
        stack=new int[maxSize];
    }

    boolean isFull(){
        return top==maxSize-1;
    }

    boolean isEmpty(){
        return top==-1;
    }

    void push(int value){
        if ((isFull())) throw new RuntimeException("栈已满");

        stack[++top]=value;
    }

    int pop(){
        if(isEmpty()) throw new RuntimeException("栈已空");

        return stack[top--];
    }

    void traverse(){
        for (int i = top; i >=0 ; i--) {
            System.out.printf(stack[i]+"\t");
        }
    }
}

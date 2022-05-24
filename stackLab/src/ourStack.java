public class ourStack {
    private int[] info;
    private int top;

    public ourStack(int capacity) {
        info = new int[capacity];
        top =0;
    }
    // method push(),pop(),topElement(),clear()

    public void push(int newInfo){
        if(!isFull()){
            info[top] = newInfo;
            top++;
        }
        else{
            System.out.println("Stack is full. You cannot push a new number");
        }
    }
    public int pop(){
        int x;
        if(!isEmpty()) {
            top--;
            x = info[top];
        }
        else{
             x= -999;
             System.out.println("Stack is empty. There is nothing to pop");
        }
        return x;
    }
    public int topElement(){
        if(isEmpty()){
            return -1;
        }
        return info[top-1];
    }
    public void clear(){
        top=0;
    }
    public boolean isEmpty(){
        return  top==0;
    }
    public boolean isFull(){
        return top >= info.length;
    }
}

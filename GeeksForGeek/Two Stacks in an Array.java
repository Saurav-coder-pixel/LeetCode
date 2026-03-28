class twoStacks {
    int size;
    int arr[];
    int top1, top2;
    
    twoStacks() {
        size= 100;
        arr= new int[100];
        top1= 0;
        top2= size-1;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if(top1<= top2){
            arr[top1++]= x;
        }else{
            System.out.println("Stack1 overflow");
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top2>= 0){
           arr[top2--]= x; 
        }else{
           System.out.println("Stack2 overflow"); 
        }
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        if(top1 > 0){
            return arr[--top1];
        }else{
            return -1;
        }
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        if(top2< size-1){
            return arr[++top2];
        }else{
            return -1;
        }
    }
}
package stack.implimentation;

class StackImplimentation1 { 
    private class Node { 
        int data; 
        Node nlink; 
    } 
    Node top; 
    StackImplimentation1()  { 
        this.top = null; 
    } 
    public void push(int val)  { 
        Node temp = new Node(); 
        if (temp == null) { 
            System.out.print("\nStack Overflow"); 
            return; 
        } 
        temp.data = val; 
        temp.nlink = top; 
        top = temp; 
    }   
    public boolean isEmpty()  { 
        return top == null; 
    }  
    public int peek()  { 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
            System.out.println("Stack is empty!"); 
            return -1; 
        } 
    } 
    public void pop() {  
        if (top == null) { 
            System.out.print("\nStack Underflow!!"); 
            return; 
        }  
        top = (top).nlink; 
    } 
    public void display()   { 
        if (top == null) { 
            System.out.printf("\nStack Underflow!!"); 
             
        } 
        else { 
            Node temp = top;
            System.out.println("Stack elements:");
            while (temp != null) { 
                System.out.print(temp.data + "->");
                temp = temp.nlink; 
            } 
        } 
    } 
} 
 
public class StackImplimentation { 
    public static void main(String[] args) 
    { 
    	StackImplimentation1 stack_obj = new StackImplimentation1(); 

        stack_obj.push(9); 
        stack_obj.push(7); 
        stack_obj.push(5); 
        stack_obj.push(3); 
        stack_obj.push(1); 

        stack_obj.display(); 

        System.out.println("\nStack top : " + stack_obj.peek());
        System.out.println("Pop two elements");
        
        stack_obj.pop(); 
        stack_obj.pop();

        stack_obj.display(); 

        System.out.println("\nNew Stack top:" + stack_obj.peek()); 
    } 
}
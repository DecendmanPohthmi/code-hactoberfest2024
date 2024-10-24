import java.util.Scanner;

class StackLL {
    static class Node{
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nEnter your choice\n1.Push\n2.Pop\n3.Display\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("\n***Existing***");
                    break;
            
                default:
                    break;
            }
        }
    }
    public static void push(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int data = sc.nextInt();
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    public static void pop(){
        if(head == null) {
            System.out.println("**Stack underflow **");
            return;
        }
        System.out.println("Element" + head.data + " has remove ");
        head = head.next;
    }
    public static void display(){
        if(head == null) {
            System.out.println("** Stack is empty **");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

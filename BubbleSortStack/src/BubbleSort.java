import java.util.*;
public class BubbleSort {
    Scanner scan = new Scanner(System.in); //object to call the scanner methods

    public void input(int n, Stack<Integer> stack1) { //taking the input inside stack
        for (int i = 0; i < n; i++) {
            stack1.push(scan.nextInt()); //pushing input one by one into stack
        }
    }

    public void sort(Stack<Integer> stack1, Stack<Integer> stack2, int n) {
        int tmp;
            while (!stack1.isEmpty()){
                if (stack2.isEmpty() || stack1.peek()>stack2.peek()) {
                    stack2.push(stack1.pop());
                }

                else if (stack1.peek()<stack2.peek()) {
                    tmp=stack1.pop();
                    while(!stack2.isEmpty()) {
                        if (stack2.peek()>tmp) {
                            stack1.push(stack2.pop());
                        } else { break; }
                    }
                    stack2.push(tmp);
                }
            }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //object to call the scanner methods
        BubbleSort hi = new BubbleSort();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        System.out.println("Insert the amount of number you want to sort");
        int n= scan.nextInt();
        hi.input(n,stack1);
        System.out.println(stack1);
        hi.sort(stack1,stack2,n);
        System.out.println(stack2);
    }
}
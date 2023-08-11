package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SoNguyenTo {
    public boolean ktSNT(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

    public void sntToStack(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (ktSNT(i)) {
                stack.push(i);
            }
        }
        System.out.print("Phan tu trong stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    public void sntToQueue(int n){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (ktSNT(i)) {
               queue.add(i);
            }
        }
        System.out.println();
        System.out.print("Phan tu trong queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}

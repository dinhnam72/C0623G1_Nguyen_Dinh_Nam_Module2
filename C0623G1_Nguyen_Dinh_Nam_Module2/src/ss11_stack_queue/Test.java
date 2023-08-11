package ss11_stack_queue;

import ss08_clean_code.Empluyee;

import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        SoNguyenTo snt = new SoNguyenTo();
        int n = 25;
        snt.sntToStack(n);
        snt.sntToQueue(n);
    }
}

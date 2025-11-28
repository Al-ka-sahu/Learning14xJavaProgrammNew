package ex_10_For_Loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
             if (i == 5) {
                 continue;
                 // continue mean skip the i==5 and continue the loop again till 50
//                in loop, only 5 will not shown
             }
            System.out.println(i); // 0,1,2,3,4
        }
    }
}

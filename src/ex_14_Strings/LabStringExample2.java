package ex_14_Strings;

public class LabStringExample2 {
    public static void main(String[] args) {
        CharSequence s = "Pramod" .subSequence(1,4); //n-1, bcoz, we starting from zero.
        System.out.println(s);

        // endindex always n-1,
        // 1,4 = Pramod = 0,1,2,3,4  =(1,2,3 = ram)

    }
}

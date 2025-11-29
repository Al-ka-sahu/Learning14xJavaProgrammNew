package ex_12_DoWhile;

public class Lab126_Diff_While_Dowhile {
    public static void main(String[] args) {
        int a = 0;
         //  while (a < 0){
        //    System.out.println(a);
        //  a++;
        //}


        do{
            System.out.println(a);
            a++;
        }while  (a<0);

//Note : atleast 1 time "do while" will be run.
// note : in DO while, 1st print then check condition will be true or false.
// Do while mostly use in Automation

    }
}

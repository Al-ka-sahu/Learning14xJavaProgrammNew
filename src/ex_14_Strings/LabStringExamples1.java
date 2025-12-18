package ex_14_Strings;

public class LabStringExamples1 {

    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result =  "abc".compareTo("ABC");
        System.out.println(result);

        //this is basically the difference of ascii number between small abc and ABC =32
        int idx = "Java" .indexOf("a"); //1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); //3
        System.out.println(idx2);

        boolean b = " ".isEmpty(); //true
        System.out.println(b);

        String s11 = String.join("z-", "Java","Python");
        System.out.println(s11);

        String s12 =  "Java"  .replace('a', 'o');
        System.out.println(s12);

        boolean b1 = "Java" .startsWith("Ja"); // true
        System.out.println(b1);

        String s13 = "Java" .concat("MAVA");
        System.out.println(s13);

// Join use with some any delimiter and concat fuction use without delimeter



    }
}

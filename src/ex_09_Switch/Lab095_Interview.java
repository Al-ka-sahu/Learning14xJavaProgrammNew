package ex_09_Switch;

public class Lab095_Interview {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
                // Statement is correct, -1 will be compared the -1, that's why we get the answers
                // Sir, only confused you to assign a =11

        }

    }
}

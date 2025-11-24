package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Helloooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
//  'A' statement is also run, bcoz break is not here.these are tricky questions
        }

    }
}

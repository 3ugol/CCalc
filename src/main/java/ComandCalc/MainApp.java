package ComandCalc;
import java.lang.Exception;
public class MainApp {
    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args0) throws Exception {
        String [] args={"5","+","5"};
        int x=0; // = Integer.parseInt(args[0]);
        String op = args[1];
        int y=0; //= Integer.parseInt(args[2]);
        int z;
        String [] roma = {"I","II","III","IV","V","VI","VII","VIII","IX,","X"};
        String a1=args[0];
        String a2=args[2];

        for (int c1 = 0; c1 < roma.length; c1++) {
            if (a1.equals(roma[c1])) {
                x = ++c1;
                break;
                }
            }

        for (int c2 = 0; c2 < roma.length; c2++) {
            if (a2.equals(roma[c2])) {
                y = ++c2;
                break;
            }
        }
        if (y==0 && x==0) {
            y=Integer.parseInt(args[2]);
            x=Integer.parseInt(args[0]);
        }
        else if (y==0 || x==0){
            System.out.println("Error");
        }

        if (op.equals("+")) {
            z = x+y;
        } else if (op.equals("-")){
            z = x-y;
        } else if (op.equals("*")){
            z = x*y;
        } else if (op.equals("/")){
            z = x/y;
        } else{
            throw new java.lang.Error("Operator not recognized");
        }
        System.out.println(z);

    }
}

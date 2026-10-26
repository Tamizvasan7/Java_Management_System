import java.util.*;
public class Main {
    public static void main(String[] args) {
        int mark[] = new int[20];
        Scanner scan = new Scanner(System.in);

        for (int i =  mark.length-1;i>=0; i--) {
            System.out.println("Enter the " + i + " index value:");
            mark[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(mark));
    }
}

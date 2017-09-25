//ID:105021088
import java.util.Scanner;
public class untitled2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float weght = scn.nextInt();
        System.out.println(Math.round (weght/600f*10)/10f);
    }
}

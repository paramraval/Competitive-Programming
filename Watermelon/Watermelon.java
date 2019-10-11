import java.util.Scanner;
public class Watermelon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        if(w!=2){
            if(w%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        if(w == 2){
            System.out.println("NO");
        }
        s.close();
    }
}

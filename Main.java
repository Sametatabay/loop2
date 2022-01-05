import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int j;
    int total=0;
    Scanner inp =new Scanner(System.in);



    do{
        System.out.print("Number Enter :");
        j=inp.nextInt();
        if ( j%4==0){
            total+=j;
        }
    }while(j%2==0);
    System.out.println(total);
    }
}

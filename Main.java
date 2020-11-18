import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String Qty, opt;
	    int totalNumbers, optInt;
	
	    Scanner register = new Scanner(System.in);
	    System.out.println("Quantos números serão cadastrados?");
	    Qty = register.nextLine();
	    totalNumbers = Integer.valueOf(Qty);
	
	    int number[] = new int[totalNumbers];
	
	    BubbleController.registerNumbers(totalNumbers, register, number);

        BubbleView.listNumbers(totalNumbers, number);


        System.out.println("Deseja ordenar de forma crescente ou decrescente?");
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Crescente");
        System.out.println("2 - Decrescente");
        opt = register.nextLine();
        optInt = Integer.valueOf(opt);

            if (optInt == 1) {
                BubbleController.orderByAsc(totalNumbers, number);
            } else if (optInt == 2) {
                BubbleController.orderByDesc(totalNumbers, number);
            } else {
                System.out.println("Favor digitar um código válido.");
            } 


        
        BubbleView.listNumbers(totalNumbers, number);


	}
}

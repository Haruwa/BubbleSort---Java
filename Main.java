import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String Qty;
	    int totalNumbers;
	
	    Scanner numberRegister = new Scanner(System.in);
	    System.out.println("Quantos números serão cadastrados?");
	    Qty = numberRegister.nextLine();
	    totalNumbers = Integer.valueOf(Qty);
	
	    int number[] = new int[totalNumbers];
	
	    BubbleController.registerNumbers(totalNumbers, numberRegister, number);

        BubbleView.listNumbers(totalNumbers, number);

	    for (int bubbleCounterDown = totalNumbers-1; bubbleCounterDown > 0; bubbleCounterDown--){
            for(int bubbleCounterUp = 0; bubbleCounterUp < bubbleCounterDown; bubbleCounterUp++){
                int aux;
                if(number[bubbleCounterUp] > number[bubbleCounterUp + 1]){
                    aux = number[bubbleCounterUp];
                    number[bubbleCounterUp] = number[bubbleCounterUp + 1];
                    number[bubbleCounterUp + 1] = aux;
                }
            }
         }
        
        BubbleView.listNumbers(totalNumbers, number);


	}
}

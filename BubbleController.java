import java.util.Scanner;

public class BubbleController {

	static void registerNumbers(int totalNumbers, Scanner numberRegister, int[] number) {
	    for (int counterUp = 0; counterUp < totalNumbers; counterUp++) {
	        String s_number;
	        System.out.println("Por favor, digite um número");
	        s_number = numberRegister.nextLine();
	        number[counterUp] = Integer.valueOf(s_number);
	    }
	}

	static void orderByAsc(int totalNumbers, int[] number) {
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
	}

	static void orderByDesc(int totalNumbers, int[] number) {
	    for (int bubbleCounterDown = totalNumbers-1; bubbleCounterDown > 0; bubbleCounterDown--){
	        for(int bubbleCounterUp = 0; bubbleCounterUp < bubbleCounterDown; bubbleCounterUp++){
	            int aux;
	            if(number[bubbleCounterUp] < number[bubbleCounterUp + 1]){
	                aux = number[bubbleCounterUp];
	                number[bubbleCounterUp] = number[bubbleCounterUp + 1];
	                number[bubbleCounterUp + 1] = aux;
	            }
	        }
	     }
	}


}

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
    
}

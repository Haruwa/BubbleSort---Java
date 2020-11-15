public class BubbleView {

	static void listNumbers(int totalNumbers, int[] number) {
	
	    System.out.println("--------------");
	    System.out.print("Number List: \n");
	    System.out.println("--------------\n");
	
	    for (int showNumbers = 0; showNumbers < totalNumbers; showNumbers++) {
	        System.out.print(number[showNumbers] + " ");
        }
        
        System.out.println("\n");
	}
    
}

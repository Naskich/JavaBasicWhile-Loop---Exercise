
import java.util.Scanner;
public class ExamPreparation {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
	       int numberNotGoodEvaluate = Integer.parseInt(scanner.nextLine());
	        if (numberNotGoodEvaluate>0 && numberNotGoodEvaluate<6) {
	            double countExam = 0;
	            double sumEvaluate = 0;
	            double numberSume = 0;
	            String nameLast ="";
	            int badEvaluate=0;            
	            String nameExam = scanner.nextLine();	            
	            while (!nameExam.equals("Enough")) {
	            	 double	numberEvaluate = Double.parseDouble(scanner.nextLine());
	                numberSume+=numberEvaluate;
	                countExam += 1;
	                sumEvaluate = numberSume/countExam;
	                nameLast = nameExam;            
	             if (numberEvaluate<=4) {
					badEvaluate +=1;
					if (badEvaluate==numberNotGoodEvaluate) {
						System.out.print("You need a break, "+ numberNotGoodEvaluate +" poor grades.");
						break;
					} 
				}
	             nameExam = scanner.nextLine();
	            }
	            if (nameExam.equals("Enough")) {
	                System.out.printf("Average score: %.2f \n",sumEvaluate);
	                System.out.printf("Number of problems: %.0f \n",countExam);
	                System.out.printf("Last problem: "+nameLast);
	            } 
	        } else {
	            System.out.print("Invalid parameter!");
	        }
	    }
	}

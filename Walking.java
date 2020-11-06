
/* 4.	Стъпки
Габи иска да започне здравословен начин на живот и си е поставила
 за цел да върви 10 000 стъпки всеки ден. Някои дни обаче е много 
 уморена от работа и ще иска да се прибере преди да постигне целта си.
  Напишете програма, която чете от конзолата по колко стъпки изминава 
  тя всеки път като излиза през деня и когато постигне целта си да се
изписва "Goal reached! Good job!"  и колко стъпки повече е извървяла 
"{разликата между стъпките} steps over the goal!".
Ако иска да се прибере преди това, тя ще въведе командата "Going home" 
и ще въведе стъпките, които е извървяла докато се прибира. След което, 
ако не е успяла да постигне целта си, на конзолата трябва да се изпише: 
"{разликата между стъпките} more steps to reach goal."
Примерен вход и изход
Вход	Изход	Вход	Изход
1000
1500
2000
6500
	Goal reached! Good job!
1000 steps over the goal!	1500
300
2500
3000
Going home
200	2500 more steps to reach goal.
Вход	Изход	Вход	Изход
1500
3000
250
1548
2000
Going home
2000	Goal reached! Good job!
298 steps over the goal!	125
250
4000
30
2678
4682	Goal reached! Good job!
1765 steps over the goal!

 * */
import java.util.Scanner;
public class Walking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int stepDay =0;
		int countStep=0;
		String stepWolkingDay = scanner.nextLine();			
		int stepDayAll =10000;
		int sumStep = 0 ;
		int homeStep=0;
		int homeGoStep=0;
		int lastStepDay= 0 ;
		boolean trueStep;
		boolean exitStep;
		boolean errorStepCount;
		int lastGoHomeStep =0;
		if (stepWolkingDay.equals("Going home")) {
			while (stepWolkingDay.equals("Going home")) {			
				 lastGoHomeStep = Integer.parseInt(scanner.nextLine());
				 if (lastGoHomeStep<=0) {
					errorStepCount=false;
					 break;
				 } else {
					if (lastGoHomeStep>10000 && lastGoHomeStep<20000) {
						homeGoStep=lastGoHomeStep-stepDayAll;
						System.out.println("Goal reached! Good job!\n" + homeGoStep + " steps over the goal!");
						break;
					} else {
						homeGoStep=stepDayAll-lastGoHomeStep;
						System.out.println( homeGoStep+ " more steps to reach goal.");
					}
				 break;		
				 }}
			} else {	
				stepDay = Integer.parseInt(stepWolkingDay);
			    countStep=+stepDay;			 
		while (!stepWolkingDay.equals("Going home")) {			
			trueStep=false;
			  if (stepDay<=0||countStep<0) {
			    	errorStepCount=true;
			    	break;
				} 
			stepWolkingDay = scanner.nextLine();
				if (stepWolkingDay.equals("Going home")) {
					int lastStep = Integer.parseInt(scanner.nextLine());
					lastStepDay=lastStep+countStep;
					if (lastStepDay>0 &&lastStepDay>=10000) {
						sumStep = lastStepDay-stepDayAll;
						exitStep=true;
						break;						
					}
					if (lastStepDay>0 &&lastStepDay<10000) {
						sumStep = stepDayAll-lastStepDay;
						exitStep=false;
						break;
					}
					  if (lastStep<0) {
					    	errorStepCount=true;
					   	break;
					}
				}
			stepDay = Integer.parseInt(stepWolkingDay);						
			countStep+=stepDay;
				if (stepDay>0 && countStep>=10000) {
					trueStep=true;
					break;
				}
			}
		}
		  		if (errorStepCount=true && lastStepDay<=0 && sumStep<=0 && stepDay<=0 && homeGoStep<0 || stepDay<=0 && sumStep<0  ) {
				System.out.println("Invalid parameter!");
			} 
			if (lastStepDay<10000&&lastStepDay>0) {			
				System.out.println( sumStep+ " more steps to reach goal.");
			}
			if (lastStepDay>=10000 && lastStepDay<100000) {
				System.out.println("Goal reached! Good job!\n" + sumStep + " steps over the goal!");
			}					
			if (trueStep=true && !stepWolkingDay.equals("Going home") && countStep>0) {
			sumStep=countStep-stepDayAll;
			System.out.println("Goal reached! Good job!\n" + sumStep + " steps over the goal!");
		}
	}
}

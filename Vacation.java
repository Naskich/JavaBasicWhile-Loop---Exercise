
/*3.	Почивка
Джеси е решила да събира пари за екскурзия и иска от вас да ѝ помогнете да разбере дали ще успее да събере необходимата сума. Тя спестява или харчи част от парите си всеки ден. Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
Вход
От конзолата се четат:
•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
•	Налични пари - реално число в интервала [0.00...25000.00]
След това многократно се четат по два реда:
•	Вид действие - текст с възможности "spend" и "save".
•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
Изход
Програмата трябва да приключи при следните случаи:
•	Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
o	"You can't save the money."
o	"{Общ брой изминали дни}"
•	Ако Джеси събере парите за почивката на конзолата се изписва:
o	"You saved the money for {общ брой изминали дни} days."
Примерен вход и изход
Вход	Изход	Обяснения
2000
1000
spend
1200
save
2000	You saved the money for 2 days.
	Пари, нужни за екскурзията: 2000
Налични пари: 1000
spend - изваждаме от парите следващото число
            (1000 - 1200 = -200, което е по-малко от 0 
               => налични пари = 0)
        ~ последователни дни, в които харчи = 1
        - общо дни : 1
save - добавяме към парите следващото число
           (0 + 2000 = 2000)
        ~ последователни дни, в които харчи = 0
        - общо дни : 2
Наличните пари (2000) >= Пари, нужни за екскурзията (2000)
 */
import java.util.Scanner;
public class Vacation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double moneyHoliday = Double.parseDouble(scanner.nextLine());
		if (moneyHoliday>=1.00 && moneyHoliday<=25000.00) {		
		Double moneyAvailability = Double.parseDouble(scanner.nextLine()); 
		if (moneyAvailability>=0.00 && moneyAvailability<=25000.00) {   
		String sumSpendSave;
		double midleSume=0;
		double finalSumeSpend=0;
		double finalSumeSave=0;
		double finalCount=0;
		double lastSpend=0;
		double lastSave=0;
		int daysHolidy=0;
		while (daysHolidy<5 && daysHolidy>=0) {	
			sumSpendSave = scanner.nextLine();		
			if ((!sumSpendSave.equals("save")) && (!sumSpendSave.equals("spend"))){
				System.out.println("Inavalid operation!");
				break;
			}					
			daysHolidy+=1;	
			if (sumSpendSave.equals("spend")) {
				 midleSume = Double.parseDouble(scanner.nextLine());
				 finalSumeSpend +=midleSume;
				 lastSpend = moneyAvailability-finalSumeSpend;
				 if (lastSpend<=0) {
					lastSpend=0;
				}
			} 
			if (sumSpendSave.equals("save")){
				 midleSume = Double.parseDouble(scanner.nextLine()); //100
				 finalSumeSave +=midleSume; //100
				 if (finalSumeSave<=0) {
					 moneyAvailability = lastSpend+finalSumeSave;			
					}
				 moneyAvailability =finalSumeSave+(moneyAvailability-finalSumeSpend) ;
			}
			
			if (moneyHoliday<=finalSumeSave || moneyAvailability>=moneyHoliday || finalSumeSave>=moneyHoliday ) {
				System.out.println("You saved the money for "+ daysHolidy +" days.");
				break;
			}	
			if (moneyHoliday>=finalCount && daysHolidy>=5) {
				System.out.println("You can't save the money.");
				System.out.println(daysHolidy);
				break;
			}
		}		
		}else {
			System.out.print("Inavalid parameter for money!");
		}
		} else {
			System.out.print("Inavalid parameter for money!");
		}		
	}
}

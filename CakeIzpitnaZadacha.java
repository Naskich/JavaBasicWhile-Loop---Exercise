
/*6. Торта - ИЗПИТНА ЗАДАЧА
Поканени сте на 30-ти рожден ден, на който рожденикът черпи 
с огромна торта. Той обаче не знае колко парчета могат да си вземат 
гостите от нея. Вашата задача е да напишете програма, която изчислява броя на парчетата,
 които гостите са взели, преди тя да свърши. Ще получите размерите на тортата в сантиметри
  (широчина и дължина – цели числа в интервала [1...1000]) и след това на всеки ред, до получаване
   на командата "STOP" или докато не свърши тортата, броят на парчетата, които гостите вземат от нея.
    Парчетата са квадратни с размер  1 см .
Да се отпечата на конзолата един от следните редове:
•	"{брой парчета} pieces are left." - ако стигнете до STOP и има останали парчета торта.
•	"No more cake left! You need {брой недостигащи парчета} pieces more."
Примерен вход и изход
Вход	Изход	Обяснения
10
10
20
20
20
20
21	No more cake left! You need 1 pieces more.	Тортата е с дължина 10 и широчина 10 
=> броят на парчетата = 10 * 10 = 100 
1-во вземане -> 100 - 20 = 80
2-ро вземане -> 80 - 20 = 60
3-то вземане -> 60 - 20 = 40
4-то вземане -> 40 - 20 = 20
5-то вземане -> 20 - 21 = -1 < 0
=> не остава повече торта, 1 парче не достига

10
2
2
4
6
STOP	8 pieces are left.	Тортата е с дължина 10 и широчина 2
=> броят на парчетата = 10 * 2 = 20 
1-во вземане -> 20 - 2 = 18
2-ро вземане -> 18 - 4 = 14
3-то вземане -> 14 - 6 = 8
4-то вземане -> команда STOP
=>останали парчета: 8


 * */
import java.util.Scanner;
public class CakeIzpitnaZadacha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dimensionCakeWidh = Integer.parseInt(scanner.nextLine());
		int dimensionCakeHLenght =  Integer.parseInt(scanner.nextLine());
		if (dimensionCakeHLenght<=0 || dimensionCakeWidh<=0 ) {
			System.out.println("Invalid parameter for Cake!");
		} else {
			int allSumCake=0;
			int lastNumberCake=0;
			boolean lastComandCake=false;
			boolean commandCake = false;
			int smallSum = 0;
			int dimensionCake = dimensionCakeHLenght*dimensionCakeWidh; // 50
			String numberCakeStop = scanner.nextLine();//5
			while(!numberCakeStop.contains("STOP")) {
				lastComandCake=false;
				int cakeNumber=Integer.parseInt(numberCakeStop); //5
				lastNumberCake+=cakeNumber;
				allSumCake = dimensionCake-lastNumberCake;
				if (dimensionCake<=lastNumberCake || lastNumberCake<=0) {
					smallSum = lastNumberCake-dimensionCake;
					commandCake=true;
					break;
				}
				numberCakeStop = scanner.nextLine();
				if (numberCakeStop.contains("STOP")) {
					lastComandCake=true;
					break;
				}	
			}
		if (lastComandCake) {
			System.out.println(allSumCake+" pieces are left.");
		}
		if (commandCake) {
			System.out.println("No more cake left! You need " + smallSum + " pieces more.");
			}			
		}
	}
}

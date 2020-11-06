
/*5.	Монети - ИЗПИТНА -WHILE
Производителите на вендинг машини искали да направят машините 
си да връщат възможно най-малко монети ресто. Напишете програма,
 която приема сума - рестото, което трябва да се върне и изчислява 
 с колко най-малко монети може да стане това. 
Примерен вход и изход
Вход	Изход	Обяснения
1.23	4	Рестото ни е 1 лев и 23 стотинки. Машината ни го връща с 4
 монети: монета от 1 лев, монета от 20 стотинки, монета от 2 стотинки и
  монета от 1 стотинка.
2	1	Рестото ни е 2 лева. Машината ни го връща с 1 монета от 2 лева.
0.56	3	Рестото ни е 56 стотинки. Машината ни го връща с 3 монети: 
монета от 50 стотинки, монета от 5 стотинки и монета от 1 стотинка.
2.73	5	Рестото ни е 2 лева и 73 стотинки. Машината ни го връща с 5 монети:
 монета от 2 лева, монета от 50 стотинки, монета от 20 стотинки, монета от 2 стотинки 
 и монета от 1 стотинка.
 * */
import java.util.Scanner;
public class CoinsIzpitnaZdacha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double coinsSum =  Double.parseDouble(scanner.nextLine());
		double changeCoinSum = coinsSum*100;
		int countCoins=0;
		if (coinsSum>0) {		
			while (changeCoinSum>0) {				
				if (changeCoinSum>=200) {
					changeCoinSum-=200;
					++countCoins;
				} else if (changeCoinSum>=100) {
					changeCoinSum-=100;
					++countCoins;
				} else if (changeCoinSum>=50) {
					changeCoinSum-=50;
					++countCoins;
				} else if (changeCoinSum>=20) {
					changeCoinSum-=20;
					++countCoins;
				} else if (changeCoinSum>=10) {
					changeCoinSum-=10;
					++countCoins;
				} else if (changeCoinSum>=5) {
					changeCoinSum-=5;
					++countCoins;
				} else if (changeCoinSum>=2) {
					changeCoinSum-=2;
					++countCoins;
				} else if (changeCoinSum>=1) {
					changeCoinSum-=2;
					++countCoins;
				}
			}
			System.out.print(countCoins);
		} else {
			System.out.print("Invalid parameter Sum Coin!");
		}
	}
}
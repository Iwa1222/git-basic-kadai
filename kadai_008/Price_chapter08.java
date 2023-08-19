package kadai_008;

import java.util.Scanner;

public class Price_chapter08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userAge = sc.nextInt();
		int nendai = (userAge/10) % 10;
		int serviceCost;
		sc.close();
		
		switch(nendai) {
		case 1:
			serviceCost = 1000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 2:
			serviceCost = 2000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 3:
			serviceCost = 3000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 4:
			serviceCost = 3000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 5:
			serviceCost = 4000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 6:
			serviceCost = 4000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 7:
			serviceCost = 4000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		case 8:
			serviceCost = 5000;
			System.out.println((nendai * 10) + "代の料金は" + serviceCost + "円");
			break;
		default:
			serviceCost = 500;
			System.out.println("料金は" + serviceCost + "円");
			break;
		}
		
	}

}

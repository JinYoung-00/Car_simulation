package car;

import java.util.Scanner;

public class GearChange implements gear{
	public int speed=0;
	public String gearchoice;
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("1. 1단|2. 2단|3. 3단|4. 4단|5. 5단|6. 6단|R(후진)");
		Scanner scanner =new Scanner(System.in);
		System.out.println(">>");
		gearchoice= scanner.next();
		switch(gearchoice) {
		case "1": 
			System.out.println("1단");
			speed=10;
			break;
		case "2":
			System.out.println("2단");
			speed=20;
			break;
		case "3":
			System.out.println("3단");
			speed=30;
			break;
		case "4":
			System.out.println("4단");
			speed=40;
			break;
		case "5":
			System.out.println("5단");
			speed=50;
			break;
		case "6":
			System.out.println("6단");
			speed=60;
			break;
		case "R":
		case "r":
			System.out.println("후진");
			break;
		default:
			System.out.println("정확한 값을 입력해주세요.");
		}
		
	}
	@Override
	public void speedshow() {
		try {
			if(gearchoice.equals("r")) {
				System.out.println("R상태입니다");
			}else if(gearchoice.equals("R")) {
				System.out.println("R상태입니다");
			}else {
				System.out.println("현재 속도: "+speed+"Km");
			}
		}catch(Exception e) {
			System.out.println("현재 속도: "+speed+"Km");
		}
	}
	
}

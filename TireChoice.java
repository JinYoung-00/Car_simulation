package car;

import java.util.Scanner;

public class TireChoice implements Tire{

	private String MechelinTire="미쉘린타이어";
	private String KumhoTire="금호타이어";
	private String HankookTire="한국타이어";
	private String ContinentalTire="콘티넨탈타이어";
	
	String FrontLeftTire=MechelinTire;
	String FrontRightTire=MechelinTire;
	String BackLeftTire=MechelinTire;
	String BackRightTire=MechelinTire;

	@Override
	public void Choice() {
		// TODO Auto-generated method stub
				
		Scanner scanner =new Scanner(System.in);
		System.out.println("어떤 타이어를 바꾸시겠습니까?");
		System.out.println("1.왼쪽 앞바퀴|2.오른쪽 앞바퀴|3.왼쪽 뒷바퀴|4.오른쪽 뒷바퀴");
		System.out.println(">>");
		int tirenum=scanner.nextInt();
		if(tirenum==1) {
			System.out.println("왼쪽 앞바퀴를 무슨 타이어로 교체하시겠습니까?");
			System.out.println("1.미쉐린|2.금호|3.한국|4.컨티넨탈");
			System.out.println(">>");
			int selecttire=scanner.nextInt();
			if(selecttire==1) {
				FrontLeftTire=MechelinTire;
			}else if(selecttire==2) {
				FrontLeftTire=KumhoTire;
			}else if(selecttire==3) {
				FrontLeftTire=HankookTire;
			}else if(selecttire==4) {
				FrontLeftTire=ContinentalTire;
			}else {
				System.out.println("정확한 값을 입력해주세요.");
			}
		}else if(tirenum==2) {
			System.out.println("오른쪽 앞바퀴를 무슨 타이어로 교체하시겠습니까?");
			System.out.println("1.미쉐린|2.금호|3.한국|4.컨티넨탈");
			System.out.println(">>");
			int selecttire=scanner.nextInt();
			if(selecttire==1) {
				FrontRightTire=MechelinTire;
			}else if(selecttire==2) {
				FrontRightTire=KumhoTire;
			}else if(selecttire==3) {
				FrontRightTire=HankookTire;
			}else if(selecttire==4) {
				FrontRightTire=ContinentalTire;
			}else {
				System.out.println("정확한 값을 입력해주세요.");
			}
		}else if(tirenum==3) {
			System.out.println("왼쪽 뒷바퀴를 무슨 타이어로 교체하시겠습니까?");
			System.out.println("1.미쉐린|2.금호|3.한국|4.컨티넨탈");
			System.out.println(">>");
			int selecttire=scanner.nextInt();
			if(selecttire==1) {
				BackLeftTire=MechelinTire;
			}else if(selecttire==2) {
				BackLeftTire=KumhoTire;
			}else if(selecttire==3) {
				BackLeftTire=HankookTire;
			}else if(selecttire==4) {
				BackLeftTire=ContinentalTire;
			}else {
				System.out.println("정확한 값을 입력해주세요.");
			}
		}else if(tirenum==4) {
			System.out.println("오른쪽 뒷바퀴를 무슨 타이어로 교체하시겠습니까?");
			System.out.println("1.미쉐린|2.금호|3.한국|4.컨티넨탈");
			System.out.println(">>");
			int selecttire=scanner.nextInt();
			if(selecttire==1) {
				BackRightTire=MechelinTire;
			}else if(selecttire==2) {
				BackRightTire=KumhoTire;
			}else if(selecttire==3) {
				BackRightTire=HankookTire;
			}else if(selecttire==4) {
				BackRightTire=ContinentalTire;
			}else {
				System.out.println("정확한 값을 입력해주세요.");
			}
		}else {
			System.out.println("정확한 값을 입력해주세요.");
		}
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("왼쪽앞바퀴 :"+FrontRightTire+"\n오른쪽앞바퀴: "+FrontLeftTire+"\n왼쪽뒷바퀴: "+BackLeftTire+"\n오른쪽뒷바퀴: "+BackRightTire);
	}
	
}

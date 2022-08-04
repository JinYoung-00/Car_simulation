package car;

import java.util.Scanner;

public class BlinkerControl implements Blinker{
	private String rightBlink = "꺼짐";
	private String leftBlink="꺼짐";
	private String EmerBlink="꺼짐";
	Scanner scanner =new Scanner(System.in);
	@Override
	public void blinkerOnoff() {
		// TODO Auto-generated method stub
		System.out.println("어떤 깜빡이를 조작하겠습니까?");
		System.out.println("1.왼쪽|2.오른쪽|3.비상깜빡이");
		System.out.println(">>");
		int blinkchoice = scanner.nextInt();
		if(blinkchoice==1) {
			if(leftBlink.equals("꺼짐")) {
				System.out.println("깜빡이를 키시겠습니까?");
				System.out.println("1.예|2.아니오");
				System.out.println(">>");
				int yesno = scanner.nextInt();
				if(yesno==1) {
					leftBlink="켜짐";
				}else if(yesno==2) {
					
				}else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			}else if(leftBlink.equals("켜짐")) {
				System.out.println("깜빡이를 끄시겠습니까?");
				System.out.println("1.예|2.아니오");
				System.out.println(">>");
				int yesno = scanner.nextInt();
				if(yesno==1) {
					leftBlink="꺼짐";
				}else if(yesno==2) {
					
				}else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			}
		}else if(blinkchoice==2) {
			if(rightBlink.equals("꺼짐")) {
				System.out.println("깜빡이를 키시겠습니까?");
				System.out.println("1.예|2.아니오");
				System.out.println(">>");
				int yesno = scanner.nextInt();
				if(yesno==1) {
					rightBlink="켜짐";
				}else if(yesno==2) {
					
				}else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			}else if(rightBlink.equals("켜짐")) {
				System.out.println("깜빡이를 끄시겠습니까?");
				System.out.println("1.예|2.아니오");
				System.out.println(">>");
				int yesno = scanner.nextInt();
				if(yesno==1) {
					rightBlink="꺼짐";
				}else if(yesno==2) {
					
				}else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			}
		}else if(blinkchoice==3) {
			if(EmerBlink.equals("꺼짐")) {
				System.out.println("깜빡이를 키시겠습니까?");
				System.out.println("1.예|2.아니오");
				System.out.println(">>");
				int yesno = scanner.nextInt();
				if(yesno==1) {
					EmerBlink="켜짐";
				}if(yesno==2) {
					
				}else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			}else if(EmerBlink.equals("켜짐")) {
				System.out.println("깜빡이를 끄시겠습니까?");
				System.out.println("1.예|2.아니오");
				System.out.println(">>");
				int yesno = scanner.nextInt();
				if(yesno==1) {
					EmerBlink="꺼짐";
				}else if(yesno==2) {
					
				}else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			}
		}else {
			System.out.println("정확한 값을 입력해주세요.");
		}
		
		
	}

	@Override
	public void blinkerstate() {
		// TODO Auto-generated method stub
		System.out.println("현재 깜빡이 상태:\n왼쪽 깜빡이 :"+leftBlink+"\n오른쪽 깜빡이: "+rightBlink+
				"\n비상깜빡이: "+EmerBlink);
	}

}

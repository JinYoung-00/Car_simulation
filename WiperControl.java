package car;

import java.util.Scanner;

public class WiperControl implements Wiper{
	boolean onoff=false;
	@Override
	public void wiperOnOff() {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		if(onoff==false) {
			System.out.println("와이퍼를 켜시겠습니까?");
			System.out.println("1.예|2.아니오");
			System.out.println(">>");
			int yesno=scanner.nextInt();
			if(yesno==1) {
				onoff=true;
				System.out.println("와이퍼가 켜졌습니다");
			}else if(yesno==2) {
			}else {
				System.out.println("정확한 값을 입력해주세요.");
			}
		}else if(onoff==true) {
			System.out.println("와이퍼를 끄시겠습니까?");
			System.out.println("1.예|2.아니오");
			System.out.println(">>");
			int yesno1=scanner.nextInt();
			if(yesno1==1) {
				onoff=false;
				System.out.println("와이퍼가 꺼졌습니다");
			}else if(yesno1==2) {
				
			}else {
				System.out.println("정확한 값을 입력해주세요.");
			}
		}
	}

	@Override
	public void wiperState() {
		// TODO Auto-generated method stub
		if(onoff==false) {
			System.out.println("와이퍼가 꺼져있습니다");
		}else if(onoff=true) {
			System.out.println("와이퍼가 켜져있습니다");
		}
	}

}

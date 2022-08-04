package car;

import java.util.Scanner;

public class WindowChoice implements window{
	private String FrontRightWindow="닫힘";
	private String FrontLeftWindow="닫힘";
	private String BackLeftWindow="닫힘";
	private String BackRightWindow="닫힘";
	String open="열림";
	String close="닫힘";
	@Override
	public void windowcontrol() {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("1. 창문 열기|2.창문 닫기");
		int openclose=scanner.nextInt();
		if(openclose==1) {
			System.out.println("어떤 창문을 여시겠습니까?");
			System.out.println("1.운전석|2.조수석|3.왼쪽 뒷창문|4.오른쪽 뒷창문");
			System.out.println(">>");
			int winnum=scanner.nextInt();
			switch(winnum) {
			case 1:
				FrontLeftWindow=open;
				System.out.println("운전석 창문을 엽니다.");
				break;
			case 2:
				FrontRightWindow=open;
				System.out.println("조수석 창문을 엽니다.");
				break;
			case 3:
				BackLeftWindow=open;
				System.out.println("왼쪽 뒷창문을 엽니다.");
				break;
			case 4:
				BackRightWindow=open;
				System.out.println("오른쪽 뒷창문을 엽니다.");
				break;
			}
		}else if(openclose==2){
			System.out.println("어떤 창문을 닫으시겠습니까?");
			System.out.println("1.운전석|2.조수석|3.왼쪽 뒷창문|4.오른쪽 뒷창문");
			System.out.println(">>");
			int winnum=scanner.nextInt();
			switch(winnum) {
			case 1:
				FrontLeftWindow=close;
				System.out.println("운전석 창문을 닫습니다.");
				break;
			case 2:
				FrontRightWindow=close;
				System.out.println("조수석 창문을 닫습니다.");
				break;
			case 3:
				BackLeftWindow=close;
				System.out.println("왼쪽 뒷창문을 닫습니다.");
				break;
			case 4:
				BackRightWindow=close;
				System.out.println("오른쪽 뒷창문을 닫습니다.");
				break;
			}
		}
		
		
	}

	@Override
	public void windowstate() {
		// TODO Auto-generated method stub
		System.out.println("창문 상태:\n운전석 창문: "+FrontLeftWindow+"\n조수석 창문: "+FrontRightWindow+
				"\n왼쪽 뒷창문: "+BackLeftWindow+"\n오른쪽 뒷창문: "+BackRightWindow);
		
	}
	
}

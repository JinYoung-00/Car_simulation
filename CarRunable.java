package car;

import java.util.Scanner;

public class CarRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time1=System.currentTimeMillis();
		GearChange gr = new GearChange();
		TireChoice tc= new TireChoice();
		WindowChoice wc=new WindowChoice();
		WiperControl wco=new WiperControl();
		BlinkerControl bc=new BlinkerControl();
		boolean run=true;
		System.out.println("자동차가 출발합니다 안전운전하세요.");
		Scanner scanner =new Scanner(System.in);
		while(run) {
			
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1.기어변속|2.현재속도|3.타이어교체|4.창문|5.와이퍼선택|6.깜빡이선택|7.현재상태|8.급브레이크|9.종료");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("선택>>");
			int num=scanner.nextInt();
			switch(num) {
			case 1:
				gr.change();
				break;
			case 2: 
				gr.speedshow();
				break;
			case 3:
				tc.Choice();
				break;
			case 4:
				wc.windowcontrol();
				break;
			case 5:
				wco.wiperOnOff();
				break;
			case 6:
				bc.blinkerOnoff();
				break;
			case 7:
				gr.speedshow();
				System.out.println("\n");
				tc.name();
				System.out.println("\n");
				wc.windowstate();
				System.out.println("\n");
				wco.wiperState();
				System.out.println("\n");
				bc.blinkerstate();
				break;
			case 8:
				gr.speed=0;
				System.out.println("급브레이크");
				break;
			case 9:
				run=false;
				break;
			default:
				System.out.println("잘못된 값을 선택하셨습니다. 다시 선택해주세요");
				break;
			}
			
		}
		double time2=System.currentTimeMillis();
		double time3=(time2-time1)*0.001;
		System.out.println("운행시간 :"+time3+"초");
		System.out.println("운행을 종료합니다. 안녕히계세요.");
	}

}

package Place;

public class Place_Shop extends Place{
	Weapon.Weapon_Stone weapon = new Weapon.Weapon_Stone(); //무기를 상점에 넣기 위해 무기 생성자 선언
	
	public void component() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(" _____  _   _  _____ ______ \r\n" + 
				"/  ___|| | | ||  _  || ___ \\\r\n" + 
				"\\ `--. | |_| || | | || |_/ /\r\n" + 
				" `--. \\|  _  || | | ||  __/ \r\n" + 
				"/\\__/ /| | | |\\ \\_/ /| |    \r\n" + 
				"\\____/ \\_| |_/ \\___/ \\_|    ");
		System.out.println();
		System.out.println();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.블루 스톤(체력)  -2,000원\n\n2.레드 스톤(공격력) -3,000원\n\n3.그린 스톤(방어력) -4,000원");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t\t\t\t\t⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("\t\t\t\t\t0.이전 화면으로 이동ψ");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
	public void blue() {
		weapon.blue_stone();
	}
	public void red() {
		weapon.red_stone();
	}
	public void green() {
		weapon.green_stone();
	}
	public void blue_information() {
		weapon.blue_information();
	}
	public void red_information() {
		weapon.red_information();
	}
	public void green_information() {
		weapon.green_information();
	}
	public void empty() {
		System.out.println(" _____                             _                       \r\n"
				+ "|_   _|                           | |                      \r\n"
				+ "  | |   _ __  __   __  ___  _ __  | |_   ___   _ __  _   _ \r\n"
				+ "  | |  | '_ \\ \\ \\ / / / _ \\| '_ \\ | __| / _ \\ | '__|| | | |\r\n"
				+ " _| |_ | | | | \\ V / |  __/| | | || |_ | (_) || |   | |_| |\r\n"
				+ " \\___/ |_| |_|  \\_/   \\___||_| |_| \\__| \\___/ |_|    \\__, |\r\n"
				+ "                                                      __/ |\r\n"
				+ "                                                     |___/ ");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("〓〓〓〓〓〓〓〓");
		System.out.println("장비가 없습니다.");
		System.out.println("〓〓〓〓〓〓〓〓");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("⇔⇔⇔⇔⇔");
		System.out.println("2.이전");	
		System.out.println("⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
}

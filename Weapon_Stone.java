package Weapon;

public class Weapon_Stone extends Weapon{
	public void blue_stone() { //블루 스톤의 대한 상세 정보와 구매할지 안할지 결정하는 구간
		this.attack=10;
		this.defense=1;
		this.hp=50;
		//this.speed_of_attack=20;
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
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("블루 스톤(체력) │ 가격:2,000원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+hp+"\n\n공격: "+attack+"\n\n방어력: "+defense);
		System.out.println();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매 X");	
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
	public void blue_information() { //블루 스톤의 정보이다. 인벤토리에서 블루스톤을 선택했을 경우 나오는 결과값이다.
		this.attack=10;
		this.defense=1;
		this.hp=50;
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
		System.out.println("블루 스톤(체력)");
		System.out.println("〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+hp+"\n\n공격: "+attack+"\n\n방어력: "+defense);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.착용 O     │     2.착용X");	
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
	
	public void red_stone() { //레드 스톤의 상세 정보와 구매할지 안할지 결정하는 구간
		this.attack=35;
		this.defense=1;
		this.hp=10;
		//this.speed_of_attack=20;
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
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("레드 스톤(공격력) │ 가격:3,000원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+hp+"\n\n공격: "+attack+"\n\n방어력: "+defense);
		System.out.println();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매 X");	
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
	public void red_information() { //레드 스톤의 정보이다. 인벤토리에서 레드 스톤을 선택했을 경우 나오는 결과값이다.
		this.attack=35;
		this.defense=1;
		this.hp=10;
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
		System.out.println("레드 스톤(공격력)");
		System.out.println("〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+hp+"\n\n공격: "+attack+"\n\n방어력: "+defense);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.착용 O     │     2.착용X");	
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
	
	public void green_stone() { //그린 스톤의 상세 정보와 구매할지 안할지 결정하는 구간
		this.attack=10;
		this.defense=5;
		this.hp=10;
		//this.speed_of_attack=20;
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
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("그린 스톤(방어력) │ 가격:4,000원");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("체력: "+hp+"\n\n공격: "+attack+"\n\n방어력: "+defense);
		System.out.println();
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.구매 O     │     2.구매 X");	
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
	public void green_information() { //그린 스톤의 정보이다. 인벤토리에서 블랙 스톤을 선택했을 경우 나오는 결과값이다.
		this.attack=10;
		this.defense=5;
		this.hp=10;
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
		System.out.println("그린 스톤(방어력)");
		System.out.println("〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+hp+"\n\n공격: "+attack+"\n\n방어력: "+defense);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.println("1.착용 O     │     2.착용X");	
		System.out.println("⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔⇔");
		System.out.print("입력: ");
	}
}

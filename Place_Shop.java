package Place;

public class Place_Shop extends Place{
	Weapon.Weapon_Stone weapon = new Weapon.Weapon_Stone(); //���⸦ ������ �ֱ� ���� ���� ������ ����
	
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
		System.out.println("������������������������������������");
		System.out.println("1.��� ����(ü��)  -2,000��\n\n2.���� ����(���ݷ�) -3,000��\n\n3.�׸� ����(����) -4,000��");
		System.out.println("������������������������������������");
		System.out.println("\t\t\t\t\t������������������������");
		System.out.println("\t\t\t\t\t0.���� ȭ������ �̵���");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.print("�Է�: ");
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
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("���������");
		System.out.println("��� �����ϴ�.");
		System.out.println("���������");
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("����������");
		System.out.println("2.����");	
		System.out.println("����������");
		System.out.print("�Է�: ");
	}
}

package Weapon;

public class Weapon_Stone extends Weapon{
	public void blue_stone() { //��� ������ ���� �� ������ �������� ������ �����ϴ� ����
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
		System.out.println("�����������������");
		System.out.println("��� ����(ü��) �� ����:2,000��");
		System.out.println("�����������������");
		System.out.println();
		System.out.println("ü��: "+hp+"\n\n����: "+attack+"\n\n����: "+defense);
		System.out.println();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.���� X");	
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}
	public void blue_information() { //��� ������ �����̴�. �κ��丮���� ��罺���� �������� ��� ������ ������̴�.
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
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("���������");
		System.out.println("��� ����(ü��)");
		System.out.println("���������");
		System.out.println();
		System.out.println("ü��: "+hp+"\n\n����: "+attack+"\n\n����: "+defense);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");	
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}
	
	public void red_stone() { //���� ������ �� ������ �������� ������ �����ϴ� ����
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
		System.out.println("������������������");
		System.out.println("���� ����(���ݷ�) �� ����:3,000��");
		System.out.println("������������������");
		System.out.println();
		System.out.println("ü��: "+hp+"\n\n����: "+attack+"\n\n����: "+defense);
		System.out.println();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.���� X");	
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}
	public void red_information() { //���� ������ �����̴�. �κ��丮���� ���� ������ �������� ��� ������ ������̴�.
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
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("���������");
		System.out.println("���� ����(���ݷ�)");
		System.out.println("���������");
		System.out.println();
		System.out.println("ü��: "+hp+"\n\n����: "+attack+"\n\n����: "+defense);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");	
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}
	
	public void green_stone() { //�׸� ������ �� ������ �������� ������ �����ϴ� ����
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
		System.out.println("������������������");
		System.out.println("�׸� ����(����) �� ����:4,000��");
		System.out.println("������������������");
		System.out.println("ü��: "+hp+"\n\n����: "+attack+"\n\n����: "+defense);
		System.out.println();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.���� X");	
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}
	public void green_information() { //�׸� ������ �����̴�. �κ��丮���� �� ������ �������� ��� ������ ������̴�.
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
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("���������");
		System.out.println("�׸� ����(����)");
		System.out.println("���������");
		System.out.println();
		System.out.println("ü��: "+hp+"\n\n����: "+attack+"\n\n����: "+defense);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");	
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}
}

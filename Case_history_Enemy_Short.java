package Case_History;

public class Case_history_Enemy_Short extends Case_history_Enemy{
	public int thief_hp=30;
	public int thief_attack=35;
	public int thief_defense=2;
	public void thief() {
		System.out.println("�����������");
		System.out.println("����");
		System.out.println("�����������");
		System.out.println();
		System.out.println("ü��: "+ thief_hp);
		System.out.println("���ݷ�: "+ thief_attack);
		System.out.println("����: "+ thief_defense);
	}
	public int goblin_hp=50;
	public int goblin_attack=10;
	public int goblin_defense=5;
	public void goblin() {
		System.out.println("�����������");
		System.out.println("���");
		System.out.println("�����������");
		System.out.println();
		System.out.println("ü��: "+ goblin_hp);
		System.out.println("���ݷ�: "+ goblin_attack);
		System.out.println("����: "+ goblin_defense);
	}
}

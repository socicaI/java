package Case_History;

public class Case_history_Enemy_Short extends Case_history_Enemy{
	public int thief_hp=30;
	public int thief_attack=35;
	public int thief_defense=2;
	public void thief() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("도적");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ thief_hp);
		System.out.println("공격력: "+ thief_attack);
		System.out.println("방어력: "+ thief_defense);
	}
	public int goblin_hp=50;
	public int goblin_attack=10;
	public int goblin_defense=5;
	public void goblin() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println("고블린");
		System.out.println("〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		System.out.println("체력: "+ goblin_hp);
		System.out.println("공격력: "+ goblin_attack);
		System.out.println("방어력: "+ goblin_defense);
	}
}

package Place;

import java.util.Scanner;

public class Place_base_Easy extends Place_Base implements Runnable {
	Scanner sc = new Scanner(System.in);
	Place_Shop shop = new Place_Shop();
	Case_History.Case_history_Friendly_Short charge1 = new Case_History.Case_history_Friendly_Short();
	Case_History.Case_history_Friendly_Long charge2 = new Case_History.Case_history_Friendly_Long();
	Case_History.Case_history_Enemy_Short e_charge1 = new Case_History.Case_history_Enemy_Short();
	Case_History.Case_history_Enemy_Long e_charge2 = new Case_History.Case_history_Enemy_Long();
	Case_History.Friendly fr = new Case_History.Friendly();

	String arr[] = new String[5];
	String arr2[] = new String[4];
	int arr5[] = new int[1];
	String arr6[] = new String[5];
	int stone = 0;
	int num;
	int sum;
	int sum1;
	public boolean t = true;

	int mutal_hp = 10;
	int mutal_attack = 30;
	int mutal_defense = 1;

	int hydra_hp = 10;
	int hydra_attack = 20;
	int hydra_defense = 1;

	int thief_hp = 30;
	int thief_attack = 35;
	int thief_defense = 2;

	int goblin_hp = 50;
	int goblin_attack = 10;
	int goblin_defense = 5;
	String a = "thief";
	String b = "goblin";
	String c = "mutal";
	String d = "hydra";
	int j;
	int i;
	int tanker_hp = 50;
	int tanker_attack = 10;
	int tanker_defense = 5;

	int nife_hp = 30;
	int nife_attack = 35;
	int nife_defense = 2;

	int rifle_hp = 10;
	int rifle_attack = 20;
	int rifle_defense = 1;

	int sniper_hp = 10;
	int sniper_attack = 30;
	int sniper_defense = 1;

	int tanker_hp_1 = tanker_hp;
	int tanker_hp_2 = tanker_hp;
	int tanker_hp_3 = tanker_hp;
	int tanker_hp_4 = tanker_hp;
	int tanker_hp_5 = tanker_hp;

	int nife_hp_1 = nife_hp;
	int nife_hp_2 = nife_hp;
	int nife_hp_3 = nife_hp;
	int nife_hp_4 = nife_hp;
	int nife_hp_5 = nife_hp;

	int rifle_hp_1 = rifle_hp;
	int rifle_hp_2 = rifle_hp;
	int rifle_hp_3 = rifle_hp;
	int rifle_hp_4 = rifle_hp;
	int rifle_hp_5 = rifle_hp;

	int sniper_hp_1 = sniper_hp;
	int sniper_hp_2 = sniper_hp;
	int sniper_hp_3 = sniper_hp;
	int sniper_hp_4 = sniper_hp;
	int sniper_hp_5 = sniper_hp;

	int hydra_hp_1 = hydra_hp;
	int goblin_hp_1 = goblin_hp;
	int mutal_hp_1 = mutal_hp;
	int thief_hp_1 = thief_hp;
	int p = 0;

	int o = 0;
	int oo = 0;
	int ooo = 0;
	int oooo = 0;
	int ooooo = 0;

	int z = 0;
	int zz = 0;
	int zzz = 0;
	int zzzz = 0;
	int zzzzz = 0;
	int yy=0;
	
	public void money() {
		int kk=(int)(Math.random() * 10);
		if(kk==7) {
			money+=1000;
		}
	}

	@Override // ������ ����
	public void run() {
		try {
			while (t == true) {
				if (hp1 <= 0) {
					this.defeat();
				} else if (hp2 <= 0) {
					this.win();
				}
				this.base();
				this.easy();
				Thread.sleep(1000);
				
				yy++;
				if(yy==2) {
				this.money();
				yy=0;
				}
				p++;
				if (p >= 3) { // 3�ʰ� �� ������ �������� ������ ������ ������ġ
					j = (int) (Math.random() * 4);// 1~4����
					i = (int) (Math.random() * 5);// 0~4������ �迭
					if (j == 0) {
						if (arr6[i] == "�� ����") {
							arr6[i] = a; // thief ��ȯ
							p = 0;
						}
					} else if (j == 1) {
						if (arr6[i] == "�� ����") {
							arr6[i] = b; // goblin ��ȯ
							p = 0;
						}
					} else if (j == 2) {
						if (arr6[i] == "�� ����") {
							arr6[i] = c;// mutal ��ȯ
							p = 0;
						}
					} else if (j == 3) {
						if (arr6[i] == "�� ����") {
							arr6[i] = d; // hydra ��ȯ
							p = 0;
						}
					}
				}
				this.off();
				if (arr1[0] != "�� ����") { // arr1[0]�� ������ ���� ���
					if (o == 2) { // o�� 2�̸� ����
						if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0] == "��Ŀ(G)" || arr1[0] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)"
								|| arr1[0] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= nife_attack;
							}
						} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)"
								|| arr1[0] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)"
								|| arr1[0] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0] == "��Ŀ(G)" || arr1[0] == "��Ŀ(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											money += 150;
											goblin_hp_1 = goblin_hp;;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											goblin_hp_2 = goblin_hp;;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							} // ���۳�
						}
						if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												money += 150;
												thief_hp_4 = thief_hp;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0] == "��Ŀ(G)" || arr1[0] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												money += 150;
												hydra_hp_4 = hydra_hp;;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (o != 2) {
						o++;
					} else if (o == 2) {
						o = 0;
					}
				} // arr6[0] ��
					// arr6[1] ����
				if (arr1[1] != "�� ����") { // arr6[1]�� ������ ���� ���
					if (oo == 2) { // oo�� 2�̸� ����
						if (arr1[1] == "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[1] == "  Į��" || arr1[1] == "Į��(R)" || arr1[1] == "Į��(G)"
								|| arr1[1] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= nife_attack;
							}
						} else if (arr1[1] == "���Ѻ�" || arr1[1] == "���Ѻ�(R)" || arr1[1] == "���Ѻ�(G)"
								|| arr1[1] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[1] == "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] == "���ݺ�(G)"
								|| arr1[1] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[1] == "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] == "��Ŀ(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											money += 150;
											thief_hp_1 = thief_hp;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "  Į��" || arr1[1] == "Į��(R)" || arr1[1] == "Į��(G)" || arr1[1] == "Į��(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											hydra_hp_2 = hydra_hp;;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								}
							} else if (arr6[j] == "thief") {
								if (j == 0) {
									thief_hp_1 -= nife_attack;
									thief_hp_1 += thief_defense;
									if (thief_hp_1 <= 0) {
										arr6[0] = "�� ����";
										thief_hp_1 = thief_hp;
										money += 150;
									}
								} else if (j == 1) {
									thief_hp_2 -= nife_attack;
									thief_hp_2 += thief_defense;
									if (thief_hp_2 <= 0) {
										arr6[1] = "�� ����";
										thief_hp_2 = thief_hp;
										money += 150;
									}
								}
							}
						}
						if (arr1[1] == "���Ѻ�" || arr1[1] == "���Ѻ�(R)" || arr1[1] == "���Ѻ�(G)" || arr1[1] == "���Ѻ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] == "���ݺ�(G)" || arr1[1] == "���ݺ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											thief_hp_2 = thief_hp;
										}
									}
								}
							}
							// ���۳�1
						}
						if (arr1[1] == "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] == "���ݺ�(G)" || arr1[1] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" || arr6[3] != "�� ����"
									|| arr6[4] != "�� ����") {
								j = (int) (Math.random() * 3) + 2;// 2~4����
								if (arr6[j] == "hydra") {
									if (j == 2) {
										hydra_hp_3 -= sniper_attack;
										hydra_hp_3 += hydra_defense;
										if (hydra_hp_3 <= 0) {
											arr6[2] = "�� ����";
											hydra_hp_3 = hydra_hp;;
											money += 150;
										}
									} else if (j == 3) {
										hydra_hp_4 -= sniper_attack;
										hydra_hp_4 += hydra_defense;
										if (hydra_hp_4 <= 0) {
											arr6[3] = "�� ����";
											money += 150;
											hydra_hp_4 = hydra_hp;;
										}
									} else if (j == 4) {
										hydra_hp_5 -= sniper_attack;
										hydra_hp_5 += hydra_defense;
										if (hydra_hp_5 <= 0) {
											arr6[4] = "�� ����";
											hydra_hp_5 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 2) {
										mutal_hp_3 -= sniper_attack;
										mutal_hp_3 += mutal_defense;
										if (mutal_hp_3 <= 0) {
											arr6[2] = "�� ����";
											mutal_hp_3 = mutal_hp;mutal_hp_3 = mutal_hp;
											money += 150;
										}
									} else if (j == 3) {
										mutal_hp_4 -= sniper_attack;
										mutal_hp_4 += mutal_defense;
										if (mutal_hp_4 <= 0) {
											arr6[3] = "�� ����";
											mutal_hp_4 = mutal_hp;
											money += 150;
										}
									} else if (j == 4) {
										mutal_hp_5 -= sniper_attack;
										mutal_hp_5 += mutal_defense;
										if (mutal_hp_5 <= 0) {
											mutal_hp_5 = mutal_hp;
											arr6[4] = "�� ����";
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 2) {
										goblin_hp_3 -= sniper_attack;
										goblin_hp_3 += goblin_defense;
										if (goblin_hp_3 <= 0) {
											arr6[2] = "�� ����";
											goblin_hp_3 = goblin_hp;;
											money += 150;
										}
									} else if (j == 3) {
										goblin_hp_4 -= sniper_attack;
										goblin_hp_4 += goblin_defense;
										if (goblin_hp_4 <= 0) {
											arr6[3] = "�� ����";
											goblin_hp_4 = goblin_hp;;
											money += 150;
										}
									} else if (j == 4) {
										goblin_hp_5 -= sniper_attack;
										goblin_hp_5 += goblin_defense;
										if (goblin_hp_5 <= 0) {
											arr6[4] = "�� ����";
											goblin_hp_5 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 2) {
										thief_hp_3 -= sniper_attack;
										thief_hp_3 += thief_defense;
										if (thief_hp_3 <= 0) {
											arr6[2] = "�� ����";
											money += 150;
											thief_hp_3 = thief_hp;
										}
									} else if (j == 3) {
										thief_hp_4 -= sniper_attack;
										thief_hp_4 += thief_defense;
										if (thief_hp_4 <= 0) {
											arr6[3] = "�� ����";
											thief_hp_4 = thief_hp;
											money += 150;
										}
									} else if (j == 4) {
										thief_hp_5 -= sniper_attack;
										thief_hp_5 += thief_defense;
										if (thief_hp_5 <= 0) {
											arr6[4] = "�� ����";
											thief_hp_5 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "���Ѻ�" || arr1[1] == "���Ѻ�(R)" || arr1[1] == "���Ѻ�(G)" || arr1[1] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" || arr6[3] != "�� ����"
									|| arr6[4] != "�� ����") {
								j = (int) (Math.random() * 3) + 2;// 2~4����
								if (arr6[j] == "hydra") {
									if (j == 2) {
										hydra_hp_3 -= rifle_attack;
										hydra_hp_3 += hydra_defense;
										if (hydra_hp_3 <= 0) {
											arr6[2] = "�� ����";
											hydra_hp_3 = hydra_hp;;
											money += 150;
										}
									} else if (j == 3) {
										hydra_hp_4 -= rifle_attack;
										hydra_hp_4 += hydra_defense;
										if (hydra_hp_4 <= 0) {
											arr6[3] = "�� ����";
											hydra_hp_4 = hydra_hp;;
											money += 150;
										}
									} else if (j == 4) {
										hydra_hp_5 -= rifle_attack;
										hydra_hp_5 += hydra_defense;
										if (hydra_hp_5 <= 0) {
											arr6[4] = "�� ����";
											hydra_hp_5 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 2) {
										mutal_hp_3 -= rifle_attack;
										mutal_hp_3 += mutal_defense;
										if (mutal_hp_3 <= 0) {
											arr6[2] = "�� ����";
											money += 150;
											mutal_hp_3 = mutal_hp;
										}
									} else if (j == 3) {
										mutal_hp_4 -= rifle_attack;
										mutal_hp_4 += mutal_defense;
										if (mutal_hp_4 <= 0) {
											arr6[3] = "�� ����";
											mutal_hp_4 = mutal_hp;
											money += 150;
										}
									} else if (j == 4) {
										mutal_hp_5 -= rifle_attack;
										mutal_hp_5 += mutal_defense;
										if (mutal_hp_5 <= 0) {
											arr6[4] = "�� ����";
											mutal_hp_5 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 2) {
										goblin_hp_3 -= rifle_attack;
										goblin_hp_3 += goblin_defense;
										if (goblin_hp_3 <= 0) {
											arr6[2] = "�� ����";
											goblin_hp_3 = goblin_hp;;
											money += 150;
										}
									} else if (j == 3) {
										goblin_hp_4 -= rifle_attack;
										goblin_hp_4 += goblin_defense;
										if (goblin_hp_4 <= 0) {
											arr6[3] = "�� ����";
											goblin_hp_4 = goblin_hp;;
											money += 150;
										}
									} else if (j == 4) {
										goblin_hp_5 -= rifle_attack;
										goblin_hp_5 += goblin_defense;
										if (goblin_hp_5 <= 0) {
											arr6[4] = "�� ����";
											goblin_hp_5 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 2) {
										thief_hp_3 -= rifle_attack;
										thief_hp_3 += thief_defense;
										if (thief_hp_3 <= 0) {
											arr6[2] = "�� ����";
											money += 150;
											thief_hp_3 = thief_hp;
										}
									} else if (j == 3) {
										thief_hp_4 -= rifle_attack;
										thief_hp_4 += thief_defense;
										if (thief_hp_4 <= 0) {
											arr6[3] = "�� ����";
											money += 150;
											thief_hp_4 = thief_hp;
										}
									} else if (j == 4) {
										thief_hp_5 -= rifle_attack;
										thief_hp_5 += thief_defense;
										if (thief_hp_5 <= 0) {
											arr6[4] = "�� ����";
											thief_hp_5 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[1] == "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
						if (arr1[1] == "  Į��" || arr1[1] == "Į��(R)" || arr1[1] == "Į��(G)" || arr1[1] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												thief_hp_5 = thief_hp;
											}
										}
									}
								}
							}
						}
					}
					if (oo != 2) {
						oo++;
					} else if (oo == 2) {
						oo = 0;
					}
				}
				// arr6[1]��
				// arr6[2]����
				if (arr1[2] != "�� ����") {
					if (ooo == 2) { // ooo�� 2�̸� ����
						if (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2] == "��Ŀ(G)" || arr1[2] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2] == "Į��(G)"
								|| arr1[2] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= nife_attack;
							}
						} else if (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2] == "���Ѻ�(G)"
								|| arr1[2] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2] == "���ݺ�(G)"
								|| arr1[2] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2] == "��Ŀ(G)" || arr1[2] == "��Ŀ(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											mutal_hp_2 = mutal_hp;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											money += 150;
											goblin_hp_1 = goblin_hp;;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2] == "Į��(G)" || arr1[2] == "Į��(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2] == "���Ѻ�(G)"
								|| arr1[2] == "���Ѻ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2] == "���ݺ�(G)"
								|| arr1[2] == "���ݺ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2] == "���ݺ�(G)" || arr1[2] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												money += 150;
												hydra_hp_4 = hydra_hp;;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												thief_hp_5 = thief_hp;
											}
										}
									}
								}
							}
						} else if (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2] == "���Ѻ�(G)"
								|| arr1[2] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												mutal_hp_5 = mutal_hp;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2] == "��Ŀ(G)"
								|| arr1[2] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2] == "Į��(G)"
								|| arr1[2] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												money += 150;
												goblin_hp_4 = goblin_hp;;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												thief_hp_5 = thief_hp;
												arr6[4] = "�� ����";
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (ooo != 2) {
						ooo++;
					} else if (ooo == 2) {
						ooo = 0;
					}
				}
				// arr6[2] ��
				if (arr1[3] != "�� ����") {
					if (oooo == 2) { // oooo�� 2�̸� ����
						if (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3] == "��Ŀ(G)" || arr1[3] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3] == "Į��(G)"
								|| arr1[3] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= nife_attack;
							}
						} else if (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3] == "���Ѻ�(G)"
								|| arr1[3] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3] == "���ݺ�(G)"
								|| arr1[3] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3] == "��Ŀ(G)" || arr1[3] == "��Ŀ(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											mutal_hp_2 = mutal_hp;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3] == "Į��(G)"
								|| arr1[3] == "Į��(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= nife_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											money += 150;
											goblin_hp_1 = goblin_hp;;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											thief_hp_2 = thief_hp;
										}
									}
								}
							}
						} else if (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3] == "���Ѻ�(G)"
								|| arr1[3] == "���Ѻ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											hydra_hp_2 = hydra_hp;;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3] == "���ݺ�(G)"
								|| arr1[3] == "���ݺ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											goblin_hp_2 = goblin_hp;
											arr6[1] = "�� ����";
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						}
						if (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3] == "���ݺ�(G)" || arr1[3] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												goblin_hp_5 = goblin_hp;;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												thief_hp_5 = thief_hp;
											}
										}
									}
								}
							}
						} else if (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3] == "���Ѻ�(G)"
								|| arr1[3] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												mutal_hp_5 = mutal_hp;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3] == "��Ŀ(G)"
								|| arr1[3] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												money += 150;
												mutal_hp_3 = mutal_hp;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3] == "Į��(G)"
								|| arr1[3] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												money += 150;
												goblin_hp_3 = goblin_hp;;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (oooo != 2) {
						oooo++;
					} else if (oooo == 2) {
						oooo = 0;
					}
				}
				// arr1[3] ��
				if (arr1[4] != "�� ����") {
					if (ooooo == 2) { // ooooo�� 2�̸� ����
						if (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4] == "��Ŀ(G)" || arr1[4] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= tanker_attack;
							}
						} else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4] == "Į��(G)"
								|| arr1[4] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= nife_attack;
							}
						} else if (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4] == "���Ѻ�(G)"
								|| arr1[4] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= rifle_attack;
							}
						} else if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4] == "���ݺ�(G)"
								|| arr1[4] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] == "�� ����"
									&& arr6[4] == "�� ����") {
								hp2 -= sniper_attack;
							}
						}
						if (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4] == "��Ŀ(G)" || arr1[4] == "��Ŀ(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= tanker_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= tanker_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= tanker_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											money += 150;
											mutal_hp_1 = mutal_hp;
										}
									} else if (j == 1) {
										mutal_hp_2 -= tanker_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= tanker_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= tanker_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= tanker_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= tanker_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4] == "Į��(G)"
								|| arr1[4] == "Į��(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= nife_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= nife_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= nife_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= mutal_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= nife_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= nife_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= nife_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= nife_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4] == "���Ѻ�(G)"
								|| arr1[4] == "���Ѻ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= rifle_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= rifle_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= rifle_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= rifle_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= rifle_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= rifle_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= rifle_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											thief_hp_1 = thief_hp;
											money += 150;
										}
									} else if (j == 1) {
										thief_hp_2 -= rifle_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											thief_hp_2 = thief_hp;
											money += 150;
										}
									}
								}
							}
						} else if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4] == "���ݺ�(G)"
								|| arr1[4] == "���ݺ�(B)") {
							if (arr6[0] != "�� ����" || arr6[1] != "�� ����") {
								j = (int) (Math.random() * 2);// 0~1����
								if (arr6[j] == "hydra") {
									if (j == 0) {
										hydra_hp_1 -= sniper_attack;
										hydra_hp_1 += hydra_defense;
										if (hydra_hp_1 <= 0) {
											arr6[0] = "�� ����";
											hydra_hp_1 = hydra_hp;
											money += 150;
										}
									} else if (j == 1) {
										hydra_hp_2 -= sniper_attack;
										hydra_hp_2 += hydra_defense;
										if (hydra_hp_2 <= 0) {
											arr6[1] = "�� ����";
											hydra_hp_2 = hydra_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "mutal") {
									if (j == 0) {
										mutal_hp_1 -= sniper_attack;
										mutal_hp_1 += mutal_defense;
										if (mutal_hp_1 <= 0) {
											arr6[0] = "�� ����";
											mutal_hp_1 = mutal_hp;
											money += 150;
										}
									} else if (j == 1) {
										mutal_hp_2 -= sniper_attack;
										mutal_hp_2 += mutal_defense;
										if (mutal_hp_2 <= 0) {
											arr6[1] = "�� ����";
											mutal_hp_2 = mutal_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "goblin") {
									if (j == 0) {
										goblin_hp_1 -= sniper_attack;
										goblin_hp_1 += goblin_defense;
										if (goblin_hp_1 <= 0) {
											arr6[0] = "�� ����";
											goblin_hp_1 = goblin_hp;
											money += 150;
										}
									} else if (j == 1) {
										goblin_hp_2 -= sniper_attack;
										goblin_hp_2 += goblin_defense;
										if (goblin_hp_2 <= 0) {
											arr6[1] = "�� ����";
											goblin_hp_2 = goblin_hp;
											money += 150;
										}
									}
								} else if (arr6[j] == "thief") {
									if (j == 0) {
										thief_hp_1 -= sniper_attack;
										thief_hp_1 += thief_defense;
										if (thief_hp_1 <= 0) {
											arr6[0] = "�� ����";
											money += 150;
											thief_hp_1 = thief_hp;
										}
									} else if (j == 1) {
										thief_hp_2 -= sniper_attack;
										thief_hp_2 += thief_defense;
										if (thief_hp_2 <= 0) {
											arr6[1] = "�� ����";
											money += 150;
											thief_hp_2 = thief_hp;thief_hp_2 = thief_hp;
										}
									}
								}
							}
						}
						if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4] == "���ݺ�(G)" || arr1[4] == "���ݺ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= sniper_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= sniper_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= sniper_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= sniper_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= sniper_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= sniper_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												money += 150;
												mutal_hp_5 = mutal_hp;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= sniper_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= sniper_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= sniper_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= sniper_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= sniper_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= sniper_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4] == "���Ѻ�(G)"
								|| arr1[4] == "���Ѻ�(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= rifle_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= rifle_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= rifle_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= rifle_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= rifle_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= rifle_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= rifle_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= rifle_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= rifle_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= rifle_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= rifle_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												money += 150;
												thief_hp_4 = thief_hp;
											}
										} else if (j == 4) {
											thief_hp_5 -= rifle_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4] == "��Ŀ(G)"
								|| arr1[4] == "��Ŀ(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= tanker_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= tanker_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= tanker_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;;
												money += 150;
											}	
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= tanker_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= tanker_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= tanker_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= tanker_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= tanker_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= tanker_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "thief") {
										if (j == 2) {
											thief_hp_3 -= tanker_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= tanker_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												thief_hp_4 = thief_hp;
												money += 150;
											}
										} else if (j == 4) {
											thief_hp_5 -= tanker_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												arr6[4] = "�� ����";
												thief_hp_5 = thief_hp;
												money += 150;
											}
										}
									}
								}
							}
						} else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4] == "Į��(G)"
								|| arr1[4] == "Į��(B)") {
							if (arr6[0] == "�� ����" && arr6[1] == "�� ����") {
								if (arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") {
									j = (int) (Math.random() * 3) + 2;// 2~4����
									if (arr6[j] == "hydra") {
										if (j == 2) {
											hydra_hp_3 -= nife_attack;
											hydra_hp_3 += hydra_defense;
											if (hydra_hp_3 <= 0) {
												arr6[2] = "�� ����";
												hydra_hp_3 = hydra_hp;;
												money += 150;
											}
										} else if (j == 3) {
											hydra_hp_4 -= nife_attack;
											hydra_hp_4 += hydra_defense;
											if (hydra_hp_4 <= 0) {
												arr6[3] = "�� ����";
												hydra_hp_4 = hydra_hp;;
												money += 150;
											}
										} else if (j == 4) {
											hydra_hp_5 -= nife_attack;
											hydra_hp_5 += hydra_defense;
											if (hydra_hp_5 <= 0) {
												arr6[4] = "�� ����";
												hydra_hp_5 = hydra_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "mutal") {
										if (j == 2) {
											mutal_hp_3 -= nife_attack;
											mutal_hp_3 += mutal_defense;
											if (mutal_hp_3 <= 0) {
												arr6[2] = "�� ����";
												mutal_hp_3 = mutal_hp;
												money += 150;
											}
										} else if (j == 3) {
											mutal_hp_4 -= nife_attack;
											mutal_hp_4 += mutal_defense;
											if (mutal_hp_4 <= 0) {
												arr6[3] = "�� ����";
												mutal_hp_4 = mutal_hp;
												money += 150;
											}
										} else if (j == 4) {
											mutal_hp_5 -= nife_attack;
											mutal_hp_5 += mutal_defense;
											if (mutal_hp_5 <= 0) {
												arr6[4] = "�� ����";
												mutal_hp_5 = mutal_hp;
												money += 150;
											}
										}
									} else if (arr6[j] == "goblin") {
										if (j == 2) {
											goblin_hp_3 -= nife_attack;
											goblin_hp_3 += goblin_defense;
											if (goblin_hp_3 <= 0) {
												arr6[2] = "�� ����";
												goblin_hp_3 = goblin_hp;;
												money += 150;
											}
										} else if (j == 3) {
											goblin_hp_4 -= nife_attack;
											goblin_hp_4 += goblin_defense;
											if (goblin_hp_4 <= 0) {
												arr6[3] = "�� ����";
												goblin_hp_4 = goblin_hp;
												money += 150;
											}
										} else if (j == 4) {
											goblin_hp_5 -= nife_attack;
											goblin_hp_5 += goblin_defense;
											if (goblin_hp_5 <= 0) {
												arr6[4] = "�� ����";
												goblin_hp_5 = goblin_hp;;
												money += 150;
											}
										}
									} else if (arr6[0] == "thief") {
										if (j == 2) {
											thief_hp_3 -= nife_attack;
											thief_hp_3 += thief_defense;
											if (thief_hp_3 <= 0) {
												arr6[2] = "�� ����";
												thief_hp_3 = thief_hp;
												money += 150;
											}
										} else if (j == 3) {
											thief_hp_4 -= nife_attack;
											thief_hp_4 += thief_defense;
											if (thief_hp_4 <= 0) {
												arr6[3] = "�� ����";
												money += 150;
												thief_hp_4 = thief_hp;
											}
										} else if (j == 4) {
											thief_hp_5 -= nife_attack;
											thief_hp_5 += thief_defense;
											if (thief_hp_5 <= 0) {
												thief_hp_5 = thief_hp;
												arr6[4] = "�� ����";
												money += 150;
											}
										}
									}
								}
							}
						}
					}
					if (ooooo != 2) {
						ooooo++;
					} else if (ooooo == 2) {
						ooooo = 0;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inven() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = "�� ����";
			}
		}
	}

	public void base() { // ���� �ʵ��� �Ʊ� ���� && ���� ����
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == null) {
				arr1[i] = "�� ����";
			}
		}
		for (int i = 0; i < arr6.length; i++) {
			if (arr6[i] == null) {
				arr6[i] = "�� ����";
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.print("  ...          .\t\t\t\t\t\t\t\t\t\t\t              ~==\n"
				+ " -==-        -:=;~       \t\t\t\t\t\t\t\t\t\t\t      ,,,,,,,,,,,,,,,,,,,,.:==-\n"
				+ " ~==        ~=~.,*!      \t\t\t\t\t\t\t\t\t\t\t      ====================::===\n"
				+ "=*!!-====*~**-;!*-!*~    \t\t[3�� ��ġ]\t\t\t\t\t\t\t[��:3�� ��ġ]\t      ====================::===\n"
				+ "=*::;===!;=~~*- ,;::*:-  \t\t " + arr1[2] + "\t\t[1�� ��ġ]\t\t      [��:1�� ��ġ]\t\t " + arr6[2]
				+ "\t\t      ====================**===\n" + "=======.**.=~     ,=--=~ \t ");
		this.arr_2();
		System.out.print("\t " + arr1[0] + "\t\t\t" + arr6[0] + "\t  ");
		this.enemy_3();
		System.out.print("\t      *========================\n" + "=====*~*:,;:       ,;*~!!\t\t\t ");
		this.arr_0();
		System.out.print("  ");
		this.enemy_1();
		System.out.print("\t\t\t      ,*=======================\n"
				+ "======,-!:  -;   .;- -;- \t\t[4�� ��ġ]\t\t\t     [VS]    \t\t\t[��:4�� ��ġ]\t      *--------------------,-=\n"
				+ "::~~~~~:;   ~=   .=:  -~ " + "\t\t " + arr1[3] + "\t\t[2�� ��ġ]\t\t      [��:2�� ��ġ]\t\t " + arr6[3]
				+ "\t\t      *  ~;-    ,;;.    ,:;, =\n" + "=;;;;;;;-   -!   .!~  -~ " + "\t ");
		this.arr_3();
		System.out.print("\t " + arr1[1] + "\t\t\t" + arr6[1] + "\t  ");
		this.enemy_4();
		System.out.print("\t      *  :=-    -==,    -!!, =\n" + "*           .,    ,.  -~ \t\t\t ");
		this.arr_1();
		System.out.print("   ");
		this.enemy_2();
		System.out.print("\t\t\t      *  ;=-    -==,    -!!, =\n" + "*                     -~ " + "\t\t[5�� ��ġ]"
				+ "\t\t\t\t\t\t\t[��:5�� ��ġ]\t      *  ,~.    .-~.    .--. *\n" + "* ,-----    ,~  .---, -~ " + "\t\t "
				+ arr1[4] + "\t\t\t\t\t\t\t " + arr6[4] + "  " + "\t\t      *                      *\n"
				+ "* ;====*    :=  ~===: ,- \t ");
		this.arr_4();
		System.out.print("\t\t\t\t\t  ");
		this.enemy_5();
		System.out.print("\t      *                      =\n" + "* ;====*    ~=    =:  ,-." + "\t\t\t"
				+ "\t\t\t\t\t\t\t\t      *-===== .!*==!* .=====.=\n" + "* ;====*    ,:    =:  ,- " + "\t\t "
				+ "\t\t\t\t\t\t\t\t\t      *-=====   -==,:  **===.1=\n"
				+ "=!======!*******!!=*;!!- \t\t\t\t\t\t\t\t\t\t\t      *-=====   -=*,: .=====.=\n");
	}

	public Place_base_Easy() { // ������ �������� ���� ������ �����̴�.
		money = 2000;
		hp1 = 100;
		hp2 = 100;
		available_troops1 = 0;
	}

	public void inventory() { // �κ��丮�� ����̴�. �������� ���⸦ �����ϸ� �κ��丮�� ������ �ȴ�.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = "�� ����";
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(" _____                             _                       \r\n"
				+ "|_   _|                           | |                      \r\n"
				+ "  | |   _ __  __   __  ___  _ __  | |_   ___   _ __  _   _ \r\n"
				+ "  | |  | '_ \\ \\ \\ / / / _ \\| '_ \\ | __| / _ \\ | '__|| | | |\r\n"
				+ " _| |_ | | | | \\ V / |  __/| | | || |_ | (_) || |   | |_| |\r\n"
				+ " \\___/ |_| |_|  \\_/   \\___||_| |_| \\__| \\___/ |_|    \\__, |\r\n"
				+ "                                                      __/ |\r\n"
				+ "                                                     |___/ ");
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("1." + arr[0]);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("2." + arr[1]);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("3." + arr[2]);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("4." + arr[3]);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("5." + arr[4]);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("\t\t\t\t\t������������������������");
		System.out.println("\t\t\t\t\t0.���� ȭ������ �̵���");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.print("�Է�: ");
	}

	public void if_ston1() { // �κ��丮���� �ִ� ���⿡ ���� Ư�� ������ ����ϱ� ���� ���ǹ��� ����ߴ�.
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[0] == "��� ����") {
			shop.blue_information();
		} else if (arr[0] == "���� ����") {
			shop.red_information();
		} else if (arr[0] == "�׸� ����") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston2() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[1] == "��� ����") {
			shop.blue_information();
		} else if (arr[1] == "���� ����") {
			shop.red_information();
		} else if (arr[1] == "�׸� ����") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston3() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[2] == "��� ����") {
			shop.blue_information();
		} else if (arr[2] == "���� ����") {
			shop.red_information();
		} else if (arr[2] == "�׸� ����") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston4() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[3] == "��� ����") {
			shop.blue_information();
		} else if (arr[3] == "���� ����") {
			shop.red_information();
		} else if (arr[3] == "�׸� ����") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	public void if_ston5() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		if (arr[4] == "��� ����") {
			shop.blue_information();
		} else if (arr[4] == "���� ����") {
			shop.red_information();
		} else if (arr[4] == "�׸� ����") {
			shop.green_information();
		} else {
			shop.empty();
		}
	}

	void enemy_1() {
		if (arr6[0] == "�� ����") {
			System.out.print("                    ");
		}
		if (arr6[0] == "mutal") {
			System.out.print("(hp:" + mutal_hp_1 + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[0] == "thief") {
			System.out.print("(hp:" + thief_hp_1 + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[0] == "goblin") {
			System.out.print("(hp:" + goblin_hp_1 + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[0] == "hydra") {
			System.out.print("(hp:" + hydra_hp_1 + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_2 = mutal_hp;
	public int thief_hp_2 = thief_hp;
	public int goblin_hp_2 = goblin_hp;
	public int hydra_hp_2 = hydra_hp;

	void enemy_2() {
		if (arr6[1] == "�� ����") {
			System.out.print("                    ");
		}
		if (arr6[1] == "mutal") {
			System.out.print("(hp:" + mutal_hp_2 + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[1] == "thief") {
			System.out.print("(hp:" + thief_hp_2 + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[1] == "goblin") {
			System.out.print("(hp:" + goblin_hp_2 + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[1] == "hydra") {
			System.out.print("(hp:" + hydra_hp_2 + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_3 = mutal_hp;
	public int thief_hp_3 = thief_hp;
	public int goblin_hp_3 = goblin_hp;
	public int hydra_hp_3 = hydra_hp;

	void enemy_3() {
		if (arr6[2] == "�� ����") {
			System.out.print("                    ");
		}
		if (arr6[2] == "mutal") {
			System.out.print("(hp:" + mutal_hp + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[2] == "thief") {
			System.out.print("(hp:" + thief_hp + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[2] == "goblin") {
			System.out.print("(hp:" + goblin_hp + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[2] == "hydra") {
			System.out.print("(hp:" + hydra_hp + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_4 = mutal_hp;
	public int thief_hp_4 = thief_hp;
	public int goblin_hp_4 = goblin_hp;
	public int hydra_hp_4 = hydra_hp;

	void enemy_4() {
		if (arr6[3] == "�� ����") {
			System.out.print("                    ");
		}
		if (arr6[3] == "mutal") {
			System.out.print("(hp:" + mutal_hp + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[3] == "thief") {
			System.out.print("(hp:" + thief_hp + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[3] == "goblin") {
			System.out.print("(hp:" + goblin_hp + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[3] == "hydra") {
			System.out.print("(hp:" + hydra_hp + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	public int mutal_hp_5 = mutal_hp;
	public int thief_hp_5 = thief_hp;
	public int goblin_hp_5 = goblin_hp;
	public int hydra_hp_5 = hydra_hp;

	void enemy_5() {
		if (arr6[4] == "�� ����") {
			System.out.print("                    ");
		}
		if (arr6[4] == "mutal") {
			System.out.print("(hp:" + mutal_hp + "/att:" + mutal_attack + "/def:" + mutal_defense + ")");
		} else if (arr6[4] == "thief") {
			System.out.print("(hp:" + thief_hp + "/att:" + thief_attack + "/def:" + thief_defense + ")");
		} else if (arr6[4] == "goblin") {
			System.out.print("(hp:" + goblin_hp + "/att:" + goblin_attack + "/def:" + goblin_defense + ")");
		} else if (arr6[4] == "hydra") {
			System.out.print("(hp:" + hydra_hp + "/att:" + hydra_attack + "/def:" + hydra_defense + ")");
		}
	}

	void arr_0() {
		if (arr1[0] == "�� ����") {
			System.out.print("                      ");
		}
		if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0] == "��Ŀ(G)" || arr1[0] == "��Ŀ(B)") {
			System.out.print("(hp:" + tanker_hp_1 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
			System.out.print("(hp:" + nife_hp_1 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
			System.out.print("(hp:" + rifle_hp_1 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
			System.out.print("(hp:" + sniper_hp_1 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_1() {
		if (arr1[1] == "�� ����") {
			System.out.print("                     ");
		}
		if (arr1[1] == "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] == "��Ŀ(B)") {
			System.out.print("(hp:" + tanker_hp_2 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[1] == "  Į��" || arr1[1] == "Į��(R)" || arr1[1] == "Į��(G)" || arr1[1] == "Į��(B)") {
			System.out.print("(hp:" + nife_hp_2 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[1] == "���Ѻ�" || arr1[1] == "���Ѻ�(R)" || arr1[1] == "���Ѻ�(G)" || arr1[1] == "���Ѻ�(B)") {
			System.out.print("(hp:" + rifle_hp_2 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[1] == "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] == "���ݺ�(G)" || arr1[1] == "���ݺ�(B)") {
			System.out.print("(hp:" + sniper_hp_2 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_2() {
		if (arr1[2] == "�� ����") {
			System.out.print("                      ");
		}
		if (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2] == "��Ŀ(G)" || arr1[2] == "��Ŀ(B)") {
			System.out.print("(hp:" + tanker_hp_3 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2] == "Į��(G)" || arr1[2] == "Į��(B)") {
			System.out.print("(hp:" + nife_hp_3 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2] == "���Ѻ�(G)" || arr1[2] == "���Ѻ�(B)") {
			System.out.print("(hp:" + rifle_hp_3 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2] == "���ݺ�(G)" || arr1[2] == "���ݺ�(B)") {
			System.out.print("(hp:" + sniper_hp_3 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_3() {
		if (arr1[3] == "�� ����") {
			System.out.print("                     ");
		}
		if (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3] == "��Ŀ(G)" || arr1[3] == "��Ŀ(B)") {
			System.out.print("(hp:" + tanker_hp_4 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3] == "Į��(G)" || arr1[3] == "Į��(B)") {
			System.out.print("(hp:" + nife_hp_4 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3] == "���Ѻ�(G)" || arr1[3] == "���Ѻ�(B)") {
			System.out.print("(hp:" + rifle_hp_4 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3] == "���ݺ�(G)" || arr1[3] == "���ݺ�(B)") {
			System.out.print("(hp:" + sniper_hp_4 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	void arr_4() {
		if (arr1[4] == "�� ����") {
			System.out.print("                     ");
		}
		if (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4] == "��Ŀ(G)" || arr1[4] == "��Ŀ(B)") {
			System.out.print("(hp:" + tanker_hp_5 + "/att:" + tanker_attack + "/def:" + tanker_defense + ")");
		} else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4] == "Į��(G)" || arr1[4] == "Į��(B)") {
			System.out.print("(hp:" + nife_hp_5 + "/att:" + nife_attack + "/def:" + nife_defense + ")");
		} else if (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4] == "���Ѻ�(G)" || arr1[4] == "���Ѻ�(B)") {
			System.out.print("(hp:" + rifle_hp_5 + "/att:" + rifle_attack + "/def:" + rifle_defense + ")");
		} else if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4] == "���ݺ�(G)" || arr1[4] == "���ݺ�(B)") {
			System.out.print("(hp:" + sniper_hp_5 + "/att:" + sniper_attack + "/def:" + sniper_defense + ")");
		}
	}

	public void buy_blue() { // ��� ������ �����ϰ� �� �� ������ �´ٸ� 2õ���� �����ϰ� ���Ÿ� �Ѵ�. ����, ���� ���� ��쿡�� ���Ű� ���� �ʴ´�.
		if (money > 1999) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("��� ������ �����ϼ̽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 2000;
			for (int i = 0; i < 5; i++) {
				if (arr[i] == "�� ����") {
					arr[i] = "��� ����";
					break;
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_red() { // ���� ������ �����ϰ� �� �� ������ �´ٸ� 3õ���� �����ϰ� ���Ÿ� �Ѵ�. ����, ���� ���� ��쿡�� ���Ű� ���� �ʴ´�.
		if (money > 2999) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� ������ �����ϼ̽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 3000;
			for (int i = 0; i < 5; i++) {
				if (arr[i] == "�� ����") {
					arr[i] = "���� ����";
					break;
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_green() { // �׸� ������ �����ϰ� �� �� ������ �´ٸ� 3õ���� �����ϰ� ���Ÿ� �Ѵ�. ����, ���� ���� ��쿡�� ���Ű� ���� �ʴ´�.
		if (money > 3999) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("�׸� ������ �����ϼ̽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 4000;
			for (int i = 0; i < 5; i++) {
				if (arr[i] == "�� ����") {
					arr[i] = "�׸� ����";
					break;
				}
			}
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void easy() { // ���� ���̵� ������ �������� ���� �Ʊ� ������ �����̴�.
		String bar = "��";
		System.out.println();
		System.out.println("HP:" + hp1);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t       HP:" + hp2);
		for (int i = 1; i <= hp1; i += 5) {
			System.out.print(bar);
		}
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t       ");
		for (int i = 1; i <= hp2; i += 5) {
			System.out.print(bar);
		}
		System.out.println();
		System.out
				.println("Money:" + money + "��" + "\t\t\t\t\t\t\t\t\t\t\t\t\t" /* �α� ��:" + available_troops2 + "/5" */);
		System.out.println("�α� ��:" + available_troops1 + "/5");
		System.out.println(
				"����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("\t\t\t\t\t1.���� ��ġ            2.����            3.�κ��丮       ");
		System.out.println(
				"����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.print("�Է�: ");
	}

	public String arr1[] = new String[5];

	public void character() {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == null) {
				arr1[i] = "�� ����";
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(" _   _         _  _             ___              \r\n"
				+ "| | | |       (_)| |           / _ \\             \r\n"
				+ "| | | | _ __   _ | |_         / /_\\ \\ _ __  _ __ \r\n"
				+ "| | | || '_ \\ | || __|        |  _  || '__|| '__|\r\n"
				+ "| |_| || | | || || |_         | | | || |   | |   \r\n"
				+ " \\___/ |_| |_||_| \\__|        \\_| |_/|_|   |_|   \r\n"
				+ "                       ______                    \r\n"
				+ "                      |______|               ");
		System.out.println();
		System.out.println();
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("1." + arr1[0]);
		System.out.println("������������������������������������");
		System.out.println("2." + arr1[1]);
		System.out.println("������������������������������������");
		System.out.println("3." + arr1[2]);
		System.out.println("������������������������������������");
		System.out.println("4." + arr1[3]);
		System.out.println("������������������������������������");
		System.out.println("5." + arr1[4]);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("\t\t\t\t\t������������������������");
		System.out.println("\t\t\t\t\t0.���� ȭ������ �̵���");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.print("�Է�: ");
	}

	public void tanker1() { // ��Ŀ�� ���� ������ ���ſ���
		charge1.tanker();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}

	public void nife1() { // Į���� ���� ������ ���ſ���
		charge1.nife();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}

	public void sniper1() { // ���ݺ��� ���� ������ ���ſ���
		charge2.sniper();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}

	public void rifle1() { // ���Ѻ��� ���� ������ ���ſ���
		charge2.rifle();
		System.out.println("������������������������������������");
		System.out.println("1.���� O     ��     2.����X");
		System.out.println("������������������������������������");
		System.out.print("�Է�: ");
	}

	public void buy_tanker1() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[0] == "�� ����") {
				available_troops1++;
			}
			arr1[0] = "  ��Ŀ";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_tanker2() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[1] == "�� ����") {
				available_troops1++;
			}
			arr1[1] = "  ��Ŀ";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_tanker3() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[2] == "�� ����") {
				available_troops1++;
			}
			arr1[2] = "  ��Ŀ";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_tanker4() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[3] == "�� ����") {
				available_troops1++;
			}
			arr1[3] = "  ��Ŀ";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_tanker5() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[4] == "�� ����") {
				available_troops1++;
			}
			arr1[4] = "  ��Ŀ";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_nife1() {
		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[0] == "�� ����") {
				available_troops1++;
			}
			arr1[0] = "  Į��";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}

	}

	public void buy_nife2() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[1] == "�� ����") {
				available_troops1++;
			}
			arr1[1] = "  Į��";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_nife3() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[2] == "�� ����") {
				available_troops1++;
			}
			arr1[2] = "  Į��";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_nife4() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[3] == "�� ����") {
				available_troops1++;
			}
			arr1[3] = "  Į��";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_nife5() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[4] == "�� ����") {
				available_troops1++;
			}
			arr1[4] = "  Į��";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_rifle1() {
		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[0] == "�� ����") {
				available_troops1++;
			}
			arr1[0] = "���Ѻ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_rifle2() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[1] == "�� ����") {
				available_troops1++;
			}
			arr1[1] = "���Ѻ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_rifle3() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[2] == "�� ����") {
				available_troops1++;
			}
			arr1[2] = "���Ѻ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_rifle4() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[3] == "�� ����") {
				available_troops1++;
			}
			arr1[3] = "���Ѻ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_rifle5() {

		if (money > 399) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 400;
			if (arr1[4] == "�� ����") {
				available_troops1++;
			}
			arr1[4] = "���Ѻ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_sniper1() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[0] == "�� ����") {
				available_troops1++;
			}
			arr1[0] = "���ݺ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_sniper2() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[1] == "�� ����") {
				available_troops1++;
			}
			arr1[1] = "���ݺ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_sniper3() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[2] == "�� ����") {
				available_troops1++;
			}
			arr1[2] = "���ݺ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_sniper4() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[3] == "�� ����") {
				available_troops1++;
			}
			arr1[3] = "���ݺ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void buy_sniper5() {
		if (money > 499) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
			money -= 500;
			if (arr1[4] == "�� ����") {
				available_troops1++;
			}
			arr1[4] = "���ݺ�";
		} else {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� �����մϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
	}

	public void war() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println(
				"______                   _                ______                       _    _              \r\n"
						+ "| ___ \\                 | |               |  ___|                     | |  | |             \r\n"
						+ "| |_/ /  ___   __ _   __| | _   _         | |_     ___   _ __         | |  | |  __ _  _ __ \r\n"
						+ "|    /  / _ \\ / _` | / _` || | | |        |  _|   / _ \\ | '__|        | |/\\| | / _` || '__|\r\n"
						+ "| |\\ \\ |  __/| (_| || (_| || |_| |        | |    | (_) || |           \\  /\\  /| (_| || |   \r\n"
						+ "\\_| \\_| \\___| \\__,_| \\__,_| \\__, |        \\_|     \\___/ |_|            \\/  \\/  \\__,_||_|   \r\n"
						+ "                             __/ | ______                      ______                      \r\n"
						+ "                            |___/ |______|                    |______|                     ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(
				"�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("\t[5�� ��ġ]\t\t\t[4�� ��ġ]\t\t\t[3�� ��ġ]\t\t\t[2�� ��ġ]\t\t\t[1�� ��ġ]");
		System.out.println(
				"������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("\t   " + arr1[4] + "\t\t\t   " + arr1[3] + "\t\t\t   " + arr1[2] + "\t\t\t   " + arr1[1]
				+ "\t\t\t   " + arr1[0]);
		System.out.println(
				"�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println();
		System.out.println("\t\t\t\t\t            �������Ͻðڽ��ϱ�?��");
		System.out.println("\t\t\t\t\t               ������������������������������������");
		System.out.println("\t\t\t\t\t        1.���� | 2.���� ȭ������ �̵�");
		System.out.println(
				"������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.print("�Է�: ");
	}

	String arr3[] = new String[1];
	int arr4[] = new int[1];

	public void arr2() { // ������ ������ �ϰ� �Ǹ� �������� ���� ������ ��ȯ�ϱ� ���� �迭�� �ִ´�.
		int a = (int) (Math.random() * 4);
		if (a == 0) {
			arr3[0] = "����";
			arr4[0] = 30;
			arr5[0] = 1000;
			System.out.println("������ ��ȯ�߽��ϴ�\n");
			e_charge1.thief();
		} else if (a == 1) {
			arr3[0] = "���";
			arr4[0] = 40;
			arr5[0] = 1500;
			System.out.println("����� ��ȯ�߽��ϴ�\n");
			e_charge1.goblin();
		} else if (a == 2) {
			arr3[0] = "��Ż";
			arr4[0] = 50;
			arr5[0] = 1700;
			System.out.println("��Ż�� ��ȯ�߽��ϴ�\n");
			e_charge2.mutal();
		} else {
			arr3[0] = "�����";
			arr4[0] = 40;
			arr5[0] = 2000;
			System.out.println("����� ��ȯ�߽��ϴ�\n");
			e_charge2.hydra();
		}
	}

	/*
	 * int thief_hp = 350; int mutal_hp = 150; int goblin_hp = 250; int hydra_hp =
	 * 230; int hp5;
	 */

	public void thief_c() {
		// int attack = 30;
		// int defense = 1;
		int hp = thief_hp + sum;
		if (hp < 0) {
			hp = 0;
		}
		/*
		 * hp5 = hp; System.out.println("�����������"); System.out.println("����");
		 * System.out.println("�����������"); System.out.println();
		 * System.out.println("ü��: " + hp5); System.out.println("���ݷ�: " + attack);
		 * System.out.println("����: " + defense);
		 */
	}

	/*
	 * public void mutal_c() { int attack = 50; int defense = 2; int hp = mutal_hp +
	 * sum; if (hp < 0) { hp = 0; }
	 */
	/* hp5 = hp; */
	/*
	 * System.out.println("�����������"); System.out.println("��Ż");
	 * System.out.println("�����������"); System.out.println();
	 * System.out.println("ü��: " + hp5); System.out.println("���ݷ�: " + attack);
	 * System.out.println("����: " + defense); }
	 */

	/*
	 * public void goblin_c() { int attack = 40; int defense = 3; int hp = goblin_hp
	 * + sum; if (hp < 0) { hp = 0; } hp5 = hp; System.out.println("�����������");
	 * System.out.println("���"); System.out.println("�����������");
	 * System.out.println(); System.out.println("ü��: " + hp5);
	 * System.out.println("���ݷ�: " + attack); System.out.println("����: " + defense);
	 * }
	 */

	public void hydra_c() {
		int attack = 40;
		int defense = 2;
		int hp = hydra_hp + sum;
		if (hp < 0) {
			hp = 0;
		}
		/* hp5 = hp; */
		System.out.println("�����������");
		System.out.println("�����");
		System.out.println("�����������");
		System.out.println();
		/* System.out.println("ü��: " + hp5); */
		System.out.println("���ݷ�: " + attack);
		System.out.println("����: " + defense);
	}

	public void tanker_c() {
		System.out.println("�����������");
		System.out.println("��Ŀ");
		System.out.println("�����������");
		System.out.println();
		System.out.println("ü��: " + tanker_hp);
		System.out.println("���ݷ�: " + tanker_attack);
		System.out.println("����: " + tanker_defense);
	}

	public void nife_c() {
		System.out.println("�����������");
		System.out.println("Į��");
		System.out.println("�����������");
		System.out.println();
		System.out.println("ü��: " + nife_hp);
		System.out.println("���ݷ�: " + nife_attack);
		System.out.println("����: " + nife_defense);
	}

	public void rifle_c() {
		System.out.println("�����������");
		System.out.println("���Ѻ�");
		System.out.println("�����������");
		System.out.println();
		System.out.println("ü��: " + rifle_hp);
		System.out.println("���ݷ�: " + rifle_attack);
		System.out.println("����: " + rifle_defense);
	}

	public void sniper_c() {
		System.out.println("�����������");
		System.out.println("���ݺ�");
		System.out.println("�����������");
		System.out.println();
		System.out.println("ü��: " + sniper_hp);
		System.out.println("���ݷ�: " + sniper_attack);
		System.out.println("����: " + sniper_defense);
	}

	public void battle() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("  #####      ##    ######   ######    ##       ##### \r\n"
				+ "   ## ##     ###      ##       ##      ##       ##    \r\n"
				+ "  ##  ##    ## ##     ##       ##      ##       ##    \r\n"
				+ " #####     ##  ##     ##       ##     ##       ####   \r\n"
				+ " ##  ##   #######    ##       ##      ##       ##     \r\n"
				+ "##  ##    ##   ##    ##       ##      ##       ##     \r\n"
				+ "#####     ##   ##    ##       ##      #####    #####  ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("���� ");
		this.arr2();
		System.out.println();
		System.out.println("������������������������������������������");
		System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
		System.out.println("������������������������������������������");
		System.out.print("�Է�: ");
	}

	public void battle1() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		System.out.println("  #####      ##    ######   ######    ##       ##### \r\n"
				+ "   ## ##     ###      ##       ##      ##       ##    \r\n"
				+ "  ##  ##    ## ##     ##       ##      ##       ##    \r\n"
				+ " #####     ##  ##     ##       ##     ##       ####   \r\n"
				+ " ##  ##   #######    ##       ##      ##       ##     \r\n"
				+ "##  ##    ##   ##    ##       ##      ##       ##     \r\n"
				+ "#####     ##   ##    ##       ##      #####    #####  ");
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != "�� ����") {
				System.out.println(arr1[i] + "��(��) ������ �߽��ϴ�.");
				if (arr1[i] == "  ��Ŀ") {
					System.out.println("   =>" + arr3[0] + "���� 10�� �������� �־����ϴ�.");
					sum -= 10;
					System.out.println();
					System.out.println();
				} else if (arr1[i] == "  Į��") {
					System.out.println("   =>" + arr3[0] + "���� 35�� �������� �־����ϴ�.");
					sum -= 35;
					System.out.println();
					System.out.println();
				} else if (arr1[i] == "���ݺ�") {
					System.out.println("   =>" + arr3[0] + "���� 30�� �������� �־����ϴ�.");
					sum -= 30;
					System.out.println();
					System.out.println();
				} else if (arr1[i] == "���Ѻ�") {
					System.out.println("   =>" + arr3[0] + "���� 20�� �������� �־����ϴ�.");
					sum -= 20;
					System.out.println();
					System.out.println();
				}
			}
		}
		if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����" && arr1[3] == "�� ����" && arr1[4] == "�� ����") {
			System.out.println("�������� ������ �� �ִ� ������ �����ϴ�...");
		}
		System.out.println();
		System.out.println("������������������������������������������");
		System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
		System.out.println("������������������������������������������");
		System.out.print("�Է�: ");
	}

	/*
	 * public void battle2() { for (int i = 0; i < 100; i++) { System.out.println();
	 * } System.out.
	 * println("  #####      ##    ######   ######    ##       ##### \r\n" +
	 * "   ## ##     ###      ##       ##      ##       ##    \r\n" +
	 * "  ##  ##    ## ##     ##       ##      ##       ##    \r\n" +
	 * " #####     ##  ##     ##       ##     ##       ####   \r\n" +
	 * " ##  ##   #######    ##       ##      ##       ##     \r\n" +
	 * "##  ##    ##   ##    ##       ##      ##       ##     \r\n" +
	 * "#####     ##   ##    ##       ##      #####    #####  ");
	 * System.out.println(); System.out.println(); System.out.println();
	 */
	/*
	 * if (arr3[0] == "����") { this.thief_c(); } else if (arr3[0] == "���") {
	 * this.goblin_c(); } else if (arr3[0] == "��Ż") { this.mutal_c(); } else {
	 * this.hydra_c(); } System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); }
	 */

	/*
	 * public void battle3() { for (int i = 0; i < 100; i++) { System.out.println();
	 * } System.out.
	 * println("  #####      ##    ######   ######    ##       ##### \r\n" +
	 * "   ## ##     ###      ##       ##      ##       ##    \r\n" +
	 * "  ##  ##    ## ##     ##       ##      ##       ##    \r\n" +
	 * " #####     ##  ##     ##       ##     ##       ####   \r\n" +
	 * " ##  ##   #######    ##       ##      ##       ##     \r\n" +
	 * "##  ##    ##   ##    ##       ##      ##       ##     \r\n" +
	 * "#####     ##   ##    ##       ##      #####    #####  ");
	 * System.out.println(); System.out.println(); System.out.println();
	 */
	/*
	 * if (hp5 < 1) { System.out.println(arr3[0] + "��(��) �׾����ϴ�.\n�Ʊ��� �� ������ �����մϴ�.");
	 * System.out.println(arr3[0] + "���׿���  " + arr5[0] + "���� ������ϴ�."); money +=
	 * arr5[0]; System.out.println(); System.out.println(); for (int i = 0; i <
	 * arr1.length; i++) { if (arr1[i] != "�� ����") { System.out.println(arr1[i] +
	 * "�� ������ �߽��ϴ�."); if (arr1[i] == "  ��Ŀ") {
	 * System.out.println("   =>10�� �������� �־����ϴ�."); hp2 -= 10; System.out.println();
	 * System.out.println(); } else if (arr1[i] == "  Į��") {
	 * System.out.println("   =>35�� �������� �־����ϴ�."); hp2 -= 35; System.out.println();
	 * System.out.println(); } else if (arr1[i] == "���ݺ�") {
	 * System.out.println("   =>30�� �������� �־����ϴ�."); hp2 -= 30; System.out.println();
	 * System.out.println(); } else if (arr1[i] == "���Ѻ�") {
	 * System.out.println("   =>20�� �������� �־����ϴ�."); hp2 -= 20; System.out.println();
	 * System.out.println(); } } } System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0; } else { // ��� ������ ���� �ʾ��� ���, ���� ������ System.out.println(arr3[0] +
	 * "��(��) �����մϴ�."); System.out.println(); System.out.println(); for (int i = 0; i
	 * < arr1.length; i++) { if (arr1[i] != "�� ����") { if (arr1[i] == "  ��Ŀ") { int j
	 * = i + 1; System.out.println("   =>" + j + "�� " + "��Ŀ���� " + arr4[0] +
	 * "�� �������� �־����ϴ�."); tanker_hp -= arr4[0]; if (tanker_hp < 1) {
	 * System.out.println(j + "�� " + "��Ŀ�� " + arr4[0] + "�����߽��ϴ�."); arr1[i] =
	 * "�� ����"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0; if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����" && arr1[3]
	 * == "�� ����" && arr1[4] == "�� ����") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("�ʵ忡 �����ϴ� ������ �����ϴ�.");
	 * System.out.println("�Ʊ� ������ �����մϴ�!!!!!"); System.out.println();
	 * System.out.println("���� �������� ���� �Ʊ��� ���� ���� " + arr4[0] + "��(��) �Ծ����ϴ�."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n�й��ϼ̽��ϴ�."); System.exit(0); } } break; } else if
	 * (arr1[i] == "  Į��") { int j = i + 1; System.out.println("   =>" + j + "�� " +
	 * "Į������ " + arr4[0] + "�� �������� �־����ϴ�."); nife_hp -= arr4[0]; if (nife_hp < 1) {
	 * System.out.println(j + "�� " + "Į���� " + arr4[0] + "�����߽��ϴ�."); arr1[i] =
	 * "�� ����"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0; if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����" && arr1[3]
	 * == "�� ����" && arr1[4] == "�� ����") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("�ʵ忡 �����ϴ� ������ �����ϴ�.");
	 * System.out.println("�Ʊ� ������ �����մϴ�!!!!!"); System.out.println();
	 * System.out.println("���� �������� ���� �Ʊ��� ���� ���� " + arr4[0] + "��(��) �Ծ����ϴ�."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n�й��ϼ̽��ϴ�."); System.exit(0); } } break; } else if
	 * (arr1[i] == "���ݺ�") { int j = i + 1; System.out.println("   =>" + j + "�� " +
	 * "���ݺ����� " + arr4[0] + "�� �������� �־����ϴ�."); sniper_hp -= arr4[0]; if (sniper_hp <
	 * 1) { System.out.println(j + "�� " + "���ݺ��� " + arr4[0] + "�����߽��ϴ�."); arr1[i] =
	 * "�� ����"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0; if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����" && arr1[3]
	 * == "�� ����" && arr1[4] == "�� ����") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("�ʵ忡 �����ϴ� ������ �����ϴ�.");
	 * System.out.println("�Ʊ� ������ �����մϴ�!!!!!"); System.out.println();
	 * System.out.println("���� �������� ���� �Ʊ��� ���� ���� " + arr4[0] + "��(��) �Ծ����ϴ�."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n�й��ϼ̽��ϴ�."); System.exit(0); } } break; } else if
	 * (arr1[i] == "���Ѻ�") { int j = i + 1; System.out.println("   =>" + j + "�� " +
	 * "���Ѻ����� " + arr4[0] + "�� �������� �־����ϴ�."); rifle_hp -= arr4[0]; if (rifle_hp < 1)
	 * { System.out.println(j + "�� " + "���Ѻ��� " + arr4[0] + "�����߽��ϴ�."); arr1[i] =
	 * "�� ����"; available_troops1--; } System.out.println(); System.out.println();
	 * System.out.println(); System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0; if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����" && arr1[3]
	 * == "�� ����" && arr1[4] == "�� ����") { sc.next(); for (int k = 0; k < 100; k++) {
	 * System.out.println(); } System.out.println("�ʵ忡 �����ϴ� ������ �����ϴ�.");
	 * System.out.println("�Ʊ� ������ �����մϴ�!!!!!"); System.out.println();
	 * System.out.println("���� �������� ���� �Ʊ��� ���� ���� " + arr4[0] + "��(��) �Ծ����ϴ�."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0;
	 * 
	 * if (hp1 > 1) { break; } else { for (j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n�й��ϼ̽��ϴ�."); System.exit(0); } } break; } } else {
	 * 
	 * }
	 */
	/*
	 * if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����" && arr1[3] ==
	 * "�� ����" && arr1[4] == "�� ����") { System.out.println("�ʵ忡 �����ϴ� ������ �����ϴ�.");
	 * System.out.println("�Ʊ� ������ �����մϴ�!!!!!"); System.out.println();
	 * System.out.println("���� �������� ���� �Ʊ��� ���� ���� " + arr4[0] + "��(��) �Ծ����ϴ�."); hp1 -=
	 * arr4[0]; System.out.println(); System.out.println();
	 * System.out.println("������������������������������������������");
	 * System.out.println("�ƹ�Ű�� �Է��ϰ�, ���͸� �����ּ���.");
	 * System.out.println("������������������������������������������"); System.out.print("�Է�: "); sum1 =
	 * 0; if (hp1 > 1) { break; } else { for (int j = 0; j < 100; j++) {
	 * System.out.println(); } System.out.println("#####   ##   #### ##    \r\n" +
	 * "##      ##    ##  ##    \r\n" + "##     # ##   ##  ##    \r\n" +
	 * "####   # ##   ##  ##    \r\n" + "##    ######  ##  ##    \r\n" +
	 * "##    #   ##  ##  ##    \r\n" + "##    #   ## #### ##### ");
	 * System.out.println("\n�й��ϼ̽��ϴ�."); System.exit(0); } } } } }
	 */

	public void add_blue1(int num) { // �κ��丮���� ��罺���� Ŭ���ϸ� ������ �� �ִ�.(ü��)
		if (arr[0] == "��� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("��� ����(ü��)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[0] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(B)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[0] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "Į��(B)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[0] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(B)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[0] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(B)";
			arr[0] = "�� ����";
		}

		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[0] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(B)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[0] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "Į��(B)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[0] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(B)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[0] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(B)";
			arr[0] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[0] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(B)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[0] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "Į��(B)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[0] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(B)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[0] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(B)";
			arr[0] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[0] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(B)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[0] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "Į��(B)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[0] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(B)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[0] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(B)";
			arr[0] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[0] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(B)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[0] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "Į��(B)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[0] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(B)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[0] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(B)";
			arr[0] = "�� ����";
		}
	}

	public void add_blue2(int num) { // �κ��丮���� ��罺���� Ŭ���ϸ� ������ �� �ִ�.(ü��)
		if (arr[1] == "��� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("��� ����(ü��)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[1] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(B)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[1] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "Į��(B)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[1] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(B)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[1] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(B)";
			arr[1] = "�� ����";
		}

		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[1] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(B)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[1] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "Į��(B)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[1] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(B)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[1] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(B)";
			arr[1] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[1] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(B)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[1] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "Į��(B)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[1] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(B)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[1] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(B)";
			arr[1] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[1] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(B)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[1] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "Į��(B)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[1] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(B)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[1] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(B)";
			arr[1] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[1] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(B)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[1] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "Į��(B)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[1] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(B)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[1] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(B)";
			arr[1] = "�� ����";
		}
	}

	public void add_blue3(int num) { // �κ��丮���� ��罺���� Ŭ���ϸ� ������ �� �ִ�.(ü��)
		if (arr[2] == "��� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("��� ����(ü��)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[2] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(B)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[2] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "Į��(B)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[2] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(B)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[2] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(B)";
			arr[2] = "�� ����";
		}

		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[2] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(B)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[2] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "Į��(B)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[2] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(B)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[2] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(B)";
			arr[2] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[2] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(B)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[2] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "Į��(B)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[2] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(B)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[2] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(B)";
			arr[2] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[2] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(B)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[2] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "Į��(B)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[2] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(B)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[2] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(B)";
			arr[2] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[2] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(B)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[2] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "Į��(B)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[2] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(B)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[2] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(B)";
			arr[2] = "�� ����";
		}
	}

	public void add_blue4(int num) { // �κ��丮���� ��罺���� Ŭ���ϸ� ������ �� �ִ�.(ü��)
		if (arr[3] == "��� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("��� ����(ü��)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[3] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(B)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[3] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "Į��(B)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[3] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(B)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[3] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(B)";
			arr[3] = "�� ����";
		}

		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[3] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(B)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[3] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "Į��(B)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[3] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(B)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[3] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(B)";
			arr[3] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[3] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(B)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[3] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "Į��(B)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[3] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(B)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[3] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(B)";
			arr[3] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[3] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(B)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[3] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "Į��(B)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[3] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(B)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[0] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(B)";
			arr[3] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[3] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(B)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[3] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "Į��(B)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[3] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(B)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[3] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(B)";
			arr[3] = "�� ����";
		}
	}

	public void add_blue5(int num) { // �κ��丮���� ��罺���� Ŭ���ϸ� ������ �� �ִ�.(ü��)
		if (arr[4] == "��� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("��� ����(ü��)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[4] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(B)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[4] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[0] = "Į��(B)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[4] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(B)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[4] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(B)";
			arr[4] = "�� ����";
		}

		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[4] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(B)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[4] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[1] = "Į��(B)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[4] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(B)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[4] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(B)";
			arr[4] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[4] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(B)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[4] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[2] = "Į��(B)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[4] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(B)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[4] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(B)";
			arr[4] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[4] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(B)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[4] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[3] = "Į��(B)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[4] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(B)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[4] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(B)";
			arr[4] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[4] == "��� ����") {
			tanker_hp += 50;
			tanker_attack += 10;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(B)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[4] == "��� ����") {
			nife_hp += 50;
			nife_attack += 10;
			nife_defense += 1;
			arr1[4] = "Į��(B)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[4] == "��� ����") {
			rifle_hp += 50;
			rifle_attack += 10;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(B)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[4] == "��� ����") {
			sniper_hp += 50;
			sniper_attack += 10;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(B)";
			arr[4] = "�� ����";
		}
	}

	public void add_red1(int num) { // �κ��丮���� ���� ������ Ŭ���ϸ� ������ �� �ִ�.(���ݷ�)
		if (arr[0] == "���� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� ����(���ݷ�)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[0] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(R)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[0] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "Į��(R)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[0] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(R)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[0] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(R)";
			arr[0] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[0] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(R)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[0] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "Į��(R)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[0] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(R)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[0] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(R)";
			arr[0] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[0] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(R)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[0] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "Į��(R)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[0] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(R)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[0] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(R)";
			arr[0] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[0] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(R)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[0] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "Į��(R)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[0] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(R)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[0] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(R)";
			arr[0] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[0] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(R)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[0] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "Į��(R)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[0] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(R)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[0] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(R)";
			arr[0] = "�� ����";
		}
	}

	public void add_red2(int num) { // �κ��丮���� ���� ������ Ŭ���ϸ� ������ �� �ִ�.(���ݷ�)
		if (arr[1] == "���� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� ����(���ݷ�)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[1] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(R)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[1] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "Į��(R)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[1] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(R)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[1] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(R)";
			arr[1] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[1] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(R)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[1] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "Į��(R)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[1] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(R)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[1] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(R)";
			arr[1] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[1] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(R)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[1] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "Į��(R)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[1] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(R)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[1] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(R)";
			arr[1] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[1] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(R)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[1] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "Į��(R)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[1] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(R)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[1] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(R)";
			arr[1] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[1] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(R)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[1] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "Į��(R)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[1] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(R)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[1] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(R)";
			arr[1] = "�� ����";
		}
	}

	public void add_red3(int num) { // �κ��丮���� ���� ������ Ŭ���ϸ� ������ �� �ִ�.(���ݷ�)
		if (arr[2] == "���� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� ����(���ݷ�)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[2] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(R)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[2] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "Į��(R)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[2] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(R)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[2] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(R)";
			arr[2] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[2] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(R)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[2] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "Į��(R)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[2] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(R)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[2] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(R)";
			arr[2] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[2] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(R)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[2] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "Į��(R)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[2] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(R)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[2] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(R)";
			arr[2] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[2] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(R)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[2] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "Į��(R)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[2] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(R)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[2] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(R)";
			arr[2] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[2] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(R)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[2] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "Į��(R)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[2] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(R)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[2] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(R)";
			arr[2] = "�� ����";
		}
	}

	public void add_red4(int num) { // �κ��丮���� ���� ������ Ŭ���ϸ� ������ �� �ִ�.(���ݷ�)
		if (arr[3] == "���� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� ����(���ݷ�)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[3] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(R)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[3] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "Į��(R)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[3] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(R)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[3] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(R)";
			arr[3] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[3] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(R)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[3] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "Į��(R)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[3] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(R)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[3] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(R)";
			arr[3] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[3] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(R)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[3] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "Į��(R)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[3] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(R)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[3] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(R)";
			arr[3] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[3] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(R)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[3] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "Į��(R)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[3] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(R)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[3] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(R)";
			arr[3] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[3] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(R)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[3] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "Į��(R)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[3] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(R)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[3] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(R)";
			arr[3] = "�� ����";
		}
	}

	public void add_red5(int num) { // �κ��丮���� ���� ������ Ŭ���ϸ� ������ �� �ִ�.(���ݷ�)
		if (arr[4] == "���� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("���� ����(���ݷ�)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[4] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[0] = "��Ŀ(R)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[4] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[0] = "Į��(R)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[4] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[0] = "���Ѻ�(R)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[4] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[0] = "���ݺ�(R)";
			arr[4] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[4] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[1] = "��Ŀ(R)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[4] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[1] = "Į��(R)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[4] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[1] = "���Ѻ�(R)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[4] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[1] = "���ݺ�(R)";
			arr[4] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[4] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[2] = "��Ŀ(R)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[4] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[2] = "Į��(R)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[4] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[2] = "���Ѻ�(R)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[4] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[2] = "���ݺ�(R)";
			arr[4] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[4] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[3] = "��Ŀ(R)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[4] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[3] = "Į��(R)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[4] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[3] = "���Ѻ�(R)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[4] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[3] = "���ݺ�(R)";
			arr[4] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[4] == "���� ����") {
			tanker_hp += 10;
			tanker_attack += 35;
			tanker_defense += 1;
			arr1[4] = "��Ŀ(R)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[4] == "���� ����") {
			nife_hp += 10;
			nife_attack += 35;
			nife_defense += 1;
			arr1[4] = "Į��(R)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[4] == "���� ����") {
			rifle_hp += 10;
			rifle_attack += 35;
			rifle_defense += 1;
			arr1[4] = "���Ѻ�(R)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[4] == "���� ����") {
			sniper_hp += 10;
			sniper_attack += 35;
			sniper_defense += 1;
			arr1[4] = "���ݺ�(R)";
			arr[4] = "�� ����";
		}
	}

	public void add_green1(int num) {
		if (arr[0] == "�׸� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("�׸� ����(����)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[0] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "��Ŀ(G)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[0] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "Į��(G)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[0] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "���Ѻ�(G)";
			arr[0] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[0] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "���ݺ�(G)";
			arr[0] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[0] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "��Ŀ(G)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[0] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "Į��(G)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[0] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "���Ѻ�(G)";
			arr[0] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[0] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "���ݺ�(G)";
			arr[0] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[0] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "��Ŀ(G)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[0] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "Į��(G)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[0] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "���Ѻ�(G)";
			arr[0] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[0] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "���ݺ�(G)";
			arr[0] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[0] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "��Ŀ(G)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[0] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "Į��(G)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[0] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "���Ѻ�(G)";
			arr[0] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[0] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "���ݺ�(G)";
			arr[0] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[0] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "��Ŀ(G)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[0] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "Į��(G)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[0] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "���Ѻ�(G)";
			arr[0] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[0] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "���ݺ�(G)";
			arr[0] = "�� ����";
		}
	}

	public void add_green2(int num) {
		if (arr[1] == "�׸� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("�׸� ����(����)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[1] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "��Ŀ(G)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[1] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "Į��(G)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[1] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "���Ѻ�(G)";
			arr[1] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[1] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "���ݺ�(G)";
			arr[1] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[1] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "��Ŀ(G)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[1] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "Į��(G)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[1] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "���Ѻ�(G)";
			arr[1] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[1] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "���ݺ�(G)";
			arr[1] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[1] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "��Ŀ(G)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[1] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "Į��(G)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[1] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "���Ѻ�(G)";
			arr[1] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[1] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "���ݺ�(G)";
			arr[1] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[1] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "��Ŀ(G)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[1] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "Į��(G)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[1] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "���Ѻ�(G)";
			arr[1] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[1] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "���ݺ�(G)";
			arr[1] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[1] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "��Ŀ(G)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[1] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "Į��(G)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[1] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "���Ѻ�(G)";
			arr[1] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[1] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "���ݺ�(G)";
			arr[1] = "�� ����";
		}
	}

	public void add_green3(int num) {
		if (arr[2] == "�׸� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("�׸� ����(����)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[2] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "��Ŀ(G)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[2] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "Į��(G)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[2] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "���Ѻ�(G)";
			arr[2] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[2] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "���ݺ�(G)";
			arr[2] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[2] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "��Ŀ(G)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[2] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "Į��(G)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[2] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "���Ѻ�(G)";
			arr[2] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[2] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "���ݺ�(G)";
			arr[2] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[2] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "��Ŀ(G)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[2] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "Į��(G)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[2] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "���Ѻ�(G)";
			arr[2] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[2] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "���ݺ�(G)";
			arr[2] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[2] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "��Ŀ(G)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[2] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "Į��(G)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[2] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "���Ѻ�(G)";
			arr[2] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[2] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "���ݺ�(G)";
			arr[2] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[2] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "��Ŀ(G)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[2] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "Į��(G)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[2] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "���Ѻ�(G)";
			arr[2] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[2] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "���ݺ�(G)";
			arr[2] = "�� ����";
		}
	}

	public void add_green4(int num) {
		if (arr[3] == "�׸� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("�׸� ����(����)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[3] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "��Ŀ(G)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[3] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "Į��(G)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[3] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "���Ѻ�(G)";
			arr[3] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[3] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "���ݺ�(G)";
			arr[3] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[3] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "��Ŀ(G)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[3] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "Į��(G)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[3] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "���Ѻ�(G)";
			arr[3] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[3] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "���ݺ�(G)";
			arr[3] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[3] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "��Ŀ(G)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[3] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "Į��(G)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[3] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "���Ѻ�(G)";
			arr[3] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[3] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "���ݺ�(G)";
			arr[3] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[3] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "��Ŀ(G)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[3] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "Į��(G)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[3] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "���Ѻ�(G)";
			arr[3] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[3] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "���ݺ�(G)";
			arr[3] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[3] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "��Ŀ(G)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[3] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "Į��(G)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[3] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "���Ѻ�(G)";
			arr[3] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[3] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "���ݺ�(G)";
			arr[3] = "�� ����";
		}
	}

	public void add_green5(int num) {
		if (arr[4] == "�׸� ����") {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("�׸� ����(����)�� �����߽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.println("�ƹ� Ű�� �Է��Ͻð� ����Ű�� �������ʽÿ�.");
			System.out.println("������������������������������������������������");
			System.out.print("�Է�: ");
		}
		if (num == 1 && arr1[0] == "  ��Ŀ" && arr[4] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[0] = "��Ŀ(G)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "  Į��" && arr[4] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[0] = "Į��(G)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "���Ѻ�" && arr[4] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[0] = "���Ѻ�(G)";
			arr[4] = "�� ����";
		} else if (num == 1 && arr1[0] == "���ݺ�" && arr[4] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[0] = "���ݺ�(G)";
			arr[4] = "�� ����";
		}
		if (num == 2 && arr1[1] == "  ��Ŀ" && arr[4] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[1] = "��Ŀ(G)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "  Į��" && arr[4] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[1] = "Į��(G)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "���Ѻ�" && arr[4] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[1] = "���Ѻ�(G)";
			arr[4] = "�� ����";
		} else if (num == 2 && arr1[1] == "���ݺ�" && arr[4] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[1] = "���ݺ�(G)";
			arr[4] = "�� ����";
		}
		if (num == 3 && arr1[2] == "  ��Ŀ" && arr[4] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[2] = "��Ŀ(G)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "  Į��" && arr[4] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[2] = "Į��(G)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "���Ѻ�" && arr[4] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[2] = "���Ѻ�(G)";
			arr[4] = "�� ����";
		} else if (num == 3 && arr1[2] == "���ݺ�" && arr[4] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[2] = "���ݺ�(G)";
			arr[4] = "�� ����";
		}
		if (num == 4 && arr1[3] == "  ��Ŀ" && arr[4] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[3] = "��Ŀ(G)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "  Į��" && arr[4] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[3] = "Į��(G)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "���Ѻ�" && arr[4] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[3] = "���Ѻ�(G)";
			arr[4] = "�� ����";
		} else if (num == 4 && arr1[3] == "���ݺ�" && arr[4] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[3] = "���ݺ�(G)";
			arr[4] = "�� ����";
		}
		if (num == 5 && arr1[4] == "  ��Ŀ" && arr[4] == "�׸� ����") {
			tanker_hp += 10;
			tanker_attack += 10;
			tanker_defense += 5;
			arr1[4] = "��Ŀ(G)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "  Į��" && arr[4] == "�׸� ����") {
			nife_hp += 10;
			nife_attack += 10;
			nife_defense += 5;
			arr1[4] = "Į��(G)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "���Ѻ�" && arr[4] == "�׸� ����") {
			rifle_hp += 10;
			rifle_attack += 10;
			rifle_defense += 5;
			arr1[4] = "���Ѻ�(G)";
			arr[4] = "�� ����";
		} else if (num == 5 && arr1[4] == "���ݺ�" && arr[4] == "�׸� ����") {
			sniper_hp += 10;
			sniper_attack += 10;
			sniper_defense += 5;
			arr1[4] = "���ݺ�(G)";
			arr[4] = "�� ����";
		}
	}

	/*
	 * int add_red(int x, int y, int z) { //�κ��丮���� ���彺���� �����ϸ� ������ �ȴ�.(���ݷ�) hp6+=10;
	 * attack+=35; defense+=1; return 0; } int add_green(int x, int y, int z) {
	 * //�κ��丮���� �׸������� �����ϸ� ������ �ȴ�.(����) hp6+=10; attack+=10; defense+=5; return 0; }
	 */
	public void defeat() {
		for (int j = 0; j < 100; j++) {
			System.out.println();
		}
		System.out.println("                     ####                       #     \r\n"
				+ " #####              #                           #     \r\n"
				+ " #    #             #                           #     \r\n"
				+ " #     #   #####   ####      #####    ######  ######  \r\n"
				+ " #     #  #     #   #       #     #  #     #    #     \r\n"
				+ " #     #  #######   #       #######  #     #    #     \r\n"
				+ " #    #   #         #       #        #    ##    #     \r\n"
				+ " #####     #####    #        #####    #### #     ###  ");
		System.out.println("\n�й��ϼ̽��ϴ�.");
		System.exit(0);
	}

	public void win() {
		if (hp2 < 0) {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println(":::       ::: ::::::::::: ::::    ::: ::::    ::: :::::::::: :::::::::  \r\n"
					+ ":+:       :+:     :+:     :+:+:   :+: :+:+:   :+: :+:        :+:    :+: \r\n"
					+ "+:+       +:+     +:+     :+:+:+  +:+ :+:+:+  +:+ +:+        +:+    +:+ \r\n"
					+ "+#+  +:+  +#+     +#+     +#+ +:+ +#+ +#+ +:+ +#+ +#++:++#   +#++:++#:  \r\n"
					+ "+#+ +#+#+ +#+     +#+     +#+  +#+#+# +#+  +#+#+# +#+        +#+    +#+ \r\n"
					+ " #+#+# #+#+#      #+#     #+#   #+#+# #+#   #+#+# #+#        #+#    #+# \r\n"
					+ "  ###   ###   ########### ###    #### ###    #### ########## ###    ### ");
			System.out.println("\n�����մϴ�.\n���� ������ �ı��Ǿ����ϴ�.\n���ӿ��� �¸��Ͽ����ϴ�.");
			System.exit(0);
		}
	}

	/*
	 * public void war1() { this.battle(); // �� ��ȯ sc.next(); while (true) {
	 * this.battle1(); // ���� ���� ���� sc.next(); this.battle2(); // ���� ���� ü�� sc.next();
	 * this.battle3(); // ���� ü���� ������ ���� ������ �����ϰ�, ���� �Ѿ��. ���� �Ʊ� ���� ü���� 0�� �Ǹ� ������ ����
	 * �ȴ�. sc.next(); if (arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] ==
	 * "�� ����" && arr1[3] == "�� ����" && arr1[4] == "�� ����") { break; } this.win(); //
	 * ���� ������ �ν����� ������ ����. /*if (hp5 == 0) { break; }
	 */
	/*
	 * } }
	 */

	public void reset() {
		sum = 0;
	}

	/*
	 * public void on() { if (arr1[0] != "�� ����") { // arr1[0]�� ������ ���� ��� if (o == 2)
	 * { // o�� 2�̸� ���� if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0] ==
	 * "��Ŀ(G)" || arr1[0] == "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * tanker_attack; } else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0]
	 * == "Į��(G)" || arr1[0] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * nife_attack; } else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] ==
	 * "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * rifle_attack; } else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0]
	 * == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * && arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * sniper_attack; } else if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0]
	 * == "��Ŀ(G)" || arr1[0] == "��Ŀ(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") {
	 * j = (int) (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" ||
	 * arr1[0] == "Į��(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= nife_attack; mutal_hp_2 += mutal_defense; if
	 * (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "�� ����"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } } else if
	 * (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] ==
	 * "���Ѻ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" ||
	 * arr1[0] == "���ݺ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (tanker_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * // ���۳� } else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] ==
	 * "���ݺ�(G)" || arr1[0] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[0] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * sniper_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= sniper_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { goblin_hp_4 -= sniper_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j ==
	 * 4) { goblin_hp_5 -= sniper_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= sniper_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * sniper_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= sniper_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } else if
	 * (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] ==
	 * "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= rifle_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= rifle_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= rifle_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= rifle_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= rifle_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= rifle_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * rifle_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[0] == "  ��Ŀ" || arr1[0] == "��Ŀ(R)" || arr1[0]
	 * == "��Ŀ(G)" || arr1[0] == "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * tanker_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= tanker_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { goblin_hp_4 -= tanker_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j ==
	 * 4) { goblin_hp_5 -= tanker_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= tanker_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * tanker_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= tanker_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } else if
	 * (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] ==
	 * "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -= nife_attack;
	 * hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { hydra_hp_4 -= nife_attack; hydra_hp_4 += hydra_defense; if
	 * (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { hydra_hp_5 -=
	 * nife_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } else if (arr6[0] == "mutal") { if (j == 2) { mutal_hp_3 -=
	 * nife_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { mutal_hp_4 -= nife_attack; mutal_hp_4 +=
	 * mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { mutal_hp_5 -= nife_attack; mutal_hp_5 += mutal_defense; if (mutal_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "goblin") { if (j == 2) {
	 * goblin_hp_3 -= nife_attack; goblin_hp_3 += goblin_defense; if (goblin_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4 -= nife_attack;
	 * goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { goblin_hp_5 -= nife_attack; goblin_hp_5 += goblin_defense;
	 * if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "thief")
	 * { if (j == 2) { thief_hp_3 -= nife_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * nife_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= nife_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } } if (o != 2)
	 * { o++; } else if (o == 2) { o = 0; } } // arr6[0] �� // arr6[1] ���� if (arr1[1]
	 * != "�� ����") { // arr6[1]�� ������ ���� ��� if (oo == 2) { // oo�� 2�̸� ���� if (arr1[1]
	 * == "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] == "��Ŀ(B)"
	 * && arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] ==
	 * "�� ����" && arr6[4] == "�� ����") { hp2 -= tanker_attack; } else if (arr1[1] ==
	 * "  Į��" || arr1[1] == "Į��(R)" || arr1[1] == "Į��(G)" || arr1[1] == "Į��(B)" &&
	 * arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] ==
	 * "�� ����" && arr6[4] == "�� ����") { hp2 -= nife_attack; } else if (arr1[1] ==
	 * "���Ѻ�" || arr1[1] == "���Ѻ�(R)" || arr1[1] == "���Ѻ�(G)" || arr1[1] == "���Ѻ�(B)" &&
	 * arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] ==
	 * "�� ����" && arr6[4] == "�� ����") { hp2 -= rifle_attack; } else if (arr1[1] ==
	 * "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] == "���ݺ�(G)" || arr1[1] == "���ݺ�(B)" &&
	 * arr6[0] == "�� ����" && arr6[1] == "�� ����" && arr6[2] == "�� ����" && arr6[3] ==
	 * "�� ����" && arr6[4] == "�� ����") { hp2 -= sniper_attack; } else if (arr1[1] ==
	 * "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] == "��Ŀ(B)" &&
	 * arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int) (Math.random() * 2);//
	 * 0~1���� if (arr6[j] == "hydra") { if (j == 0) { hydra_hp_1 -= tanker_attack;
	 * hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { hydra_hp_2 -= tanker_attack; hydra_hp_2 += hydra_defense;
	 * if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "mutal") {
	 * if (j == 0) { mutal_hp_1 -= tanker_attack; mutal_hp_1 += mutal_defense; if
	 * (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { mutal_hp_2 -=
	 * tanker_attack; mutal_hp_2 += mutal_defense; if (mutal_hp_2 <= 0) { arr6[1] =
	 * "�� ����"; } } } else if (arr6[j] == "goblin") { if (j == 0) { goblin_hp_1 -=
	 * tanker_attack; goblin_hp_1 += goblin_defense; if (goblin_hp_1 <= 0) { arr6[0]
	 * = "�� ����"; } } else if (j == 1) { goblin_hp_2 -= tanker_attack; goblin_hp_2 +=
	 * goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if
	 * (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -= tanker_attack; thief_hp_1
	 * += thief_defense; if (thief_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j ==
	 * 1) { thief_hp_2 -= tanker_attack; thief_hp_2 += thief_defense; if (thief_hp_2
	 * <= 0) { arr6[1] = "�� ����"; } } } } else if (arr1[1] == "  Į��" || arr1[1] ==
	 * "Į��(R)" || arr1[1] == "Į��(G)" || arr1[1] == "Į��(B)" && arr6[0] != "�� ����" ||
	 * arr6[1] != "�� ����") { j = (int) (Math.random() * 2);// 0~1���� if (arr6[j] ==
	 * "hydra") { if (j == 0) { hydra_hp_1 -= nife_attack; hydra_hp_1 +=
	 * hydra_defense; if (hydra_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1)
	 * { hydra_hp_2 -= nife_attack; hydra_hp_2 += hydra_defense; if (hydra_hp_2 <=
	 * 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "mutal") { if (j == 0) {
	 * mutal_hp_1 -= nife_attack; mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { mutal_hp_2 -= nife_attack;
	 * mutal_hp_2 += mutal_defense; if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "goblin") { if (j == 0) { goblin_hp_1 -= nife_attack;
	 * goblin_hp_1 += goblin_defense; if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { goblin_hp_2 -= nife_attack; goblin_hp_2 += goblin_defense;
	 * if (goblin_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief")
	 * { if (j == 0) { thief_hp_1 -= nife_attack; thief_hp_1 += thief_defense; if
	 * (thief_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -=
	 * nife_attack; thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] =
	 * "�� ����"; } } } } else if (arr1[1] == "���Ѻ�" || arr1[1] == "���Ѻ�(R)" || arr1[1]
	 * == "���Ѻ�(G)" || arr1[1] == "���Ѻ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����")
	 * { j = (int) (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j ==
	 * 0) { hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1
	 * <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_1 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[1] == "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] == "���ݺ�(G)" ||
	 * arr1[1] == "���ݺ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * // ���۳�1 } else if (arr1[1] == "���ݺ�" || arr1[1] == "���ݺ�(R)" || arr1[1] ==
	 * "���ݺ�(G)" || arr1[1] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * sniper_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 +=
	 * mutal_defense; if (nife_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j]
	 * == "goblin") { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 +=
	 * goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j ==
	 * 3) { goblin_hp_4 -= sniper_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -=
	 * sniper_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4]
	 * = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -=
	 * sniper_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { thief_hp_5 -= sniper_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } } else if (arr1[1] == "���Ѻ�" || arr1[1] ==
	 * "���Ѻ�(R)" || arr1[1] == "���Ѻ�(G)" || arr1[1] == "���Ѻ�(B)" && arr6[0] == "�� ����"
	 * && arr6[1] == "�� ����" || arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] !=
	 * "�� ����") { j = (int) (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra")
	 * { if (j == 2) { hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if
	 * (hydra_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -=
	 * rifle_attack; hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 +=
	 * hydra_defense; if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[j] == "mutal") { if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3
	 * += mutal_defense; if (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j ==
	 * 3) { mutal_hp_4 -= rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4
	 * <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack;
	 * mutal_hp_5 += mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } }
	 * else if (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } else if
	 * (arr1[1] == "  ��Ŀ" || arr1[1] == "��Ŀ(R)" || arr1[1] == "��Ŀ(G)" || arr1[1] ==
	 * "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[1] == "  Į��" || arr1[1] == "Į��(R)" || arr1[1]
	 * == "Į��(G)" || arr1[1] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } } } if (oo != 2) { oo++; } else if (oo == 2) {
	 * oo = 0; } } // arr6[1]�� // arr6[2]���� if (arr1[2] != "�� ����") { if (ooo == 2) {
	 * // ooo�� 2�̸� ���� if (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2] ==
	 * "��Ŀ(G)" || arr1[2] == "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * tanker_attack; } else if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2]
	 * == "Į��(G)" || arr1[2] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * nife_attack; } else if (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2] ==
	 * "���Ѻ�(G)" || arr1[2] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * rifle_attack; } else if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2]
	 * == "���ݺ�(G)" || arr1[2] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * && arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * sniper_attack; } else if (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2]
	 * == "��Ŀ(G)" || arr1[2] == "��Ŀ(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") {
	 * j = (int) (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2] == "Į��(G)" ||
	 * arr1[2] == "Į��(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= nife_attack; mutal_hp_2 += mutal_defense; if
	 * (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "�� ����"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } } else if
	 * (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2] == "���Ѻ�(G)" || arr1[2] ==
	 * "���Ѻ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2] == "���ݺ�(G)" ||
	 * arr1[2] == "���ݺ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[2] == "���ݺ�" || arr1[2] == "���ݺ�(R)" || arr1[2] == "���ݺ�(G)" ||
	 * arr1[2] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] !=
	 * "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random()
	 * * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= sniper_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= sniper_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= sniper_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -= sniper_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * sniper_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[2] == "���Ѻ�" || arr1[2] == "���Ѻ�(R)" || arr1[2]
	 * == "���Ѻ�(G)" || arr1[2] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * || arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } else if
	 * (arr1[2] == "  ��Ŀ" || arr1[2] == "��Ŀ(R)" || arr1[2] == "��Ŀ(G)" || arr1[2] ==
	 * "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[2] == "  Į��" || arr1[2] == "Į��(R)" || arr1[2]
	 * == "Į��(G)" || arr1[2] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[j] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[j] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } } } if (ooo != 2) { ooo++; } else if (ooo == 2)
	 * { ooo = 0; } } // arr6[2] �� if (arr1[3] != "�� ����") { if (oooo == 2) { //
	 * oooo�� 2�̸� ���� if (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3] ==
	 * "��Ŀ(G)" || arr1[3] == "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * tanker_attack; } else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3]
	 * == "Į��(G)" || arr1[3] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * nife_attack; } else if (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3] ==
	 * "���Ѻ�(G)" || arr1[3] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * rifle_attack; } else if (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3]
	 * == "���ݺ�(G)" || arr1[3] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * && arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * sniper_attack; } else if (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3]
	 * == "��Ŀ(G)" || arr1[3] == "��Ŀ(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") {
	 * j = (int) (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3] == "Į��(G)" ||
	 * arr1[3] == "Į��(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= nife_attack; mutal_hp_2 += mutal_defense; if
	 * (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "�� ����"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } } else if
	 * (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3] == "���Ѻ�(G)" || arr1[3] ==
	 * "���Ѻ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3] == "���ݺ�(G)" ||
	 * arr1[3] == "���ݺ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (nife_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2 -=
	 * sniper_attack; goblin_hp_2 += goblin_defense; if (rifle_hp_2 <= 0) { arr6[1]
	 * = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "�� ����"; } } else if (j == 1) { thief_hp_2 -= sniper_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } } else if
	 * (arr1[3] == "���ݺ�" || arr1[3] == "���ݺ�(R)" || arr1[3] == "���ݺ�(G)" || arr1[3] ==
	 * "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= sniper_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= sniper_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= sniper_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= sniper_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * sniper_attack; thief_hp_5 += thief_defense; if (sniper_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[3] == "���Ѻ�" || arr1[3] == "���Ѻ�(R)" || arr1[3]
	 * == "���Ѻ�(G)" || arr1[3] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * || arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } else if
	 * (arr1[3] == "  ��Ŀ" || arr1[3] == "��Ŀ(R)" || arr1[3] == "��Ŀ(G)" || arr1[3] ==
	 * "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } } } else if (arr1[3] == "  Į��" || arr1[3] == "Į��(R)" || arr1[3]
	 * == "Į��(G)" || arr1[3] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } } } if (oooo != 2) { oooo++; } else if (oooo ==
	 * 2) { oooo = 0; } } // arr1[3] �� if (arr1[4] != "�� ����") { if (ooooo == 2) { //
	 * ooooo�� 2�̸� ���� if (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4] ==
	 * "��Ŀ(G)" || arr1[4] == "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * tanker_attack; } else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4]
	 * == "Į��(G)" || arr1[4] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * nife_attack; } else if (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4] ==
	 * "���Ѻ�(G)" || arr1[4] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" &&
	 * arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * rifle_attack; } else if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4]
	 * == "���ݺ�(G)" || arr1[4] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * && arr6[2] == "�� ����" && arr6[3] == "�� ����" && arr6[4] == "�� ����") { hp2 -=
	 * sniper_attack; } else if (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4]
	 * == "��Ŀ(G)" || arr1[4] == "��Ŀ(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") {
	 * j = (int) (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0)
	 * { hydra_hp_1 -= tanker_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= tanker_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= tanker_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= tanker_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= tanker_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= tanker_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= tanker_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= tanker_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4] == "Į��(G)" ||
	 * arr1[4] == "Į��(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= nife_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= nife_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= nife_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= mutal_attack; mutal_hp_2 += mutal_defense;
	 * if (nife_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin") {
	 * if (j == 0) { goblin_hp_1 -= nife_attack; goblin_hp_1 += goblin_defense; if
	 * (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2 -=
	 * nife_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) { arr6[1] =
	 * "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) { thief_hp_1 -=
	 * nife_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0) { arr6[0] =
	 * "�� ����"; } } else if (j == 1) { thief_hp_2 -= nife_attack; thief_hp_2 +=
	 * thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } } else if
	 * (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4] == "���Ѻ�(G)" || arr1[4] ==
	 * "���Ѻ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= rifle_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= rifle_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= rifle_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= rifle_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= rifle_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= rifle_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= rifle_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <= 0)
	 * { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= rifle_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4] == "���ݺ�(G)" ||
	 * arr1[4] == "���ݺ�(B)" && arr6[0] != "�� ����" || arr6[1] != "�� ����") { j = (int)
	 * (Math.random() * 2);// 0~1���� if (arr6[j] == "hydra") { if (j == 0) {
	 * hydra_hp_1 -= sniper_attack; hydra_hp_1 += hydra_defense; if (hydra_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { hydra_hp_2 -= sniper_attack;
	 * hydra_hp_2 += hydra_defense; if (hydra_hp_2 <= 0) { arr6[1] = "�� ����"; } } }
	 * else if (arr6[j] == "mutal") { if (j == 0) { mutal_hp_1 -= sniper_attack;
	 * mutal_hp_1 += mutal_defense; if (mutal_hp_1 <= 0) { arr6[0] = "�� ����"; } }
	 * else if (j == 1) { mutal_hp_2 -= sniper_attack; mutal_hp_2 += mutal_defense;
	 * if (mutal_hp_2 <= 0) { arr6[1] = "�� ����"; } } } else if (arr6[j] == "goblin")
	 * { if (j == 0) { goblin_hp_1 -= sniper_attack; goblin_hp_1 += goblin_defense;
	 * if (goblin_hp_1 <= 0) { arr6[0] = "�� ����"; } } else if (j == 1) { goblin_hp_2
	 * -= sniper_attack; goblin_hp_2 += goblin_defense; if (goblin_hp_2 <= 0) {
	 * arr6[1] = "�� ����"; } } } else if (arr6[j] == "thief") { if (j == 0) {
	 * thief_hp_1 -= sniper_attack; thief_hp_1 += thief_defense; if (thief_hp_1 <=
	 * 0) { arr6[0] = "�� ����"; } } else if (j == 1) { thief_hp_2 -= sniper_attack;
	 * thief_hp_2 += thief_defense; if (thief_hp_2 <= 0) { arr6[1] = "�� ����"; } } } }
	 * else if (arr1[4] == "���ݺ�" || arr1[4] == "���ݺ�(R)" || arr1[4] == "���ݺ�(G)" ||
	 * arr1[4] == "���ݺ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] !=
	 * "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random()
	 * * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * sniper_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= sniper_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= sniper_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= sniper_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= sniper_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= sniper_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= sniper_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= sniper_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= sniper_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= sniper_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= sniper_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * sniper_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[4] == "���Ѻ�" || arr1[4] == "���Ѻ�(R)" || arr1[4]
	 * == "���Ѻ�(G)" || arr1[4] == "���Ѻ�(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����"
	 * || arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= rifle_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= rifle_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= rifle_attack; hydra_hp_5 += hydra_defense;
	 * if (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") {
	 * if (j == 2) { mutal_hp_3 -= rifle_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * rifle_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= rifle_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= rifle_attack;
	 * goblin_hp_3 += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { goblin_hp_4 -= rifle_attack; goblin_hp_4 +=
	 * goblin_defense; if (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j ==
	 * 4) { goblin_hp_5 -= rifle_attack; goblin_hp_5 += goblin_defense; if
	 * (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "thief") {
	 * if (j == 2) { thief_hp_3 -= rifle_attack; thief_hp_3 += thief_defense; if
	 * (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { thief_hp_4 -=
	 * rifle_attack; thief_hp_4 += thief_defense; if (thief_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { thief_hp_5 -= rifle_attack; thief_hp_5 +=
	 * thief_defense; if (thief_hp_5 <= 0) { arr6[4] = "�� ����"; } } } } else if
	 * (arr1[4] == "  ��Ŀ" || arr1[4] == "��Ŀ(R)" || arr1[4] == "��Ŀ(G)" || arr1[4] ==
	 * "��Ŀ(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" || arr6[2] != "�� ����" ||
	 * arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int) (Math.random() * 3) +
	 * 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) { hydra_hp_3 -=
	 * tanker_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { hydra_hp_4 -= tanker_attack; hydra_hp_4 +=
	 * hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { hydra_hp_5 -= tanker_attack; hydra_hp_5 += hydra_defense; if (hydra_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if (j == 2) {
	 * mutal_hp_3 -= tanker_attack; mutal_hp_3 += mutal_defense; if (mutal_hp_3 <=
	 * 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -= tanker_attack;
	 * mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { mutal_hp_5 -= tanker_attack; mutal_hp_5 += mutal_defense;
	 * if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "goblin")
	 * { if (j == 2) { goblin_hp_3 -= tanker_attack; goblin_hp_3 += goblin_defense;
	 * if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { goblin_hp_4
	 * -= tanker_attack; goblin_hp_4 += goblin_defense; if (goblin_hp_4 <= 0) {
	 * arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -= tanker_attack;
	 * goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] = "�� ����"; } }
	 * } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -= tanker_attack;
	 * thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] = "�� ����"; } }
	 * else if (j == 3) { thief_hp_4 -= tanker_attack; thief_hp_4 += thief_defense;
	 * if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { thief_hp_5 -=
	 * tanker_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } } else if (arr1[4] == "  Į��" || arr1[4] == "Į��(R)" || arr1[4]
	 * == "Į��(G)" || arr1[4] == "Į��(B)" && arr6[0] == "�� ����" && arr6[1] == "�� ����" ||
	 * arr6[2] != "�� ����" || arr6[3] != "�� ����" || arr6[4] != "�� ����") { j = (int)
	 * (Math.random() * 3) + 2;// 2~4���� if (arr6[j] == "hydra") { if (j == 2) {
	 * hydra_hp_3 -= nife_attack; hydra_hp_3 += hydra_defense; if (hydra_hp_3 <= 0)
	 * { arr6[2] = "�� ����"; } } else if (j == 3) { hydra_hp_4 -= nife_attack;
	 * hydra_hp_4 += hydra_defense; if (hydra_hp_4 <= 0) { arr6[3] = "�� ����"; } }
	 * else if (j == 4) { hydra_hp_5 -= nife_attack; hydra_hp_5 += hydra_defense; if
	 * (hydra_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if (arr6[0] == "mutal") { if
	 * (j == 2) { mutal_hp_3 -= nife_attack; mutal_hp_3 += mutal_defense; if
	 * (mutal_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j == 3) { mutal_hp_4 -=
	 * nife_attack; mutal_hp_4 += mutal_defense; if (mutal_hp_4 <= 0) { arr6[3] =
	 * "�� ����"; } } else if (j == 4) { mutal_hp_5 -= nife_attack; mutal_hp_5 +=
	 * mutal_defense; if (mutal_hp_5 <= 0) { arr6[4] = "�� ����"; } } } else if
	 * (arr6[0] == "goblin") { if (j == 2) { goblin_hp_3 -= nife_attack; goblin_hp_3
	 * += goblin_defense; if (goblin_hp_3 <= 0) { arr6[2] = "�� ����"; } } else if (j
	 * == 3) { goblin_hp_4 -= nife_attack; goblin_hp_4 += goblin_defense; if
	 * (goblin_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4) { goblin_hp_5 -=
	 * nife_attack; goblin_hp_5 += goblin_defense; if (goblin_hp_5 <= 0) { arr6[4] =
	 * "�� ����"; } } } else if (arr6[0] == "thief") { if (j == 2) { thief_hp_3 -=
	 * nife_attack; thief_hp_3 += thief_defense; if (thief_hp_3 <= 0) { arr6[2] =
	 * "�� ����"; } } else if (j == 3) { thief_hp_4 -= nife_attack; thief_hp_4 +=
	 * thief_defense; if (thief_hp_4 <= 0) { arr6[3] = "�� ����"; } } else if (j == 4)
	 * { thief_hp_5 -= nife_attack; thief_hp_5 += thief_defense; if (thief_hp_5 <=
	 * 0) { arr6[4] = "�� ����"; } } } } } if (ooooo != 2) { ooooo++; } else if (ooooo
	 * == 2) { ooooo = 0; } } }
	 */
	public void off() {
		if (arr6[0] != "�� ����") { // arr6[0]�� ������ ���� ���
			if (z == 2) { // z�� 2�̸� ����
				if (arr6[0] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= hydra_attack;
				} else if (arr6[0] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= goblin_attack;
				} else if (arr6[0] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= mutal_attack;
				} else if (arr6[0] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= thief_attack;
				} else if (arr6[0] == "hydra" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "�� ����";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[0] == "goblin" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[0] == "mutal" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[0] == "thief" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								rifle_hp_2 = rifle_hp;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								sniper_hp_2 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "�� ����";
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								arr1[4] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								rifle_hp_5 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[0] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								available_troops1--;
								nife_hp_4 = nife_hp;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "�� ����";
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								sniper_hp_3 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				}
			}
			if (z != 2) {
				z++;
			} else if (z == 2) {
				z = 0;
			}
		} // arr6[0] ��
			// arr6[1] ����
		if (arr6[1] != "�� ����") { // arr6[1]�� ������ ���� ���
			if (zz == 2) { // zz�� 2�̸� ����
				if (arr6[1] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= hydra_attack;
				} else if (arr6[1] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= goblin_attack;
				} else if (arr6[1] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= mutal_attack;
				} else if (arr6[1] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= thief_attack;
				} else if (arr6[1] == "hydra" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								tanker_hp_2 = tanker_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[1] == "goblin" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "�� ����";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[1] == "mutal" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[1] == "thief" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[1] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								tanker_hp_3 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[1] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								nife_hp_5 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[1] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[1] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								nife_hp_5 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								rifle_hp_5 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				}
			}
			if (zz != 2) {
				zz++;
			} else if (zz == 2) {
				zz = 0;
			}
		}
		// arr6[1]��
		// arr6[2]����
		if (arr6[2] != "�� ����") {
			if (zzz == 2) { // zzzz�� 2�̸� ����
				if (arr6[2] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= hydra_attack;
				} else if (arr6[2] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= goblin_attack;
				} else if (arr6[2] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= mutal_attack;
				} else if (arr6[2] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= thief_attack;
				} else if (arr6[2] == "hydra" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[2] == "goblin" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[2] == "mutal" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[2] == "thief" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[2] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								rifle_hp_3 = rifle_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[2] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[2] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[2] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				}
			}
			if (zzz != 2) {
				zzz++;
			} else if (zzz == 2) {
				zzz = 0;
			}
		}
		// arr6[2] ��
		if (arr6[3] != "�� ����") {
			if (zzzz == 2) { // zzzzz�� 2�̸� ����
				if (arr6[3] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= hydra_attack;
				} else if (arr6[3] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= goblin_attack;
				} else if (arr6[3] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= mutal_attack;
				} else if (arr6[3] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= thief_attack;
				} else if (arr6[3] == "hydra" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								nife_hp_2 = nife_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								available_troops1--;
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[3] == "goblin" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "�� ����";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								sniper_hp_1 = sniper_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[3] == "mutal" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								arr1[0] = "�� ����";
								rifle_hp_1 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[3] == "thief" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								tanker_hp_1 = tanker_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								nife_hp_1 = nife_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								nife_hp_2 = nife_hp;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[3] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								nife_hp_3 = nife_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[3] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								arr1[4] = "�� ����";
								available_troops1--;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								rifle_hp_5 = rifle_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								sniper_hp_4 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[3] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[3] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								available_troops1--;
								sniper_hp_3 = sniper_hp;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				}
			}
			if (zzzz != 2) {
				zzzz++;
			} else if (zzzz == 2) {
				zzzz = 0;
			}
		}
		// arr6[3] ��
		if (arr6[4] != "�� ����") {
			if (zzzzz == 2) { // zzzzzz�� 2�̸� ����
				if (arr6[4] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= hydra_attack;
				} else if (arr6[4] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= goblin_attack;
				} else if (arr6[4] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= mutal_attack;
				} else if (arr6[4] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" && arr1[2] == "�� ����"
						&& arr1[3] == "�� ����" && arr1[4] == "�� ����") {
					hp1 -= thief_attack;
				} else if (arr6[4] == "hydra" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= hydra_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= hydra_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= hydra_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= hydra_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= hydra_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= hydra_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= hydra_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= hydra_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					}
				} else if (arr6[4] == "goblin" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= goblin_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= goblin_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= goblin_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= goblin_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= goblin_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								arr1[0] = "�� ����";
								available_troops1--;
							}
						} else if (j == 1) {
							rifle_hp_2 -= goblin_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= goblin_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 1) {
							sniper_hp_2 -= goblin_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[4] == "mutal" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= mutal_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= mutal_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= mutal_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= mutal_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								available_troops1--;
								arr1[1] = "�� ����";
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= mutal_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= mutal_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								rifle_hp_2 = rifle_hp;
								available_troops1--;
								arr1[1] = "�� ����";
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= mutal_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								available_troops1--;
								arr1[0] = "�� ����";
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= mutal_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								sniper_hp_2 = sniper_hp;
								arr1[1] = "�� ����";
								available_troops1--;
							}
						}
					}
				} else if (arr6[4] == "thief" && arr1[0] != "�� ����" || arr1[1] != "�� ����") {
					j = (int) (Math.random() * 2);// 0~1����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 0) {
							tanker_hp_1 -= thief_attack;
							tanker_hp_1 += tanker_defense;
							if (tanker_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								tanker_hp_1 = tanker_hp;
							}
						} else if (j == 1) {
							tanker_hp_2 -= thief_attack;
							tanker_hp_2 += tanker_defense;
							if (tanker_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								tanker_hp_2 = tanker_hp;
							}
						}
					} else if (arr1[j] == "  Į��" || arr1[j] == "Į��(R)" || arr1[j] == "Į��(G)" || arr1[j] == "Į��(B)") {
						if (j == 0) {
							nife_hp_1 -= thief_attack;
							nife_hp_1 += nife_defense;
							if (nife_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								nife_hp_1 = nife_hp;
							}
						} else if (j == 1) {
							nife_hp_2 -= thief_attack;
							nife_hp_2 += nife_defense;
							if (nife_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								nife_hp_2 = nife_hp;
							}
						}
					} else if (arr1[j] == "���Ѻ�" || arr1[j] == "���Ѻ�(R)" || arr1[j] == "���Ѻ�(G)" || arr1[j] == "���Ѻ�(B)") {
						if (j == 0) {
							rifle_hp_1 -= thief_attack;
							rifle_hp_1 += rifle_defense;
							if (rifle_hp_1 <= 0) {
								rifle_hp_1 = rifle_hp;
								available_troops1--;
								arr1[0] = "�� ����";
							}
						} else if (j == 1) {
							rifle_hp_2 -= thief_attack;
							rifle_hp_2 += rifle_defense;
							if (rifle_hp_2 <= 0) {
								arr1[1] = "�� ����";
								rifle_hp_2 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[j] == "���ݺ�" || arr1[j] == "���ݺ�(R)" || arr1[j] == "���ݺ�(G)" || arr1[j] == "���ݺ�(B)") {
						if (j == 0) {
							sniper_hp_1 -= thief_attack;
							sniper_hp_1 += sniper_defense;
							if (sniper_hp_1 <= 0) {
								arr1[0] = "�� ����";
								available_troops1--;
								sniper_hp_1 = sniper_hp;
							}
						} else if (j == 1) {
							sniper_hp_2 -= thief_attack;
							sniper_hp_2 += sniper_defense;
							if (sniper_hp_2 <= 0) {
								arr1[1] = "�� ����";
								available_troops1--;
								sniper_hp_2 = sniper_hp;
							}
						}
					}
				} else if (arr6[4] == "thief" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= thief_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= thief_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= thief_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= thief_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= thief_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= thief_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								nife_hp_5 = nife_hp;
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= thief_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= thief_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								available_troops1--;
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							rifle_hp_5 -= thief_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= thief_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								sniper_hp_3 = sniper_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= thief_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= thief_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[4] == "mutal" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= mutal_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= mutal_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= mutal_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= mutal_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= mutal_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							nife_hp_5 -= mutal_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= mutal_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								rifle_hp_3 = rifle_hp;
							}
						} else if (j == 3) {
							rifle_hp_4 -= mutal_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								rifle_hp_4 = rifle_hp;
							}
						} else if (j == 4) {
							rifle_hp_5 -= mutal_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= mutal_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								arr1[2] = "�� ����";
								available_troops1--;
							}
						} else if (j == 3) {
							sniper_hp_4 -= mutal_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= mutal_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				} else if (arr6[4] == "hydra" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= hydra_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= hydra_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= hydra_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								available_troops1--;
								arr1[4] = "�� ����";
								tanker_hp_5 = tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= hydra_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								nife_hp_3 = nife_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							nife_hp_4 -= hydra_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								nife_hp_4 = nife_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							nife_hp_5 -= hydra_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								nife_hp_5 = nife_hp;
								available_troops1--;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= hydra_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= hydra_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								rifle_hp_4 = rifle_hp;
								arr1[3] = "�� ����";
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= hydra_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								rifle_hp_5 = rifle_hp;
								available_troops1--;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= hydra_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								sniper_hp_3 = sniper_hp;
							}
						} else if (j == 3) {
							sniper_hp_4 -= hydra_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								sniper_hp_4 = sniper_hp;
								available_troops1--;
								arr1[3] = "�� ����";
							}
						} else if (j == 4) {
							sniper_hp_5 -= hydra_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								sniper_hp_5 = sniper_hp;
								available_troops1--;
							}
						}
					}
				} else if (arr6[4] == "goblin" && arr1[0] == "�� ����" && arr1[1] == "�� ����" || arr1[2] != "�� ����"
						|| arr1[3] != "�� ����" || arr1[4] != "�� ����") {
					j = (int) (Math.random() * 3) + 2;// 2~4����
					if (arr1[j] == "  ��Ŀ" || arr1[j] == "��Ŀ(R)" || arr1[j] == "��Ŀ(G)" || arr1[j] == "��Ŀ(B)") {
						if (j == 2) {
							tanker_hp_3 -= goblin_attack;
							tanker_hp_3 += tanker_defense;
							if (tanker_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								tanker_hp_3 = tanker_hp;
							}
						} else if (j == 3) {
							tanker_hp_4 -= goblin_attack;
							tanker_hp_4 += tanker_defense;
							if (tanker_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								tanker_hp_4 = tanker_hp;
							}
						} else if (j == 4) {
							tanker_hp_5 -= goblin_attack;
							tanker_hp_5 += tanker_defense;
							if (tanker_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								tanker_hp_5 -= tanker_hp;
							}
						}
					} else if (arr1[0] == "  Į��" || arr1[0] == "Į��(R)" || arr1[0] == "Į��(G)" || arr1[0] == "Į��(B)") {
						if (j == 2) {
							nife_hp_3 -= goblin_attack;
							nife_hp_3 += nife_defense;
							if (nife_hp_3 <= 0) {
								arr1[2] = "�� ����";
								available_troops1--;
								nife_hp_3 = nife_hp;
							}
						} else if (j == 3) {
							nife_hp_4 -= goblin_attack;
							nife_hp_4 += nife_defense;
							if (nife_hp_4 <= 0) {
								available_troops1--;
								arr1[3] = "�� ����";
								nife_hp_4 = nife_hp;
							}
						} else if (j == 4) {
							nife_hp_5 -= goblin_attack;
							nife_hp_5 += nife_defense;
							if (nife_hp_5 <= 0) {
								available_troops1--;
								nife_hp_5 = nife_hp;
								arr1[4] = "�� ����";
							}
						}
					} else if (arr1[0] == "���Ѻ�" || arr1[0] == "���Ѻ�(R)" || arr1[0] == "���Ѻ�(G)" || arr1[0] == "���Ѻ�(B)") {
						if (j == 2) {
							rifle_hp_3 -= goblin_attack;
							rifle_hp_3 += rifle_defense;
							if (rifle_hp_3 <= 0) {
								arr1[2] = "�� ����";
								rifle_hp_3 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 3) {
							rifle_hp_4 -= goblin_attack;
							rifle_hp_4 += rifle_defense;
							if (rifle_hp_4 <= 0) {
								arr1[3] = "�� ����";
								rifle_hp_4 = rifle_hp;
								available_troops1--;
							}
						} else if (j == 4) {
							rifle_hp_5 -= goblin_attack;
							rifle_hp_5 += rifle_defense;
							if (rifle_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								rifle_hp_5 = rifle_hp;
							}
						}
					} else if (arr1[0] == "���ݺ�" || arr1[0] == "���ݺ�(R)" || arr1[0] == "���ݺ�(G)" || arr1[0] == "���ݺ�(B)") {
						if (j == 2) {
							sniper_hp_3 -= goblin_attack;
							sniper_hp_3 += sniper_defense;
							if (sniper_hp_3 <= 0) {
								sniper_hp_3 = sniper_hp;
								available_troops1--;
								arr1[2] = "�� ����";
							}
						} else if (j == 3) {
							sniper_hp_4 -= goblin_attack;
							sniper_hp_4 += sniper_defense;
							if (sniper_hp_4 <= 0) {
								arr1[3] = "�� ����";
								available_troops1--;
								sniper_hp_4 = sniper_hp;
							}
						} else if (j == 4) {
							sniper_hp_5 -= goblin_attack;
							sniper_hp_5 += sniper_defense;
							if (sniper_hp_5 <= 0) {
								arr1[4] = "�� ����";
								available_troops1--;
								sniper_hp_5 = sniper_hp;
							}
						}
					}
				}
			}
			if (zzzzz != 2) {
				zzzzz++;
			} else if (zzzzz == 2) {
				zzzzz = 0;
			}
		}
	}
}

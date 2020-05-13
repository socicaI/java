package Main;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int unit;

		Referense.Referense_Main re_m = new Referense.Referense_Main(); // Referense/Logo�� �ִ� �޼ҵ带 ����ϱ� ���� ����
		Referense.Referense_Base re_b = new Referense.Referense_Base();
		Place.Place_Shop shop = new Place.Place_Shop();
		Place.Place_base_Easy easy = new Place.Place_base_Easy();
		Th.Reference thread = new Th.Reference();
		Music.Music m1 = new Music.Music("king.wav");
		Music.Music2 m2 = new Music.Music2();

		thread.roading();
		m1.Play();
		a: while (true) { // ���� ������ �Ǿ��ų� ���� ȭ�鿡�� '���� ���'�� �����ϰ� �ǵ��� ���� �� �ٽ� ���� ȭ���� ��µǰ� �ϱ� ���ؼ� �ݺ������� ����

			/*
			 * ���� ���� ȭ�鿡�� 1.���� ���� 2.���� ��� 3.���� ���� ��ư ������ ��ư�� �������� �� Ư�� ����� ��µ� �� �ְ� �۾��� ����
			 */
			re_m.main(); // Referense/Logo���� �ʱ� ���� ȭ��
			num = sc.nextInt();

			while (num > 2 || num < 1) { // 1~3���� ���� �Է����� ��쿡 �ٸ� ���� Ŭ���ߴٰ� �����ϰ� �ٽ� ���� ȭ���� ��µǾ� �ν��� �ȵ� ��ó�� �����ֱ� ���� �ݺ�������
											// ����
				re_m.main();
				num = sc.nextInt();
			}
			if (num == 1) { // ���� ���� ���̵� ����â�� ���ɴϴ�.
				re_m.start();
				num = sc.nextInt();

				while (num > 2 || num < 1) {
					re_m.start();
					num = sc.nextInt();
				}
				m1.Stop();
				thread.roading();
				if (num == 1) { // ���̵� ������ �������� ���
					m2.start();
					Thread T = new Thread(easy);
					T.start();
					while (true) {
						num = sc.nextInt();
						while (num > 3 || num < 1) {
							easy.base();
							easy.easy();
							num = sc.nextInt();
						}
						if (num == 1) { // ���� ��ġ�� �������� ���
							T.suspend();
							easy.t = false;
							b: while (true) {
								easy.character();
								unit = sc.nextInt();
								while (num > 5 || num < 0) {
									easy.character();
									unit = sc.nextInt();
								}
								if (unit == 0) { // �ٽ� ��� ���� ȭ������ ��ȯ�ȴ�.
									T.resume();
									easy.t = true;
									break;
								} else if (unit < 6) { // 1������ 5�� ���� ���� �Է��ϸ� ������ ������ �� �ִ� â���� �Ѿ��.
									while (true) {
										re_b.unit();
										num = sc.nextInt();
										while (num < 0 || num > 4) {
											re_b.unit();
											num = sc.nextInt();
										}
										if (num == 0) { // �ٽ� ���� ��ġ ȭ������ ��ȯ�ȴ�.
											break;
										} else if (num == 1) {
											while (true) {
												easy.tanker1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.tanker1();
													num = sc.nextInt();
												}
												if (num == 1) { // ��Ŀ�� �����ϱ� ���� â�� ������, ���� ���ǿ� �����Ǹ� ��ġ ��Ͽ� �ö󰣴�.
													if (unit == 1) {
														easy.buy_tanker1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_tanker2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_tanker3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_tanker4();
														sc.next();
														continue b;
													} else {
														easy.buy_tanker5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										} else if (num == 2) { // Į�� �����ϱ� ���� â�� ������, ���� ���ǿ� �����Ǹ� ��ġ ��Ͽ� �ö󰣴�.
											while (true) {
												easy.nife1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.nife1();
													num = sc.nextInt();
												}
												if (num == 1) {
													if (unit == 1) {
														easy.buy_nife1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_nife2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_nife3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_nife4();
														sc.next();
														continue b;
													} else {
														easy.buy_nife5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										} else if (num == 3) { // ���Ѻ��� �����ϱ� ���� â�� ������, ���� ���ǿ� �����Ǹ� ��ġ ��Ͽ� �ö󰣴�.
											while (true) {
												easy.rifle1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.rifle1();
													num = sc.nextInt();
												}
												if (num == 1) {
													if (unit == 1) {
														easy.buy_rifle1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_rifle2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_rifle3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_rifle4();
														sc.next();
														continue b;
													} else {
														easy.buy_rifle5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										} else { // ���ݺ��� �����ϱ� ���� â�� ������, ���� ���ǿ� �����Ǹ� ��ġ ��Ͽ� �ö󰣴�.
											while (true) {
												easy.sniper1();
												num = sc.nextInt();
												while (num < 1 || num > 2) {
													easy.sniper1();
													num = sc.nextInt();
												}
												if (num == 1) {
													if (unit == 1) {
														easy.buy_sniper1();
														sc.next();
														continue b;
													} else if (unit == 2) {
														easy.buy_sniper2();
														sc.next();
														continue b;
													} else if (unit == 3) {
														easy.buy_sniper3();
														sc.next();
														continue b;
													} else if (unit == 4) {
														easy.buy_sniper4();
														sc.next();
														continue b;
													} else {
														easy.buy_sniper5();
														sc.next();
														continue b;
													}
												} else {
													break;
												}
											}
										}
									}
								}
							}
						} else if (num == 2) { // ������ �������� ���
							T.suspend();
							easy.t = false;
							while (true) {
								easy.inven();
								shop.component();
								num = sc.nextInt();
								while (num > 3 || num < 0) {
									shop.component();
									num = sc.nextInt();
								}
								if (num == 0) {
									T.resume();
									easy.t = true;
									break;
								} else if (num == 1) { // �������� ��� ������ �������� ��� ��� ������ �� ������ ���´�.
									shop.blue();
									num = sc.nextInt();
									while (num > 2 || num < 1) {
										shop.blue();
										num = sc.nextInt();
									}
									while (true) {
										if (num == 1) { // ��� ������ ���� ���θ� ����� �����ϰ� �Ǹ� �κ��丮�� ��� �̵��ȴ�.
											easy.buy_blue();
											sc.next();
											break;
										} else {
											break;
										}
									}
								} else if (num == 2) { // �������� ���� ������ �������� ��� ��� ������ �� ������ ���´�.
									shop.red();
									num = sc.nextInt();
									while (num > 2 || num < 1) {
										shop.red();
										num = sc.nextInt();
									}
									while (true) {
										if (num == 1) { // ���� ������ ���� ���θ� ����� �����ϰ� �Ǹ� �κ��丮�� ��� �̵��ȴ�.
											easy.buy_red();
											sc.next();
											break;
										} else {
											break;
										}
									}
								} else { // �������� �׸� ������ �������� ��� ��� ������ �� ������ ���´�.
									shop.green();
									num = sc.nextInt();
									while (num > 2 || num < 1) {
										shop.green();
										num = sc.nextInt();
									}
									while (true) {
										if (num == 1) { // �׸� ������ ���� ���θ� ����� �����ϰ� �Ǹ� �κ��丮�� ��� �̵��ȴ�.
											easy.buy_green();
											sc.next();
											break;
										} else {
											break;
										}
									}
								}
							}
						} else if (num == 3) { // �κ��丮�� �������� ���
							T.suspend();
							easy.t = false;
							while (true) {
								easy.inventory();
								num = sc.nextInt();
								while (num < 0 || num > 5) {
									easy.inventory();
									num = sc.nextInt();
								}
								if (num == 0) { // �κ��丮���� �ٽ� �ʱ� ȭ������ �̵�
									T.resume();
									easy.t = true;
									break;
								} else if (num == 1) { // �κ��丮���� 1���� �������� ���
									while (true) {
										easy.if_ston1();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston1();
											num = sc.nextInt();
										}
										if (num == 1) { // ���� ������ ������ ���� �����ϴ� �ʵ忡 ���ϴ� ���ֿ� ������ �� �ְ� ������ �� �ִ�.
											easy.character();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												easy.character();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue1(1);
												easy.add_red1(1);
												easy.add_green1(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue1(2);
												easy.add_red1(2);
												easy.add_green1(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue1(3);
												easy.add_red1(3);
												easy.add_green1(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue1(4);
												easy.add_red1(4);
												easy.add_green1(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue1(5);
												easy.add_red1(5);
												easy.add_green1(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else if (num == 2) { // 2���� �������� ���
									while (true) {
										easy.if_ston2();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston2();
											num = sc.nextInt();
										}
										if (num == 1) {
											easy.character();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												easy.character();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue2(1);
												easy.add_red2(1);
												easy.add_green2(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue2(2);
												easy.add_red2(2);
												easy.add_green2(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue2(3);
												easy.add_red2(3);
												easy.add_green2(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue2(4);
												easy.add_red2(4);
												easy.add_green2(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue2(5);
												easy.add_red2(5);
												easy.add_green2(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else if (num == 3) { // 3���� �������� ���
									while (true) {
										easy.if_ston3();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston3();
											num = sc.nextInt();
										}
										if (num == 1) {
											easy.character();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												easy.character();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue3(1);
												easy.add_red3(1);
												easy.add_green3(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue3(2);
												easy.add_red3(2);
												easy.add_green3(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue3(3);
												easy.add_red3(3);
												easy.add_green3(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue3(4);
												easy.add_red3(4);
												easy.add_green3(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue3(5);
												easy.add_red3(5);
												easy.add_green3(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else if (num == 4) { // 4���� �������� ���
									while (true) {
										easy.if_ston4();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston4();
											num = sc.nextInt();
										}
										if (num == 1) {
											re_b.unit1();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												re_b.unit1();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue4(1);
												easy.add_red4(1);
												easy.add_green4(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue4(2);
												easy.add_red4(2);
												easy.add_green4(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue4(3);
												easy.add_red4(3);
												easy.add_green4(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue4(4);
												easy.add_red4(4);
												easy.add_green4(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue4(5);
												easy.add_red4(5);
												easy.add_green4(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								} else { // 5���� �������� ���
									while (true) {
										easy.if_ston5();
										num = sc.nextInt();
										while (num > 2 || num < 1) {
											easy.if_ston5();
											num = sc.nextInt();
										}
										if (num == 1) {
											re_b.unit1();
											num = sc.nextInt();
											while (num > 5 || num < 0) {
												re_b.unit1();
												num = sc.nextInt();
											}
											if (num == 1) {
												easy.add_blue5(1);
												easy.add_red5(1);
												easy.add_green5(1);
												sc.next();
												break;
											} else if (num == 2) {
												easy.add_blue5(2);
												easy.add_red5(2);
												easy.add_green5(2);
												sc.next();
												break;
											} else if (num == 3) {
												easy.add_blue5(3);
												easy.add_red5(3);
												easy.add_green5(3);
												sc.next();
												break;
											} else if (num == 4) {
												easy.add_blue5(4);
												easy.add_red5(4);
												easy.add_green5(4);
												sc.next();
												break;
											} else if (num == 5) {
												easy.add_blue5(5);
												easy.add_red5(5);
												easy.add_green5(5);
												sc.next();
												break;
											} else {
												break;
											}
										} else {
											break;
										}
									}
								}
							}
						} else { // ���� ��ġ �ϷḦ �������� ���
							while (true) {
								easy.war();
								num = sc.nextInt();
								while (num < 1 || num > 2) {
									easy.war();
									num = sc.nextInt();
								}
								if (num == 1) {
									easy.reset();
									break;
								} else {
									break;
								}
							}
						}
					}

				}  else { // ���̵� ������� �������� ���
					 // ���� ����� ���ɴϴ�.
					while (true) { // ���� ����� 1������
						re_m.how_to_play1();
						num = sc.nextInt();
						while (num > 2 || num < 1) {
							re_m.how_to_play1();
							num = sc.nextInt();
						}
						if (num == 1) { // �ʱ� ���� ȭ������ �̵��Ѵ�.
							break;
						} else {
							while (true) { // ���� ����� 2������
								re_m.how_to_play2();
								num = sc.nextInt();
								while (num > 2 || num < 1) {
									re_m.how_to_play1();
									num = sc.nextInt();
								}
								if (num == 1) { // �ʱ� ���� ȭ������ �̵��Ѵ�.
									continue a;
								} else { // ���� ����� 1�������� ��ȯ�� �ȴ�.
									break;
								}
							}
						}
					}
				}

			} else { // 3.���� ���Ḧ �������� �� �ʱ� ���� ȭ���� ���������� ���� ���� �޽��� ��µǸ鼭 ���μ��� ����ȴ�.
				break;
			}
		}
		re_m.end();
	}
}

package Th;

public class Reference extends Thread{
	public void roading() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
			System.out.println("`8.`888b                 ,8'          .8.          8 888888888o.   \r\n"
					+ " `8.`888b               ,8'          .888.         8 8888    `88.  \r\n"
					+ "  `8.`888b             ,8'          :88888.        8 8888     `88  \r\n"
					+ "   `8.`888b     .b    ,8'          . `88888.       8 8888     ,88  \r\n"
					+ "    `8.`888b    88b  ,8'          .8. `88888.      8 8888.   ,88'  \r\n"
					+ "     `8.`888b .`888b,8'          .8`8. `88888.     8 888888888P'   \r\n"
					+ "      `8.`888b8.`8888'          .8' `8. `88888.    8 8888`8b       \r\n"
					+ "       `8.`888`8.`88'          .8'   `8. `88888.   8 8888 `8b.     \r\n"
					+ "        `8.`8' `8,`'          .888888888. `88888.  8 8888   `8b.   \r\n"
					+ "         `8.`   `8'          .8'       `8. `88888. 8 8888     `88. -전 to the 쟁-");
			System.out.println();
			System.out.println("\t\t========로딩중입니다. 잠시만 기다려주세요========");
			System.out.print("\t\t");
			for (int y = 0; y < 15; y++) {
				System.out.print("◎");
				Thread.sleep(55);
				for (int z = 0; z < 1; z++) {
					System.out.print("○");
					Thread.sleep(55);
				}
			}
			for (int x = 0; x < 100; x++) {
				System.out.println(" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

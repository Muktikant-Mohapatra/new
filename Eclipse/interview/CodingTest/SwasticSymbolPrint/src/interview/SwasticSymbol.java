package interview;

public class SwasticSymbol {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			if (i == 0) {
				System.out.print("            ");
			}
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					System.out.print("*");

				}
			}

		}
		System.out.println();
		for (int j = 0; j < 2; j++) {
			for (int j2 = 0; j2 < 3; j2++) {
				for (int k = 0; k < 2; k++) {

					if (j == 1) {
						for (int i = 0; i < 4; i++) {
							System.out.print("*");

						}

					} else if (j2 == 2) {
						System.out.print("*");
						System.out.println("          *");
					} else {
						System.out.println("           *");
					}
				}
			}
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			if (i > 0) {
				System.out.print("     ");
			}
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					if (j < 1 && i < 1) {
						System.out.println("           *           *");

					} else if (i > 0) {
						System.out.print("*");
					} else {
						System.out.println("           *");
					}
				}
			}
		}

	}
}

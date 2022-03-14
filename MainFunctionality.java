public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which service would you like to use? \n" + "[1] : Basic week visualizer \n" + "[2] : Advanced week visualizer \n" + "[3] : Basic calculator \n" + "[4] : Employee repertoire"  );
		int i = scan.nextInt();
		switch (i) {
		case 1:
			BasicWeek();
			break;
		case 2:
			AdvancedWeek();
			break;
		case 3:
			Basiccalculator();
			break;
		case 4:
			Employee();
			break;
		default :
			System.out.println("Please make sure you pick a number between 1 and 4");
		}
	}

}
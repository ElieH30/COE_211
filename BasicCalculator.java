public static void BasicCalculator () {
Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number:");
		int n1 = scan.nextInt();
		System.out.println("Input the operator");

		char o = scan.next().charAt(0);
		System.out.println("Input the second number:");
		int n2 = scan.nextInt();
		
		switch(o) {
		case '+':
			int a = n1 + n2;
			System.out.println(n1 + " +" + n2 + "=" + a);
			break;
		case '-':
			int s = n1 - n2;
			System.out.println(n1 + " -" + n2 + "=" + s);
			break;
		case '*':
			int m = n1 * n2;
			System.out.println(n1 + " *" + n2 + "=" + m);
			break;
		case '/':
			int d = n1/n2;
			System.out.println(n1 + " +" + n2 + "=" + d);
			break;
			
		default:
			System.out.println("Invalid operator");
			break;
		}
		
		
    }
     
 public static void Employee (){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the employee's first name: ");
		String fname = scan.next();
		System.out.println("Please input the employee's last name: ");
		String lname = scan.next();
		System.out.println("Please input the employee's age: ");
		int age = scan.nextInt();
		System.out.println("Please input the employee's salary: ");
		Double salary = scan.nextDouble();
		
		System.out.println(fname+" "+ lname +","+" "+ age +"," +" " + salary);
	}
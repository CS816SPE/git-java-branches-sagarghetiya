import java.util.*;
class clac{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("Enter your choice : ");
			System.out.println("1. Add two numbers");
			System.out.println("2. Exit");	
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice){
				case 1:
					System.out.println("Enter two numbers : ");
					float a = sc.nextFloat();
					sc.nextLine();
					float b = sc.nextFloat();
					sc.nextLine();
					System.out.println("Addition is : "+(a+b));
					break;
				case 2:
					System.out.println("Enter two numbers : ");
					float a = sc.nextFloat();
                                        sc.nextLine();
                                        float b = sc.nextFloat();
                                        sc.nextLine();
                                        System.out.println("Subtraction is : "+(a-b));
					System.exit(0);
					break;
				default:
					System.out.println("INVALID CHOICE !!! ");

			}
		}while(choice != 2);
		sc.close();
	}
}

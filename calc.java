package mycalc;
import java.util.*;
class clac{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("Enter your choice : ");
			System.out.println("1. Add two numbers");
			System.out.println("2. Substract two numbers");
			System.out.println("3. Multiply two numbers");	
			System.out.println("4. Exit");
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
					float i = sc.nextFloat();
                                        sc.nextLine();
                                        float j = sc.nextFloat();
                                        sc.nextLine();
                                        System.out.println("Subtraction is : "+(i-j));
				case 3:
					System.out.println("Enter two numbers : ");
					float k = sc.nextFloat();
					sc.nextLine();
					float l = sc.nextFloat();
					sc.nextLine();
					System.out.println("Multiplication is : "+(k*l));
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("INVALID CHOICE !!! ");
					break;
			}
		}while(choice != 4);
		sc.close();
	}
}

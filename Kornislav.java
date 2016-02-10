import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		int input1,input2,input3,input4,current;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value_1 : ");
		input1=scan.nextInt();
		System.out.print("Input Value_2 : ");
		input2=scan.nextInt();
		System.out.print("Input Value_3 : ");
		input3=scan.nextInt();
		System.out.print("Input Value_4 : ");
		input4=scan.nextInt();
		if(input1>input2){
		current=input1;
		input1=input2;
		input2=current;
		}
		if(input1>input3){
		current=input1;
		input1=input3;
		input3=current;
		}
		if(input1>input4){
		current=input1;
		input1=input4;
		input4=current;
		}
		if(input2>input3){
		current=input2;
		input2=input3;
		input3=current;
		}
		if(input2>input4){
		current=input2;
		input2=input4;
		input4=current;
		}
		if(input3>input4){
		current=input3;
		input3=input4;
		input4=current;
		}
		System.out.print("\nRectangle Area is : "+""+input3+""+" * "+input1+" = "+input3*input1);
	}

}

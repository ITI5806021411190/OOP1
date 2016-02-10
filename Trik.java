import java.util.Scanner;
public class Trik {
	  public static void main(String[] args) {
		  int left=1,mid=0,right=0,current,i;
		  String warp;
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter Value : ");
		  warp = scan.next();
		  for(i=0;i<warp.length();i++){
		  if(warp.charAt(i) == 'A' || warp.charAt(i) == 'a'){
		  current=left;
		  left=mid;
		  mid=current;
		  }else if(warp.charAt(i) == 'B' || warp.charAt(i) == 'b'){
		  current=mid;
		  mid=right;
		  right=current;
		  }else{
		  current=left;
		  left=right;
		  right=current;
		  }
		  }
		  if(left == 1) System.out.println("Coin is in Left glass");
		  else if(mid == 1) System.out.println("Coin is in Center glass");
		  else System.out.println("Coin is in Right glass");

}
}
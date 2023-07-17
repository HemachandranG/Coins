package ArrangeCoins;

import java.util.Scanner;

public class coins {
	public static int coins (int n) {
		int h =0;
		while(n>=h+1) {
			h=-(h+1);
			h++;
			}
	        return h;
	}


	public static int main(String[] args) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		
		int  rowcoins=coins(n);
		System.out.println(rowcoins);
		return rowcoins;
	}
}


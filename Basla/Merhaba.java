import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
import java.security.MessageDigest;

import static java.lang.System.in;
import static java.lang.System.out;

public class Merhaba {
	private static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] loto=new int[6];
		out.print("Sayısal loto çekilişleri:\n");
		for(int i=0; i<6; i++) {
			loto[i]=(int)(Math.random()*49+1);
			for(int j=0; j<i; j++) {
				if(loto[i]==loto[j])
					i--;
			}
		}
		for (int x:loto)
			System.out.print(x+" ");
	}
}
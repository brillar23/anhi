package st_1110;

import java.util.Scanner;

public class �����������ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� �� �Է�");
		int hak = sc.nextInt();
		
		int[] jum=new int[hak];
		System.out.println("���� ���� "+hak+"�� �Է�");
		for(int i=0; i<hak; i++) {
			jum[i]=sc.nextInt();
		}
		
		int[] result=new int[hak];
		
		for(int i=0; i<hak; i++) {
			int count =1;
			for(int j=0; j<hak; j++) {
				if(jum[i]<jum[j]) {
					count++;
				}
			}
			
			result[i] =count;
		}
		for(int i:result) {
			System.out.print("  "+i);
		}
		
		
	}

}

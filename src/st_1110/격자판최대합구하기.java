package st_1110;

import java.util.Scanner;

public class �������ִ��ձ��ϱ� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ����� �Է��ϼ���(2~50 �� ����)");
		int size=sc.nextInt();
		int[][] arr=new int[size][size];
		
		System.out.println("�����ǿ� �� ���ڸ� �Է��ϼ���");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int line=0; 
		int max=0;
		int row=0;
		int col=0;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				row+= arr[i][j];
				col+= arr[j][i];
			}
			line=Math.max(line, row);
			line=Math.max(line, col);
		}
		row=col=0;
		for(int i=0; i<size; i++) {
			row+=arr[i][i];
			col+=arr[i][size-i-1];
		}
		
		line=Math.max(max, row);
		line=Math.max(max, col);
		
		System.out.println("�ִ����� "+line+"�Դϴ�.");
	}
	


}

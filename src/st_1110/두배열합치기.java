package st_1110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class �ι迭��ġ�� {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("�迭1�� ����");
		int size1= sc.nextInt();
		
		System.out.println("�迭2�� ����");
		int size2= sc.nextInt();
		
		System.out.println("�迭1�� ������ ���� ������������ �Է�");
		int[] arr1 =new int[size1];
		for(int i=0; i<size1; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("�迭2�� ������ ���� ������������ �Է�");
		int[] arr2= new int[size2];
		for(int i=0; i<size2; i++) {
			arr2[i]=sc.nextInt();
		}
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0; i<size1; i++) {
			list.add(arr1[i]);
		}
		
		for(int i=0; i<size2; i++) {
			list.add(arr2[i]);
		}
		
		Collections.sort(list);
		
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
	}

}

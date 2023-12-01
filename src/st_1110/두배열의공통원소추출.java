package st_1110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class �ι迭�ǰ���������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�迭1�� ����");
		int size1 = sc.nextInt();

		System.out.println("�迭2�� ����");
		int size2 = sc.nextInt();

		System.out.println("�迭1�� ������ ���� ������������ �Է�");
		int[] arr1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("�迭2�� ������ ���� ������������ �Է�");
		int[] arr2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		List<Integer> list=new ArrayList<>();
		
		Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 =0, p2=0;
        while(p1<size1 && p2<size2){
            if(arr1[p1] == arr2[p2]){
                list.add(arr1[p1++]);
                p2++;
            }else if(arr1[p1] < arr2[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
	}

}

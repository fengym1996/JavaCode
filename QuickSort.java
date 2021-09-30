package cn.subject;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,6,1,8,5};
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
		 
		 /**
		16  * ���ź����㷨���ݹ�ʵ��
		17  * @param array
		18  * @param left
		19  * @param right
		20  */
		 public static void sort(int[] array, int left, int right) {
		     if(left > right) {
		         return;
		     }
		     // base�д�Ż�׼��
		     int base = array[left];
		     int i = left, j = right;
		     while(i != j) {
		         // ˳�����Ҫ���ȴ��ұ߿�ʼ�����ң�ֱ���ҵ���baseֵС����
		         while(array[j] >= base && i < j) {
		             j--;
		         }
		 
		         // �ٴ������ұ��ң�ֱ���ҵ���baseֵ�����
		         while(array[i] <= base && i < j) {
		             i++;
		         }
		 
		         // �����ѭ��������ʾ�ҵ���λ�û���(i>=j)�ˣ������������������е�λ��
		         if(i < j) {
		             int tmp = array[i];
		             array[i] = array[j];
		             array[j] = tmp;
		         }
		     }
		 
		     // ����׼���ŵ��м��λ�ã���׼����λ��
		     array[left] = array[i];
		     array[i] = base;
		 
		     // �ݹ飬�������׼����������ִ�к�����ͬ���Ĳ���
		     // i��������Ϊ������ȷ���õĻ�׼ֵ��λ�ã������ٴ���
		     sort(array, left, i - 1);
		     sort(array, i + 1, right);
		 }
	

}

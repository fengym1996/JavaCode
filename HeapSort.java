package cn.subject;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {16, 7, 3, 20, 17, 8};

	        heapSort(arr);
	        System.out.println(Arrays.toString(arr));

	}
	public static void heapSort(int[]arr) {
		//������
		for(int i=(arr.length-1)/2;i>=0;i--) {
			adjustHeap(arr, i, arr.length);
		}
		//�����ѽṹ+�����Ѷ�Ԫ����ĩβԪ��
		for(int i=arr.length-1;i>0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			//���¶Զѽ��е���
			adjustHeap(arr, 0, i);
		}
	}
	private static void adjustHeap(int[] arr,int parent,int length) {
		int temp=arr[parent];   //����Ϊ���ڵ�temp
		int lChild=2*parent+1;   //����
		while(lChild<length) {
			int rChild=lChild+1;   //�Һ���
			//������Һ������Һ��ӽڵ��ֵ�������ӽڵ��ֵ
			if(rChild<length&&arr[lChild]<arr[rChild]) {
				lChild++;
			}
			//������ڵ��ֵ�Ѵ����ӽڵ��ֱֵ�ӽ���
			if(temp>=arr[lChild]) {
				break;
			}
			arr[parent]=arr[lChild];   //���ӽڵ��ֵ�������ڵ�
			parent=lChild;
			lChild=2*lChild+1;
		}
		arr[parent]=temp;
	}



}

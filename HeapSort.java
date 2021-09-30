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
		//创建堆
		for(int i=(arr.length-1)/2;i>=0;i--) {
			adjustHeap(arr, i, arr.length);
		}
		//调整堆结构+交换堆顶元素与末尾元素
		for(int i=arr.length-1;i>0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			//重新对堆进行调整
			adjustHeap(arr, 0, i);
		}
	}
	private static void adjustHeap(int[] arr,int parent,int length) {
		int temp=arr[parent];   //将作为父节点temp
		int lChild=2*parent+1;   //左孩子
		while(lChild<length) {
			int rChild=lChild+1;   //右孩子
			//如果有右孩子且右孩子节点的值大于左孩子节点的值
			if(rChild<length&&arr[lChild]<arr[rChild]) {
				lChild++;
			}
			//如果父节点的值已大于子节点的值直接结束
			if(temp>=arr[lChild]) {
				break;
			}
			arr[parent]=arr[lChild];   //把子节点的值赋给父节点
			parent=lChild;
			lChild=2*lChild+1;
		}
		arr[parent]=temp;
	}



}

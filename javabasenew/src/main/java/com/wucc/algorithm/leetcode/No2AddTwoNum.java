package com.wucc.algorithm.leetcode;

import com.sun.deploy.uitoolkit.impl.awt.AWTAnimationPanel2;

import java.util.List;

/**
 * <p>
 *题目描述
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 题目解析
 * 设立一个表示进位的变量carried，建立一个新链表，把输入的两个链表从头往后同时处理，每两个相加，将结果加上carried后的值作为一个新节点到新链表后面。
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-30 15:47
 */
public class No2AddTwoNum {

	static class ListNode{
		Integer value;
		ListNode next;

		public ListNode(Integer value) {
			this.value = value;
		}
	}

	public static ListNode addTwoNum(ListNode listNode1,ListNode listNode2){
		ListNode listNodeAdd = new ListNode(-1);
        ListNode cur = listNodeAdd;
		int  carried = 0;
		while (null != listNode1 || null != listNode2){
			Integer num1 = null==listNode1?0:listNode1.value;
			Integer num2 = null==listNode2?0:listNode2.value;
			Integer sum = num1 + num2 + carried;
			carried = sum / 10;
			sum = sum % 10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			if(null != listNode1){
				listNode1 = listNode1.next;
			}
			if(null != listNode2){
				listNode2 = listNode2.next;
			}

		}
		if(1 == carried){
			cur.next =new ListNode(carried);
		}


		return listNodeAdd.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		ListNode listNode = addTwoNum(l1, l5);

		while (null != listNode){
			System.out.println(listNode.value);
			listNode = listNode.next;
		}
	}
}

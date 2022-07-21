package com.kirby.algorithms.doublelinkedlist;

public class ReverseDoubleLinkedListProblem {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		list.addToHead("1");
		list.addToTail("2");
		list.addToTail("3");
		list.addToTail("4");

		list.printList(list.head);

		Node reverse = list.reverse(list);

		list.printList(reverse);

	}

}

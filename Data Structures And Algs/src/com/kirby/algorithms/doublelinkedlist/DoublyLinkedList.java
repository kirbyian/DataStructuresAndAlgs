package com.kirby.algorithms.doublelinkedlist;

public class DoublyLinkedList {

	public Node head;
	public Node tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * Adds data to the head of a DLL. O(1) complexity
	 * 
	 * @param data
	 */
	public void addToHead(String data) {
		Node newHead = new Node(data);
		Node currentHead = this.head;

		if (currentHead != null) {
			currentHead.setPreviousNode(newHead);
			newHead.setNextNode(currentHead);
		}
		this.head = newHead;

		if (this.tail == null) {
			this.tail = newHead;
		}
	}

	/**
	 * Adds data to the tail of a DLL. O(1) complexity
	 * 
	 * @param data
	 */
	public void addToTail(String data) {
		Node newTail = new Node(data);
		Node currentTail = this.tail;

		if (currentTail != null) {
			currentTail.setNextNode(newTail);
			newTail.setPreviousNode(currentTail);
		}
		this.tail = newTail;

		if (this.head == null) {
			this.head = newTail;
		}
	}

	/**
	 * Prints the contents of a DLL from head to tail
	 * 
	 * @param head
	 * @return
	 */
	public String printList(Node head) {
		Node currentNode = head;
		String output = "<head> ";
		while (currentNode != null) {
			output += currentNode.data + " ";
			currentNode = currentNode.getNextNode();
		}
		output += "<tail>";
		System.out.println(output);
		return output;
	}

	/**
	 * Reverses the order of a DLL
	 * 
	 * @param llist
	 * @return
	 */
	public static Node reverse(DoublyLinkedList llist) {

		Node temp = llist.head;
		Node newHead = llist.head;

		while (temp != null) {
			Node prev = temp.getPreviousNode();
			temp.setPreviousNode(temp.getNextNode());
			temp.setNextNode(prev);
			newHead = temp;
			temp = temp.getPreviousNode();

		}

		return newHead;

	}

}
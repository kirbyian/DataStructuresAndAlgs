package com.kirby.algorithms.linkedlist;

/**
 * Linkedlist contains a list of Nodes which contain a reference to the next
 * node and the data they store.
 * 
 * Advantages Insert at head 0(1) Can tranverse in Order
 * 
 * Disadvantages Deletion is O(n) Search is O(n) Insert at Tail is O(n)
 * 
 * @author iankirby
 *
 */
public class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void addToHead(Node node) {
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void addToTail(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
	}

	public void printTravsersal() {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	public Node removeNode(Node node) {
		if (head == node) {
			head = head.getNext();
			return head;
		} else {
			Node current = head;
			while (current != null) {
				if (current.getNext() == node) {
					current.setNext(node.getNext());
					return node;
				}
				current = current.getNext();
			}
			return null;
		}
	}

	public Node findNode(String data) {
		if (head == null) {
			return head;
		} else {
			Node current = head;
			while (current != null) {
				if (current.getData().equals(data)) {
					return current;
				}
				current = current.getNext();
			}
			return null;
		}
	}

}

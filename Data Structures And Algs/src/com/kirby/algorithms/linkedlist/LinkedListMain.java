package com.kirby.algorithms.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		Node firstNode=new Node("FirstNode");
		Node secondNode=new Node("SecondNode");
		Node thirdNode=new Node("thirdNode");
		
		list.addToHead(firstNode);
		
		list.addToHead(secondNode);
		list.addToTail(thirdNode);
		list.removeNode(secondNode);
		
		list.printTravsersal();
		
		//Node findNode = list.findNode("thirdNode");
		
		//System.out.println(findNode.getData());

	}

}

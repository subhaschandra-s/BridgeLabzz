package com.bridgelab.Datastructure.Base;

public class Linkedlist 
{
class Node{
	Object data;
	Node next;
	Node(Object data){
		this.data=data;
	}
}
Node head;
 public void add(Object obj) {
	 Node n=new Node(obj);
	 if(head==null) {
		 head=n;
		 return;
	 }
	 Node t=head;
	 while(t.next!=null) {
		 t=t.next; 
	 }
	 t.next=n;
 }
 public String toString()
 {
 	String st="";
 	Node t=head;
 	while(t!=null)
 	{
 		st=st+t.data;
 		if(t.next!=null)
 			st=st+"-->";
 		t=t.next;
 	}
 	return st;
 	
}
}

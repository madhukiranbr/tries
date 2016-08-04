class node {
	public node(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}
	int data;
	node next;
}
public class linkedlist {
	node head;
	public linkedlist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ls = new linkedlist();
		
		ls.add(5);
		System.out.println(ls.size());
		System.out.println(ls.size());


		ls.add(50,1);
		ls.add(500);
		ls.add(4);

		ls.print();
		ls.reverse();
		System.out.println(ls.size());
	}

	private void reverse() {
		// TODO Auto-generated method stub
		linkedlist ls =this;
		if (ls.size() == 0) return;
		int l=ls.size();
		while(l <= 0){
			//head.
		}
	}

	private void print() {
		// TODO Auto-generated method stub
		node head=this.head;
		while(head != null) {
			System.out.print(head.data);
			head = head.next;
		}
		System.out.println();
	}

	private void add(int data, int index) {
		// TODO Auto-generated method stub
		node tmp = new node(data);
		node head = this.head;
		if (head == null && index==0) head = tmp;
		else if( head == null && index != 0) {
			throw new IndexOutOfBoundsException();
		}
		while (index != 0 && head.next != null) {
			head = head.next;
			index--;
		}
		if (head == null) throw new IndexOutOfBoundsException();
		node next = head.next;
		head.next= tmp;
		tmp.next = next;
	}

	private void add(int i) {
		node tmp = new node(i);
		
		if (head == null) head = tmp;
		else {
			node head = this.head;
			while (head.next != null) head = head.next;
			head.next = tmp;
		}
	}

	private int size() {
		// TODO Auto-generated method stub
		int val = 0;
		node head = this.head;
		if (head != null){
			while (head != null) {head = head.next;val++;}
		}
		return val;
	}
	

}

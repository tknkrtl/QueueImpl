
public class Queue {

	public int queuesize = 5 ;
	public int queue[] = new int [queuesize];
	public int rear,front,size;
	
	
	public void enQueue(int value) {
		
		if(size==queuesize) {
		System.out.println("Queue is Full !");
		}
		else {
		queue[rear] = value;
		rear = ( rear + 1 ) % queuesize;
		size++;
		}
		
	}
	public void deQueue() {
		
		if(size==0) {
		System.out.println("Queue is Empty !");
		}
		else {
		front = (front + 1) % queuesize;
		size--;
		}
		
	}
	
	public void print() {
		
		for(int i=0 ; i<size ; i++) {
			
			System.out.println(queue[(front+i)%queuesize]);
			
		}
		
	}
	
	
}

package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 1;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}

	public void increaseBy(int i) {
	}

    public void decreaseBy(int i) {
    }

    public void multiplyBy(int i) {
    }
	
}

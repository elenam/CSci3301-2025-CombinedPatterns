
public class DuckCall implements Quackable {
	ObservingQuacks myObservers;

	public DuckCall() {
		myObservers = new ObservingQuacks(this);
	}
 
	/*
	 * Calls used by hunters
	 */
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(QuackObserver observer) {
		myObservers.registerObserver(observer);
	}

	public void notifyObservers() {
		myObservers.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
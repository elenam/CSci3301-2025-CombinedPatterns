
public class DecoyDuck implements Quackable {
	ObservingQuacks observable;

	public DecoyDuck() {
		observable = new ObservingQuacks(this);
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(QuackObserver observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
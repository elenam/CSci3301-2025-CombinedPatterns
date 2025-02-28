public class RubberDuck implements Quackable {
	ObservingQuacks myObservers;  

	public RubberDuck() {
		myObservers = new ObservingQuacks(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(QuackObserver observer) {
		myObservers.registerObserver(observer);
	}

	public void notifyObservers() {
		myObservers.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
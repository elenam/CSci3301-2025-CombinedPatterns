public class RedheadDuck implements Quackable {
	// after adding the observer pattern each duck is observable,
	// keeping the list of its observers in its instance of
	// ObservingQuacks
	ObservingQuacks myObservers;

	public RedheadDuck() {
		myObservers = new ObservingQuacks(this);
	}

	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	public void registerObserver(QuackObserver observer) {
		myObservers.registerObserver(observer);
	}

	public void notifyObservers() {
		myObservers.notifyObservers();
	}

	public String toString() {
		return "Redhead Duck";
	}
}
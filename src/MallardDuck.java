public class MallardDuck implements Quackable {
	ObservingQuacks myObservers;
 
	public MallardDuck() {
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
		return "Mallard Duck";
	}
}
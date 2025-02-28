/*
 * Using adapter pattern to make a goose quackable without
 * changing the Goose class
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	ObservingQuacks observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new ObservingQuacks(this);
	}
 
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void registerObserver(QuackObserver observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
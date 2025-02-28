import java.util.List;
import java.util.ArrayList;


public class ObservingQuacks implements QuackObservable {
	List<QuackObserver> observers = new ArrayList<QuackObserver>();
	QuackObservable duck;
 
	public ObservingQuacks(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(QuackObserver observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		/*
		 * Simplified the loop into a simple for-each loop
		 */
		for (QuackObserver observer: observers) {
			observer.update(duck);
		}
	}
}
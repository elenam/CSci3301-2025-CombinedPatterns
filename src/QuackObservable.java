/*
 * Observer pattern: allows updating the Quackologist 
 * every time a quack happens. 
 * 
 */
public interface QuackObservable {
	public void registerObserver(QuackObserver observer);
	public void notifyObservers();
}
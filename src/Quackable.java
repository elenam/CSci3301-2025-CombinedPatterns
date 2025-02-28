/*
 * Since we are observing quacks, we are making Quackable 
 * to be QuackObservable
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
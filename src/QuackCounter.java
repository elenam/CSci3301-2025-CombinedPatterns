/*
 * We are decorating a duck with a class that counts
 * its quacks, without modifying the duck classes.
 * We will call the quack method on the decorated object. 
 */

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks; //static quack counter
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	public void registerObserver(QuackObserver observer) {
		duck.registerObserver(observer);
	}
 
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
	public String toString() {
		return duck.toString();
	}
}
/*
 * Creating ducks for which we keep track of quacks (counting 
 * was added via Decorator pattern, see QuackCounter. 
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
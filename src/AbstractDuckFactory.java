/*
 * We can create regular ducks or decorated ducks - 
 * ducks for which we count quacks
 */

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
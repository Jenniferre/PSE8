package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * This class represents a FeedingStrategy in which the hamster feeds once every
 * feed zone.
 *
 */
public final class FeedOnceStrategy implements FeedingStrategy {
	private int foodCount = 0;

	@Override
	public boolean isFeedingRequired() {
		if (foodCount == 0) {
			foodCount++;
			return true;
		}
		foodCount = 0;
		return false;

	}

}

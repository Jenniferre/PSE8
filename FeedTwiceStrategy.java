package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

public final class FeedTwiceStrategy implements FeedingStrategy {
	int foodCounter = 0;

	@Override
	public boolean isFeedingRequired() {
		if (foodCounter < 2) {
			foodCounter++;
			return true;
		}
		foodCounter = 0;
		return false;
	}

}

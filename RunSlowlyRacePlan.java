package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * This Class represents a raceplan, where the hamster moves slowly.
 */
public final class RunSlowlyRacePlan implements RacePlan {
	@Override
	public void nextStep(final RunnerHamster hamster) {
		hamster.runSlowly();
	}

}

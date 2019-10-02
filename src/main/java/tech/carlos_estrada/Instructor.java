package tech.carlos_estrada;

public class Instructor extends Person implements Teacher {

	public Instructor(long id, String name) {
		super(id, name);
	}

	public void teach(Learner learner, double numberOfHours) {
		learner.learn(numberOfHours);
	}

	public void lecture(Learner[] learners, double numberOfHours) {
		double numberOfHoursPerLearner = numberOfHours / learners.length;

		for (Learner leaner : learners) {
			leaner.learn(numberOfHoursPerLearner);
		}


	}
}

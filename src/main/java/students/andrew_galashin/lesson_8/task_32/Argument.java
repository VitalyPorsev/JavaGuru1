package students.andrew_galashin.lesson_8.task_32;

class Argument extends MathOperation {

	private double argument;


	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}


}

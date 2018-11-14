package Silver;

public class Student {
	private double[] Grades = new double[10];
{
	Grades[0] = (Math.random() * 9) + 1;
	Grades[1] = (Math.random() * 9) + 1;
	Grades[2] = (Math.random() * 9) + 1;
	Grades[3] = (Math.random() * 9) + 1;
	Grades[4] = (Math.random() * 9) + 1;
	Grades[5] = (Math.random() * 9) + 1;
	Grades[6] = (Math.random() * 9) + 1;
	Grades[7] = (Math.random() * 9) + 1;
	Grades[8] = (Math.random() * 9) + 1;
	Grades[9] = (Math.random() * 9) + 1;
}
	public double getGrade(int index) {
		return Grades[index];
	}
	public void showGradesonScreen(){
		for(double e:Grades ) {
			System.out.println("Grades" + e);
		}
	}
}
package methodReference;

interface I2 {
	Course test(int a, String b, String c, String d);
}

class Course {
	
	private int courseId;
	private String courseName;
	private String duration;
	private String trainer;

	public Course() {
		System.out.println("default constructor");
	}

	public Course(int courseId, String courseName, String duration, String trainer) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.trainer = trainer;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
}

public class ConstructorRef {
	public static void main(String[] args) {
		I2 i2 = Course :: new ;
		Course c =  i2.test(101, "Advance Java", "6 Months", "Som");
			System.out.println(c);
		
	}
}

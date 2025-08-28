public class Student {
    private Name name;
    private Date dateOfBirth;
    private float gpa;
    private int creditsTaken;

    public Student(Name name, Date dateOfBirth, float gpa, int creditsTaken) {
        if (gpa < 0.0 || gpa > 5.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 5.0");
        }
        if (creditsTaken < 0 || creditsTaken > 200) {
            throw new IllegalArgumentException("Credits taken must be between 0 and 200");
        }
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.creditsTaken = creditsTaken;
    }

    @Override
    public String toString() {
        return "Name: " + name.toString() + ", DOB: " + dateOfBirth.toString() +
                ", GPA: " + gpa + ", Credits: " + creditsTaken;
    }
}


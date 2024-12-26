public class Teacher {
    private String name;
    private String subject;
    private int yearsOfExperience;

    public Teacher(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public School findSchool(){
        return new School();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
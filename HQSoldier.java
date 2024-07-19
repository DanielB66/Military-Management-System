public class HQSoldier extends Soldier {
    private String course;

    public HQSoldier(int id, String name, String rank, int age, String weapon, String course) {
        super(id, name, rank, age, weapon);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "HQSoldier " + super.toString() + "{course='" + course + "}";
    }
}

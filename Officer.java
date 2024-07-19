public class Officer extends Soldier {
    private String title;
    private double salary;

    public Officer(int id, String name, String rank, int age, String weapon, String title, double salary) {
        super(id, name, rank, age, weapon);
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Officer " + super.toString() + "{" + "title='" + title + ", salary=" + salary + "}";
    }
}

public class Commander extends Officer {
    private String unit;

    public Commander(int id, String name, String rank, int age, String weapon, String title, double salary, String unit) {
        super(id, name, rank, age, weapon, title, salary);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Commander " + super.toString() + "{unit=" + unit + "}";
    }
}

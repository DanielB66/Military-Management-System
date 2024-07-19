import java.util.ArrayList;

public class MilitaryUnit {
    private Commander commander;
    private ArrayList<Soldier> soldiers;

    public MilitaryUnit(Commander commander) {
        this.commander = commander;
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier) {
        if (soldier.equals(commander) || soldiers.contains(soldier))
            return;
        else
            soldiers.add(soldier);
    }

    public int countOfficers() {
        int counter = 1; // the commander is the first
        for (Soldier soldier : soldiers)
            if (soldier instanceof Officer)
                counter++;
        return counter;
    }

    public boolean hasWeapon(String weapon) {
        for (Soldier soldier : soldiers)
            if (soldier.getWeapon().equals(weapon))
                return true;
        return false;
    }
}

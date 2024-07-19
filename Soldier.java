public class Soldier {
    private int id;
    private String name;
    private String rank;
    private int age;
    private String weapon;

    public Soldier(int id, String name, String rank, int age, String weapon) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.age = age;
        this.weapon = weapon;
    }

    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRank() {
		return rank;
	}

	public int getAge() {
		return age;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
    public String toString() {
        return "Soldier {" + "id='" + id + ",name='" + name + ",rank=" + rank + ",age=" + age + ",weapon=" + weapon + '}';
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Soldier) {
            return id == ((Soldier) other).id && age == ((Soldier) other).age && name.equals(((Soldier) other).name)
                    && rank.equals(((Soldier) other).rank) && weapon.equals(((Soldier) other).weapon);
        } else
            return false;
    }
}

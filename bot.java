package pokeman;

public class bot {
	private String name;
	private int rate;
	private int health;
	private int defence;
	private int speed;
	private int accuracy;
	private int attack;
	private int level;
	private int mood;
	private int goldKill;
	private int expKill;
	
	
	public bot (String name, int rate, int health, int defence, int speed, int accuracy, int attack, int level, int mood, int goldKill, int expKill) {
		this.name = name;
		this.rate = rate;
		this.health = health;
		this.defence = defence;
		this.speed = speed;
		this.accuracy = accuracy;
		this.attack = attack;
		this.level = level;
		this.mood = mood;
		this.goldKill = goldKill;
		this.expKill = expKill;
	}

	@Override
    public String toString() {
        String result = getName() + "," + getRate() + "," + getHealth() + "," + getDefence() + "," + getSpeed() + "," + getAccuracy() + "," + getAttack() + "," + getLevel() + "," + getMood() + "," + getGoldKill() + "," + getExpKill();
        return result;
    }
	
	public String getName() {
		return name;
	}

	public int getRate() {
		return rate;
	}

	public int getHealth() {
		return health;
	}
	
	public int getDefence() {
		return defence;
		}
	
	public int getSpeed() {
		return speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getAttack() {
		return attack;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getMood() {
		return mood;
	}
	
	public int getGoldKill() {
		return goldKill;
	}
	
	public int getExpKill() {
		return expKill;
	}
}
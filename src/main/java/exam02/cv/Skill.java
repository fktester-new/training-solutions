package exam02.cv;

public class Skill {

    public static final int MIN_SKILL_LEVEL = 1;
    public static final int MAX_SKILL_LEVEL = 5;

    private String name;
    private int level;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }
}

package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {


    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String skillName) {

        for (Skill skill : skills) {
            if (skillName.equals(skill.getName())) {
                return skill.getLevel();
            }
        }
        throw new IllegalArgumentException("Skill not found.");
    }

    public void addSkills(String... newSkills) {
        for (String s : newSkills) {
            String name = s.substring(0, s.indexOf("(")).trim();
            int level = Integer.parseInt(s.substring(s.indexOf("(") + 1, s.indexOf(")")));
            skills.add(new Skill(name, level));
        }
    }

}
package exam02.cv;

import java.util.List;

public class Cv {


    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String skillName){
        if (!findSkillByName(skillName)){
            throw new SkillNotFoundException("Skill not found!");
        }
        int result = 1;
        for (Skill skill: skills) {
            if (skillName.equals(skill.getName())){
                result = skill.getLevel();
            }
        }
        return result;
    }

    public void addSkills(List<Skill> newSkills){
        for (Skill skill : newSkills) {
            skills.add(skill);
        }
    }

    private boolean findSkillByName(String skillName){
        for (Skill skill : skills) {
            if (skillName.equals(skill.getName())){
                return true;
            }
            }
        return false;
    }
}

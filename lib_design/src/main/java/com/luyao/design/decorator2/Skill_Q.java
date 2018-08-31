package com.luyao.design.decorator2;

/**
 * 描述：ConcreteDecortot 技能: Q
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Skill_Q extends Skills {
    private String skillName;

    public Skill_Q(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q: " + skillName);
        super.learnSkills();
    }
}

package com.luyao.design.decorator2;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/8/31
 */
public class SKill_W extends Skills {
    private String skillName;

    public SKill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能W: " + skillName);
        super.learnSkills();
    }
}

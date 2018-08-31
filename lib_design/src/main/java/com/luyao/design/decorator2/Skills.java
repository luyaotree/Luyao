package com.luyao.design.decorator2;

/**
 * 描述：Decorator 技能栏
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Skills implements Hero {
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if (hero != null) {
            hero.learnSkills();
        }
    }
}

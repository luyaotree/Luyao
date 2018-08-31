package com.luyao.design.decorator2;

/**
 * 描述：客户端：召唤师
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Player {

    public static void main(String[] args) {
        // 选择英雄
        Hero hero = new BindMonk("李青");
        Skills skills = new Skills(hero);
        Skills q = new Skill_Q(skills, "天音波");
        Skills w = new SKill_W(q, "金钟罩");
        w.learnSkills();
    }

}

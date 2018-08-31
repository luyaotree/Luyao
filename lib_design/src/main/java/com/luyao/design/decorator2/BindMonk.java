package com.luyao.design.decorator2;

/**
 * 描述：ConcreteComponent 具体英雄盲僧
 *
 * @author luyao
 * @date 2018/8/31
 */
public class BindMonk implements Hero {
    private String name;

    public BindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能! ");
    }
}

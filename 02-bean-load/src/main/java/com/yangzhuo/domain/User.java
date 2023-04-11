package com.yangzhuo.domain;

public class User {
    int id;
    String name;
    double money;

    public User() {
    }

    public User(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", money = " + money + "}";
    }
}

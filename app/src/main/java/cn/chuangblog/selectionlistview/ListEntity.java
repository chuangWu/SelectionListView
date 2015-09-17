package cn.chuangblog.selectionlistview;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import cn.chuangblog.selectionlistview.game.Entity;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-09-17 16:33
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class ListEntity implements Serializable {
    public String[] getMapKeyArr() {
        return mapKeyArr;
    }

    private final String[] mapKeyArr = {"one", "two", "three"};
    private String name;
    private List<Entity> one;
    private List<Entity> two;
    private List<Entity> three;

    private HashMap<String, List<Entity>> map = new HashMap<String, List<Entity>>();

    public ListEntity() {

    }

    public HashMap<String, List<Entity>> getMap() {
        return map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Entity> getOne() {
        return one;
    }

    public void setOne(List<Entity> one) {
        this.one = one;
    }

    public List<Entity> getTwo() {
        return two;
    }

    public void setTwo(List<Entity> two) {
        this.two = two;
    }

    public List<Entity> getThree() {
        return three;
    }

    public void setThree(List<Entity> three) {
        this.three = three;
    }

    public void setMap(HashMap<String, List<Entity>> map) {
        this.map = map;
    }
}

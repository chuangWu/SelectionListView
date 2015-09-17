package cn.chuangblog.selectionlistview.game;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/9/17.
 */
public class GameListEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<BannerEntity> images;
    private List<GameListAllEntity> fire;
    private List<GameListAllEntity> hot;
    private List<GameListAllEntity> games;
    private String name;
    private int tag;

    public List<BannerEntity> getImages() {
        return images;
    }

    public void setImages(List<BannerEntity> images) {
        this.images = images;
    }

    public List<GameListAllEntity> getFire() {
        return fire;
    }

    public void setFire(List<GameListAllEntity> fire) {
        this.fire = fire;
    }

    public List<GameListAllEntity> getHot() {
        return hot;
    }

    public void setHot(List<GameListAllEntity> hot) {
        this.hot = hot;
    }

    public List<GameListAllEntity> getGames() {
        return games;
    }

    public void setGames(List<GameListAllEntity> games) {
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}

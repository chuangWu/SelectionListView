package cn.chuangblog.selectionlistview.game;

import java.io.Serializable;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-09-11 13:02
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class BannerEntity implements Serializable {


    private String img = "";
    private String url = "";
    private int jump;
    private boolean isGoddessLive;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public boolean isGoddessLive() {
        return isGoddessLive;
    }

    public void setIsGoddessLive(boolean isGoddessLive) {
        this.isGoddessLive = isGoddessLive;
    }
}

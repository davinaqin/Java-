package edu.swun.set;

import java.util.Date;
//公告的添加和删除
//在指定位置处插入公告
//删除公告
//修改公告
public class Notice {
    //公告类属性
    //标号id
    //标题title
    //创建人creator
    //创建时间createTime
    private int id;
    private String title;
    private String creator;
    private Date createTime;

    public Notice(int id, String title, String creator, Date createTime) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}

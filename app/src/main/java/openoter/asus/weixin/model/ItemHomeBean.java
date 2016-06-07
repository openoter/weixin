package openoter.asus.weixin.model;

/**
 * Created by asus on 2016/6/7.
 */
public class ItemHomeBean {
    public int ImageResId;
    public String GroupName;
    public String time;
    public String msgContent;

    public ItemHomeBean(int imageResId, String groupName, String time, String msgContent) {
        ImageResId = imageResId;
        GroupName = groupName;
        this.time = time;
        this.msgContent = msgContent;
    }
}

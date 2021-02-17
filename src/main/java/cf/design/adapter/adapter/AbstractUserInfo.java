package cf.design.adapter.adapter;

/**
 * @author chengfan
 * @date 2020-01-07 10:39:56
 */
public abstract class AbstractUserInfo implements IUserInfo{

    /**
     * 姓名
     */
    public String getUserName(){
        return "";
    }

    /**
     * 电话
     */
    public String getTel(){
        return "";
    }

    /**
     * 公司地址
     */
    public String getAddress(){
        return "";
    }

    /**
     * 职位
     */
    public String getJob(){
        return "";
    }

}

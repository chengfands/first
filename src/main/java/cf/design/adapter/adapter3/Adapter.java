package cf.design.adapter.adapter3;

import java.util.Map;

/**
 * @author chengfan
 * @date 2020-01-07 14:04:29
 */
public class Adapter implements IUserInfo {

    private OutWorkInfoImpl outWorkInfo;
    private OutUserInfoImpl outUserInfo;
    private Map<String, String> userMap = null;
    private Map<String, String> workMap = null;

    public Adapter(OutWorkInfoImpl outWorkInfo, OutUserInfoImpl outUserInfo) {
        this.outWorkInfo = outWorkInfo;
        this.outUserInfo = outUserInfo;
        this.userMap = outUserInfo.getPersonInfo();
        this.workMap = outWorkInfo.getWorkInfo();
    }

    @Override
    public String getUserName() {
        return userMap.get("name");
    }

    @Override
    public String getTel() {
        return userMap.get("phone");
    }

    @Override
    public String getAddress() {
        return workMap.get("address");
    }

    @Override
    public String getJob() {
        return workMap.get("job");
    }
}

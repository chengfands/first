package cf.design.adapter.adapter;


import java.util.Map;

/**
 * @author chengfan
 * @date 2019-12-20 10:03:03
 */
public class AdapterUser extends OutUserImpl implements IUserInfo {

    private Map<String,String> userMap = super.getPersonInfo();
    private Map<String,String> workMap = super.getWorkInfo();

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

//    @Override
//    public String getDepartment(){
//        return "研发一部";
//    }

}

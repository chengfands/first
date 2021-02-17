package cf.design.factory.abstractt;

/**
 * @author chengfan
 * @date 2020-01-13 14:50:29
 */
public abstract class HumanFactory {

    /**
     * 生产黑人、黄人、白人
     */
    public abstract Human createBlackHuman();
    public abstract Human createYellowHuman();
    public abstract Human createWhiteHuman();

}

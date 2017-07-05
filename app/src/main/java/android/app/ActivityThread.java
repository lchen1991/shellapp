package android.app;

/**
 * Created on 2017/07/05
 * desc:
 *
 * @author: chenlei
 * @version:1.0
 */

public class ActivityThread {

    private static volatile ActivityThread sCurrentActivityThread = null;

    public static ActivityThread currentActivityThread() {
        return sCurrentActivityThread;
    }
}

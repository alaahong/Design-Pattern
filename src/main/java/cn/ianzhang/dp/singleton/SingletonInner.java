package cn.ianzhang.dp.singleton;

import lombok.Data;

/**
 * @author Ian
 */
@Data
public final class SingletonInner {
    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    private SingletonInner() {
    }

    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }

}

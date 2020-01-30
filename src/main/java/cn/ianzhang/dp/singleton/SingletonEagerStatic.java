package cn.ianzhang.dp.singleton;

import lombok.Data;

/**
 * @author Ian
 */
@Data
public class SingletonEagerStatic {
    private static SingletonEagerStatic instance;

    static {
        instance = new SingletonEagerStatic();
    }

    private SingletonEagerStatic() {
    }

    public static SingletonEagerStatic getInstance() {
        return instance;
    }
}

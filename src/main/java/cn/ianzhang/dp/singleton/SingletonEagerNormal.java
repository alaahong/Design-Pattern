package cn.ianzhang.dp.singleton;

import lombok.Data;

/**
 * @author Ian
 */
@Data
public class SingletonEagerNormal {
    private SingletonEagerNormal() {
    }

    private static final SingletonEagerNormal instance = new SingletonEagerNormal();

    public static SingletonEagerNormal getInstance() {
        return instance;
    }
}

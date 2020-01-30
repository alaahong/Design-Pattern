package cn.ianzhang.dp.singleton;

import lombok.Data;

/**
 * @author Ian
 */
@Data
public final class SingletonEagerNormal {
    private static final SingletonEagerNormal instance = new SingletonEagerNormal();

    private SingletonEagerNormal() {
    }

    public static SingletonEagerNormal getInstance() {
        return instance;
    }
}

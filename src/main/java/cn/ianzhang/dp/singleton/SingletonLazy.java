package cn.ianzhang.dp.singleton;

import lombok.Data;

/**
 * @author Ian
 */
@Data
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {
    }
    public static synchronized SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}

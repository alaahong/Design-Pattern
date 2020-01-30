package cn.ianzhang.dp.singleton;

import lombok.Data;

import java.io.ObjectStreamException;

/**
 * @author Ian
 */
@Data
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;
    private SingletonDoubleCheck() {
    }
    public static SingletonDoubleCheck getInstance() {
        if(instance == null){
            synchronized (SingletonDoubleCheck.class){
                if(instance == null){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}

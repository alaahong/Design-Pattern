package cn.ianzhang.dp.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SingletonTest {
    @Test
    public void singletonEagerNormal() {
        assertThat(SingletonEagerNormal.getInstance())
                .isEqualTo(SingletonEagerNormal.getInstance());
        assertThat(SingletonEagerNormal.getInstance())
                .hasSameHashCodeAs(SingletonEagerNormal.getInstance());
        log.info("SingletonEagerNormal: {}", SingletonEagerNormal.getInstance() == SingletonEagerNormal.getInstance());
    }

    @Test
    public void singletonEagerStatic() {
        assertThat(SingletonEagerStatic.getInstance())
                .isEqualTo(SingletonEagerStatic.getInstance());
        assertThat(SingletonEagerStatic.getInstance())
                .hasSameHashCodeAs(SingletonEagerStatic.getInstance());
        log.info("SingletonEagerStatic: {}", SingletonEagerStatic.getInstance() == SingletonEagerStatic.getInstance());
    }

    @Test
    public void singletonLazy() {
        assertThat(SingletonLazy.getInstance())
                .isEqualTo(SingletonLazy.getInstance());
        assertThat(SingletonLazy.getInstance())
                .hasSameHashCodeAs(SingletonLazy.getInstance());
        log.info("SingletonLazy: {}", SingletonLazy.getInstance() == SingletonLazy.getInstance());
    }

    @Test
    public void singletonDoubleCheck() {
        assertThat(SingletonDoubleCheck.getInstance())
                .isEqualTo(SingletonDoubleCheck.getInstance());
        assertThat(SingletonDoubleCheck.getInstance())
                .hasSameHashCodeAs(SingletonDoubleCheck.getInstance());
        log.info("SingletonDoubleCheck: {}", SingletonDoubleCheck.getInstance() == SingletonDoubleCheck.getInstance());
    }

    @Test
    public void singletonInner() {
        assertThat(SingletonInner.getInstance())
                .isEqualTo(SingletonInner.getInstance());
        assertThat(SingletonInner.getInstance())
                .hasSameHashCodeAs(SingletonInner.getInstance());
        log.info("SingletonInner: {}", SingletonInner.getInstance() == SingletonInner.getInstance());
    }

    @Test
    public void singletonEnum() {
        assertThat(SingletonEnum.INSTANCE)
                .isEqualTo(SingletonEnum.INSTANCE);
        assertThat(SingletonEnum.INSTANCE)
                .hasSameHashCodeAs(SingletonEnum.INSTANCE);
        log.info("SingletonEnum: {}", SingletonEnum.INSTANCE == SingletonEnum.INSTANCE);
    }
}
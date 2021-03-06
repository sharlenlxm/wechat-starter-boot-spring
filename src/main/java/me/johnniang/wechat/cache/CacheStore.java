package me.johnniang.wechat.cache;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Cache store interface.
 *
 * @param <K> cache key type
 * @param <V> cache value type
 * @author johnniang
 * *
 */
public interface CacheStore<K, V> {

    /**
     * Gets by cache key.
     *
     * @param key must not be null
     * @return cache value
     */
    @NonNull
    Optional<V> get(@NonNull K key);

    /**
     * Puts a cache.
     *
     * @param key      cache key must not be null
     * @param value    cache value must not be null
     * @param timeout  the key expiration must not be less than 0
     * @param timeUnit timeout unit
     */
    void put(@NonNull K key, @NonNull V value, long timeout, @NonNull TimeUnit timeUnit);

    /**
     * Delete a key.
     *
     * @param key cache key must not be null
     */
    void delete(@NonNull K key);

}

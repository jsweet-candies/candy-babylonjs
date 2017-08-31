package def.babylonjs.babylon;
/**
     * This class implement a typical dictionary using a string as key and the generic type T as value.
     * The underlying implementation relies on an associative array to ensure the best performances.
     * The value can be anything including 'null' but except 'undefined'
     */
public class StringDictionary<T> extends def.js.Object {
    /**
         * This will clear this dictionary and copy the content from the 'source' one.
         * If the T value is a custom object, it won't be copied/cloned, the same object will be used
         * @param source the dictionary to take the content from and copy to this dictionary
         */
    native public void copyFrom(StringDictionary<T> source);
    /**
         * Get a value based from its key
         * @param key the given key to get the matching value from
         * @return the value if found, otherwise undefined is returned
         */
    native public T get(String key);
    /**
         * Get a value from its key or add it if it doesn't exist.
         * This method will ensure you that a given key/data will be present in the dictionary.
         * @param key the given key to get the matching value from
         * @param factory the factory that will create the value if the key is not present in the dictionary.
         * The factory will only be invoked if there's no data for the given key.
         * @return the value corresponding to the key.
         */
    native public T getOrAddWithFactory(String key, java.util.function.Function<String,T> factory);
    /**
         * Get a value from its key if present in the dictionary otherwise add it
         * @param key the key to get the value from
         * @param val if there's no such key/value pair in the dictionary add it with this value
         * @return the value corresponding to the key
         */
    native public T getOrAdd(String key, T val);
    /**
         * Check if there's a given key in the dictionary
         * @param key the key to check for
         * @return true if the key is present, false otherwise
         */
    native public Boolean contains(Object key);
    /**
         * Add a new key and its corresponding value
         * @param key the key to add
         * @param value the value corresponding to the key
         * @return true if the operation completed successfully, false if we couldn't insert the key/value because there was already this key in the dictionary
         */
    native public Boolean add(String key, T value);
    native public Boolean set(String key, T value);
    /**
         * Get the element of the given key and remove it from the dictionary
         * @param key
         */
    native public T getAndRemove(String key);
    /**
         * Remove a key/value from the dictionary.
         * @param key the key to remove
         * @return true if the item was successfully deleted, false if no item with such key exist in the dictionary
         */
    native public Boolean remove(String key);
    /**
         * Clear the whole content of the dictionary
         */
    native public void clear();
    public final double count=0;
    /**
         * Execute a callback on each key/val of the dictionary.
         * Note that you can remove any element in this dictionary in the callback implementation
         * @param callback the callback to execute on a given key/value pair
         */
    native public void forEach(java.util.function.BiConsumer<String,T> callback);
    /**
         * Execute a callback on every occurrence of the dictionary until it returns a valid TRes object.
         * If the callback returns null or undefined the method will iterate to the next key/value pair
         * Note that you can remove any element in this dictionary in the callback implementation
         * @param callback the callback to execute, if it return a valid T instanced object the enumeration will stop and the object will be returned
         */
    native public <TRes> TRes first(java.util.function.BiFunction<String,T,TRes> callback);
}


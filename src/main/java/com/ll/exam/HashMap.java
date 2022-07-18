package com.ll.exam;

import java.util.*;

public class HashMap<K,V>{
    Object [] keys;
    Object [] values;
    int size=0;
    int lastIndex=-1;
    public HashMap() {
        keys = new Object[2];
        values = new Object[2];
    }

    void put(K key, V value){
        int idx = getIndex(key);
        if(idx !=-1){
            values[idx] = value;
        }
        else{
            lastIndex++;
            size++;
            extendDatasSizeIfNeed();
            keys[lastIndex] = key;
            values[lastIndex] = value;
        }
    }
    void extendDatasSizeIfNeed() {
        if ( lastIndex >= keys.length ) {
            Object[] newArr = Arrays.copyOf(keys, keys.length*2);
            keys = newArr;
            Object[] newArr2 = Arrays.copyOf(values, values.length*2);
            values = newArr2;
        }
    }

    void remove(K key){
        int idx = getIndex(key);
        for(int i=idx;i<lastIndex;i++){
            values[i]=values[i+1];
            keys[i] = keys[i+1];
        }
        lastIndex--;
        size--;
    }

    List<K> keySet(){
        List<K> list = new ArrayList<>();
        for(int i=0;i<=lastIndex;i++){
            list.add((K) keys[i]);
        }
        return list;
    }

    V get(K key){
        int idx = getIndex(key);
        return (V)values[idx];
    }
    int getIndex(K key){
        for(int i=0;i<lastIndex+1;i++){
            if(keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    int size(){
        return size;
    }
}
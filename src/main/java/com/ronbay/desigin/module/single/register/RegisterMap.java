package com.ronbay.desigin.module.single.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterMap {

    private static Map<String,Object> registerMap = new ConcurrentHashMap<>();

    public static RegisterMap getInstance(String name){
        if (name == null){
            name = RegisterMap.class.getName();
        }
        if (registerMap.get(name) == null){
            try{
                registerMap.put(name,Class.forName(name).newInstance());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return (RegisterMap)registerMap.get(name) ;
    }
}

package com.xncoding.pattern.flyweight.authorization;

public interface Flyweight {
    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     *
     * @param securityEntity 安全实体
     * @param permit         权限
     * @return true 表示匹配，false 表示不匹配
     */
    public boolean match(String securityEntity, String permit);
}

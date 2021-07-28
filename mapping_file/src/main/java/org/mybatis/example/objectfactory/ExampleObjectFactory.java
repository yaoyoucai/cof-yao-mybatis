package org.mybatis.example.objectfactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName ExampleObjectFactory.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/7/22 10:05 上午
 */
public class ExampleObjectFactory extends DefaultObjectFactory {
    @Override
    public Object create(Class type) {
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }

}

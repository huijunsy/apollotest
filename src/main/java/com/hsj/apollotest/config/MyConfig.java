package com.hsj.apollotest.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.beans.factory.annotation.Value;

public class MyConfig {

    @ApolloConfig
    private Config config;

    @Value("${node:default}")
    private String node;

    @ApolloConfigChangeListener
    private void configChange(ConfigChangeEvent configChangeEvent){
        if(configChangeEvent.isChanged("node")){
            node = config.getProperty("node","default");
        }
    }

    public String getNode(){
        return config.getProperty("node","default");
    }

}

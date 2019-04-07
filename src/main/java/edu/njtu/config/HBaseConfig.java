package edu.njtu.config;

import edu.njtu.service.HBaseService;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * HBase相关配置
 *
 * @author zifangsky
 * @date 2018/7/12
 * @since 1.0.0
 */
//@Configuration
////@ConfigurationProperties(prefix = HBaseConfig.CONF_PREFIX)
//    @Component
public class HBaseConfig {

    public static final String CONF_PREFIX = "hbase.conf";

    private Map<String,String> confMaps;

    public Map<String, String> getconfMaps() {
        return confMaps;
    }
    public void setconfMaps(Map<String, String> confMaps) {
        this.confMaps = confMaps;
    }
}

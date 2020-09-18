package com.jg.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>Title: Application</p>
 * <p>Company: </p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @author jinpu.shi
 * @version v1.0.0
 * @since 2020-09-18 10:30
 */
@SpringBootApplication(scanBasePackages = {"com.jg.wx.dao", "com.jg.wx", "com.jg.wx.core",
        "com.jg.wx.hy"})
@MapperScan({"com.jg.wx.dao", "com.jg.wx.dao.ex"})
@EnableTransactionManagement
@EnableScheduling
public class HyApplication {
    public static void main(String[] args) {
        SpringApplication.run(HyApplication.class, args);
    }
}

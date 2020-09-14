package com.jg.wx.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 服务启动类
 *
 * @author JinPu.shi
 */
@SpringBootApplication(scanBasePackages = {"com.jg.wx", "com.jg.wx.core",
        "com.jg.wx.admin"})
@MapperScan({ "com.jg.wx.dao", "com.jg.wx.dao.ex" })
@EnableTransactionManagement
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
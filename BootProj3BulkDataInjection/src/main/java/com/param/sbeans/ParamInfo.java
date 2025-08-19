package com.param.sbeans;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "p.info")
@Component("pr")
public class ParamInfo {
	
	private String name;
	private String sirname;
	private String addrs;
	private long mobileNo;
	private String nickName;
	private String lover;
	List<String> crush;
}

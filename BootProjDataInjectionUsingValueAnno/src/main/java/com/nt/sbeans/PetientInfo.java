package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pinfo")
@Data
public class PetientInfo {
	@Value("10001")
	private int pid;
	@Value("${pi.name}")
	private String pname;
	@Value("${pi.mobileNo}")
	private long mobileNo;
	@Value("${pi.addrs}")
	private String paddrs;
	@Value("#{dcc.xrayPrice+dcc.ctscanprice+dcc.MRIScanPrice+dcc. ecgPrice}")
	private double billamount;
	@Value("#{dcc.ecgPrice<=0}")
	private boolean ecgFree;
	@Value("${os.name}")
	private String osName;
	@Value("${Path}")
	private String pathData;
	
}

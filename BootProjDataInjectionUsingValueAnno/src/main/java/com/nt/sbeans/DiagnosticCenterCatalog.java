package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dcc")
@Data
public class DiagnosticCenterCatalog {
	
	@Value("${dc.xrayRate}")
	private double xrayPrice;
	@Value("${dc.ctcScanRate}")
	private double ctscanprice;
	@Value("${dc.mriScanRate}")
	private double MRIScanPrice;
	@Value("${dc.ecgRate}")
	private double ecgPrice;
}

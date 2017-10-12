package com.nsl.goldfisl.qa.feature1.testcase;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.nsl.goldfish.qa.GoldFishTestHelpher;

public class TestFeature1 extends GoldFishTestHelpher {
	
	static Logger LOG = Logger.getLogger(TestFeature1.class);
	
	@Test
	public static void testDbData() {
		List<Map<String,String>> executeAndGetColumnOutput = dbUtil.executeAndGetColumnOutput(GET_EMPLOYEE_DATA);
		System.out.println(executeAndGetColumnOutput);
		LOG.debug(executeAndGetColumnOutput);
		
	}

}

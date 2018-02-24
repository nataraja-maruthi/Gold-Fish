package com.nsl.goldfisl.qa.myCalucalation.testcase;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.nsl.goldfish.qa.GoldFishTestHelpher;

public class TestFeature1 extends GoldFishTestHelpher{
	
	static Logger LOG = Logger.getLogger(TestFeature1.class);
	
	@Test
	public static void testDbData() {
//		List<Map<String,String>> output = dbUtil.executeAndGetColumnOutput(GET_EMPLOYEE_DATA);
		String output = null;
		System.out.println(output);
		assertNotNull(output, "Db data should not be empty");
		LOG.debug(output);
	}

}

package com.nsl.goldfisl.qa.feature1.testcase;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.nsl.goldfish.qa.GoldFishTestHelpher;

public class TestFeature1 extends GoldFishTestHelpher {
	
	@Test
	public static void testDbData() {
		List<Map<String,String>> executeAndGetColumnOutput = dbUtil.executeAndGetColumnOutput(GET_EMPLOYEE_DATA);
		System.out.println(executeAndGetColumnOutput);
	}

}

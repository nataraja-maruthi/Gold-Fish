package com.nsl.goldfish.qa;

import org.testng.Assert;
import com.nsl.goldfish.constants.GoldFishConstants;
import com.nsl.goldfish.constants.SQLQueries;
import com.nsl.goldfish.util.DataBaseUtility;


public class GoldFishTestHelpher extends Assert implements GoldFishConstants,SQLQueries{

	public static DataBaseUtility dbUtil = new DataBaseUtility();
}

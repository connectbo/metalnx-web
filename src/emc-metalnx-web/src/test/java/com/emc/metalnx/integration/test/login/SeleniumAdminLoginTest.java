/*
 * Copyright (c) 2015-2017, Dell EMC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.emc.metalnx.integration.test.login;

import org.irods.jargon.testutils.TestingPropertiesHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.emc.metalnx.test.generic.UiTestUtilities;

import junit.framework.Assert;

public class SeleniumAdminLoginTest {

	private static final Logger logger = LoggerFactory.getLogger(SeleniumAdminLoginTest.class);

	private static WebDriver driver = null;

	/*************************************
	 * TEST SET UP
	 * 
	 * @throws Exception
	 *************************************/

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = UiTestUtilities.getDriver();
	}

	/**
	 * After all tests are done, the test must quit the driver. This will close
	 * every window associated with the current driver instance.
	 */

	@AfterClass
	public static void tearDownAfterClass() {
		if (driver != null) {
			driver.quit();
			driver = null;
			UiTestUtilities.setDriver(null);
		}
	}

	/**
	 * Test for admin log in.
	 *
	 * @throws Exception
	 */
	@Test
	public void testLoginAsAdmin() throws Exception {
		logger.info("Test logging in as a admin user");
		UiTestUtilities.login(UiTestUtilities.testingProperties.getProperty(TestingPropertiesHelper.IRODS_ADMIN_USER_KEY),
				UiTestUtilities.testingProperties.getProperty(TestingPropertiesHelper.IRODS_ADMIN_PASSWORD_KEY));
		Assert.assertEquals(UiTestUtilities.DASHBOARD_URL, driver.getCurrentUrl());
	}

}
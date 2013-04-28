package de.rixtrick;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testLengthOfUniqueKey() {

		Assert.assertEquals(36, App.generateUniqueKey().length());
	}
}

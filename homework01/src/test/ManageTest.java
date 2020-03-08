package test;

import static org.junit.Assert.*;

import org.junit.Test;

import test_hm01.Manage;

public class ManageTest{
	private static Manage ma =new Manage();
	@Test
	public void testOutput() {
		assertEquals("这就在我的知识范围以外了",ma.Output(-1));
	}

}

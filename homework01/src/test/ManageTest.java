package test;

import static org.junit.Assert.*;

import org.junit.Test;

import test_hm01.Manage;

public class ManageTest{
	private static Manage ma =new Manage();
	@Test
	public void testOutput() {
		assertEquals("������ҵ�֪ʶ��Χ������",ma.Output(-1));
	}

}

package com.files;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileExistTest {
	private FileExist fileFoundCheck;
	
	@Test
	public void fileFoundCheckWhenPresenttest() {
		File find = new File("src\\com\\file.txt");
		fileFoundCheck =new FileExist();
		boolean actual= fileFoundCheck.fileFoundChecking(find);
		assertEquals(true,actual);
	}
	@Test
	public void fileFoundCheckWhenNotPresenttest() {
		File find = new File("src\\com\\fileOne.txt");
		fileFoundCheck =new FileExist();
		boolean actual= fileFoundCheck.fileFoundChecking(find);
		assertEquals(false,actual);
	}

}
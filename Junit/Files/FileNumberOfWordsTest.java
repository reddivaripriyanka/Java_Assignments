
package com.files;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class FileNumberOfWords {
	private WordCount wordcount;
	
	
	@Before
	public void setUp(){
		wordcount = new WordCount();
	}
	
	@Test
	public void testForWordCount() throws IOException {
	
		int result = wordcount.wordCount();
		
		assertEquals(12,result);
	}

}
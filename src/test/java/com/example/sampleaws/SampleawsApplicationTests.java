package com.example.sampleaws;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SampleawsApplicationTests {

	@Test
	public void  contextLoads() {
		double sample = 10.0;
		assertNotNull(sample);
	}

}

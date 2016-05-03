package br.com.hackerrank.challenges.day01;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class TestChallenge01 {
	
	@Test
	public void testChallenge() throws IOException {
		
//		IntegerAsker asker = PowerMockito.mock(IntegerAsker.class);
//		Mockito.when(asker.askInt(1)).thenReturn(1);
//		Mockito.when(asker.askDouble(4.0)).thenReturn(4.0);
//		Mockito.when(asker.askString("fera")).thenReturn("fera");
		
		BufferedReader bufferedReader = org.mockito.Mockito.mock(BufferedReader.class);
		Mockito.when(bufferedReader.readLine()).thenReturn("1");
		
		DataTypes.main(null);
	}

}

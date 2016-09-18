package javaMultithreading;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ThreadingTest {

	@Test
	public void test() {
		String  ExpectedOutput1= "start {t1 }{t2 }";
		String ExpectedOutput2 = "start {t1 }{t2 }";
		Threading nonsyncThread = new Threading(false);
		nonsyncThread.Start();
		String nonSyncOutput = nonsyncThread.op;
		assertThat(nonSyncOutput, not(equalTo(ExpectedOutput1)));
		assertThat(nonSyncOutput, not(equalTo(ExpectedOutput2)));
		System.out.println(nonSyncOutput);
		Threading syncThread = new Threading(true);
		syncThread.Start();
		String SyncOutput = syncThread.op;
		System.out.println(SyncOutput);
		//assert or
		assert SyncOutput.equals(ExpectedOutput1) || SyncOutput.equals(ExpectedOutput2);
	}

}	

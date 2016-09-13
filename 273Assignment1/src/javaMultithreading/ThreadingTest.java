package javaMultithreading;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ThreadingTest {

	@Test
	public void test() {
		String ExpectedOutput = "start {t1 }{t1 }{t1 }{t1 }{t1 }{t2 }{t2 }{t2 }{t2 }{t2 }";
		Threading nonsyncThread = new Threading(false);
		nonsyncThread.Start();
		String nonSyncOutput = nonsyncThread.op;
		assertThat(nonSyncOutput, not(equalTo(ExpectedOutput)));
		System.out.println(nonSyncOutput);
		Threading syncThread = new Threading(true);
		syncThread.Start();
		String SyncOutput = syncThread.op;
		System.out.println(SyncOutput);
		assertEquals(ExpectedOutput, SyncOutput);
	}

}	

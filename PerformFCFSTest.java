package performFCFS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PerformFCFSTest {

	PerformFCFS fs=new PerformFCFS();
	int arrival_t[]={1,5,9,25};
	int job_s[]={12,7,2,5};
	int expected[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};

	@Test
	public void test() {
		assertArrayEquals(expected, fs.fcfs(arrival_t, job_s));
		
	}

}

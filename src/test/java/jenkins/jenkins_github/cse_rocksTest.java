package jenkins.jenkins_github;
import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class cse_rocks {
//	cse_rocks cal=new cse_rocks();
//	
//	@Test
//	void test() {
//		int result = cal.add(2, 3);
//		assertEquals(5,result);
//	}
//	
//
//	
//	
//
//}



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CseRocksTest {
	cse_rocks cal = new cse_rocks();

	@Test
	void test1() {
		int result = cal.mul(2, 3);
		assertEquals(6, result);
	}
}
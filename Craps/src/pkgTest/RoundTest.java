package pkgTest;

import static org.junit.Assert.fail;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Round;
import pkgCore.eGameResult;

class RoundTest {

	@Test
	void test() {
		
		Round r = new Round();
		
		
		if (r.getComeoutScore() == 7 || r.getComeoutScore() == 11) {
			
			if (r.getResult() != eGameResult.NATURAL) {
				
				fail("Game logic error");
			}
			
		}
		
		
		if (r.getComeoutScore() == 2 || r.getComeoutScore() == 3 || r.getComeoutScore() == 12) {
			
			if (r.getResult() != eGameResult.CRAPS) {
				
				fail("Game logic error");
			}
			
		}
		
		if (r.getComeoutScore() == r.getContinueRoll()) {
			
			if (r.getResult() != eGameResult.POINT) {
				
				fail("Game logic error");
			}
			
		}
		
		if (r.getContinueRoll() == 7) {
			
			if (r.getResult() != eGameResult.SEVEN_OUT) {
				
				fail("Game logic error");
			}
			
		}	
		
	}

}

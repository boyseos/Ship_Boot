package com.ship.match;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MatchInit implements ApplicationRunner{
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		String[][] mtx = {
				{""}
		};
	}

}

package com.sid.javaexception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

	@Test
	public void analyseSadMood() {
		MoodAnalyser analyser = new MoodAnalyser();
		String actualResult = analyser
				.analyseMood("I am in Sad mood");

		assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseHappyMood() {
		MoodAnalyser analyser = new MoodAnalyser();
		String actualResult = analyser
				.analyseMood("I am in any mood");

		assertEquals("HAPPY", actualResult);
	}
}

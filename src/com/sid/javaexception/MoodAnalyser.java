package com.sid.javaexception;

public class MoodAnalyser {

	public String analyseMood(String msg) {
		try {
			if (msg.toLowerCase().contains("sad") || msg
					.toLowerCase().contains("exhausted")) {
				return "SAD";
			} else {
				return "HAPPY";
			}

		} catch (Exception e) {
			System.out.println("Invalid msg");
			System.out.println(e);
			return "Invalid input";
		}
	}
}

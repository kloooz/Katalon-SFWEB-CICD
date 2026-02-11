package com.smartfren

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

class StepLogger {

	@Keyword
	def step(String message) {
		// Appear clearly in Log Viewer / Reports
		KeywordUtil.logInfo(message)
		KeywordUtil.markPassed(message)
	}
}

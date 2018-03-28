package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customexception.InvalidParameter;
import com.model.ClockData;
import com.model.ExceptionResponse;
import com.service.ClockCalculaterService;

@RestController
public class HomeController {

	@Autowired
	private ClockCalculaterService clockCalculaterService;

	private final String utcDateTimeRegexPatern = "^(-?(?:[1-9][0-9]*)?[0-9]{4})-(1[0-2]|0[1-9])-(3[01]|0[1-9]|[12][0-9])T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z)?$";

	@ResponseBody
	@RequestMapping(value = "/api/berlinClock", params = {
			"time" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ClockData getBerlinClock(@RequestParam(value = "time", required = true) String utcDateTime) {

		boolean regexResult = utcDateTime.matches(this.utcDateTimeRegexPatern);

		if (!regexResult) {

			throw new InvalidParameter(utcDateTime + " is not valid form");

		}

		return this.clockCalculaterService.calculate(utcDateTime);

	}

	@ExceptionHandler(InvalidParameter.class)
	public ResponseEntity<ExceptionResponse> parameterException(InvalidParameter ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorCode("Input Failed");
		response.setErrorMessage(ex.getMessage());

		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
	}

}

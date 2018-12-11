package com.fhir.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.fhir.model.*;

@SpringBootApplication
public class FhirApplication {

	public static void main(String[] args) {
		SpringApplication.run(FhirApplication.class, args);
	}

// Patient controller
@RestController
@Api(value="/patient",description="Patient Details",produces ="application/json")

@RequestMapping("/patient")
class PatientController {


@ApiOperation(value="get patient",response=Patient.class)
   @ApiResponses(value={
   @ApiResponse(code=200,message="Patient Details",response=Patient.class),
   @ApiResponse(code=500,message="Internal Server Error"),
   @ApiResponse(code=404,message="Patient not found")
})
 @RequestMapping(value="/getPatient",method=RequestMethod.GET,produces="application/json")
   public ResponseEntity<Patient> getPatient() {
	 	Patient patient = new Patient();
	   	patient.setResourceType("Patient");
	   	patient.setId("1234");
	   	return new ResponseEntity<Patient>(patient, HttpStatus.OK);
    }
}

}
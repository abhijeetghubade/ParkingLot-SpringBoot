package com.parkinglot.mgmt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parkinglot.mgmt.pojo.AddParkingLotRequest;
import com.parkinglot.mgmt.pojo.AddParkingLotResponse;
import com.parkinglot.mgmt.pojo.CarInfo;
import com.parkinglot.mgmt.pojo.FindVehicleResponse;
import com.parkinglot.mgmt.pojo.GetParkingLotsResponse;
import com.parkinglot.mgmt.pojo.ParkVehicleRequest;
import com.parkinglot.mgmt.pojo.ParkVehicleResponse;
import com.parkinglot.mgmt.pojo.UnparkVehicleResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "/parkinglotmanagement", description = "Parking Lot Controller", produces = "application/json")
@RequestMapping("/parkinglotmanagement")
public class ParkingLotController {

	@ApiOperation(value="Creates a new parking lot")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Parking lot created."),
			@ApiResponse(code=401,message="You are not authorized to view the resource"),
			@ApiResponse(code=403,message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404,message="The resource you were trying to reach is not found"),
			@ApiResponse(code=500,message="Internal Server Error")
	})
	@RequestMapping(value = "/parkingLots", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<AddParkingLotResponse> createParkingLot(@RequestBody AddParkingLotRequest parkinglotrequest) {
		AddParkingLotResponse response = new AddParkingLotResponse();
		response.setParkingLotNumber(1);
		return new ResponseEntity<AddParkingLotResponse>(response, HttpStatus.OK);
	}
	
	
	@ApiOperation(value="Parks a given car to a random parking lot using the provided rule")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Car has been parket."),
			@ApiResponse(code=401,message="You are not authorized to view the resource"),
			@ApiResponse(code=403,message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404,message="The resource you were trying to reach is not found"),
			@ApiResponse(code=500,message="Internal Server Error")
	})
	@RequestMapping(value = "/park", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ParkVehicleResponse> park(@RequestBody ParkVehicleRequest parkVehicle) {
		ParkVehicleResponse response = new ParkVehicleResponse();
		return new ResponseEntity<ParkVehicleResponse>(response, HttpStatus.OK);
	}
	
	@ApiOperation(value="Unparks a car with given license number")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Car has been unparked."),
			@ApiResponse(code=401,message="You are not authorized to view the resource"),
			@ApiResponse(code=403,message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404,message="The resource you were trying to reach is not found"),
			@ApiResponse(code=500,message="Internal Server Error")
	})
	@RequestMapping(value = "/unpark/{licenseNumber}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<UnparkVehicleResponse> unpark(@PathVariable final int licenseNumber) {
		UnparkVehicleResponse response = new UnparkVehicleResponse();
		return new ResponseEntity<UnparkVehicleResponse>(response, HttpStatus.OK);
	}
	
	@ApiOperation(value="Returns details of a parking lot")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Parkinglot details."),
			@ApiResponse(code=401,message="You are not authorized to view the resource"),
			@ApiResponse(code=403,message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404,message="The resource you were trying to reach is not found"),
			@ApiResponse(code=500,message="Internal Server Error")
	})
	@RequestMapping(value = "/parkingLots/{parkingLotNumber}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<GetParkingLotsResponse> findParkingLot(@PathVariable int parkingLotNumber) {
		GetParkingLotsResponse response = new GetParkingLotsResponse();
		response.setParkingLotNumber(1);
		return new ResponseEntity<GetParkingLotsResponse>(response, HttpStatus.OK);
	}
	
	@ApiOperation(value="Returns list of cars with same color in the given parking lot")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Cars parked in given parking lot retreived"),
			@ApiResponse(code=401,message="You are not authorized to view the resource"),
			@ApiResponse(code=403,message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404,message="The resource you were trying to reach is not found"),
			@ApiResponse(code=500,message="Internal Server Error")
	})
	
	@ApiOperation(value="Returns the parking lot and the slot number")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Car found"),
			@ApiResponse(code=401,message="You are not authorized to view the resource"),
			@ApiResponse(code=403,message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404,message="The resource you were trying to reach is not found"),
			@ApiResponse(code=500,message="Internal Server Error")
	})
	@RequestMapping(value = "/find/{carLicenseNumber}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<FindVehicleResponse> findVehicle(@PathVariable int carLicenseNumber) {
		FindVehicleResponse resoponse = new FindVehicleResponse();
		return new ResponseEntity<FindVehicleResponse>(resoponse, HttpStatus.OK);
	}
}

# Parking Lot Usiing Spring Boot
This application exposes all the required apis via **Swagger**.

## Parking Rules
**Fill First (id: fillFirst )** Find nearest(parking lot with lower number is considered nearest) parking lot
with empty slots, park the car there.

**Even Distribution (id: evenDistribution )** Find the parking lot with max emptiness(percentage of how
empty that is) and park the car there, irrespective of the parking lot number(i.e. does not matter if it's
nearest or not)

## This applications exposes the following APIs
 * POST /parkingLots
    - Creates a new parking lot
    - **Request Format** : {name, capacity}
    - Capacity for a parking lot can vary but should not exceed more than 200
    - **Response Format** : {parkingLotNumber}
 * POST /park
    - Parks a given car to a random parking lot using the provided rule
    - **Request Format** : {car: {licenseNumber, color}, parkingRule}
    - A parkingRule will be either of these two- fillFirst , evenDistribution
    - **Response Format** : {parkingId, parkingLotNumber}
 * GET /unpark/<licenseNumber>
    - Unparks a car with given license number; essentially making the parking lot free by 1 slot and returns the parking bill
    - **Response Format** : {car: {licenseNumber, color}, billAmount, durationOfParking, perHourRate}
 * GET /parkingLots/<parkingLotNumber>
    - Returns details of a parking lot
    - **Response Format** : {name, capacity, parkingLotNumber, emptySlotCount}
 * GET /find/<carLicenseNumber>
    - Returns the parking lot and the slot number the car got assigned to for parking
    - **Response Format** : {parkingLotNumber, slotNumber, parkingId}

# Air control

Create a service (`AirControlService`) in which you can simulate some basic airport air control and that has Watchtowers and Airplanes (with Passengers & Crew) .

Apply TDD!

## Psuedo-code

We'll show you the expected behavior (in psuedo-code) of the `performSomeAirControl` method of `AirControlService`.
To have a better understanding of the different steps involved; read the sections for each individual step.

```java
// Step 0: psuedo-code
// -------

var watchtower = new Watchtower();

var airplane01 = new Airplane(crew, passengers, watchtower);
watchtower.track(airplane01);

var airplane02 = new Airplane(crew, passengers, watchtower);
watchtower.track(airplane02);

var airplane03 = new Airplane(crew, passengers, watchtower);
watchtower.track(airplane03);

// Step 1: psuedo-code
// -------

// airplane02 is the first to perform a request for taxi
// inside RequestForTaxi, the Airplane has to call a method on its watchtower
airplane02.requestForTaxi();
airplane01.requestForTaxi();  
airplane03.requestForTaxi();  

// Step 2: psuedo-code
// -------

// watchtower approves 2 taxi requests (the first to be approved should be airplane02, the second airplane01)
watchtower.approveNextTaxiRequest();
watchtower.approveNextTaxiRequest(); 

// Step 3: psuedo-code
// -------

// watchtower approves an airplane for take-off (airplaneThatTookOff should reference the same object as airplane01)
var airplaneThatTookOff = watchtower.approveNextAirplaneForTakeOff();

// check which airplanes are ready for take-off (should be airplane 02)
print -> watchtower.airplanesReadyForTakeOff

// check which airplanes have an active taxi request (should be airplane 03)
print -> watchtower.getAirplanesWithTaxiRequest()

// check which airplanes are being tracked (should be both airplane 02 and airplane 03)
print -> watchtower.getAirplanesBeingTracked()
```

Below you'll find a section on all the different steps.

## Step 0
1. Upon creating the Airplane, assign a Watchtower responsible to track the Airplane.
2. Each Airplane, after creation, should be tracked by a Watchtower
   - The Watchtower should store all the Airplanes.

```java
// Step 0: psuedo-code
// -------

var watchtower = new Watchtower();

var airplane01 = new Airplane(crew, passengers, watchtower);
watchtower.track(airplane01);

var airplane02 = new Airplane(crew, passengers, watchtower);
watchtower.track(airplane02);

var airplane03 = new Airplane(crew, passengers, watchtower);
watchtower.track(airplane03);
```

## Step 1 
1. An Airplane requests its Watchtower for taxi. (`exampleAirplane.requestForTaxi()`)
2. The Watchtower stores the request, does not yet approve it.
    - Constraint: Only if the Watchtower was already tracking the Airplane!
      - If not, the request is not stored 
      - Make sure to check this.

```java
// Step 1: psuedo-code
// -------

// airplane02 is the first to perform a request for taxi
// inside RequestForTaxi, the Airplane has to call a method on its watchtower
airplane02.requestForTaxi();
airplane01.requestForTaxi();  
airplane03.requestForTaxi();  
```

## Step2 
1. The Watchtower approves a taxi request (The **first** airplane to make a taxi request, is the **first** that gets approved) which results in the airplane being ready for take-off.
    - `exampleWatchtower.approveNextTaxiRequest()`
    - Approving a taxi request can be a simple as removing the airplane from the 'collection' of taxi-requests 
    - and adding it to the 'collection' of ready-for-take-off. However, your implementation can differ.

```java
// Step 2: psuedo-code
// -------

// watchtower approves 2 taxi requests (the first to be approved should be airplane02, the second airplane01)
watchtower.approveNextTaxiRequest();
watchtower.approveNextTaxiRequest(); 
```

## Step 3
1. The Watchtower approves the next airplane in line for take-off.
  - `exampleWatchtower.approveNextAirplaneForTakeOff()`
  - The **last** airplane that was ready for take-off is the **first** airplane to be able to take off
    - That's just how it works in this airport... :)
  - The airplane should be removed from the 'collection' ready-for-take-off
  - We no longer have to track the airplane in any way once we approve it for take off
  - The airplane itself can be returned (by the method)

```java
// Step 3: psuedo-code
// -------

// watchtower approves an airplane for take-off (airplaneThatTookOff should reference the same object as airplane01)
var airplaneThatTookOff = watchtower.approveNextAirplaneForTakeOff();

// check which airplanes are ready for take-off (should be airplane 02)
print -> watchtower.airplanesReadyForTakeOff

// check which airplanes have an active taxi request (should be airplane 03)
print -> watchtower.airplanesWithTaxiRequest

// check which airplanes are being tracked (should be both airplane 02 and airplane 03)
print -> watchtower.airplanesBeingTracked
```


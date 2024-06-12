# Boarding

We have provided you with some Java files. Most importantly is the `Gate` class.

It's your job to implement 2 specific methods in `Gate`:
- `goStandInLineToBoard`
- `letNextPassengerBoard`

Closely inspect the `Passenger` class and `BoardingPriority` enum. A better understanding 
of this class and enum will help you correctly implement the methods of `Gate`.

Then, in `Airport`, create a `Gate` object to which you add different `Passenger` objects, use different boarding 
priorities. Once they're all added to the `Gate` object, start letting the passengers board (`letNextPassengerBoard`).
- Each time, print out the returned `passenger` object.
- See how the order in which the passengers were added, is not the same as how they're being processed. Do you know why?

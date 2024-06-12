# Time Exercise

## State
Write a definition for a class named `Time` which consists of 3 (instance) fields
- hour (int)
- minute (int)
- second (double)
Make sure to pay attention to proper encapsulation!
    
## Constructors
Time should have 3 constructors
    - One without any arguments which sets the instance variables to the following values:
        - hour to 13
        - minute to 30
        - seconds to 0.0   
    - One with 2 arguments, hour and minute, which should be assigned to the instance variables hour and minute
    - One with 3 arguments, hour, minute and second, which should be assigned to the instance variables hour, minute and second

## equals, toString and other
Time should override the `toString` method, 
if called, it should return the following String: "The time is hh:mm:ss.ss"

A Time object is equal to another if their hour, minute and second values are the same.

Provide a getter method for hour and one for minute.

## Static class members
Define a **constant**, TEA_TIME_HOUR, which you set to 16. (it represents the hour on which everyone should have Tea time...)

Create a **class method** (not instance method) `highestHour` which takes two Time objects as arguments and returns the Time object 
with the highest hour.

## Run the application

Create a `TimeRunner` class in which you create some Time objects and use all the methods and constructors you created.
Print the results, then run the TimeRunner and inspect the results. Does it all look like expected?

When done, let someone evaluate your implementation.


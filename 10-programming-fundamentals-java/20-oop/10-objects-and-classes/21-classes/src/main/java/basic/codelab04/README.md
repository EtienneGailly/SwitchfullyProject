# The need for speed

Create a `RaceCar`class which has `numberOfGears` and `currentGear` (both int) as its fields.

As its behavior, a `RaceCar` has 4 methods:
- public methods `shiftGearUp` and `shiftGearDown` which shifts the `currentGear` one gear up or down
    - The following criteria should apply:
        - `currentGear` can never be negative
        - `currentGear` can never be higher than `numberOfGears`
- a private method `shiftGear` which takes the `gear` to which we want to shift
    - The argument `gear` can never be more than 1 gear higher or lower than `currentGear`
        - e.g. calling `shiftGear(2)` when `currentGear == 1` will result in `currentGear == 2`
        - e.g. calling `shiftGear(2)` when `currentGear == 3` will result in `currentGear == 2`
        - e.g. calling `shiftGear(2)` when `currentGear == 4` will result in `currentGear == 4`
- The overridden toString method which should return the text *"Racecar with {numberOfGears} in total, currently in {currentGear} gear."*

When creating an instance of `RaceCar`, we should be able to provide values to initialize both `numberOfGears` and `currentGear`.
If none are provided, `numberOfGears` should default to value `6` and `currentGear` to value `0` (which stands for 'Reverse').         
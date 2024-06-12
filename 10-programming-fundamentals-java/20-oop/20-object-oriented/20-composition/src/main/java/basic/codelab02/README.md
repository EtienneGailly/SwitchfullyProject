# Agenda
 
Create and design an agenda. 

- An `Agenda` has a name.
- An `Agenda` has an owner, which is of type `Person`.
- An `Agenda` consists of multiple `Entry` objects (entries).

A `Person` has a full name and email address.

An `Entry` has a date (of type `LocalDate`, so only dd-mm-yyyy) and a title.
- 2 `Entry` objects are equal if their date is the same, ignoring the title. 

It should be possible to add a new `Entry` to the agenda! However, an agenda can only have one entry per day.
- Should a new entry - with the same date as an existing entry that's already part of the agenda - be attempted 
to be added to the agenda, refuse it.
- The max amount of entries an agenda can have is set to value 25.

Make it so that I can print a `Agenda` object to the console and it displays a nice readout of the entire agenda (a day per day overview).
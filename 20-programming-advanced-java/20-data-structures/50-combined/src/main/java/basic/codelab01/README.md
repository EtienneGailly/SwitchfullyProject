# Football

## Footballer
A footballer has the following state
- A name
- A birthday (as LocalDate)
- A shirtNumber (String or int?)
    - Tip: To help you select the type, answer the following question: 
    will we ever do calculations with shirtNumber?
- The number of goals scored
- A `Position`
    - There a 4 possible positions:
        - Goalkeeper
        - Defender
        - Midfielder
        - Striker

## FootballTeam
A `FootballTeam` has to following state
- Footballers (max allowed amount: 11)

A `FootballTeam` has the following behavior
- A method returning the list of footballers sorted by their natural order, which is based on their birthday (descending).
- A method returning the list of footballers **sorted** by their shirt number (ascending)
- A method returning the list of footballers **sorted** by their position
    - Starting from index 0: first all the Midfielders, then the Defenders, then the Goalkeepers and finally the Strikers

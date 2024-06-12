# Supermarket

## Queue 101

In general, a Queue provides FIFO (first in, first out) operations (meaning: the element that was added first, will 
also be the first element that is processed). However, The `PriorityQueue<E>` implementation does not behave according to FIFO 
(as it uses a certain priority - based on (natural) order - to alter the processing order). 

Should you need a FIFO queue, you can opt for:
- `LinkedList` (it (also) implements the `Queue` interfaces): methods `add(...)` and `poll(...)` provide FIFO functionality.
- `ArrayBlockingQueue`  (a bounded (fixed-sized) FIFO blocking queue backed by an array)

## The Domain

### CheckoutCounter
Represent a supermarket checkout counter
- A checkout counter has a `Cashier` (but not required)
- A checkout counter has a status (open or closed)
- A checkout counter has a checkout line containing of `Customers`

### Customer
Represents a supermarket customer.
- A customer has one or more `Grocery`
- A customer has a name
- A customer is a loyal customer or not

### Grocery
Represents a supermarket grocery
- A grocery has a name
- A grocery has a price per unit (combination of a decimal unit + a currency (euro))
- A grocery has an amount (so more than 1 unit is possible)

### Cashier
Represents a supermarket cashier.
- A cashier has a name

## Expected behavior

### CheckoutCounter

The following methods should be present on `ChechoutCounter`, they define its public API:
- `open(Cashier)`
  - Opens the checkout counter
    - Change the status of the checkout counter to 'open'
    - Should a cashier already be present, simply replace it
- `close()`
  - Closes the checkout counter
    - If the checkout line is not empty, throw an exception
    - Else
      - Remove the cashier
      - Change the status of the checkout counter to 'closed'
- `joinCheckoutLine(Customer)`
  - If the checkout counter is closed, throw an exception
  - Else
    - Add the customer to the checkout line 
- `processNextCustomerInLine()`.
  - If the checkout counter is closed, throw an exception
  - If there are no Customer in line, don't throw an exception (it's not an exceptional case). Try to let the method return something meaninful.
  - Else
    - Take the next customer in line
    - Calculate for all of its groceries the total price
      - A loyal customer gets a 5% discount on the total price
    - Let the method return the total price (combination of a decimal unit + a currency (euro))

## Application

Write an executable program in which you create at least one `CheckoutCounter` instance that has multiple customers waiting in line.
Then process some (or all) of the customers (after assigning a cashier).










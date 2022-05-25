# Airline Ticketing Restful API
## Description

This project utilizes the spring framework to integrate two services into a single client facing REST API.  Users of the API can perform CRUD operations on User accounts(Users), Airplanes(Jets), and Ticket Booking(Reservations).

## Technologies Used

* Java 8
* SQL
* Spring AOP
* Spring Boot
* Spring Data
* SOAP
* REST
* JMS Queues

Airline Ticketing REST API Usage
==============================




## Features
This API is setup to handle the creation and management of
----------------------------------------------------------
**-Jets**
    
    -id
    -name
    -capacity
**-Users**
   
    -id
    -userName
    -password
    -membershipLevel
**-Reservations**
  
    -id
    -quantity
    -totalCost
    
Improvements to be made:
----------------------------------------------------------
* Business logic to integrate flights and reservations.
* Management levels of membership levels (Amount of money spent)

## Getting Started

Install software to sent requests to the API.
-SoapUI
-Postman
-ARC(Advanced Rest Client)

-cloning: git clone https://github.com/BLee1126/revature_p1.git
-System enviromental variables needed for:
-db_url_p0, db_url_p1, db_username_p0, db_username_p1, db_password_p0, db_password_p1

## Usage

### Reservations Functionality


**-Save a new Reservation** 

-url: http://localhost:5000/rsvps/create/

**id is auto-serialized**

-RequestBody:

{
"quantity":10,
"totalCost":4900.98
}    
**Find Reservation by ID**

-url: http://localhost:5000/rsvps/one?id=?

-Request Parameter: ID (Integer)
   
**Find all Reservations**

-url: http://localhost:5000/rsvps/all

**Update Reservation by Reservation ID**

-url: http://localhost:5000/rsvps/update

-RequestBody:

{
    "id": 1,
    "quantity": 1,
    "totalCost": 800.11
}
                   
**Delete Reservation by Reservation ID**

-url: http://localhost:5000/rsvps/delete?id=?

-Request Parameter: Reservation ID (Integer)
    

### Jets Functionality


**Save New Jet**

-url: http://localhost:5000/Jets/save

**id is auto-serialized**

-RequestBody:

{
    "name":"here comes johnny",
    "capacity": 400
}
    
**Find Jet by ID**

-url: http://localhost:5000/jets/one?id=?

-Request Parameter: Jet ID (Integer)
    
**Find all Jets**

-url: http://localhost:5000/jets/all
    
**Update Jet by Jet ID**

-url: http://localhost:5000/jets/update?id=?

-Request Parameter: Jet ID (Integer)

-RequestBody:

{
    "id":2,
    "name": "beluga no longer",
    "capacity": 3
}
                  
**Delete Jet by Jet ID**

-url: http://localhost:5000/campsites/delete?id=?

-Request Parameter: ID (Integer)
   
### Users Functionality


**Find User by User ID**

-url: http://localhost:5000/users/id?id=?
-Request Parameter: User ID (Integer)

**Find All Users**

-url: http://localhost:5000/users/all
    
**Save User**

-url: http://localhost:5000/users/create

-RequestBody:

{
    "userName":"p1tester",
    "password":"passsword",
    "firstName":"test",
    "lastName":"testlastname",
    "membershipLevel": 3
}
                   
**Delete User by User ID**

-url: http://localhost:5000/users/delete?id=?

-Request Parameter: User ID (Integer)
     
 **Update User**
 
 -url: http://localhost:5000/users/update
 
 -RequestBody:
 
{
    "userId":8,
    "userName":"p1tester",
    "password":"passsword",
    "firstName":"updated this",
    "lastName":"and this",
    "membershipLevel": 3
}
    




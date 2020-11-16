# EventTrackerProject

##Song of the Day Tracker

##Overview

This API project was to create a program that keeps track of information over time, and can implement all CRUD operations for entries in the database. My project tracks songs of the day, so a user can track their favorite song by date and see how their taste changes/grows. The project has a MySQL database that has the song entries. The database is managed by Spring Data JPA (which allows the repository and service interfaces for the query database operations) and Spring REST services (which allows the CRUD operations to be performed with the more concise and efficient controller methods).

## Technologies Used
* Java
* JUnit Testing
* Spring Data JPA
* Spring REST
* Spring Tool Suite
* Atom
* GitHub
* MAMP
* MySQL
* Gradle
* Postman


## API Implementation

| Returns | Verb | URI Mapping | Description |
| --- | --- | -- | -- |
| 'List<Song>' | GET | api/songs | Retrieve list of song of the day entries |

## Lessons Learned
This project uses Spring Data JPA and Spring REST services. We previously learned how to do CRUD operations without using the built in automated features of the repository, so it was extremely efficient to write create, read, update, delete methods this week after learning it the hard way. The search by keyword method is also implemented.

Using Postman to check the correct mappings and API testing was super useful.

## Implementation
1. localhost:
2. aws:

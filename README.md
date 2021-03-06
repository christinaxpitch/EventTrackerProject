# EventTrackerProject -Song of the Day Tracker

## Overview (Week 12)

This API project was to create a program that keeps track of information over time, and can implement all CRUD operations for entries in the database. My project tracks songs of the day, so a user can track their favorite song by date and see how their taste changes/grows. The project has a MySQL database that has the song entries. The database is managed by Spring Data JPA (which allows the repository and service interfaces for the query database operations) and Spring REST services (which allows the CRUD operations to be performed with the more concise and efficient controller methods).

## Overview Part II (Week 13)

JavaScript was added on the second week of this project. The backend mapping and testing was completed from the previous part of the project. JavaScript was added to dynamically add to our HTML file so that the user can implement the basic CRUD commands from the front end. The page has a few forms which the user can update an entry, delete an entry, or create a new entry. All the entries are also displayed in a table.

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

## Technologies Used (Part II)
* JavaScript
* Asynchronous JavaScript and XML (AJAX)
* DOM/DOM manipulation
* Event Listeners
* XMLHttpRequest Objects


## API Implementation

| Return Type | Verb | URI Mapping | Functionality |
| --- | --- | -- | -- |
| `List<Song>`| **GET** | api/songs | Retrieve list of song of the day entries |
| `Song`| **GET** | api/songs/{songID} | Retrieve one song of the day entry by ID |
| `Song` | **POST** | api/songs | Creates a new song of the day entry |
| `List<<Song>>` | **GET** | api/songs/artist/{artist} | Retrieve song of the day entries by artist |
| `Boolean` | **DELETE** | api/songs/delete/{songID} | Delete a song of the day entry by it's ID |
| `Song` | **PUT** | api/songs/{songID} | Updates information in an existing entry by it's ID |
| `List<Song>` | **GET** | api/songs/search/{keyword} | Searches song entries by a keyword|

## Lessons Learned
This project uses Spring Data JPA and Spring REST services. We previously learned how to do CRUD operations without using the built in automated features of the repository, so it was extremely efficient to write create, read, update, delete methods this week after learning it the hard way. The search by keyword method is also implemented.

Using Postman to check the correct mappings and API testing was super useful.

## Implementation
aws link: http://3.138.41.38:8080/CodeConnections/api/songs

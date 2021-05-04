# Wildlife Tracker.
#### This is a java application that allows the user to create squads and add heroes to the squad
#### By **AGUTU SAVANAH**&trade;
## Description
This application allows rangers to input and record details of animals.


## Project setup instructions
* Make sure you have all the Requirements of running Java apps installed such as JUnit, intellij, SDK, JDK.

* Clone the project into your machine from https://github.com/savanahatieno/Wildlife-Tracker.git .

* Gradle run javac Wildlife-Tracker.java to compile and java wildlifetracker to run the program

## Live Page 
![live page ](https://user-images.githubusercontent.com/62004236/117077676-3777a700-ad41-11eb-9270-b748ac43c412.png)


### Manual Database Creation
To create the necessary databases, launch postgres, then psql, and run the following commands:

* `CREATE DATABASE wildlife_tracker;`
* `\c wildlife_tracker;`
* `CREATE TABLE animals (id serial PRIMARY KEY, name varchar);`
* `CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar);`
* `CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, date TIMESTAMP);`
* `CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;`


## Technologies used
* Java.
* Gradle(for unit testing).
* Bootstrap.
* Spark.
* Material Design Bootstrap.

## Specs
Rangers can add their names so that they can be identified.
Ranger adds a zone where the sighting was made.
Ranger adds the name of the animal they sighted.
Ranger adds the suspected age of the animal.
Ranger adds the suspected health of the animal.
Ranger adds species of the animal whether endangered or not endangered
A timestamp is created by the database to record time of sighting



## Support and contact details
contact me @agutusavanah01@gmail.com

### License
The project is under[MIT license]
Copyright &copy; 2019.All right reserved

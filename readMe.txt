this is  a ReadMe file to show how to run the code of the task sent from Prezi:
	- this is a full stack task
			-	the front end is implemented using AngularJS framework, the output is only one page holding all the data(presentations) sent from the back end.
				-	the data view on the page is ordered by "creation date" descending by default.
				-	the data can be searched by any matching of any field.
				-	the data search and ordering is handled client-side(front end logic)
				-	the data is served from the backed eagerly (all the data sent once)
			-	the back end is implemented using Java specifically(using Spring stack), the back-end logic is called using restful calls from front end.
				-	for the back end data as demanded I used the JSON file as a data source and mapped the data into object oriented entities.
				-	for the current implementation the back end is consisted of (rest API as Business layer, Model layer), taking into consideration that the view is the front end (client side)
				-	for the back end also I'm currently mapping the data into Object Oriented entities that seams to be illogic for the current state but it will has value for the scalability, Maintainability and modularity of the project.
				
	- to compile and run the project you should have (JDK 7 , maven, and internet connection)
		1- open the project folder and run command(mvn clean install)--> this way the project will compile and generate the files to be deployed
		2- after finishing (cd target) to get into the compiled and packaged files.
		3- run "java -jar presentation.data.task-0.0.1-SNAPSHOT.jar", this will run an embedded web server and deploy the project on it.
			--note the embedded server run on port 8080 by default so ensure that this port is free.

	- the project is hosted on heroku.com as you requested:
		url :	https://prezipresentations.herokuapp.com/

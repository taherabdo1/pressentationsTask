this is  a ReadMe file to show how to run the code of the task sent from Prezi:
	- this is a full stack task
			-	the front end is implemented using AngularJS framework, the output is only one page holding all the data(pesentations) sent from the back end.
				-	the data view on the page is oreded by "creation date" desceindingly by default.
				-	the data can be searched by any matching of any field.
				-	the data search and ordering is handled client-side(front end logic)
				-	the data is servered from the backed eagerly (all the data sent once)
			-	the back end is implemented using Java specifically(using Spring stack), the back-end logic is called using restful calls from front end.
				-	for the back end data as demanded I used the JSON file as a data source however for a real life scienario I will depand on a more relieable persistance layer like RDBMS or a no-sql datasource
				-	for the current implementation the back end is consisted of only one layer (rest API), how ever in a real life sceinario I should devide tha application into multi layers mainly I will go for the MVC Design pattern
				-	for thw back end also I'm currently don't map the data into Object Oriented I just read the file(data Source) and sent it to the front end to be viewed, in a real life sceinario I will use ORM implementation to validate the object data and rely on a more relieable data source.
				
	- to compile and run the project you should have (JDK 7 , maven, and internet connection)
		1- open the project folder and run command(mvn clean install)--> this way the project will compile and generate the files to be deployed
		2- after finishing (cd targer) to get to the comiled and packaged files.
		3- run "java -jar presentation.data.task-0.0.1-SNAPSHOT.jar", this will run an embedded web server and deploy the project on it.
			--note the embedded server run on port 8080 by default so ensure that this port is free.

	- the project is hosted on heroku.com as you requested:
		url :	https://prezipresentations.herokuapp.com/

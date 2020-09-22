# MNS
<p align="center">
    <a href="https://github.com/Ghislain1/mns237-server/issues/" title="Open Issues"><img src="https://img.shields.io/github/issues/Ghislain1/mns237-server?style=flat-square "></a>
<a href="https://app.circleci.com/pipelines/github/Ghislain1/mns237-server" title="Circleci"><img src="https://img.shields.io/circleci/build/github/Ghislain1/mns237-server?color=green&logo=red&style=flat-square?style=flat-square"></a>
</p>
. 
<p align="center">
	<a href="#service-apis">Service APIs</a>.
	<a href="#documentation">Documentation</a>.
	<a href="#support-and-feedback">Support</a>.
	<a href="#how-to-contribute">Contribute</a>.
	<a href="#contributors">Contributors</a>.
	<a href="#repositories">Repositories</a>.
	<a href="#liecensing">Licensing</a>
</p>

# table-of-contents

- For REST api. Click here to see the [Demo Live](https://mns237-serverapi.herokuapp.com/api/)
- For client. Click here to seee the [Demo Live](https://idrice24.github.io/mns/)  
- Client project [here](https://github.com/idrice24/mns)

# Coding
## Precondition
1.  Maven
1.  Postgres
1.  JetBrains IntelliJ IDEA (Community Edition) 2020.2 oder higher
1.  OpenJDK 14.0.2 14.0.2  (JavaSE 14)

## Development process for server
1. Fork/Clone the code
1. Prepare your machine to use PostgresSQL **** NOT NEED ANY MORE already on cloud***
1. Run batch file deploy-local.cmd -- should be successfull
1. Go to browser and dial http://localhost:8080/api/
1. Browser should display json information
1. Let's code now!!
1. Run batch file deploy-local.cmd-- should be successfull 
1. Commit with issue number
1. Push all

## Preparation of machine to use PostgresSql
1. [Download PostgresSql at] (https://www.postgresql.org/download/)
1. Add the PostgreSql bin directory path to the PATH enviromenttal variable
1. Open the psql command-line too..
1. Run a CREATE DATABASE command to create a database..
1. Connect to the new database using the cmd: \c databaseName.
Run the postgres. script provided in the Media Server installation directory.
1. \i 'path/postgres.sql'
where path is the script file path.
1. Grant privileges to the user that Media Server will connect as.
1. Open the Data Sources (ODBC) program:
	- In the Windows Control Panel, click System and Security.
	- click Administrative Tools
	- after Data Sources(ODBC)
1. In the User DNS tab Add....
	- Create New Data Source dialog box opens.
1. Select the PostgreSQL Unicode driver from the list and click Finish.
1. Complete the data sources information fields:
1. click datasource
1. (Optional) Micro Focus recommends that you select the Use Declare/Fetch check box, to reduce memory use.
1. click page 2
1. Select the bytea as LO check box
1. Click Apply and then ok
1. test the connection
1. if successfull click ok
1. click save
1. click ok
1. You can now configure Media Servers to connect to the db 

# Howtos
## Maven 
### How to list dependeny from cmd
1. mvn -B -DskipTests clean dependency:list install
1. DskipTests to skip test components
## Heroku
### How to Manual deploy 
1. Go Heroku and open desired project
1. Go to Deploy tab and scroll down 
1.  Sample [real project](https://github.com/Yuth-Set/camarket) using java maven

[back to top](#table-of-contents)
# mns237-serve
<p align="center">

 <a href="https://github.com/Ghislain1/mns237-server/issues" title="Open Issues"><img src="https://img.shields.io/github/issues/Ghislain1/mns237-server?style=flat-square"></a>
<a href="https://app.circleci.com/pipelines/github/Ghislain1/mns237-server" title="Circleci"><img src="https://img.shields.io/circleci/build/github/Ghislain1/mns237-server?color=green&logo=red&style=flat-square?style=flat-square"></a>
  <a href="https://github.com/Ghislain1/mns237-server/blob/master/LICENSE" title="License"><img src="https://img.shields.io/github/license/idrice24/mns237-serve?style=flat-square"></a>


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
1.  Postgres in Window or Virtual ToolBox 
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
## PostgresSql
1. Prepare your machine to use PostgresSql ( Oracle VirtualBox or PostgresSql on Window )
1. [Download PostgresSql] (https://www.postgresql.org/download/) and follow instruction **or**

### How to use PostgresSql from Oracle VirtualBox
1. Install [Oracle VirtualBox](https://www.virtualbox.org/) if you got old windons version
1. Start docker Quickstart Terminal
1. Run command **docker ps --all** to list  docker container in docker
1. Run command **docker run --name nameC -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres**
[back to top](#table-of-contents)

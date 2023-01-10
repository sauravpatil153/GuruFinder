# GuruFinder

## Document:
System Requirement Specification Document

## Title:
System Reqruiement Spefication for GuruFinder

## Team: 
Direct Customer,Indirect Customer, Architect,Business Analyst,	Quality Assurance Team, System Analyst

## Objective (Purpose):
GuruFinder is an online platform to assist students/parents to find a private tutor in both remote and physical mode or to find a online interactive class according to comfort and budget. It also helps indiviuals who are looking to offer tutoring services.

## Scope:
GuruFinder will allow students/parents to outlook and subscribe to various courses according to their proficiency. Admin will be able to manage students and tutors and to approve registration of new tutors. The System  will be generate live Business Operations statistics trends through customized dashboard for stakeholders.

## Definitions:
	

## Functional Requirements:


	
## NonFunctional Requirement:

### Security
Registered Customer will allowed to place an order.	
Each stakeholder will be to access system  through authentication process. Who are you ?
System will provide access to  the content , operations using Role based security (Authorization) (Permissions based on Role)
Using SSL in all transactions  which will be performed stakeholder. It would protect confidential information shared by system to stake holder of Shared by stakeholder to system.
System will automatically log of  all stakeholder after some time due to inactiveness.
System will block operations for inactive  stakeholder and would redirect for authentication.
System  will internally maintain secure communiction channel between Servers ( Web Servers, App Servers, databse Server)
Sensitive data will be always encrypted across communcation.
User proper firewall to protect servers from out side fishing, velnerable attacks.


### Reliability
The system will backup business data on regular basis and recover in short time duration to keep system operational
Continous updates are matained , continous Adminstration is done to keep system operational.
During peak hours system will maintain same user experaince by managing load balacning .

### Availability
Uptime:   24* 7  available  99.999%
	
### Maintainability:
A Commercial database software will be used to maintain System data Persistence.
A readymade Web Server will be installed to host GuruFinder to management server capabilities.
IT operations team will easily monitor and configure System using Adminstrative tools provided by Servers.
Separate enviornment will be maintained for system for isolation in  production, testing, and development.

### Portablility:
PDA: Portable Device Application
System will provide portable User Interface ( HTML, CSS, JS) through  users will be able to access online shopping portal.
System can be deployed to single server, multi server, to any OS, Cloud (Azure or AWS or GCP)

### Accessibility:
Only registered customer will be able to place an order after authentication.
Sales team can reject or approve  orders, shopper requests  based on role  provided.
BOD team will be able to view daily, weekly, monthly, annual businss Growth throgh customized dashboard.
Shoppers will be able to see their product sale graph

### Durability:


### Efficiency:


### Modularity:
System will designed and developed using reusable, independent or dependent business scenarios in the form of modules.
These modules will be loosely coupled and highly cohesive.
	
### Scalability:
System will be able  to  provide  consistent user exeprience to stake holder as well as vistors irrespective of load.

### Safety:	
GuruFinder will be secure from malicious attack, fishing.
GuruFinder functionalilites are protected from outside with prper firewall configuration.
GuruFinder will be always kept updated with latest anit virus software.
Business data will be backed up periodically to ensure safty of data using increamental back up strategy.
Role based security will be applied for Application data and operations accessibility.
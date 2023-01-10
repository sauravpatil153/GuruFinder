# GuruFinder

## Document:
System Requirement Specification Document

## Title:
System Requirement Specification for GuruFinder

## Team: 
Direct Customer,Indirect Customer, Architect,Business Analyst,	Quality Assurance Team, System Analyst

## Objective (Purpose):
GuruFinder is an online platform to assist students/parents to find a private tutor in both remote and physical mode or to find a online interactive class according to comfort and budget. It also helps indiviuals who are looking to offer tutoring services.

## Scope:
GuruFinder will allow students/parents to outlook and subscribe to various courses. Tutors will be able to offer several courses according to their proficiency. Admin will be able to manage students and tutors and to approve registration of new tutors. The System  will generate live Business Operations statistics trends through customized dashboard for stakeholders.

## Definitions:
	

## Functional Requirements:
Admin:
- Login: Admin can login with usage of designated credentials.
- Manage Tutor: Admin can upload/delete/approve the records of tutors and parents/students.
- Manage courses: Admin can add/delete courses inside the portal.
- Dashboard: Admin will be able to view live statistics of tutors,students and courses enrolled.

Parents/Students:
- Registration: Parents/Students can register and obtain credentials.
- Login: Parents/Students can login with usage of designated credentials.
- View/Subscribe: Parents/Students can view or subscribe for courses.
- Mode of Learning: Parents/Students can choose any mode of learning while opting for courses such as In-person tutoring,
  Online Live in-person tutoring or Online Live classes as per availaibility.
- Rate Tutor: Parents/Students can rate tutor upon subscription of courses.

Tutors:
- Registration: Tutor can register and obtain credentials.
- Login: Tutor can login with usage of designated credentials.
- Add Courses: Tutor will be able to add courses respective to specific domain.
- Manage Reservation Requests: Tutors can approve/reject the reservation requests of parents/students.
- View/Access Courses: Tutor will be able to view/update/remove posted courses. 
- View Ratings: Tutor can view his/her ratings.
	
## NonFunctional Requirement:

### Security
Registered Customer will allowed to place an order.	
Each stakeholder will be to access system through authentication process.
System will provide access to the content, operations using Role based security (Authorization) (Permissions based on Role)
Using SSL in all transactions which will be performed stakeholder. It would protect confidential information shared by system to stake holder of Shared by stakeholder to system.
System will automatically log of all stakeholder after some time due to inactiveness.
System will block operations for inactive stakeholder and would redirect for authentication.
System  will internally maintain secure communiction channel between Servers (Web Servers, App Servers, Database Server)
Sensitive data will be always encrypted across communcation.
User proper firewall to protect servers from out side fishing, velnerable attacks.


### Reliability
The system will backup business data on regular basis and recover in short time duration to keep system operational
Continous updates are maintained, continuous adminstration is done to keep system operational.
During peak hours system will maintain same user experaince by managing load balancing.

### Availability
Uptime:   24* 7  available  99.999%
	
### Maintainability:
A Commercial database software will be used to maintain system data persistence.
A readymade Web Server will be installed to host GuruFinder to management server capabilities.
IT operations team will easily monitor and configure System using Adminstrative tools provided by servers.
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

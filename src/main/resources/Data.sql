create table employee
(	empId integer not null,
	fName varchar(255) not null,
	lName varchar(255) not null,
	dptId integer not null,
	hdate timestamp,
	activities boolean not null,
	primary key (empId)
	);
	
	
	
	INSERT INTO EMPLOYEE (empId,fName,lName,dptId,hdate,activities)
	values(1,'Bishnu','K C',1,sysdate(),true);
	
	
	
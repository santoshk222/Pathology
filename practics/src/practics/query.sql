create database pathology_project;

use pathology_project;

create table login(uname varchar(25) not null,
pass varchar(25) default null,
primary key(uname));


insert into login values("rajashree","raj123"),("digambar","digu123");

create table tests(
tname varchar(20) not null,
amount int(25) default null,
nrange varchar(20) default null,
upper float default null,
lower float default null,
units varchar(20)default null,
primary key(tname)
);

insert into tests values ('CBC',1000,NULL,NULL,NULL,NULL),
('ESR',230,'0-15',15,0,'mm/hr'),
('Haemoglobin',100,'11.0-16.0',16,11,'g/dL'),
('HCT',122,'37.0-50.0',50,37,'%'),
('MCH',170,'27-31',31,27,'pg'),
('MCV',170,'82-95',95,82,'fl'),
('PLT',145,'150-450',450,150,'10^3/uL'),
('RBC',120,'3.5-5.50',5.5,3.5,'10^6/uL'),
('RDW-CV',450,'11.5-14.5',14.5,11.5,'%'),
('RDW-SD',450,'35-56',56,35,'fl'),
('WBC',500,'4.5-11',11,4.5,'10^3/uL');

select * from tests;

 create table patientdeatails(
 rid int(10) not null,
 pname varchar(20) default null,
 age int(10) default null,
 gender varchar(5) default null,
 cno varchar(10) default null,
 address varchar(20) default null,
 paid int(11) default null,
 due int(10) default null,
 tests varchar(20) default null,
 total int(10) default null,
 primary key(rid)
 );
 
 select * from patientdeatails;
 
 


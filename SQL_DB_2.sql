create database trainingdb;

use trainingdb;

create table login_details(
login_id int,
password varchar(50),
no_attempts int,
login_count int,
status varchar(30)
);

insert into login_details
values(1001,'hello',3, 2, 'Inactive');

insert into login_details
values(1002,'hello',3, 2, 'active');

insert into login_details
values(1003,'hello',3, 2, 'active');

insert into login_details
values(1004,'hello',3, 2, 'active');

insert into login_details
values(1005,'hello',3, 2, 'active');


select * from login_details;







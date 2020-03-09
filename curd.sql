drop database thymeleaf;
create database thymeleaf;
use thymeleaf;
CREATE TABLE user (
id int(11) NOT NULL AUTO_INCREMENT,
name varchar(30),
PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;


INSERT INTO user VALUES (1,'name1');
INSERT INTO user VALUES (2,'name2');
INSERT INTO user VALUES (3,'name3');
INSERT INTO user VALUES (4,'name4');
INSERT INTO user VALUES (5,'name5');
INSERT INTO user VALUES (6,'name6');
INSERT INTO user VALUES (7,'name7');
INSERT INTO user VALUES (8,'name8');
INSERT INTO user VALUES (9,'name9');
INSERT INTO user VALUES (10,'name10');

CREATE TABLE school (
id int(11) NOT NULL AUTO_INCREMENT,
uid int(11),
schoolname varchar(30),
PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;

insert into school VALUES(1,1,'aa');
insert into school VALUES(2,2,'bb');
insert into school VALUES(3,3,'cc');
insert into school VALUES(4,4,'dd');
insert into school VALUES(5,5,'ee');
insert into school VALUES(6,6,'dd');
insert into school VALUES(7,7,'dd');
insert into school VALUES(8,8,'ee');
insert into school VALUES(9,9,'dd');
insert into school VALUES(10,10,'ee');

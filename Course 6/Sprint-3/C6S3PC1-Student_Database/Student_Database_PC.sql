create database school;
use school;
create table student(s_rollNo int, s_name varchar(30), s_totalMarks double, s_grade varchar(2));
insert into school.student values(11,'Mim',480.8,'A'); 
insert into school.student values(12,'Prince',460.0,'B');
insert into school.student values(13,'Abhiraj',450.8,'B');
insert into school.student values(14,'Priti',469.8,'A');
insert into school.student values(15,'Agnivesh',477.9,'A');
insert into school.student values(16,'Saurav',459.8,'C');
insert into school.student values(17,'Rani',449.8,'C');
select * from student;

create database movie_database;
use movie_database;
create table movie(Title varchar(30),Budget_in_Millions int, Release_Date date, Revenue_in_Millions int, Rating_Average double);
insert into movie values('Avatar',237,'2009-12-10',278,7.2);
insert into movie values('Titanic',200,'1997-11-18',185,7.5);
insert into movie values('The Avengers',220,'2012-04-25',152,7.4);
insert into movie values('Jurassic World',150,'2015-06-09',151,6.5);
insert into movie values('Furious 7',190,'2015-04-01',150,7.3);
insert into movie values('The Avengers: Age of Ultron',280,'2015-04-22',141,7.3);
insert into movie values('Iron Man 3',200,'2013-04-18',122,6.8);
insert into movie values('Minions',74,'2015-06-17',11,6.4);
insert into movie values('Caption: America Civil War',250,'2016-04-27',115,7.1);
insert into movie values('Transformers:Dark of the Moon',195,'2011-06-28',112,6.1);
# Task 1
select * from movie;
# Task 2
select * from movie where Title ='Jurassic World' and Rating_Average = 6.5;
# Task 3
select * from movie where Rating_Average >= 7;
# Task 4
select * from movie where Title like'The Avengers%';
# Task 5
select Title, Rating_Average from movie where Rating_Average between 7 and 8; 
# Task 6
select Title from movie where Budget_in_Millions >=250;
# Task 7
select Title,Rating_Average from movie where Revenue_in_Millions between 150 and 200;
# Task 8
select Title, Release_Date from movie where Title like 'T%';
# Task 9
select sum(Revenue_in_Millions) from movie;
#Task 10
select Title, Revenue_in_Millions from movie where Revenue_in_Millions = (select min(Revenue_in_Millions) from movie);
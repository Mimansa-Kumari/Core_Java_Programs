use car_sales;
insert into sales_person value(1008,"Charles","Florida",0);
# Task 1
select * from sales_person;
# Task 2
select * from sales_person where firstName = "Robin" and city ="Barcelona";
# Task 3
select city, commissionRate from sales_person where firstName = "John";
# Task 4
select * from sales_person where commissionRate > 15;
# Task 5
select * from sales_person where commissionRate between 10 and 20;
# Task 6
select firstName, city from sales_person where commissionRate >25;
# Task 7
select firstName, city from sales_person where commissionRate = 0;
# Task 8
select firstName from sales_person where firstName like 'J%';
# Task 9
select firstName from sales_person where city in('London','New York','San Jose');
# Task 10
select avg(commissionRate) from sales_person;
# Task 11
select firstName from sales_person where commissionRate in(10,11,12,13);
# Task 12
select firstName, city from sales_person where commissionRate = (select max(commissionRate) from sales_person);
create table car_sales.customer(customerId int primary key, firstName varchar(20), lastName varchar(20), 
city varchar(20), rating int, salesId int,foreign key(salesId)references sales_person(salesId));
use car_sales;
insert into customer values(2001,'Hoffman','Anny','London',100,1001);
insert into customer values(2002,'Giovanni','Jenny','Rome',200,1003);
insert into customer values(2003,'Liu','Willium','San Jose',100,1002);
insert into customer values(2004,'Harry','Grass','Berlin',300,1002);
insert into customer values(2005,'Clemens','John','London',200,1001);
insert into customer values(2006,'Fenny','John','San Jose',200,1005);
insert into customer values(2007,'Jonathon','Bob','Rome',300,1004);
SELECT * FROM car_sales.customer;


create table car_sales.order(orderId int primary key, amount int, orderDate varchar(20), customerId int, foreign key(customerId) references customer(customerId));
use car_sales;
insert into car_sales.order values(3001,123,'01-02-2020',2001);
insert into car_sales.order values(3003,187,'02-10-2020',2007);
insert into car_sales.order values(3002,100,'30-07-2000'2003);
insert into car_sales.order values(3005,201,'09-10-2011',2007);
insert into car_sales.order values(3009,145,'10-10-2012',2002);
insert into car_sales.order values(3007,167,'02-04-2021',2002);
insert into car_sales.order values(3008,189,'02-03-1999',2006);
insert into car_sales.order values(3010,100,'18-09-2000',2004);
SELECT * FROM car_sales.order;


use car_sales;
delete  from car_sales.order where orderId=3008;
delete  from car_sales.sales_person where commissionRate=0;
update car_sales.order set amount =200 where amount=100;
update car_sales.sales_person set commissionRate = 28 where commissionRate = 26;
update car_sales.customer set rating = 150 where rating = 100;
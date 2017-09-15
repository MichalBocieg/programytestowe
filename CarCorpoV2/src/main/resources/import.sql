insert into person(pesel, firstname, secondname, dateOfEmployment) values(95010212345, 'Adam', 'Vhor', '1995-01-02');
insert into person(pesel, firstname, secondname, dateOfEmployment) values(16112512345, 'Marek', 'Nowak', '2016-11-25');
insert into person(pesel, firstname, secondname, dateOfEmployment) values(05013012345, 'Jan', 'Kek', '2005-01-30');
insert into person(pesel, firstname, secondname, dateOfEmployment) values(10091712345, 'Mateusz', 'Biskup', '2010-09-17');
insert into person(pesel, firstname, secondname, dateOfEmployment) values(13021212345, 'Michal', 'Bociek', '2013-02-12');
insert into person(pesel, firstname, secondname, dateOfEmployment) values(93071312345, 'Dariusz', 'Dgark', '1993-07-13');

insert into car(brand, capacity, mileage, typeOfProperty) values(0, 250,  200000,0);
insert into car(brand, capacity, mileage, typeOfProperty) values(2, 400,  180000,1);
insert into car(brand, capacity, mileage, typeOfProperty) values(3, 450,  120000,0);
insert into car(brand, capacity, mileage, typeOfProperty) values(2, 300,  235000,1);
insert into car(brand, capacity, mileage, typeOfProperty) values(3, 7000, 127000,0);

insert into privatecar(brand, capacity, mileage, person) values(1, 600, 134000,05013012345);
insert into privatecar(brand, capacity, mileage, person) values(0, 540, 83000,93071312345);

insert into car(brand, capacity, mileage, typeOfProperty) values(1, 600,  134000,2);
insert into car(brand, capacity, mileage, typeOfProperty) values(0, 540,  83000, 2);

insert into assignment( startOfAssignment, person, car ) values('2011-07-18', 16112512345, 5);
insert into assignment( startOfAssignment, person, car ) values('2011-09-28', 05013012345, 3);
insert into assignment( startOfAssignment, person, car ) values('2010-12-13', 10091712345, 1);
insert into assignment( startOfAssignment, person, car ) values('2011-11-02', 13021212345, 1);
insert into assignment( startOfAssignment, person, car ) values('2013-10-16', 93071312345, 2);
insert into assignment( startOfAssignment, person, car ) values('2010-04-08', 93071312345, 4);
insert into assignment( startOfAssignment, person, car ) values('2011-10-15', 93071312345, 3);

drop database testing_system;

create database testing_system;
use testing_system;
create table `department`(
departmentID int  primary key auto_increment,
departmentName varchar(100)
);

create table `position`(
positionID int primary key auto_increment,
positionName varchar(30)
);

create table `account`(
accountID int primary key auto_increment,
email varchar(40),
userName varchar(30),
fullName varchar(30),
departmentID int,
positionID int,
createTime date,
foreign key (departmentID) references department(departmentID),
foreign key (positionID) references `position`(positionID)
);

create table `group`(
groupID int primary key auto_increment,
groupName varchar(30),
creatorID int,
createDate date 
);

create table `groupaccount`(
groupID int,
accountID int,
joindate date,
foreign key (groupID) references `group`(groupID),
foreign key (accountID) references `account`(accountID)
);

create table `typequestion`(
typeID int primary key auto_increment,
typeName varchar(20)
);

create table `categoryquestion`(
categoryID int primary key auto_increment,
categoryName varchar(30)
);

create table `question`(
questionID int primary key auto_increment,
content varchar(500),
categoryID int,
typeID int,
creatorID int,
createDate date,
foreign key (categoryID) references categoryquestion(categoryID),
foreign key (typeID) references typequestion(typeID)
);

create table `answer`(
answerID int primary key auto_increment,
content varchar(500),
questionID int,
isCorrect bool,
foreign key (questionID) references question(questionID)
);

create table `exam`(
examID int primary key auto_increment,
`code` varchar(20),
tittle varchar(200),
categoryID int,
duration time,
creatorID int,
createDate date
);

create table `examquestion`(
examID int,
questionID int,
foreign key (examID) references exam(examID),
foreign key (questionID) references question(questionID)
);

insert into `department`(departmentName) values ("sale"),("marketing"),("Accounting department"),("Administration department"),("Customer Service department"),("programing department"),("Human Resources department"),("Research & Development department"),("Audit department"),("Financial department");
insert into `position`(positionName) values ("dev"),("test"),("scrum-master"),("PM"),("manager"),("accountant"),("Director"),("Employee"),("Trainee"),("marketer");
insert into `account`(email,userName,fullName,createTime,departmentID,positionID) values ("son@gmail.com","thaison","dothaison","2021-09-02",3,6),
																 ("nam@gmail.com","vannam","ngovannam","2021-09-02",6,1),
																 ("hung@gmail.com","duchung","tranduchung","2021-09-02",6,2),
																 ("linh@gmail.com","vinhlinh","daovinhlinh","2021-09-02",6,3),
                                                                 ("mai@gmail.com","huongmai","nguyenhuongmai","2021-09-02",6,4),
                                                                 ("lan@gmail.com","phuonglan","nguyenphuonglan","2021-09-02",6,9),
                                                                 ("tuan@gmail.com","ductuan","nguyenductuan","2021-09-02",6,9),
                                                                 ("duong@gmail.com","daiduong","dodaiduong","2021-09-02",5,5),
                                                                 ("hoang@gmail.com","anhhoang","trananhhoang","2021-09-02",2,10),
                                                                 ("van@gmail.com","bichvan","nguyenbichvan","2021-09-02",2,10);
                                                                 

insert into `group`(groupName,creatorID,createDate) values  ("team1",112,"2021-09-02"),
															("team2",223,"2021-09-02"),
															("team3",345,"2021-09-02"),
															("team4",165,"2021-09-02"),
															("team5",178,"2021-09-02"),
                                                            ("team6",134,"2021-09-02"),
                                                            ("team7",189,"2021-09-02"),
                                                            ("team8",111,"2021-09-02"),
                                                            ("team9",110,"2021-09-02"),
                                                            ("team10",137,"2021-09-02");
                                                            
insert `groupaccount`(groupID,accountID,joinDate) values (1,2,"2021-09-04"),
														 (1,3,"2021-09-04"),
                                                         (1,4,"2021-09-04"),
                                                         (1,5,"2021-09-04"),
                                                         (2,3,"2021-09-04"),
                                                         (4,2,"2021-09-04"),
                                                         (5,3,"2021-09-04"),
                                                         (6,2,"2021-09-04"),
                                                         (7,4,"2021-09-04"),
                                                         (1,6,"2021-09-04"),
                                                         (2,2,"2021-09-04");

insert into `typequestion`(typeName) values ("essay"),("multiple-choice"),("Matching"),("form-question"),("table-completion");

insert into `categoryquestion`(categoryName) values ("Java"),(".NET"),("SQL"),("C"),("HTML");

insert into `question` (content, creatorID, createDate,categoryID,typeID) values (" what is abstract class in Java",123,"2021-09-04",1,2),
																("how to insert data in mySQL",123,"2021-09-04",2,4),
                                                                (" what is pointer in C",123,"2021-09-04",3,5),
                                                                ("what is .NET",123,"2021-09-04",4,2),
                                                                (" what is tag <input> in HTML",123,"2021-09-04",5,1);

insert into `answer`(content,questionID,isCorrect) values ("A class declared with the abstract keyword is called an abstract class. Abstract class can contain abstract methods and regular methods",1,TRUE),
														("Multi-inheritance support",1,false),
                                                        ("Only abstract methods",1,false),
                                                        ("Only static and final variables",1,false),
														("Use the insert into - values statement",2,TRUE),
                                                        ("Pointer in C is a variable, it is also known as locator or indicator that indicates an address of a value",3,TRUE),
                                                        ("NET is a web and software development framework. It is considered as one of the good and reliable frameworks. However, learning and understanding .NET framework is not simple. A lot of people love .NET for its 'language interoperability' - any language in .NET can use code written in another language.",4,TRUE),
                                                        ("The HTML <input> or input tag in HTML is used to represent an input field where the user can enter data.",5,TRUE);

insert into `exam`(`code`,tittle,categoryID,duration,creatorID,createDate) values   (1101,"procifiency-test1",12,"02:00:00",113,"2021-09-04"),
																					(1102,"procifiency-test2",15,"02:00:00",114,"2021-09-04"),
                                                                                    (1104,"procifiency-test3",04,"02:00:00",133,"2021-09-04"),
                                                                                    (1107,"procifiency-test4",23,"02:00:00",121,"2021-09-04"),
                                                                                    (1108,"procifiency-test5",45,"03:00:00",153,"2021-09-04"),
                                                                                    (1567,"procifiency-test6",15,"00:20:00",153,"2021-09-04"),
                                                                                    (1765,"procifiency-test7",62,"02:00:00",178,"2021-09-04"),
                                                                                    (1899,"procifiency-test8",82,"00:40:00",123,"2021-09-04"),
                                                                                    (1187,"procifiency-test9",99,"02:00:00",100,"2021-09-04"),
                                                                                    (1346,"procifiency-test10",18,"02:20:00",199,"2021-09-04");
                                                                                    
insert into `examquestion`(examID,questionID) values (1,1),
                                                     (1,2),  
                                                     (1,3),
                                                     (2,1),
                                                     (2,4),
                                                     (3,5),
                                                     (6,1),
                                                     (6,2),
                                                     (7,5),
                                                     (8,1),
                                                     (9,4),
                                                     (6,4);
                                                     

-- question 1 
select * 
from `account`
left join `department` on `account`.departmentID = `department`.departmentID;

-- question 2 
select *
from `account`
where createTime > "2010-10-20";

-- question 3 
select *
from `account`
left join `position` on `account`.positionID = `position`.positionID = 1;

-- question 4 
select `department`.departmentID, `department`.departmentName 
from `account`
left join `department` on  `department`.departmentID = `account`.departmentID
group by departmentID
having count(`account`.departmentID) >3;

-- question 5 
select questionID
from examquestion
group by questionID
order by count(examID) desc
limit 1;

-- question 6
select categoryID, count(categoryID)
from question
group by categoryID;

-- question 7
select questionID, count(examID)
from examquestion
group by questionID;

-- question 8
select question.questionID, question.content
from question 
join answer on question.questionID = answer.questionID
group by question.questionID
order by count(answer.answerID) desc
limit 1;

-- question 9
select groupID, count(accountID)
from groupaccount
group by groupID;

-- question 10
select `position`.positionID, `position`.positionName
from `position`
join `account` on `position`.positionID = `account`.positionID
group by `position`.positionID
ORDER BY count(`account`.accountID) desc
limit 1;

-- question 11
select department.departmentName,`position`.positionName, count(`position`.positionID)
from ((`position`
join `account` on `position`.positionID = `account`.positionID) 
join department on department.departmentID = `account`.departmentID)
group by department.departmentName,`position`.positionName;

-- question 12
select * 
from question
join answer on question.questionID = answer.questionID;
 
 -- question 13
 select typeQuestion.typeName, count(question.questionID)
 from question
 join typeQuestion on question.typeID = typeQuestion.typeID
 group by typeQuestion.typeName;
 
-- question 14
select `group`.groupID
from ((`group` left join groupaccount on `group`.groupID = groupaccount.groupID)
left join `account` on groupaccount.accountID = `account`.accountID)
group by `group`.groupID
having count(groupaccount.accountID) = 0;

-- question 15
select `group`.groupID
from ((`group` left join groupaccount on `group`.groupID = groupaccount.groupID)
left join `account` on groupaccount.accountID = `account`.accountID)
group by `group`.groupID
having count(`account`.accountID) = 0;

-- question 16
select question.questionID
from question
join answer on question.questionID = answer.questionID
group by question.questionID
having count(answer.answerID) = 0;

-- question 17
select groupaccount.accountID
from groupaccount
where groupID = 1
union distinct
select groupaccount.accountID
from groupaccount
where groupID = 2;

-- question 18
select groupaccount.groupID
from groupaccount
group by groupID
having count(accountID) > 5
union all
select groupaccount.groupID
from groupaccount
group by groupID
having count(accountID) < 7;




                                                     
                                                     

drop database testing_system;

create database testing_system;
use testing_system;
create table `department`(
departmentID int  primary key auto_increment,
departmentName varchar(30)
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
duration varchar(200),
creatorID int,
createDate date
);

create table `examquestion`(
examID int,
questionID int,
foreign key (examID) references exam(examID),
foreign key (questionID) references question(questionID)
);

insert into `department`(departmentName) values ("sale"),("marketing"),("Accounting department"),("Administration department"),("Customer Service department"),("programing department");
insert into `position`(positionName) values ("dev"),("test"),("scrum-master"),("PM"),("manager"),("accountant");
insert into `account`(email,userName,fullName,createTime,departmentID,positionID) values ("son@gmail.com","thaison","dothaison",now(),3,6),
											 ("nam@gmail.com","vannam","ngovannam",now(),6,1),
											 ("hung@gmail.com","duchung","tranduchung",now(),6,2),
											 ("linh@gmail.com","vinhlinh","daovinhlinh",now(),6,3),
                                                                			 ("mai@gmail.com","huongmai","nguyenhuongmai",now(),6,4);

insert into `group`(groupName,creatorID,createDate) values  ("team1",112,now()),
							    ("team2",223,now()),
					                    ("team3",345,now()),
							    ("team4",165,now()),
							    ("team5",178,now());
                                                            
insert `groupaccount`(groupID,accountID,joinDate) values (1,2,now()),
							 (1,3,now()),
                                                         (1,4,now()),
                                                         (1,5,now()),
                                                         (2,3,now());

insert into `typequestion`(typeName) values ("essay"),("multiple-choice"),("Matching"),("form-question"),("table-completion");

insert into `categoryquestion`(categoryName) values ("Java"),(".NET"),("SQL"),("C"),("HTML");

insert into `question` (content, creatorID, createDate,categoryID,typeID) values (" what is abstract class in Java",123,now(),1,2),
										 ("how to insert data in mySQL",123,now(),2,4),
                                                               			 (" what is pointer in C",123,now(),3,5),
                                                                		 ("what is .NET",123,now(),4,2),
                                                               			 (" what is tag <input> in HTML",123,now(),5,1);

insert into `answer`(content,questionID,isCorrect) values ("A class declared with the abstract keyword is called an abstract class. Abstract class can contain abstract methods and regular methods",1,TRUE),
							  ("Use the insert into - values statement",2,TRUE),
                                                          ("Pointer in C is a variable, it is also known as locator or indicator that indicates an address of a value",3,TRUE),
                                                          ("NET is a web and software development framework. It is considered as one of the good and reliable frameworks. However, learning and understanding .NET framework is not simple. A lot of people love .NET for its 'language interoperability' - any language in .NET can use code written in another language.",4,TRUE),
                                                          ("The HTML <input> or input tag in HTML is used to represent an input field where the user can enter data.",5,TRUE);

insert into `exam`(`code`,tittle,categoryID,duration,creatorID,createDate) values   (1101,"procifiency-test",12,"2 hours",113,now()),
										    (1102,"procifiency-test",15,"2 hours",114,now()),
                                                                                    (1104,"procifiency-test",04,"2 hours",133,now()),
                                                                                    (1107,"procifiency-test",23,"2 hours",121,now()),
                                                                                    (1108,"procifiency-test",45,"2 hours",153,now());
                                                                                    
insert into `examquestion`(examID,questionID) values (1,1),
                                                     (1,2),  
                                                     (1,3),
                                                     (2,1),
                                                     (2,4);
                                                     

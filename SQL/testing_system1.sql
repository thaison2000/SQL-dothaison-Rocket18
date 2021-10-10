drop database testing_system;

create database testing_system;
use testing_system;
create table `department`(
departmentID int auto_increment,
departmentName varchar(30)
);

create table `position`(
positionID int auto_increment,
positionName varchar(30)
);

create table `account`(
accountID int auto_increment,
email varchar(40),
userName varchar(30),
fullName varchar(30),
departmentID int,
positionID int,
createTime date
);

create table `group`(
groupID int auto_increment,
groupName varchar(30),
creatorID int,
createDate date 
);

create table `groupaccount`(
groupID int,
accountID int,
joindate date
);

create table `typequestion`(
typeID int auto_increment,
typeName varchar(20)
);

create table `categoryquestion`(
categoryID int auto_increment,
categoryName varchar(30)
);

create table `question`(
questionID int auto_increment,
content varchar(500),
categoryID int,
typeID int,
creatorID int,
createDate date
);

create table `answer`(
answerID int auto_increment,
content varchar(500),
questionID int,
isCorrect bool
);

create table `exam`(
examID int auto_increment,
`code` varchar(20),
tittle varchar(200),
categoryID int,
duration time,
creatorID int,
createDate date
);

create table `examquestion`(
examID int,
questionID int
);


use testing_system;


-- question 1
delimiter $$
create procedure question1(in ID int )
begin
select accountID
from `account`
where departmentID = ID;
end $$
delimiter ;

call question1(2);

-- question 2
delimiter $$
create procedure question2()
begin 
select groupID, count(accountID)
from groupaccount
group by groupID;
end $$
delimiter ;

call question2();

-- question 3
delimiter $$
create procedure question3()
begin
select typeID, count(questionID)
from question
where createDate > "2021-09-00"
group by typeID;
end $$
delimiter ;

call question3();

-- question 4
drop procedure question4;
delimiter $$
create procedure question4()
begin
select question.typeID, count(answer.questionID)
from question
join answer on question.questionID = answer.questionID
group by question.typeID
having count(answer.questionID) = (select max(abc) from ( select count(answer.questionID) as abc
							  from question
							  join answer on question.questionID = answer.questionID
						 	  group by question.typeID )as subquery);
end $$
delimiter ;

call question4;

-- question 5
delimiter $$
create procedure question5()
begin
select typequestion.typeName,question.typeID, count(answer.questionID)
from (question
join answer on question.questionID = answer.questionID)
join typequestion on typequestion.typeID = question.typeID
group by question.typeID
having count(answer.questionID) = (select max(abc) from ( select count(answer.questionID) as abc
							  from question
							  join answer on question.questionID = answer.questionID
						  	  group by question.typeID )as subquery);
end $$
delimiter ;

call question5;

-- question 6
drop procedure question6;
delimiter $$
create procedure question6(in string_name varchar(30))
begin
select*
from `account`
where userName like concat("%",string_name,"%");
end $$
delimiter ;

call question6("vannam");

-- question 7
drop procedure question7;
delimiter $$
create procedure question7(in in_fullname varchar(30), in in_email varchar(40))
begin
declare username varchar(40) default substring_index(in_email,"@",1);
declare positionID int default 1;
declare departmentID int default 1;

insert into `account` (email,userName,fullName,createTime,departmentID,positionID) values (in_email,username, in_fullname,now(), departmentID,positionID);
select * from `account`;
end $$
delimiter ;

call question7("thaison","dothaison@gmail.com");

-- question 8
drop procedure question8;
delimiter $$
create procedure question8(in in_type varchar(20))
begin
	if(in_type = "essay") then
		select question.questionID,question.content,max(length(question.content))
		from question 
		join typequestion on question.typeID = typequestion.typeID
		where question.typeID = 1;
	elseif(in_type = "multiple-choice") then
		select question.questionID,question.content,max(length(question.content))
		from question 
		join typequestion on question.typeID = typequestion.typeID
		where question.typeID = 2;
	end if;
end $$
delimiter ;

call question8("essay");

-- question 9
SET FOREIGN_KEY_CHECKS=0; -- to disable them
drop procedure question9;
delimiter $$
create procedure question9(in ID int)
begin 
delete from exam
where examID = ID;
end $$
delimiter ;

call question9(1);

-- question 10
SET FOREIGN_KEY_CHECKS=0; -- to disable them
drop procedure question10;
delimiter $$
create procedure question10()
begin
delete from exam 
where ((year(now()) - year(createDate)) > 3);
end $$
delimiter ;

call question10;

-- question 11

drop procedure question11;
SET FOREIGN_KEY_CHECKS=0; -- to disable them
delimiter $$
create procedure question11(in in_departmentname varchar(30))
begin
update `account`
set departmentID = 100
where departmentID =   (select departmentID
			from department
                        where departmentName = in_departmentname);
                        
delete from department
where departmentName = in_departmentname;
end $$
delimiter ;
call question11("sale");

                 

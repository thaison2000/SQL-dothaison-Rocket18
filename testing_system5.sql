-- question 1
drop view question1;
create view question1 as
select *
from `account` 
where departmentID = (select departmentID from department where departmentName = "sale");
 
-- question 2
drop view question2;
create view question2 as
select *
from groupaccount
group by accountID
having count(groupID) =(select count(groupID)
			from groupaccount
			group by accountID
			order by count(groupID) desc
			limit 1);

-- question 3
SET SQL_SAFE_UPDATES = 0;
drop view question3;
create view question3 as
select questionID,content,length(content)
from question
where length(content) > 300;
delete from question3
where length(content) >300;

 -- question 4
 drop view question4;
 create view question4 as
 select departmentID, count(accountID)
 from `account`
 group by departmentID
 having count(accountID) = (select count(accountID)
			    from `account` 
                            group by departmentID 
                            order by count(accountID) desc
                            limit 1);
					
 
 -- question 5
drop view question5;
create view question5 as
select question.content
from question
join `account` on question.creatorID = `account`.accountID
where `account`.fullName like "nguyen%";
 
                                                     

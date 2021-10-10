use testing_system;

-- ques1
drop trigger ques1;
delimiter $$
create trigger ques1
before insert on `group`
for each row
begin
if(year(now()) -year(new.createDate)) >1
then 
signal sqlstate "12345"
set message_text = "nhap khong dung";
end if;
end $$
delimiter ;

insert into `group`(groupName,creatorID,createDate) values ("team30",12,"2018-12-23");

-- ques 2
drop trigger ques2;
delimiter $$
create trigger ques2
before insert on `account`
for each row
begin
	declare id int;
    select department.departmentID into id
    from department
    where departmentName = "sale";
    if(new.departmentID = id)  then
    signal sqlstate "12345"
    set message_text = "department 'sale' can not add more user";
    end if;
    end $$
    delimiter ;
    
insert into `account`(email,userName,fullName,createTime,departmentID,positionID) values ("abcde@gmail.com","abcde","abcde",now(),1,2);

-- ques 3
delimiter $$
create trigger ques3
before insert on groupaccount
for each row
begin
	declare num int;
    select count(accountID)  into num
    from groupaccount
    where groupID = new.groupID;
    if (num>= 5) then
    signal sqlstate "12345"
    set message_text = "1 group chi chua nhieu nhat 5 users";
    end if;
end $$
delimiter ;

-- ques 4
delimiter $$
create trigger ques3
before insert on examquestion
for each row
begin
	declare num int;
    select count(questionID)  into num
    from examquestion
    where examID = new.examID;
    if (num>= 10) then
    signal sqlstate "12345"
    set message_text = "1 bai thi co nhieu nhat la 10 cau hoi";
    end if;
end $$
delimiter ;

-- ques 5
delimiter $$
create trigger ques5
before delete on `account`
for each row
begin
declare delete_email varchar(40);
set delete_email = "admin@gmail.com";
if (old.email = delete_email) then 
signal sqlstate "12345"
set message_text = "khong the xoa account cua admin";
end if;
end $$
delimiter ;

-- ques 6
SET FOREIGN_KEY_CHECKS=0;
drop trigger ques6;
delimiter $$
create trigger ques6
before insert on `account`
for each row
begin 
if(new.departmentID is null) then
set new.departmentID =20; -- 10 la id cua phong ban waiting department
end if;
end $$
delimiter ;


insert into `account`(email,userName,fullName,createTime,positionID) values ("hahaha@gmail.com","ha","dothaiha",now(),2);

    
select * from `account`;

-- ques 12
select *, case when (time_to_sec(duration)/60) <=30 then  "short time"
		       when 30< (time_to_sec(duration)/60) <=60 then "medium time"
               else "long time"
               end as tg
from exam;


-- ques 14
select department.departmentName, case when count(`account`.accountID) = 0 then "khong co user"
							      else count(`account`.accountID)
                                  end as soluong_users
from department 
left join `account` on department.departmentID = `account`.departmentID
group by department.departmentName


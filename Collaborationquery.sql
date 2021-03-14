use collaboration;

create Table User(
UserId int not null auto_increment,
FirstName varchar(30),
LastName varchar(30),
username varchar(20),
Password varchar(20),
Email varchar(40),
Role varchar(5),
Status varchar(10),
IsOnline boolean,
Enabled boolean,
primary key(UserId)
);
drop table User;
insert into User(FirstName, lastName, UserName, Password, email, Role, Status, Isonline, Enabled) 
values('Neil','Jerry','nmj','nmj@123','neilmarceljerry@gmail.com','Admin','Active',true,true);
Select * from User;
CREATE TABLE Blog (
    BlogId INT NOT NULL AUTO_INCREMENT,
    BlogTitle VARCHAR(20),
    BlogContent VARCHAR(300),
    BlogPosted DATE,
    Status VARCHAR(10),
    NoOfLikes INT,
    NoOfComments INT,
    NoOfViews INT,
    UserId INT,
    UserName VARCHAR(20),
    PRIMARY KEY (BlogId)
);

CREATE TABLE BlogComments (
    BlogCommentId INT NOT NULL AUTO_INCREMENT,
    UserId INT,
    UserName VARCHAR(20),
    UserProfileId INT,
    Title VARCHAR(20),
    NoOfLikes INT,
    BlogComment VARCHAR(300),
    CurrentDate DATE,
    BlodId int,
    PRIMARY KEY (BlogCommentId)
);

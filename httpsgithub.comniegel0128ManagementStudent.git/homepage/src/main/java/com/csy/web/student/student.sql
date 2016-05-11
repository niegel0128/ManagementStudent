drop table student;
CREATE TABLE student(
	s_id VARCHAR(16) PRIMARY KEY,
	s_name VARCHAR(20) NOT NULL,
	s_password VARCHAR(16) NOT NULL,
	s_tel VARCHAR(20),
	s_email VARCHAR(40),
	s_use_yn VARCHAR(1) NOT NULL,
	s_profile_img VARCHAR(100),
	s_role VARCHAR(1) not null,
	s_uid VARCHAR(20) not null
);

select * from student;

 SELECT * FROM student 
 where s_id = 'cho' and s_password = '1'

INSERT INTO student(s_id,s_name,s_password,s_tel,s_email,s_use_yn,
s_profile_img,s_role,s_uid)
values ('cho','조조조','1','000-0000-0000','cho@student.com','y',
'student.png','1',date_format(now(),'%Y%m%d%H%i%s%f'));

INSERT INTO student(
	s_id
	,s_name
	,s_password
	,s_tel
	,s_email
	,s_use_yn
	,s_profile_img,s_role,s_uid)
values ('cho','조조조','1','000-0000-0000','cho@student.com','y',
'student.png','1',date_format(now(),'%Y%m%d%H%i%s%f'));


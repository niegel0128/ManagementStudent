drop table admin;

CREATE TABLE admin(
	a_id VARCHAR(16) PRIMARY KEY,
	a_name VARCHAR(20) NOT NULL,
	a_password VARCHAR(16) NOT NULL,
	a_tel VARCHAR(20),
	a_email varchar(40),
	a_use_yn varchar(1) not null,
	a_profile_img VARCHAR(100),
	a_role varchar(1) not null,
	a_uid varchar(20) not null
);

INSERT INTO admin(a_id,a_name,a_password,a_tel,a_email,a_use_yn,
a_profile_img,a_role,a_uid)
values ('admin','관리자','1','000-0000-0000','admin@admin.com','y',
'admin.png','2',date_format(now(),'%Y%m%d%H%i%s%f'))

select * from admin;

select date_format(now(),'%Y%m%d%H%i%s%f') from dual

SELECT * FROM student WHERE s_id = 'cho' AND s_password = '1' 

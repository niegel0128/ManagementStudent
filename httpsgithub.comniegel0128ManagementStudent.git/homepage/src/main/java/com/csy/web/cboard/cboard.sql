drop table cboard; 
CREATE TABLE cboard(
	c_seq INT(11) NOT NULL AUTO_INCREMENT,
	c_title varchar(50) not null,
	c_des varchar(3000),
	c_use_yn varchar(1) not null,
	c_reg_user_id varchar(16) not null,
	c_reg_date DATETIME not null,
	c_file_src1 varchar(100),
	c_file_src2 varchar(100),
	c_uid varchar(20) not null,
	PRIMARY KEY (c_seq)
)

select * from cboard;

INSERT INTO cboard(c_seq,c_title,c_des,c_use_yn,c_reg_user_id,
c_reg_date,c_file_src1,c_file_src2,c_uid)
values ('1','테스트','cboard내용','y','admin',now(),
'cboard1.txt','cboard2.txt',date_format(now(),'%Y%m%d%H%i%s%f'));
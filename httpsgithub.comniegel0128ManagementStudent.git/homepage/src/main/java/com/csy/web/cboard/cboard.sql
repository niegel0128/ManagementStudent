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
	c_reg_user_name varchar(20) not null,
	PRIMARY KEY (c_seq)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE cboard
DROP COLUMN c_reg_user_name;

ALTER TABLE cboard
ADD (c_reg_user_name varchar(20))
;

select * from cboard;

INSERT INTO cboard(c_seq,c_title,c_des,c_use_yn,c_reg_user_id,
c_reg_date,c_file_src1,c_file_src2,c_uid,c_reg_user_name)
values ('1','테스트','cboard내용','y','admin',now(),
'cboard1.txt','cboard2.txt',date_format(now(),'%Y%m%d%H%i%s%f'),'관리자');

INSERT INTO cboard(c_title,c_des,c_use_yn,c_reg_user_id,
c_reg_date,c_file_src1,c_file_src2,c_uid,c_reg_user_name)
values ('테스트2'
	,'cboard내용2'
	,'y'
	,'cho'
	,now()
	,'cboard2.txt'
	,'cboard2.txt'
	,date_format(now(),'%Y%m%d%H%i%s%f')
	,'조조조');

	INSERT INTO cboard(c_title,c_des,c_use_yn,c_reg_user_id,
c_reg_date,c_file_src1,c_file_src2,c_uid,c_reg_user_name)
values ('테스트3','cboard내용3','y','cho',now(),
'cboard3.txt','cboard3.txt',date_format(now(),'%Y%m%d%H%i%s%f'),'조조조');
	
INSERT INTO cboard(c_title,c_des,c_use_yn,c_reg_user_id,
c_reg_date,c_file_src1,c_file_src2,c_uid,c_reg_user_name)
values ('테스트4','cboard내용4','y','cho',now(),
'cboard4.txt','cboard4.txt',date_format(now(),'%Y%m%d%H%i%s%f'),'조조조');

INSERT INTO cboard(c_title,c_des,c_use_yn,c_reg_user_id,
c_reg_date,c_file_src1,c_file_src2,c_uid,c_reg_user_name)
values ('테스트5'
	,'cboard내용5'
	,'y'
	,'cho'
	,now()
	,'cboard5.txt'
	,'cboard5.txt'
	,date_format(now(),'%Y%m%d%H%i%s%f')
	,'조조조');

delete from cboard 
where c_reg_user_id ='cho';

commit;

--게시판 구현 쿼리  mapper : seletAll serviceImpl : list()
SELECT a.c_title as title
		,a.c_des as des
		,b.s_name as name
		,lpad(a.c_reg_Date,10,0) as regDate
FROM cboard a , student b
where a.c_reg_user_id = b.s_id
order by a.c_reg_Date desc

--
select lpad(c_reg_Date,10,0) from cboard;

--게시판 구현 쿼리 mapper : selectByName  serviceImpl : getByName
--방법1
SELECT a.c_title as title
		,a.c_des as des
		,b.s_name as name
		,lpad(a.c_reg_Date,10,0) as regDate
FROM cboard a , student b
where a.c_reg_user_id = b.s_id
AND b.s_name = '조조조'
and b.c_use_yn = 'y'
order by a.c_reg_Date desc
--방법2
SELECT c_title as title
		,c_des as des
		,c_reg_user_name as name
		,lpad(c_reg_Date,10,0) as regDate
FROM cboard
where c_reg_user_name = '조조조'
and c_use_yn = 'y'
order by c_reg_Date desc
--
--게시판 구현 쿼리 mapper : selectById  serviceImpl : getById
--방법1
SELECT a.c_title as title
		,a.c_des as des
		,b.s_name as name
		,lpad(a.c_reg_Date,10,0) as regDate
FROM cboard a , student b
where a.c_reg_user_id = b.s_id
AND b.s_id = 'cho'
and c_use_yn = 'y'
order by a.c_reg_Date desc
--방법2
SELECT c_title as title
		,c_des as des
		,c_reg_user_name as name
		,lpad(c_reg_Date,10,0) as regDate
FROM cboard
where c_reg_user_id
AND c_reg_user_id = 'cho'
and c_use_yn = 'y'
order by c_reg_Date desc
--
--delete
 update cboard 
 set c_use_yn = 'n'
 where c_seq = 2;
 
--update
   UPDATE cboard 
   SET 
	   c_title = '타이틀테스트변경99',
	   c_des = '변경~9',
	   c_file_src1 = '파일변경99',
	   c_file_src2 = '파일변경99'
   WHERE c_seq = 2
----------------------
select * from cboard;
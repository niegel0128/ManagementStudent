drop table attent;
create table attent(
	at_seq int(11) not null AUTO_INCREMENT,
	at_start_date date,
	at_end_date date,
	at_date int(11),
	ad_uid varchar(20) not null,
	PRIMARY KEY (at_seq)
);

select * from attent;

INSERT INTO attent(at_seq,at_start_date,at_end_date,at_date,ad_uid)
values (1,'2016-05-02 17:12:23','2016-08-02 15:23:10','1',date_format(now(),'%Y%m%d%H%i%s%f'));


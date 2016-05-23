select * from graph;
select seq,label,fillColor,strokeColor,pointColor,pointStrokeColor,pointHighlightFill,pointHighlightStroke,data1,data2,data3,data4,data5 from graph
<!-- Create -->
DROP TABLE graph;
CREATE TABLE graph(
	seq INT(11) NOT NULL AUTO_INCREMENT,
	label varchar(100),
	fillColor varchar(100),
	strokeColor varchar(100),
	pointColor varchar(100),
	pointStrokeColor varchar(100),
	pointHighlightFill varchar(100),
	pointHighlightStroke varchar(100),
	data1 varchar(100),
	data2 varchar(100),
	data3 varchar(100),
	data4 varchar(100),
	data5 varchar(100),
	PRIMARY KEY (seq)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

<!-- insert -->
INSERT 
INTO graph(seq,label,fillColor,strokeColor,pointColor,pointStrokeColor,pointHighlightFill,pointHighlightStroke,data1,data2,data3,data4,data5)
values (1,'first','rgba(220,220,220,0,2)','rgba(220,220,220,1)','rgba(220,220,220,1)','#fff','#fff',
'rgba(220,220,220,1)','20','30','10','40','50');

<!-- insert -->
INSERT
INTO graph(label,fillColor,strokeColor,pointColor,pointStrokeColor,pointHighlightFill,pointHighlightStroke
,data1,data2,data3,data4,data5)
values ('second','rgba(151,187,205,2)','rgba(151,187,205,1)','rgba(151,187,205,1)','#fff','#fff',
'rgba(151,187,205,1)','10','40','30','50','10');

<!-- select -->
   select 
		seq,
		label,
		fillColor,
		strokeColor,
		pointColor,
		pointStrokeColor,
		pointHighlightFill,
		pointHighlightStroke,
		data1,
		data2,
		data3,
		data4,
		data5
	from graph;

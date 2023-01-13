
CREATE TABLE goto_school
(
	student_id INT NOT NULL REFERENCES student(student_id)  ON UPDATE CASCADE ON DELETE CASCADE,
	class_id INT NOT NULL REFERENCES class(class_id)  ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT goto_school_PKEY PRIMARY KEY (student_id,class_id)
);
insert into goto_school(student_id,class_id) values(1001,011);
insert into goto_school(student_id,class_id) values(1002,021);
insert into goto_school(student_id,class_id) values(1003,022);
insert into goto_school(student_id,class_id) values(1004,032);
insert into goto_school(student_id,class_id) values(1005,033);
insert into goto_school(student_id,class_id) values(1006,012);
insert into goto_school(student_id,class_id) values(1007,023);
insert into goto_school(student_id,class_id) values(1008,031);
insert into goto_school(student_id,class_id) values(1009,013);
insert into goto_school(student_id,class_id) values(10010,024);
insert into goto_school(student_id,class_id) values(10011,025);
insert into goto_school(student_id,class_id) values(10012,014);
insert into goto_school(student_id,class_id) values(10013,034);


CREATE TABLE activities(id BIGINT AUTO_INCREMENT,
                        start_time TIMESTAMP,
                        activity_desc VARCHAR(255),
                        activity_type VARCHAR(255),
                        PRIMARY KEY(id));

INSERT INTO activities(start_time, activity_desc, activity_type) VALUES ('2021-02-01 14:30:00','Biking in Mecsek', 'BIKING');
INSERT INTO activities(start_time, activity_desc, activity_type) VALUES ('2021-02-01 14:30:00','Hiking in Mecsek', 'HIKING');
INSERT INTO activities(start_time, activity_desc, activity_type) VALUES ('2021-01-31 10:30:00','Running in Mecsek', 'RUNNING');
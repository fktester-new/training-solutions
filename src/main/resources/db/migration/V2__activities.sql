CREATE TABLE activities(id BIGINT AUTO_INCREMENT,
                        start_time TIMESTAMP,
                        activity_desc VARCHAR(255),
                        activity_type VARCHAR(255),
                        PRIMARY KEY(id));

CREATE TABLE track_points(id BIGINT AUTO_INCREMENT,
                         act_time DATE,
                         lat DOUBLE,
                         lon DOUBLE,
                         activityId BIGINT,
                         PRIMARY KEY(id),
                         FOREIGN KEY (activityId) REFERENCES activities(id));

INSERT INTO activities(start_time, activity_desc, activity_type) VALUES ('2021-02-01 14:30:00','Biking in Mecsek', 'BIKING');
INSERT INTO activities(start_time, activity_desc, activity_type) VALUES ('2020-02-01 14:30:00','Hiking in Mecsek', 'HIKING');
INSERT INTO activities(start_time, activity_desc, activity_type) VALUES ('2020-01-31 10:30:00','Running in Mecsek', 'RUNNING');
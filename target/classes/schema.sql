CREATE TABLE Patient
(
 name varchar(100) NOT NULL,
  id  int NOT NULL ,
 doctor varchar(100) DEFAULT NULL,
 PRIMARY KEY (id)
);
#spring.jpa.properties.hibernate.default_schema=dbo

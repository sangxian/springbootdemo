CREATE DATABASE springbootdb;
use  springbootdb;
CREATE TABLE city(
 id int(10)  NOT NULL AUTO_INCREMENT ,
 province_id int(10) NOT NULL ,
 city_name varchar(25) DEFAULT NULL  ,
 description varchar(25) DEFAULT NULL ,
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
select * from city;
INSERT city VALUES (1 ,1,'温岭市','BYSocket 的家在温岭。');

/*UPDATE mysql.user SET Password=PASSWORD('root') where USER='root';
create user demo identified by 'demo';
GRANT ALL PRIVILEGES ON  *.* TO demo;
FLUSH PRIVILEGES;*/


create table userinfo (
id int(10) not null AUTO_INCREMENT,
user_id varchar(25) DEFAULT NULL,
password varchar(25) DEFAULT NULL,
 PRIMARY KEY (id))
ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
select * from userinfo;


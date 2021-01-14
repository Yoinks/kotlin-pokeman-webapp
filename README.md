MYSQL Datbase Setup


docker run --name mysql-pokeman-db -p 3306:3306 -e MYSQL_ROOT_PASSWORD=pokeman123 -d mysql

mysql -p


CREATE DATABASE Pokemans;
CREATE USER 'derp'@'localhost' IDENTIFIED BY 'derp123';
CREATE USER 'derp'@'%' IDENTIFIED BY 'derp123';
GRANT ALL ON Pokemans.* TO 'derp'@'localhost';
GRANT ALL ON Pokemans.* TO 'derp'@'%';
flush privileges;

CREATE TABLE pokeman (
	id int AUTO_INCREMENT UNIQUE,
	name VARCHAR(50),
	type VARCHAR(50)
);

INSERT INTO pokeman (name, type) VALUES ("peenisaur","flacid"),("boobasaur","boob"),("assssuar","ass");
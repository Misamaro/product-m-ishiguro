DROP TABLE IF EXISTS product;

CREATE TABLE product
(
   id INT NOT NULL AUTO_INCREMENT,
   prod_name VARCHAR(256),
   quantity INT(3),
   price INT(16),
   delete_flg bool,
   update_date timestamp not null default current_timestamp on update current_timestamp,
   create_date timestamp not null default current_timestamp,
   PRIMARY KEY(id)
);
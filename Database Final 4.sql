CREATE DATABASE final_4;

USE  final_4;

CREATE TABLE `user`(
	id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE KEY,
    `password` VARCHAR(255) NOT NULL,
    exp_in_year TINYINT,
    pro_skill VARCHAR(255),
    project_id INT,
    `role` ENUM('MANAGER','EMPLOYEE') DEFAULT 'EMPLOYEE'
);
INSERT INTO `final_4`.`user` (`id`, `full_name`, `email`, `password`, `pro_skill`, `project_id`, `role`) VALUES ('1', 'duc nguyen', 'ducnguyen@gmail.com', 'duc123', 'sql,java', '1', 'EMPLOYEE');
INSERT INTO `final_4`.`user` (`id`, `full_name`, `email`, `password`, `pro_skill`, `project_id`, `role`) VALUES ('2', 'ha phan', 'haphan@vtc.com', 'ha5695', 'ruby,c', '1', 'EMPLOYEE');
INSERT INTO `final_4`.`user` (`id`, `full_name`, `email`, `password`, `exp_in_year`, `project_id`, `role`) VALUES ('3', 'tuan vu', 'tuanvu@htc.com', 'tuandep', '2', '2', 'MANAGER');
INSERT INTO `final_4`.`user` (`id`, `full_name`, `email`, `password`, `pro_skill`, `project_id`, `role`) VALUES ('4', 'nga ngoc', 'ngangoc@kfc.com', 'ngoc3699', 'php', '2', 'EMPLOYEE');
INSERT INTO `final_4`.`user` (`id`, `full_name`, `email`, `password`, `exp_in_year`, `project_id`, `role`) VALUES ('5', 'vu ha', 'vuha@cfc.com', 'hatuan2', '4', '3', 'MANAGER');


use staging;

DROP TABLE IF EXISTS `standard_charge`;
DROP TABLE IF EXISTS `hospital`;
DROP TABLE IF EXISTS `procedure`;
DROP TABLE IF EXISTS `procedure_category`;

CREATE TABLE `procedure_category` (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY (id))
SELECT DISTINCT rev_code, rev_desc 
FROM `monroe_standardcharges`
WHERE area != "SDS"
ORDER BY rev_desc;

CREATE TABLE `procedure` (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY (id))
SELECT DISTINCT `code`, code_type, code_desc, area, rev_code, rev_desc 
FROM `monroe_standardcharges`
WHERE area != "SDS"
ORDER BY code_desc;

ALTER TABLE `procedure`
ADD `procedure_category_id` int;

UPDATE `procedure` AS p,
		`procedure_category` AS pc
SET p.procedure_category_id = pc.id
WHERE p.rev_code LIKE pc.rev_code;

ALTER TABLE `procedure`
ADD CONSTRAINT FK_procedure_category
FOREIGN KEY (procedure_category_id) REFERENCES `procedure_category` (id);

ALTER TABLE `procedure`
DROP COLUMN rev_code,
DROP COLUMN rev_desc;

CREATE TABLE `hospital` (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY (id))
SELECT DISTINCT entity_cd
FROM `monroe_standardcharges`
ORDER BY entity_cd;

CREATE TABLE `standard_charge` (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY (id))
SELECT DISTINCT discounted_cash_price, entity_cd, `code` 
FROM `monroe_standardcharges`
WHERE area != "SDS";

ALTER TABLE `standard_charge`
ADD `hospital_id` int;

ALTER TABLE `standard_charge`
ADD `procedure_id` int;

UPDATE `standard_charge` AS sc,
		`procedure` AS p
SET sc.procedure_id = p.id
WHERE sc.`code` LIKE p.`code`;

UPDATE `standard_charge` AS sc,
		`hospital` AS h
SET sc.hospital_id = h.id
WHERE sc.`entity_cd` LIKE h.`entity_cd`;

ALTER TABLE `standard_charge`
ADD CONSTRAINT FK_procedure
FOREIGN KEY (procedure_id) REFERENCES `procedure` (id);

ALTER TABLE `standard_charge`
ADD CONSTRAINT FK_hospital
FOREIGN KEY (hospital_id) REFERENCES `hospital` (id);

ALTER TABLE `standard_charge`
DROP COLUMN `entity_cd`,
DROP COLUMN `code`;

DELETE FROM `standard_charge`
WHERE discounted_cash_price = "";

UPDATE `procedure_category`
SET rev_code = "1", rev_desc = "HCPCS code"
WHERE id = 1;

UPDATE `procedure_category`
SET rev_desc = "Other Therapeutic Service"
WHERE rev_code = "0951";

UPDATE `procedure`
SET code_desc = "Antibody Test; severe acute respiratory syndrome coronavirus 2"
WHERE `code` = "86769"; 

ALTER TABLE `hospital`
ADD hospital_name varchar(50);

UPDATE `hospital`
SET hospital_name = "Monroe Clinic"
WHERE entity_cd = "SSM_MCH";

UPDATE `hospital`
SET hospital_name = "Ripon Clinic"
WHERE entity_cd = "SSM_RCH";

UPDATE `hospital`
SET hospital_name = "St. Agnes Hospital"
WHERE entity_cd = "SSM_SAF";



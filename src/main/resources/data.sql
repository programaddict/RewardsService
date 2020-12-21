DROP TABLE IF EXISTS rewards;

CREATE TABLE rewards (
  transaction_Id INT NOT NULL PRIMARY KEY,
  account_Id VARCHAR(10) NOT NULL,
  first_Name VARCHAR(50) NOT NULL,
  last_Name VARCHAR(50) NOT NULL,
  transaction_Amount INT NOT NULL, 
  date VARCHAR(15) NOT NULL
);

INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date) 
	values(0000000101, 'A0001', 'Michale', 'Robbin', 12, '2020-01-15');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000102, 'A0001', 'Michale', 'Robbin', 65, '2020-01-18');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000103, 'A0001', 'Michale', 'Robbin', 134, '2020-02-09');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000104, 'A0001', 'Michale', 'Robbin', 85, '2020-02-25');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000105, 'A0001', 'Michale', 'Robbin', 135, '2020-03-22');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000106, 'A0002', 'Carlos', 'Snares', 75, '2020-01-16');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000107, 'A0002', 'Carlos', 'Snares', 35, '2020-01-17');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000108, 'A0002', 'Carlos', 'Snares', 90, '2020-02-26');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000109, 'A0002', 'Carlos', 'Snares', 50, '2020-02-06');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000110, 'A0002', 'Carlos', 'Snares', 187, '2020-03-26');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000111, 'A0003', 'Enric', 'Dosio', 100, '2020-01-16');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000112, 'A0003', 'Enric', 'Dosio', 123, '2020-01-14');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000113, 'A0003', 'Enric', 'Dosio', 9, '2020-03-06');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000114, 'A0003', 'Enric', 'Dosio', 128, '2020-03-10');
INSERT INTO rewards(transaction_Id, account_Id, first_Name, last_Name, transaction_Amount, date)
	values(0000000115, 'A0003', 'Enric', 'Dosio', 65, '2020-03-27');
	
	
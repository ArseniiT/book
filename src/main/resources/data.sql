CREATE TABLE book(
  id INT(11) NOT NULL AUTO_INCREMENT,
  title 	VARCHAR(100) NOT NULL,
  description VARCHAR(255),
  author VARCHAR(100)NOT NULL,
  isbn VARCHAR(20)NOT NULL UNIQUE,
  printYear INT(4) NOT NULL,
  readAlready  TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)
  DEFAULT CHARACTER SET = utf8;
INSERT INTO book(title, description, author, isbn, print_year, read_already) VALUES
  ('Murach Java Programming (5th Edition)',
   'This is the 5th edition of Murach classic Java book that trained thousands
    of developers in the last 15 years.', 'Joel Murach', '1943872074', '2017', '0');

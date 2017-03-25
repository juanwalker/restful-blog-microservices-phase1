# restful-blog-microservices-phase1

This project is part of the transformation to microservices of project https://github.com/benjsicam/restful-blog, it was splitted in 4 stages for educational purposes.

For the stage 1 you will need to create three new databases with the following tables:

##restful_blog_auth

```sql
CREATE TABLE IF NOT EXISTS `credentials` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

INSERT INTO `credentials` (`id`, `username`, `password`) VALUES
	(1, 'admin', '$2a$10$4nz/lAntXH017MFHPX1R5.m3YEAhVICaJtrQUP87ZvGr1dEIKNyPq'),
	(2, 'user', '$2a$10$NtDZRpRKw190x5QR/oNCMuW5Ff6yx4klaw.Qd5PP2/i8DXjZzqHaG');
```

##restful_blog_author

```sql
CREATE TABLE IF NOT EXISTS `author` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

INSERT INTO `author` (`id`, `username`, `firstname`, `lastname`, `email`) VALUES
	(1, 'admin', 'admin', 'admin', 'admin@benjsicam.me'),
	(2, 'user', 'Juan', 'dela Cruz', 'info@benjsicam.me');
```

##restful_blog_log

```sql
CREATE TABLE IF NOT EXISTS `log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `message` varchar(21000) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=339 DEFAULT CHARSET=utf8;
```

CREATE TABLE `users` (
  `id` integer PRIMARY KEY,
  `name` varchar(255),
  `password` varchar(255)
);

CREATE TABLE `following` (
  `userid` integer,
  `followingid` varchar(255)
);

CREATE TABLE `calender` (
  `date` DATE PRIMARY KEY,
  `goal` varchar(255),
  `work` varchar(255),
  `sharing` varchar(255),
  `userid` integer
);

CREATE TABLE `goals` (
  `userid` integer,
  `goal` varchar(255),
  `category` varchar(255),
  PRIMARY KEY (`userid`, `goal`)
);

CREATE TABLE `works` (
  `userid` integer,
  `work` varchar(255),
  `category` varchar(255),
  PRIMARY KEY (`userid`, `work`)
);

ALTER TABLE `calender` ADD FOREIGN KEY (`userid`) REFERENCES `users` (`id`);

ALTER TABLE `works` ADD FOREIGN KEY (`userid`) REFERENCES `users` (`id`);

ALTER TABLE `goals` ADD FOREIGN KEY (`userid`) REFERENCES `users` (`id`);

ALTER TABLE `following` ADD FOREIGN KEY (`userid`) REFERENCES `users` (`id`);

ALTER TABLE `calender` ADD FOREIGN KEY (`goal`) REFERENCES `goals` (`goal`);

ALTER TABLE `calender` ADD FOREIGN KEY (`work`) REFERENCES `works` (`work`);

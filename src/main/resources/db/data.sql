insert into user_tb(username, password, email, created_at)
values ('ssar', '$2a$10$93SObxZRuYAOT5a22IQDj.3j5XK3EQSIlzsD31BCS1Dyt3ISSA6ci', 'ssar@nate.com', now());
insert into user_tb(username, password, email, created_at)
values ('cos', '$2a$10$lWwqfv9yWKKInp9DhCDFdOEb0v/cFy5NqUarY0Czk2X3uTLKK3IBG', 'cos@nate.com', now());
insert into user_tb(username, password, email, created_at)
values ('love', '$2a$10$gB0bFdQOGv2Rb4MtRme1XeCKy7te/Z9XV1Av.fEfTF7i/4SCw66IS', 'love@nate.com', now());

insert into board_tb(title, content, user_id, created_at)
values ('제목1', '내용1', 1, now());
insert into board_tb(title, content, user_id, created_at)
values ('제목2', '내용2', 1, now());
insert into board_tb(title, content, user_id, created_at)
values ('제목3', '내용3', 2, now());
insert into board_tb(title, content, user_id, created_at)
values ('제목4', '내용4', 3, now());
insert into board_tb(title, content, user_id, created_at)
values ('제목5', '내용5', 1, now());
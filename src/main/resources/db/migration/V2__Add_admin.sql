insert into users(id, username, password, active)
  values (2, 'admin', '123', TRUE);

insert into user_role(user_id, roles)
  values (2, 'USER'), (2,'ADMIN');
DROP TABLE IF EXISTS user_subscriptions;

CREATE TABLE user_subscriptions(
  channel_id bigint NOT NULL REFERENCES users,
  subscriber_id bigint NOT NULL REFERENCES users,
  PRIMARY KEY(channel_id, subscriber_id)
)engine=MyISAM;


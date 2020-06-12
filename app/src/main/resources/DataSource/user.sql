create table `user`(
     id int(11) not null auto_increment,
     account varchar(255) not null default '' COMMENT '账户',
     password varchar(128) not null default '' COMMENT '密码',
     address varchar(100) not null default '' COMMENT '地址',
     phone varchar(20) not null default '' COMMENT '手机号码',
     point int(11) not null default 0 COMMENT '积分',
     remark varchar(250) not null default '' COMMENT'评论',
     tel_phone varchar(20) not null default '' COMMENT '备用号码',
     user_name varchar(20) not null default '' COMMENT '用户名称',
     zip_code varchar(30) not null default '' COMMENT '邮政编码',
     balance  bigint(20) not null default 0 COMMENT '账户金额',
     PRIMARY key(id)
)ENGINE=InnoDB auto_increment=0 DEFAULT CHARSET=utf8 COMMENT '用户表';
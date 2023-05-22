-- 用户信息表 sys_user
create table sys_user
(
    ID         varchar(50) not null comment 'id' primary key,
    LOGIN_NAME varchar(50) not null comment '登录名称',
    FULL_NAME  varchar(50) not null comment '用户昵称',
    constraint SYS_USER_pk_LOGIN_NAME
        unique (LOGIN_NAME)
) comment '系统-用户信息标' collate = utf8mb4_bin;
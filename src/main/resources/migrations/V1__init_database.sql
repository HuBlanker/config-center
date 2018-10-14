CREATE TABLE `config_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(128) NOT NULL COMMENT '用户名称',
  `passwd` varchar(128) NOT NULL COMMENT '密码',
  `roles` varchar(256) DEFAULT NULL COMMENT '角色id列表',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  index `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `role` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(128) NOT NULL COMMENT '角色名称',
  `closets` varchar(256) DEFAULT NULL COMMENT '壁橱id列表',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  index `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `closet` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(128) NOT NULL COMMENT '壁橱名称',
  `comment` varchar(128) DEFAULT NULL COMMENT '备注',
  `drawers` varchar(256) DEFAULT NULL COMMENT '抽屉id列表',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  index `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE `drawer` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(128) NOT NULL COMMENT '抽屉名称',
    `comment` varchar(128) DEFAULT NULL COMMENT '备注',
  `content` text DEFAULT NULL COMMENT '角色id列表',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  index `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
# config-center 配置中心

## 说明

## 数据库

1.用户```config_user```


列名 | 类型 | 备注 
---| --- | --- | 
id | int | 用户id
name | string | 用户名
passwd | string | 密码
roles | string | 角色id列表
created_at | datetime | 创建时间
updated_at | datetime | 修改时间

2.角色```role```

列名 | 类型 | 备注 
---| --- | --- | 
id | int | 角色id
name | string | 用户名
closets | string | 壁橱id列表
created_at | datetime | 创建时间
updated_at | datetime | 修改时间

3.壁橱```closet```

列名 | 类型 | 备注 
---| --- | --- | 
id | int | 壁橱id
name | string | 壁橱名称
comment | string | 壁橱备注
drawers | string | 抽屉id列表
created_at | datetime | 创建时间
updated_at | datetime | 修改时间

4.抽屉```drawer```

列名 | 类型 | 备注 
---| --- | --- | 
id | int | 抽屉id
name | string | 抽屉名称
comment | string | 抽屉备注
content | string(big) | 抽屉内容
created_at | datetime | 创建时间
updated_at | datetime | 修改时间
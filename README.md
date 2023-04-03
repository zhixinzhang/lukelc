# lukelc
<li>https://docs.spring.io/spring-boot/docs/current/reference/html/index.html</li>
### Mysql Command 

*Start and Stop MySQL using*
<li>https://www.youtube.com/watch?v=2paC-z79OeY</li>
```
lukezhang@DESKTOP-7687KRD:~/projects/lukelc$ sudo service mysql start
[sudo] password for lukezhang: LukeAi....1

lukezhang@DESKTOP-7687KRD:~/projects/lukelc$ sudo mysqld_safe --skip-grant-tables &
Please ENTER to return to the linux bash prompt

lukezhang@DESKTOP-7687KRD:~/projects/lukelc$ sudo mysql --user=root mysql

UPDATE mysql.user SET authentication_string=null WHERE User='root';
ALTER USER 'root'@'localhost' IDENTIFIED BY 'new_password';
FLUSH PRIVILEGES;
quit


sudo service mysql stop

lukezhang@DESKTOP-7687KRD:~/projects/lukelc$ sudo mysql -p -u root
```

*enter into Mysql*
```
sudo mysql -p -u root
DKPAi1234!
```

```mysql> SHOW DATABASES;
mysql> SHOW TABLES;
mysql> select * from user_entity;
```

*select a database called lcdb −
```mysql> use lcdb;
Database changed
```
reset Root pw : https://stackoverflow.com/questions/41645309/mysql-error-access-denied-for-user-rootlocalhost

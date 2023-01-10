## check status 
	sudo service mysql status
## restart server
	sudo service mysql restart
## change address
	goto ->	/etc/mysql/mysql.conf.d/mysqld.cnf
	bind-address            = 192.168.0.5
## after every change restart the server
	sudo systemctl restart mysql.service


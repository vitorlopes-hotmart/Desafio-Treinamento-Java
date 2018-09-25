# Running Liquibase

`./liquibase \
--classpath=/usr/share/java/mysql-connector-java-8.0.12.jar \
--changeLogFile=scripts/master.xml \
--username=[USERNAME] \
--password=[PASSWORD] \
--url="jdbc:mysql://localhost:3306/desafio_treinamento_java?createDatabaseIfNotExist=true" \
--driver=com.mysql.jdbc.Driver \
update`
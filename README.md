# Desafio-Treinamento-Java

Este projeto foi desenvolvido para ser usado como um meio de aprendizado em programação Java, Spring Boot e diversas implicações. 

## Criando o Banco de Dados

Este projeto se baseia em um Sistema de Gerenciamento de Banco de Dados MySql e para criá-lo com mais agilidade, recomenda-se o uso da biblioteca Liquibase.

Faça o Download desta biblioteca e executa o seguinte comando:

`./liquibase
--classpath=/usr/share/java/mysql-connector-java-8.0.12.jar
--changeLogFile=scripts/master.xml
--username=[USERNAME]
--password=[PASSWORD]
--url="jdbc:mysql://localhost:3306/desafio_treinamento_java?createDatabaseIfNotExist=true"
--driver=com.mysql.jdbc.Driver
update`

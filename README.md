# springboot-demo-II

## After cloning the repo, run docker to get the appropriate working env

#### Mysql for apple m1
docker pull --platform linux/amd64 mysql
#### run mysql image
docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=mydb -d -p 3306:3306 mysql:latest

### Make sure springboot-demo-II/backend/src/main/resources/application.properties is filled with:
         
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=password
    spring.datasource.url=jdbc:mysql://localhost:3306/mydb
    spring.jpa.hibernate.ddl-auto=update


### Source: https://www.youtube.com/watch?v=aYvU0vI_Tg0&t=1523s

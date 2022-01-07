### springboot-demo-II

### First thing after cloning the repo, run docker to get the appropriate working env

### Docker
# Mysql for apple m1
docker pull --platform linux/amd64 mysql
# run mysql image
docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=password -d -p 3306:3306 mysql:latest

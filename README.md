# springboot-docker

# Some Useful docker commands

1) To Create image using docker file

docker build -f Dockerfile -t springboot-docker-image .

after -t(tag) represent image name and (.) reprsent where is Dockerfile is , so we will use (.) as we run commnad from our project root directory

2)To check wetaher image created or not

docker images

3) running created image inside docker conatiner

docker run -p 8084:8080 springboot-docker-image

where 8084 open port connection for outside container user and its binds with aplication on port 8080 internally

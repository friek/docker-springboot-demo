# Docker Spring boot Demo application
Source code for blog posting [learning docker](https://www.localhost.nl/2018/04/10/learning-docker/).

Build the docker image:
```bash
docker build -t friek/dockerdemo:test .
```

Run the image:
```bash
docker run --detach -p 8080:8080 friek/dockerdemo:test
```
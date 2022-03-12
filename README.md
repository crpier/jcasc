# jcasc
My config for Jenkins
Builds into a Dockerfile.
Used on the infrastructure from https://github.com/tiannaru/subsistence_infrastructure.

## TODO
- create a pipeline for this that at least builds and pushes the image lmao

### Build
```
docker build -t jenkins:jcasc 
```

### Run
```
docker run --name jenkins --rm -p 8080:8080 --env JENKINS_ADMIN_ID=admin --env JENKINS_ADMIN_PASSWORD=password --env GITHUB_TOKEN=token --env JENKINS_URL=http://example.com:8080/ jenkins:jcasc
```

### Env vars

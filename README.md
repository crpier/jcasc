### Build
```
docker build -t jenkins:jcasc 
```

### Run
```
docker run --name jenkins --rm -p 8080:8080 --env JENKINS_ADMIN_ID=admin --env JENKINS_ADMIN_PASSWORD=password --env GITHUB_TOKEN=token --env JENKINS_URL=http://example.com:8080/ jenkins:jcasc
```

### Env vars

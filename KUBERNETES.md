











### Kubernetes

In the `petclinic.k8s.yml` overwrite the `config-deployment:` spec's `env:` value for the entry `GIT_CONFIG_URI` to the URL of your forked configuration repository. Don't start the application yet, there's more work required to customise it for your environment.

```yaml
...
  spec:
      containers:
        - env:
            - name: "SPRING_PROFILES_ACTIVE"
              value: "kubernetes"
            - name: "PORT"
              value: "8888"
            - name: "GIT_CONFIG_URI"
              value: "https://github.com/<your-github-username>/spring-petclinic-microservices-config"
```

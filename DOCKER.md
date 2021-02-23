






### Docker

In the `docker-compose.yml` overwrite the `config-server:` `environment:` value for the entry `GIT_CONFIG_URI` to the URL of your forked configuration repository. Don't start the application yet, there's more work required to customise it for your environment.

```yaml
...
config-server:
    image: benwilcock/spring-petclinic-config-server-native:2.4.1
    container_name: config-server
    mem_limit: 1024M
    ports:
        - 8888:8888
    environment:
        - PORT=8888
        - SPRING_PROFILES_ACTIVE=docker
        - TRACING_SERVER_URI=http://tracing-server:9411
        - GIT_CONFIG_URI=https://github.com/benwilcock/spring-petclinic-microservices-config
```


#### Running The Petclinic Microservices

To run the services, a handy `docker-compose` configuration has been provided in the file `docker-compose.yml`. This means that you can start all the applications using the command `docker-compose up`.

```bash
docker-compose up
```

However, even though the `depends_on` has been specified, this will rarely work. Docker's concept of an application being "started" is not the same as an application being "ready" to accept traffic. The sample expects a specific boot-order to be respected and when it's not, the applications fast-fail (usually because the Config server is unavailable). See [https://docs.docker.com/compose/startup-order/](https://docs.docker.com/compose/startup-order/).

To work around this issue, use `docker-compose up` to configure everything and then simply restart the containers in the order stated in the "Start The Applications" section above. You may do this however you like.

I use the excellent Portainer.io for Docker to do this. Installing Portainer is easy, just a few commands. see: [https://www.portainer.io/installation/](https://www.portainer.io/installation/). Below is a snippet:

```bash
docker volume create portainer_data
docker run -d -p 8000:8000 -p 9000:9000 --name=portainer --restart=always -v /var/run/docker.sock:/var/run docker.sock -v portainer_data:/data portainer/portainer-ce
```

With Portainer in your system, you can use its handy browser interface to control your Petclinic 'Stack'. You can start, stop, and restart containers easily and do other things like view their logs or connect with them over ssh.

Start the microservices one at a time in the right order, checking the logs or the `/actuator/health` endpoint to ensure the app is running before moving on to the next. You can also monitor the [Admin Server](http://localhost:9090) in your browser to check which applications have started and registered with the Discovery service.

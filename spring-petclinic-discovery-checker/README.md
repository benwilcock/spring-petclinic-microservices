# Spring Cloud Discovery Checker

See `pom.xml` for dependencies.

## Test Using a Browser...

Deploy the app, get a URL, open a browser, and try these addresses.

#### Default Landing Page

```bash
http://<apps-url-address>/
```

Displays: _"Get your greeting here"_

#### Greeting

```bash
GET http://<apps-url-address>/greeting
```

Returns:

```bash
Hello, World!
```

#### List Of Discoverable Services

```bash
http://<apps-url-address>/listservices
```

Displays: _"Service List.
            Discoverable applications are: [kubernetes, tas4k8s-svc-001, tas4k8s-svc-002, kube-dns] at present."_


## Test Using The REST Api...

Deploy the app, get a URL, open a rest client (or Httpie), and try these endpoints.

#### Hello

```bash
GET http://<apps-url-address>/hello
```

Returns:

```bash
Hello world!
```
            
#### List Of Discoverable Services

```bash
GET http://<apps-url-address>/services
```

Returns:

```json
[
    "admin-server",
    "config-checker",
    "discovery-checker"
]
```

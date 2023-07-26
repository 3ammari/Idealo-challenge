# Idealo Robot

Project is split to two modules

- `be/`: backend module
- `fe/`: frontend module

1. to start the app 
```bash
cd be/
docker build -t a3ammari/idealo-robot:latest .
docker run -e SERVICE_HTTP_PORT=80 -p 8080:80 -ti a3ammari/idealo-robot
```

2. to test the API from the cli run the following 
```bash
sh request.sh
```

3. to test to Frontend open `fe/fe.html`

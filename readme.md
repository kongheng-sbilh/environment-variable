
## Start the project from Maven
- Go to `src/main/resources` Rename the `.env-sample` to `.env` and replace the XXXXX value with the real value
- Open the ternimal
- Run `mvn clean install`
- Run `java -jar .\target\environment-variable-0.0.1-SNAPSHOT.jar`
- Access to `localhost:8080`

## Start the project from Docker
- Open the ternimal
- Run `docker-compose up`
- Access to `localhost:8080`



### Noted:
Run this command `java -jar .\target\environment-variable-0.0.1-SNAPSHOT.jar --spring.profiles.active=uat` to start the application based on profile active.

the project folder called first-try is using OAuth2


this is only through browser:
http://localhost:8080/oauth/token?grant_type=password&client_id=restapp&client_secret=restapp&username=java&password=spring
then:
http://localhost:8080/api/users/?access_token=<returned token>

<quote>
carlson is using this way:
curl -X POST -vu clientapp:123456 http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=spring&username=roy&grant_type=password&scope=read%20write&client_secret=123456&client_id=clientapp"
curl -X POST -vu client_secret:restapp http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=spring@java&username=beingjavaguy&grant_type=password&scope=read%20write&client_secret=restapp&client_id=restapp"
</quote>


I am using this way for oauth2:
1) get the token:
curl -X POST  http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=spring&username=java&grant_type=password&client_secret=restapp&client_id=restapp"

{"value":"304b71b9-c702-45bb-b6c1-fcc52823f9dc","expiration":"Dec 3, 2015 11:20:00 AM","tokenType":"bearer","refreshToken":{"expiration":"Jan 2, 2016 11:18:00 AM","value":"364466d6-1183-4e3c-979b-7f818e70558c"},"scope":[],"additionalInformation":{}}

2) using token to get the json data:

curl http://localhost:8080/api/users/ -H "Authorization: Bearer 304b71b9-c702-45bb-b6c1-fcc52823f9dc"


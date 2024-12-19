# Eagle Scout Tracker

## Testing

Register a new scout:

```bash
curl -d '{"name":"Timmy","email":"timmy@example.com","birthDate":"2009-12-08"}' -X POST -H 'content-type: application/json' http://localhost:8080/v1/scouts
```

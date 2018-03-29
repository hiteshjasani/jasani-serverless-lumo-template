# {{name}} lambda service

## Quickstart

1. Set up your AWS Credentials
2. Install [serverless][] somewhere and update path in Makefile
3. Install npm dependencies `npm install`
4. Deploy your service `make deploy`
5. Test your service by using curl.

```shell
# Modify the url to match your actual service
$ curl https://xxxxx.execute-api.us-east-1.amazonaws.com/dev/get
```

6. Use the Makefile for other common commands such as getting info,
   checking logs, limiting the service and finally, removing it.


## History

This project was generated from the [jasani-serverless-lumo][]
template.  It uses lumo for compilation and runs the lambda functions
on [Node.js][].

[jasani-serverless-lumo]: https://github.com/hiteshjasani/jasani-serverless-lumo-template
[Node.js]: https://nodejs.org/
[serverless]: https://serverless.com

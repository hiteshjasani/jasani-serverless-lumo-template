# jasani-serverless-lumo

A Leiningen template for an npm serverless function compiled with lumo.

## Usage

Make sure you have the prerequisites installed.

1. `lein new jasani-serverless-lumo fooserver`
2. `npm install`
3. `.../serverless deploy`

If all goes well, you should see output similar to this:

```
Serverless: Targeting /private/tmp/t/fooserver/.serverless/fooserver.zip
Serverless: Executing "lumo --classpath /private/tmp/t/fooserver/node_modules/serverless-cljs-plugin/serverless-cljs-plugin --auto-cache --main serverless-lumo.build --service-path /private/tmp/t/fooserver --functions '[{:name "fooserver-dev-get" :invoke fooserver.core/get}]' --index false --warning-exit false"
Serverless: Returning artifact path /private/tmp/t/fooserver/.serverless/fooserver.zip
Serverless: Packaging service...
Serverless: Excluding development dependencies...
Serverless: Creating Stack...
Serverless: Checking Stack create progress...
.....
Serverless: Stack create finished...
Serverless: Uploading CloudFormation file to S3...
Serverless: Uploading artifacts...
Serverless: Uploading service .zip file to S3 (2.93 MB)...
Serverless: Validating template...
Serverless: Updating Stack...
Serverless: Checking Stack update progress...
.................................
Serverless: Stack update finished...
Service Information
service: fooserver
stage: dev
region: us-east-1
stack: fooserver-dev
api keys:
  None
endpoints:
  GET - https://vtx6omxt91.execute-api.us-east-1.amazonaws.com/dev/get
functions:
  get: fooserver-dev-get
```

4. Test your function

```
curl https://vtx6omxt91.execute-api.us-east-1.amazonaws.com/dev/get
```


## Prerequisites

* [nodejs & npm](https://nodejs.org/en/)
* [serverless](https://serverless.com/)
* [lumo](https://github.com/anmonteiro/lumo)
* You have an AWS account and configured credentials

## Credits

This work builds upon the great work done by:

* [nervous-systems](https://github.com/nervous-systems/serverless-cljs-plugin)
* [serverless](https://serverless.com/)

## License

Copyright © 2018 Hitesh Jasani

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.


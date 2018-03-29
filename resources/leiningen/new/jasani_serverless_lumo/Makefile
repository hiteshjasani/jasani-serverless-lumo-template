# This Makefile is not necessary to do these commands. But it makes
# remembering them much easier.

# Uncomment if you've installed serverless globally
SL		= ../node_modules/serverless/bin/serverless
#SL		= serverless

# Assume aws cli is in your PATH variable
AWS		= aws

# Some make targets require a function argument
SAMPLE_FN	= {{name}}-dev-get
SAMPLE_FN_SHORT	= get



.PHONY: info info-raw deploy remove logs fn-config limit unlimit clean

info:
	$(SL) info

info-raw:
	$(AWS) lambda list-functions

deploy:
	$(SL) deploy

remove:
	$(SL) remove

logs:
	$(SL) logs -f $(SAMPLE_FN_SHORT)

fn-config:
	$(AWS) lambda get-function --function-name $(SAMPLE_FN)

limit:
	$(AWS) lambda put-function-concurrency --function-name $(SAMPLE_FN) \
	  --reserved-concurrent-executions 25

unlimit:
	$(AWS) lambda delete-function-concurrency --function-name $(SAMPLE_FN)

clean:
	-rm index.js
	-rm -r out

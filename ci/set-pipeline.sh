#!/bin/sh

fly -t jsug set-pipeline \
   -p portside-gateway \
   -c `dirname $0`/pipeline.yml \
   -l `dirname $0`/credentials.yml
#!/bin/sh
docker build . -t simple-log-client
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 simple-log-client"

#! /bin/bash

mvn install

cd weixin
mvn spring-boot:start

cd ../subscribe
mvn spring-boot:start
#!/bin/bash

#Start and supervise postgres, redis and memcache

#Start push server in the background
sudo java -jar target/Push-Server-0.12.0-capsule-fat.jar server config/pushconfig.yml &

#Wait until push server is running
sleep 5

#Migrate database (needed on first run at least)
sudo java -jar target/TextSecureServer-0.79.jar accountdb migrate config/local.yml
sudo java -jar target/TextSecureServer-0.79.jar messagedb migrate config/local.yml

#Start TextSecure server
sudo java -jar target/TextSecureServer-0.79.jar server config/local.yml

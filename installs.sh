#!/bin/bash

echo installing java tools for terminal
 sudo apt-get update && apt-get upgrade
 sudo apt-get install default-jdk
 sudo apt-get install software-properties-common
 sudo add-apt-repository ppa:linuxuprising/java
 sudo apt-get update
 sudo apt-get install oracle-java11-installer
 sudo apt-get install oracle-java13-installer
 javac --version
 java --version
#  clear
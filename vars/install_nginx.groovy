def call(){
  pipeline {
    agent any
    stages {
      stage('Installing nginx') {
        steps {
          sh "apt install nginx -y"
        }
      }
      stage('Starting nginx service') {
        steps {
          sh "systemctl start --now nginx"
        }
      }
      stage('Request a page') {
        steps {
          sh "curl localhost"
        }
      }
    }  
  }
}

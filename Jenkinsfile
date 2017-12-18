pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(poll: true, url: 'https://github.com/eFaps/eFaps-API.git', branch: 'master', changelog: true)
      }
    }
  }
}
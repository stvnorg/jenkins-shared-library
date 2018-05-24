def call() {
  node {
    stages {
      stage('Bundle Install') {
        script {
          sh 'bundle install'
        }
      }
    } 
  }
}

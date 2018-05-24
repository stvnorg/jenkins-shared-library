def call() {
  node {
    stages {
      stage('Bundle Install') {
        steps {
          sh 'bundle install'
        }
      }
    } 
  }
}

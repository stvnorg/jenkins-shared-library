def call() {
  node {
    stage('Bundle Install') {
      steps {
        sh 'bundle install'
      }
    } 
  }
}

def call() {
  node {
    stage('Bundle Install') {
      script {
        sh 'bundle install'
      }
    }
  }
}

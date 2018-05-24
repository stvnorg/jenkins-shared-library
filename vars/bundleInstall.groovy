def call() {
  node {
    stage('Bundle Install') {
      echo "Command Executed using the Library"
      sh 'bundle install'
      
    }
  }
}

def call() {
  node {
    stage('Bundle Install') {
      echo "Command Executed using the Library"
      ~/.rbenv/shims/bundle install
    }
  }
}

def call() {
    sh (script: 'echo "${GIT_BRANCH}" | sed "s/origin\\///g"', returnStdout: true).trim()
}


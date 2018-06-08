def call(string) {
    string = string.replaceAll('home','var/lib')
    return string + "@libs/jenkins-shared-library/gradle-scripts"
}

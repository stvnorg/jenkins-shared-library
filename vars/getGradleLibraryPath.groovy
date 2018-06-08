def call(string) {
    string = string.replaceAll('home','var/lib')
    return string + "/jenkins-shared-library/gradle-scripts"
}

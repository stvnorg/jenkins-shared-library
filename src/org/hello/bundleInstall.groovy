package org.hello
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def bundleInstall() {
    steps.sh "bundle install"
  }
}

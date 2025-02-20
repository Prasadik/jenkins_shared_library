def call(cmd) {
  echo "this stage will generate the artifact"
  sh "mvn clean ${cmd}"
}

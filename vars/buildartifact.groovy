def call() {
  echo "this stage will generate the artifact"
  sh "mvn clean package"
}

def call (String name = 'User') {
  echo "Building java project ${name}"
  //sh 'mvn clean ${name}'
  sh "mvn clean ${name}"
}

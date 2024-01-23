def call() {
sh 'mvn sonar:sonar -Dsonar.projectkey=sonar -Dsonar.host.url=http://65.0.110.26:9000 -Dsonar=sonar.exclusions*/.java'
}
return this

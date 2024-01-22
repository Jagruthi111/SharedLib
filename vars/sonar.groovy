def call() {
sh 'mvn sonar:sonarb-Dsonar.projectkey=sonar -Dsonar.host.url=http://3.111.55.250:9000 -Dsonar=sonar.exclusions*/.java'
}
return this

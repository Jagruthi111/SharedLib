def ssh(String user, String ip) {
sh "ssh ${user}@${ip}"
}


  
            // sh 'scp /home/slave01/workspace/SamplePipeline/target/hello-world-war-1.0.0.war root@172.31.2.55:/opt/apache-tomcat-8.5.98/webapps/'

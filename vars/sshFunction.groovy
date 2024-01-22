def ssh(String user, String ip) {
sh "ssh ${user}@${ip}"
}

def scp(String warPath, String user, String ip, String destPath) {
  sh "scp ${warPath} ${user}@${ip}:${destPath}"
}

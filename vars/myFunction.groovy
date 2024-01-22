def remove(name) {
sh "rm -rf ${name}"
}

def clone(url) {
sh "git clone ${url}"
}
    

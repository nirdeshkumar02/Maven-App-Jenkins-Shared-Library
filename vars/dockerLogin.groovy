def call(credentialsId){
    withCredentials([usernamePassword(credentialsId: credentialsId, passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker login -u '$USER' -p '$PASS' "
    }
}
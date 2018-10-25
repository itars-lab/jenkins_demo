pipeline {
    stages {
        stage("checkout") {
            checkout('svn_url')
        }
        stage("build") {
            timeout(5, units: 'MINUTES') {
                sh './run-some-script.sh'
            }
        }
        stage("deploy") {
            sh "./deploy-something.sh"
        }
    }
}
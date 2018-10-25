pipeline {
    postBuild {
        always {
            archive "target/**/*"
            junit 'path/to/*.xml'
        }
        failure {
            sh './cleanup-failure.sh'
        }
    }
}

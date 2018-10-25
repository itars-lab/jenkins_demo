pipeline {
    // all listed tools need to be installed on master at first
    agent none

    stages {
        stage("distribute") {
            parallel(
                "windows": {
                    node("windows") {
                        bat "print 'message from windows node'"
                    }
                },
                "unix": {
                    node("linux") {
                        sh "print 'message from UNIX-like node'"
                    }
                }
            )
        }
    }

    postBuild {
        //where it will be executed?? Can cause this some problems? How?
        always {
            archive "target/**/*"
            junit 'target/surefire-reports/*.xml'
        }
    }

    notofications {
        failure {
            mail(to: "tarsa.pawel@nobleprog.com", subject: "FAILURE ${currentBuild.fullDisplayName}",
                    body: "Build is OK")
        }
    }
}

pipeline {
    // all listed tools need to be installed on master at first
    tools {
        maven "Maven 3.3.5"
        jdk "Oracle JDK 8u161"
    }

    //Run on any executor
    agent label:""

    stages {
        stage("build") {
            sh "mvn clean install -DmavenOption=true -Pprofile"
        }
    }

    postBuild {
        always {
            archive "target/**/*"
            junit 'target/surefire-reports/*.xml'
        }
    }

    notofications {
        failure {
            mail(to:"tarsa.pawel@nobleprog.com", subject:"FAILURE ${currentBuild.fullDisplayName}",
            body: "Build is OK")
        }
    }
}

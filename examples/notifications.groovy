pipeline {
    notifications {
        success {
            mail to:"tarsa.pawel@nobleprog.com" "Build passed"
        }
        failure {
            //slack notifications etc.
            mail to:"tarsa.pawel@nobleprog.com",
                    subject:"Build failed",
                    body:"Fix me please!"
        }
    }
}

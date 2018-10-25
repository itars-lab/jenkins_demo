def giturl = 'https://github.com/nobleprog/jenkins_demo.git'
for(i in 0..10) {
    job("DSL-Tutorial-1-Test-${i}") {
        scm {
            git(giturl)
        }
        steps {
            maven("test -Dtest.suite=${i}")
        }
    }
}

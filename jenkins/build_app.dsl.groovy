def gitUrl = 'git://github.com/test/test'

//job(${params.NEW_JOB_NAME}) {
//    scm {
//        git(gitUrl)
//    }
//    steps {
//        sh 'echo "Job created from seed!"'
//    }
//}


pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'echo "Job created from seed!"' 
            }
        }
    }
}
def gitUrl = 'git://github.com/test/test'

//job(${params.NEW_JOB_NAME}) {
//    scm {
//        git(gitUrl)
//    }
//    steps {
//        sh 'echo "Job created from seed!"'
//    }
//}


//pipeline ("my_new_pipeline") {
//    agent any
//    stages {
//        stage('Build') { 
//            steps {
//                sh 'echo "Job created from seed!"' 
//            }
//        }
//    }
//}

job('my-new-seeded-job') {
  steps {
    sh('echo Hello World!')
  }
}
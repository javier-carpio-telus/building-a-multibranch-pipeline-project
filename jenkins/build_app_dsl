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

pipelineJob('python_dsl_job_example') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/build_app.groovy'))
            sandbox()
        }
    }
}
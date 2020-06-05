pipeline {
    agent any
    stages {
        stage('Create') { 
            steps {
                sh "ls -lrht"
                jobDsl targets: 'jenkins/build-app.dsl.groovy',
                    ignoreExisting: true,
                    additionalParameters: [
                        NEW_JOB_NAME: "$NEW_JOB_NAME"
                    ]
                sh "echo \"Param NEW_JOB_NAME $NEW_JOB_NAME\" "
            }
        }
    }
}

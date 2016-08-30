node {
    stage "Test"
        checkout scm
	sh "lein do clean, check"

    stage "Deploy"
        checkout scm
        sh "lein do clean, deploy"
}

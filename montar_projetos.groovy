workflowJob("example") {
    logRotator {
        numToKeep 10
    }

    triggers {
        scm 'H/5 * * * *'
    }
}
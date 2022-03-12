multibranchPipelineJob('backend-boilerplate') {
    branchSources {
        github {
            id('backend-boilerplate')
            repoOwner('tiannaru')
            repository('backend-boilerplate')
            scanCredentialsId('ghusertoken')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}

multibranchPipelineJob('whisper') {
    branchSources {
        github {
            id('whisper')
            repoOwner('tiannaru')
            repository('whisper')
            scanCredentialsId('ghusertoken')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}

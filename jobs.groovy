multibranchPipelineJob('whisper') {
    branchSources {
        github {
            id('whisper') // IMPORTANT: use a constant and unique identifier
            repoOwner('tiannaru')
            repository('whisper')
            scanCredentialsId('ghcred')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}

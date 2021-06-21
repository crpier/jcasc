pipelineJob('whisper') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/tiannaru/whisper.git')
          }
          branch('*/main')
        }
      }
      lightweight()
    }
  }
}



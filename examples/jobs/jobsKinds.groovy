job(String name, Closure closure = null) {}          // since 1.30, an alias for freeStyleJob

freeStyleJob(String name, Closure closure = null) {} // since 1.30

buildFlowJob(String name, Closure closure = null) {} // since 1.30

ivyJob(String name, Closure closure = null) {}       // since 1.38

matrixJob(String name, Closure closure = null) {}    // since 1.30

mavenJob(String name, Closure closure = null) {}     // since 1.30

multiJob(String name, Closure closure = null) {}     // since 1.30

workflowJob(String name, Closure closure = null) {}  // since 1.30

multibranchWorkflowJob(String name, Closure closure = null) {} // since 1.42


def myJob = freeStyleJob('SimpleJob')
myJob.with {
    description 'A Simple Job'
}
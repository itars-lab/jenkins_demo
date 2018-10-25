pipeline {
    agent label:'' //run on any node
    /**
        agent docker:'ubuntu' //run on any node within Docker container of the "ubuntu" image
        agent docker:'ubuntu' label:'foo' //run on a node with the label "foo" within docker container of the "ubuntu" image
        agent none //don't run on a node at all - manege node blocks yourself within
     */

}

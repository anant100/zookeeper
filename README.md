# zookeeper
Zookeeper Election process

# Election process
-> Each `Candidate` process will try to join the election
-> Once elected, it will keep the leadership for a random number of seconds and exits
-> Departure of the leader will launch a new election process by ZK automatically

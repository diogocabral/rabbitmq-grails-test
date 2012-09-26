rabbitmq-grails-test
====================

Install rabbitmq on your machine

```brew install rabbitmq```

Start grails from the cloned directory 

```grails run-app```

Breed a rabbit with 

```curl http://localhost:8080/mq-test/rabbit/breed```

or many with 

```#!/bin/bash
for i in {1..100}
do
  curl http://localhost:8080/mq-test/rabbit/breed
done
```


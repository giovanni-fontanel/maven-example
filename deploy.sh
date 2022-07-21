#!/bin/bash
# Generate a randomly exit code to simulate wrong deploy
exitcode=$[ $RANDOM % 10 ]
echo exit code is $exitcode

if [[ $exitcode == 0 ]]; then
    echo "Simulating wrong deploy..."
    exit 1
fi
exit 0

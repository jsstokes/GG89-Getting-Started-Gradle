# Getting Started with GridGain 8.9.15

This repo is identical to the instructions on the [GridGain Quick Start Guide for Java](https://www.gridgain.com/docs/latest/getting-started/quick-start/java) page.

The only difference is that this repo uses Gradle rather than Maven.


## Configuring GridGain
I used GridGain v8.9.15 Enterprise Edition to test this application.  You will need a license key for this edition.
1. Copy the $GRIDGAIN_HOME/libs/optional/control-center-agent folder to the $GRIDGAIN_HOME/libs folder
2. Once the cluster is started, there will be a token in stdout that will be needed to connect to control center
   <br><b><u>Optionally</b></u>, you could use [GridGain Nebula](https://portal.gridgain.com/) to get access to Control Center - there is a free trial available on the site.

## Instructions to execute the sample
1. Your project should use Java 11
2. Start a GridGain node using $GRIDGAIN_HOME/bin/ignite.sh

Then run the HelloWorld.java class's main() method.

## Verify the results
1. Connect your cluster into Control Center or Nebula - use the "+" in the top menu and choose "Attach Cluster".  Paste your token into the resulting popup to connect the cluster.
2. Select "Caches" (Left hand menu) and you should a cache name "myCache", which was created by the sample application.
3. Use the elipses (three dots) at the end of the cache entry and Select "Run scan query" which will display the contents of the cache.
4. You should see two entries that were created.

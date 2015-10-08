# cascalog-flink

A Clojure library designed to ... well, that part is up to you.

## Usage

To build the sample app from the command line use:

    lein uberjar

Before running this sample app, be sure to set your `HADOOP_HOME` environment variable. Then clear the `output` directory, then to run on a desktop/laptop with Apache Hadoop in standalone mode:

    rm -rf output
    hadoop jar ./target/cflink.jar data/rain.txt output/rain

To view the results:

    more output/rain/part-00000
## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

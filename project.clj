(defproject cascalog-flink "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [cascalog/cascalog-core-flink "3.0.0-SNAPSHOT"]
                 ;[cascalog/cascalog-more-taps "2.1.1" :exclusions [cascalog/cascalog-core]]
                 ]
  :uberjar-name "cflink.jar"
  :aot [cascalog-flink.core]
  :main cascalog-flink.core)

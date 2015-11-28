(defproject cascalog-flink "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cascalog/cascalog-core "3.0.0-flink"]
                 ;[cascalog/cascalog-more-taps "2.1.1" :exclusions [cascalog/cascalog-core]]
                 ]
  :uberjar-name "cflink.jar"
  ;:aot [cascalog-flink.core]
  ;:main cascalog-flink.core
  )

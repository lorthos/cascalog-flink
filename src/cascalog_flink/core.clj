(ns cascalog-flink.core
  (:use [cascalog.api])
  (:gen-class))


(def words (cascalog.cascading.tap/memory-source-tap [
                                                      ["t1" "t2"] ["t1" "t2"] ["t1" "t2"]
                                                      ]))


(def data [["key1" 30] ["key1" 4] ["key2" 35] ["key3" 3] ["key3" 3]])

(comment

  (import 'org.apache.hadoop.io.serializer.JavaSerialization)
  (with-serializations [JavaSerialization]
                       (?<- (stdout) [?key] (data ?key ?value) (= ?value 3)))
  )


(comment
  (?<- (stdout)
       [?word ?sum]
       (words)
       )


  (?- (stdout)
      words)
  )


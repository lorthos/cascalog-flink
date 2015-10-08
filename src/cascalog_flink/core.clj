(ns cascalog-flink.core
  (:use [cascalog.api])
  (:gen-class))


(def words (cascalog.cascading.tap/memory-source-tap [
                                                      ["t1" "t2"] ["t1" "t2"] ["t1" "t2"]
                                                      ]))



(comment
  (?<- (stdout)
       [?word ?sum]
       (words)
       )


  (?- (stdout)
      words)
  )


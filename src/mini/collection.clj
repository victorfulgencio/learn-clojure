(ns mini.collection)

(def some-collection [1 2 64 54 11 87 0])

(comment "good to know"
         (type some-collection)
         (instance? java.util.List some-collection)
         (nth some-collection 4))


(comment "thread first vs thread last"
         (-> some-collection
             first
             (- 2))

         (->> some-collection
              first
              (- 2)))

#{1 33 4 77 0 2 5}



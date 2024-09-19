(ns mini.state)

(defn update-state [current-state, new-item]
  (conj current-state new-item))

(defn create-item [index]
  {:message (str "That's item number #" index)
   :index index})

(defn run-updates!
  ([times] (run-updates! 0 times []))
  ([index times state]
   (if (< index times)
     (let [new-index (inc index)
           new-state (update-state state (create-item index))]
       (recur new-index times new-state))
     state)))

(run-updates! 10)

(ns mini.server.core
  (:require [ring.adapter.jetty :as server])
  (:require [clojure.data.json :as json]))

(defn handler [_]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (json/write-str {:hello "World"})})

(server/run-jetty handler {:port 3000
                    :join? false})


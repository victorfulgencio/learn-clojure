(ns mini.playground)

(comment "Fibonacci"
         (defn fibo [num]
           (if (<= num 1)
             num
             (+ (fibo (- num 1)) (fibo (- num 2))))) ; how to tail recursion this?
         (fibo 7))


(comment "Multi arity function"
         (defn send-message
           ([]     (send-message "That's a default message"))
           ([msg]  (println msg)))

         (println (send-message "Non default message"))
         (println (send-message)))

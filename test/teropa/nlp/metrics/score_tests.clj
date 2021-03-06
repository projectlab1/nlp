(ns teropa.nlp.metrics.score-tests
  (:use teropa.nlp.metrics.score)
  (:use clojure.test))

(deftest accuracy-tests
  (is (= 2 (accuracy [1 2 3 4 5]
                     [1 2 6 7 8])))
  (is (= 0 (accuracy [5 4 3 2 1]
                     [1 2 6 7 8]))))
    
(deftest measure-tests 
  (let [r #{1 2 3 4 5 9 10}
        t #{1 2 6 7 8}]
    (is (= (/ 2 5) (precision r t)))
    (is (= (/ 2 7) (recall r t)))
    (is (= (/ 1 3) (f-measure r t)))))

(run-tests)

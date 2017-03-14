(ns debug-utils.routes
  (:require [clojure.tools.logging :as log]))

(defn request-logger
  [handler]
  (fn [req]
    (log/info "REQUEST:" (dissoc req
                                 :compojure.api.middleware/options
                                 :ring.swagger.middleware/data))
    (let [resp (handler req)]
      (log/info "RESPONSE:" (dissoc resp :body))
      resp)))

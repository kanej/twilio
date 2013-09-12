(ns me.kanej.twilio.call
  (:import [com.twilio.sdk TwilioRestClient]))

(defn call [{:keys [account-sid auth-token] :as cred} {:keys [url to from] :as call}]
  (let [client (TwilioRestClient. account-sid auth-token)
        call-factory (.getCallFactory (.getAccount client))
        message-params {"Url" url "To" to "From" from "Method" "GET"}] 
    (.create call-factory message-params)))

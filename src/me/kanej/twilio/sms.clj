(ns me.kanej.twilio.sms
  (:import [com.twilio.sdk TwilioRestClient]))

(defn sms-send [{:keys [account-sid auth-token] :as cred} {:keys [body to from] :as msg}]
  (let [client (TwilioRestClient. account-sid auth-token)
        message-factory (.getSmsFactory (.getAccount client))
        message-params {"Body" body "To" to "From" from}] 
    (.create message-factory message-params)))


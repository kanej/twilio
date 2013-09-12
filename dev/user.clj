(ns user
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application."
  (:require
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer (javadoc)]
   [clojure.pprint :refer (pprint)]
   [clojure.reflect :refer (reflect)]
   [clojure.repl :refer (apropos dir doc find-doc pst source)]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.test :as test]
   [clojure.tools.namespace.repl :refer (refresh refresh-all)]

   [me.kanej.twilio]
   [me.kanej.twilio.sms :as sms]
   [me.kanej.twilio.call :as call])
  (:import [com.twilio.sdk TwilioRestClient]))

(def settings (read-string (slurp "settings.clj")))

(def cred (:twilio-cred settings))
(def phone-numbers (:phone-numbers settings))

(def boom-message {:body "Go Lagavulin!"
                   :to   (:kanej phone-numbers)
                   :from (:twilio phone-numbers)})

(def lagavulin-call {:url "http://www.kanej.me/lagavulin.xml"
                     :to  (:kanej phone-numbers) 
                     :from (:twilio phone-numbers)})

(def system
  "A Var containing an object representing the application under
  development."
  nil)

(defn init
  "Creates and initializes the system under development in the Var
  #'system."
  []
  ;; TODO
  )

(defn start
  "Starts the system running, updates the Var #'system."
  []
  ;; TODO
  )

(defn stop
  "Stops the system if it is currently running, updates the Var
  #'system."
  []
  ;; TODO
  )

(defn go
  "Initializes and starts the system running."
  []
  (init)
  (start)
  :ready)

(defn reset
  "Stops the system, reloads modified source files, and restarts it."
  []
  (stop)
  (refresh :after 'user/go))

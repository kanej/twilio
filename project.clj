(defproject me.kanej/twilio "0.1.0-SNAPSHOT"
  :description "Clojure wrapper of the twilio java api."
  :url "http://github.com/kanej/twilio"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]
                                  [com.twilio.sdk/twilio-java-sdk "3.3.14"]]
                   :source-paths ["dev"]}})

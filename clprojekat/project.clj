(defproject clprojekat "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                  [com.novemberain/monger "2.0.1"]
                 [lib-noir "0.9.9"]
                 [ring "1.3.2"]
                 [compojure "1.3.4"]
                 [org.clojure/data.json "0.2.6"] 
                 [clj-http "1.1.0"]
                 [hiccup "1.0.5"]
                 [incanter "1.5.6"]
                  [de.ubercode.clostache/clostache "1.4.0"]
                 ]
  :plugins [[lein-ring "0.9.1"]]
 :ring {:init clprojekat.controller/insert-initial-info
        :handler clprojekat.core/app}
  )

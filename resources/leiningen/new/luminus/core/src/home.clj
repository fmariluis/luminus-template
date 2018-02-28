(ns <<project-ns>>.routes.home
  (:require [<<project-ns>>.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))
<% include compojure/home-fragment.clj %>
<% include reitit/home-fragment.clj %>


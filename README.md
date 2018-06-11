<!--

     _          _                       _   _        ___ _____
    / \   __  _(_) ___  _ __ ___   __ _| |_(_) ___  |_ _|_   _|
   / _ \  \ \/ / |/ _ \| '_ ` _ \ / _` | __| |/ __|  | |  | |
  / ___ \  >  <| | (_) | | | | | | (_| | |_| | (__   | |  | |
 /_/   \_\/_/\_\_|\___/|_| |_| |_|\__,_|\__|_|\___| |___| |_|

   Copyright (C) Axiomatic IT Incorporated. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

-->

## spring-mvc-demo
A simple demo of a Web application using Spring MVC.

#### Getting Started

1) Run the demo application using Maven with: mvn jetty:run

2) Browse to the following URL to see the demo: http://localhost:8080/spring-mvc-demo

3) Browse to the following URL to view the data: http://localhost:8082

For more information on Spring MVC, visit [springsource.org].

* The database will write to this file: ~/Documents/Development/db/spring-mvc-demo. You can change this by editing the jdbc.properties file.

* JSON is also supported by appending .json to the RESTful URL patterns like 'http://localhost:8080/item.json'. The RESTful support will be expanded.

[springsource.org]:http://springsource.org
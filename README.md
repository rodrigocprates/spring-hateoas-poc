## Spring HATEOAS example

See http://projects.spring.io/spring-hateoas/.

### Build & Run

mvn install

run Application.java

### About

A greeting rest app at http://localhost:8080/greeting with basic json response.

Generated with hypermedia links on it's structure:
	
"_links":{
    "self":{
      "href":"http://localhost:8080/greeting?name=Prates"
    }
  }
}

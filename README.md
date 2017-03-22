## Spring HATEOAS example

### Build & Run

mvn install

run Application.java

### About

A greeting rest app at http://localhost:8080/greeting with basic json response.

Generated with hypermedia links to it's structure:
	
"_links":{
    "self":{
      "href":"http://localhost:8080/greeting?name=Prates"
    }
  }
}
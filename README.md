# Spring-WebBoard

JAVA-Spring WebBoard

## **Website**

MVN POM.XML dependency :
https://mvnrepository.com/

HTML samples :
https://www.w3schools.com/html/html_examples.asp

jdbc MYSQL connection :
https://spring.io/guides/gs/accessing-data-mysql/

(JSP)HTML table sampls :
https://coding-factory.tistory.com/184

## **STS Progress guide :**

> **After dependency ADDED at STS4 :**

    Run as -> Maven clean -> Maven -> Update Project...


## **JSP Progress guide :**

> **Simple submit button :**
> 
> `<button type="submit" formaction="HomePage" formmethod="get">홈페이지로가기</button>`

> **Button click with action (event) :**
> 
> `<button id="btnclick">홈페이지로가기</button>`
> 
> `$('#btnclick').on("click", function(evt) {  self.location = "HomePage"; });`

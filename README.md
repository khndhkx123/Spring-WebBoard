
# Spring-WebBoard

JAVA-Spring WebBoard

## **Website**

MVN POM.XML dependency :
https://mvnrepository.com/

Mybatis for Mapper.xml :
https://mybatis.org/mybatis-3/ko/getting-started.html

HTML samples :
https://www.w3schools.com/html/html_examples.asp

jdbc MYSQL connection :
https://spring.io/guides/gs/accessing-data-mysql/

(JSP)HTML table sampls :
https://coding-factory.tistory.com/184

Bootstrap : 
https://getbootstrap.com/


## **STS memo :**

> **After dependency ADDED at STS4 :**

    Run as -> Maven clean -> Maven -> Update Project...

## **JSP memo :**

> **Bootstrap & jquery :**

    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap-theme.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

> **Simple submit button :**

    <button type="submit" formaction="HomePage" formmethod="get">홈페이지로가기</button>

> **Button click with action (event) :**

    <button id="btnclick">홈페이지로가기</button>
    $('#btnclick').on("click", function(evt) { self.location = "HomePage"; });

> **Meta tag for phone device :**

    <meta name="viewport" content="width=device-width, user-scalable=1.0">

## **Interceptor  guide :**
> **[QTorder] Interceptor is use for ISSUE : 
normal user can directly access admin page using url**

    1. Admininterceptor extends HandlerInterceptorAdapter
    2. Running process structure : preHandle -> Controller Access -> postHandle
	3. We need to check admin before Running Controller : @Override preHandle
	4. Call for present session and save : HttpSession session = req.getSession();
	5. get Attribute "member" and save it to Type<MemberVO> : MemberVO member = (MemberVO)session.getAttribute("member");
	6. if non-login or normal user : if(member == null || member.getVerify() == 2)
	7. Page will automatically go to main : res.sendRedirect("/");
	8. return false for not running controller
> **REMIND that Controller will only run when : prehandle return true !**


## **Current Progress remind : QTorder**

>**2020.05.16 : [ISSUE] second admin & admin are same**
mb_ident value : (0 : admin, 1 : second admin, 2 : normal user)
currently second admin can assess  /admin/index because : AdminInterceptor Line 19
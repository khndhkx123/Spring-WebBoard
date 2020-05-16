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

## **STS memo :**

> **After dependency ADDED at STS4 :**

    Run as -> Maven clean -> Maven -> Update Project...

##**Interceptor  guide: **
> **[QTorder] Interceptor is use for ISSUE : 
normal user can directly access admin page using url**

    Admininterceptor extends HandlerInterceptorAdapter
    Running process structure : preHandle -> Controller Access -> postHandle
	We need to check admin before Running Controller : @Override preHandle
	Call for present session and save : HttpSession session = req.getSession();
	get Attribute "member" and save it to Type<MemberVO> : MemberVO member = (MemberVO)session.getAttribute("member");
	if non-login or normal user : if(member == null || member.getVerify() == 2)
	Page will automatically go to main : res.sendRedirect("/");
	return false for not running controller
> **REMIND that Controller will only run when : prehandle return true !**


## **Current Progress remind : QTorder**

>**2020.05.16 : [ISSUE] second admin & admin are same**
mb_ident value : (0 : admin, 1 : second admin, 2 : normal user)
currently second admin can assess  /admin/index because : AdminInterceptor Line 19
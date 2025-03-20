<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    a{
        text-decoration: none;
        color:black;
        font-size: 11px;
    }

    .nav-area{
        background-color: black;
        color:white;
        display:table;
        height:50px;
        width:100%;

        text-align: center;
    }

   .menu{
        display:table-cell;
        width:25%; 
        height:50px;
        vertical-align: middle;
    }
    

</style>
</head>
<body>
	<h1 align="center">Welcome to MyBatis World</h1>

    <div class="login-area" align="center">
        <form action ="login.me" method="post">
        <table>
            <tr>
            <td>아이디</td>
            <td><input name="userId" required> </td>
            <td rowspan="2"><input type="submit" value="로그인"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="userPwd" required></td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                    <a href="">회원가입</a>
                    <a href="">아이디/비밀번호찾기</a>
                </td>
                
            </tr>
        </table>
    </form>

    <!-- 로그인 후  -->
     <!-- <table>
        <tr>
            <td colspan="2" class="login-info"><b>xxx님 환영합니다</b></td>
        </tr>
        <tr>
            <td><a href="">마이페이지</a></td>
            <td><a href="">로그아웃</a></td>
        </tr>
     </table>
    </div> -->
    <br>

    <div class="nav-area">
        <div class="menu">HOME</div>
        <div class="menu">공지사항</div>
        <div onclick="" class="menu">게시판</div>
        <div class="menu">ETC</div>
    </div>
</body>
</html>
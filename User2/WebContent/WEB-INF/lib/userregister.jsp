<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="servlet/ServletUserRegister" method="post">
		<table align="center" border="1" style="border-collapse: collapse;">
		<tr>
		<td colspan="2"> 用户注册</td>
		</tr>
		<tr>   //用户名
			<td>用户名：</td>
			<td><input type="text" name="username" /></td>
		</tr>
		<tr>     //密码
			<td>密码：</td>
			<td><input type="password" name="userPassword" /> </td>
		</tr>
		<tr>//地址
			<td>地址：</td>
			<td>
				<select name="userProvince" id="userProvince" onchange="addCity()"></select>省
				<select name="userCity id="userCity"></select>市
				<head>
        <title></title>
        <script type="text/javascript">
            function addProvince()
            {
                var prov = document.getElementById("province");
                var provs = ["河南", "河北", "山西", "新疆"];
                prov.length = 0;        
                for (var i=0;i<provs.length ; i++)
                {
                    var op = document.createElement("option");
                    op.value = provs[i];
                    op.innerHTML = provs[i];
                    prov.appendChild(op);
                }
                addCity();
            }
            function addCity()
            {
                var city = document.getElementById("city");
                var cities = [
                    ["郑州市","洛阳市","开封市","南阳市"],
                    ["石家庄市","邯郸市","保定市"],
                    ["太原市","大同市","晋城市","运城市"],
                    ["乌鲁木齐市","吐鲁番地区","哈密","昌吉"]
                ];
                var provIndex = document.getElementById("province").selectedIndex;
                city.length = 0;        
                for (var i=0; i<cities[provIndex].length; i++)
                {
                    var op = document.createElement("option");
                    op.value = cities[provIndex][i];
                    op.innerHTML = cities[provIndex][i];
                    city.appendChild(op);
                }
            }
        </script>
    </head>
    <body onload="addProvince()">
        <center>
            <form method="post" >
                省份：<select id="province" onchange="addCity()">
                      </select>
                城市：<select id="city">
                      </select>
            </form>
        </center>
    </body>
    <head>
        <title></title>
        <script type="text/javascript">
            function addOption()
            {
                for (var i=0; i<10; i++)
                {
                    document.getElementById("year").options[i] = new Option(1990+i, 1990+i);
                }

                for (var i=1; i<=12; i++)
                {
                    document.getElementById("month").options[i-1] = new Option(i, i);
                    document.getElementById("month").options[0].selected = true;
                }
            }
            function changeOption()
            {
                var yearIndex = document.getElementById("year").selectedIndex;
                var year = document.getElementById("year").options[yearIndex].value;
                var monthIndex = document.getElementById("month").selectedIndex;
                var month = document.getElementById("month").options[monthIndex].value;
                var isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
                if (isLeap && (month == 2))    
                {
                    for (var i=1; i<=29; i++)
                    {
                        document.getElementById("day").options[29] = null;
                        document.getElementById("day").options[30] = null;
                        document.getElementById("day").options[i-1] = new Option(i, i);
                    }
                }
                if (!isLeap && (month == 2))
                {
                    for (var i=1; i<=28; i++)
                    {
                        document.getElementById("day").options[28] = null;
                        document.getElementById("day").options[29] = null;
                        document.getElementById("day").options[30] = null;
                        document.getElementById("day").options[i-1] = new Option(i, i);
                    }
                }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                {
                    for (var i=1; i<=31; i++)
                    {
                        document.getElementById("day").options[i-1] = new Option(i, i);
                    }
                }
                if (month == 4 || month == 6 || month == 9 || month == 11)    //判断是否为非2月
                {
                    for (var i=1; i<=30; i++)
                    {
                        document.getElementById("day").options[30] = null;
                        document.getElementById("day").options[i-1] = new Option(i, i);
                    }
                }
            }
        </script>
    </head>
    <body onload="addOption();changeOption()">
       <form action="" method="post" >
            <select id="year" size="1" onchange="changeOption()">
                    <option></option>
            </select>年
            <select id="month" size="1" onchange="changeOption()">
                    <option></option>
            </select>月
            <select id="day" size="1">
                     <option></option>
            </select>日
        </form>
    </body>
		</td>
	</tr>
		<tr>//爱好
			<td>爱好：</td>
			<td>
				<input type="checkbox " name="userHobby" value="篮球" />篮球
				<input type="checkbox " name="userHobby" value="足球" />足球
				<input type="checkbox " name="userHobby" value="羽毛球" />羽毛球
				<input type="checkbox " name="userHobby" value="跑步" />跑步
			</td>
		</tr>
		<tr>//个人描述
		<td>个人描述：</td>
		<td>
			<textarea rows="3" cols="10" name="userDescribe"></textarea>
		</td>
		</tr>
		<tr>
			<td class="tdstyle" colspan="2">
				<input type="submit" value="注册" />
			</td>
			</tr>
		</table>
</form>
</body>
</html>
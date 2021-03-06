<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>首页 · 问卷调查</title>
    <link rel="stylesheet" href="../frame/layui/css/layui.css">
    <link rel="stylesheet" href="../frame/static/css/style.css">
    <link rel="icon" href="../frame/static/image/code.png">
</head>
<body>

<!-- layout admin -->
<div class="layui-layout layui-layout-admin"> <!-- 添加skin-1类可手动修改主题为纯白，添加skin-2类可手动修改主题为蓝白 -->
    <!-- header -->
    <div class="layui-header my-header">
        <a href="index.ftl">
            <!--<img class="my-header-logo" src="" alt="logo">-->
            <div class="my-header-logo">问卷调查</div>
        </a>
        <div class="my-header-btn">
            <button class="layui-btn layui-btn-small btn-nav"><i class="layui-icon">&#xe65f;</i></button>
        </div>

        <!-- 顶部左侧添加选项卡监听 -->

        <!-- 顶部右侧添加选项卡监听 -->
        <ul class="layui-nav my-header-user-nav" lay-filter="side-top-right">
            <!-- <li class="layui-nav-item"><a href="javascript:;" class="pay" href-url="">支持作者</a></li> -->
            <li class="layui-nav-item">
                <a class="name" href="javascript:;"><i class="layui-icon">&#xe629;</i>主题</a>
                <dl class="layui-nav-child">
                    <dd data-skin="0"><a href="javascript:;">默认</a></dd>
                    <dd data-skin="1"><a href="javascript:;">纯白</a></dd>
                    <dd data-skin="2"><a href="javascript:;">蓝白</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item" id="logout-parent-id">
                <a class="name" href="javascript:;"><img src="../frame/static/image/code.png" alt="logo"> ${loginUser.userName} </a>
                <dl class="layui-nav-child">
                    <!-- <dd><a href="javascript:;" href-url="demo/login.html"><i class="layui-icon">&#xe621;</i>登录页</a></dd> -->
                    <!-- <dd><a href="javascript:;" href-url="demo/map.html"><i class="layui-icon">&#xe621;</i>图表</a></dd> -->
                    <dd><a href="javascript:void(0);" id="update-pwd-id">修改密码</a></dd>
                    <dd><a href="javascript:void(0);" id="logout-id">退出 <i class="layui-icon">&#x1006;</i></a></dd>
                </dl>
            </li>
        </ul>

    </div>
    <!-- side -->
    <div class="layui-side my-side">
        <div class="layui-side-scroll">
            <!-- 左侧主菜单添加选项卡监听 -->
            <ul class="layui-nav layui-nav-tree" lay-filter="side-main">
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe628;</i>问卷调查</a>
                    <dl class="layui-nav-child" id="ques_survey_id_parent">
                        <dd><a href="javascript:;" id="ques_survey_id" href-url="../survey/ques-survey.html"><i class="layui-icon">&#xe621;</i>问卷列表</a></dd>
                        <dd><a href="javascript:;" href-url="../survey/ques-type.html"><i class="layui-icon">&#xe621;</i>题目大类列表</a></dd>
                        <dd><a href="javascript:;" href-url="../survey/ques.html"><i class="layui-icon">&#xe621;</i>题目列表</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <!-- body -->
    <div class="layui-body my-body">
        <div class="layui-tab layui-tab-card my-tab" lay-filter="card" lay-allowClose="true">
            <ul class="layui-tab-title">
                <li class="layui-this" lay-id="1"><span><i class="layui-icon">&#xe638;</i>欢迎页</span></li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    <iframe id="iframe" src="../survey/welcome.html" frameborder="0"></iframe>
                </div>
            </div>
        </div>
    </div>
    <!-- footer -->
    <div class="layui-footer my-footer">
        
    </div>
</div>

<!-- 右键菜单 -->
<!-- <div class="my-dblclick-box none">
    <table class="layui-tab dblclick-tab">
        <tr class="card-refresh">
            <td><i class="layui-icon">&#x1002;</i>刷新当前标签</td>
        </tr>
        <tr class="card-close">
            <td><i class="layui-icon">&#x1006;</i>关闭当前标签</td>
        </tr>
        <tr class="card-close-all">
            <td><i class="layui-icon">&#x1006;</i>关闭所有标签</td>
        </tr>
    </table>
</div> -->

<script src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../frame/layui/layui.js"></script>
<script type="text/javascript" src="../frame/static/js/vip_comm.js"></script>
<script src="../js/common.js"></script>
<script type="text/javascript" src="../js/survey.js"></script>
<script type="text/javascript">
layui.use(['layer'], function () {

    // 操作对象
    var layer       = layui.layer
//        ,vipNav     = layui.vip_nav
        ,$          = layui.jquery;

    // 顶部左侧菜单生成 [请求地址,过滤ID,是否展开,携带参数]
    //vipNav.top_left('./json/nav_top_left.json','side-top-left',false);
    // 主体菜单生成 [请求地址,过滤ID,是否展开,携带参数]
    //vipNav.main('./json/nav_main.json','side-main',true);

    // you code ...
	$("#logout-parent-id").on("click", "#logout-id", function(e) {
		var REMOVE_URL = "/logout";
        var formData = {
		};
        
        asyncXhr2('/logout.ftl', JSON.stringify(formData), "POST", 'application/json', function(data){
        	if(data){
        		window.location.href="/crm-web/loginFtl";
        	}else{
        		alert("退出失败!");
        	}
  	    });
	});
	
	$('#update-pwd-id').on('click', function () {
        	layer.open({
        		  type: 2,
        		  area: ['500px', '300px'],
        		  fixed: false, //不固定
        		  maxmin: true, 
        		  content: '/crm-web/updatePwdFtl.ftl?userName=' + '${loginUser.userName}'
        	});
        	//layer.full(index);
        });
	
	/*$("#logout-parent-id").on("click", "#update-pwd-id", function(e) {
		var REMOVE_URL = "/crm-web/updatePwd";
		debugger;
		alert(111)
		var email = "${loginUser.email}";
		alert(email);
        var formData = {
        	
		};
        
        asyncXhr2('/crm-web/updatePwd.ftl', JSON.stringify(formData), "POST", 'application/json', function(data){
        	if(data){
        		window.location.href="/crm-web/loginFtl";
        	}else{
        		alert("退出失败!");
        	}
  	    });
        
	});*/

});
</script>
</body>
</html>
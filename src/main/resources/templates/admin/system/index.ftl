<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<title>${siteName!""}</title>
<#include "../common/header.ftl"/>

</head>
  
<body>
<div class="lyear-layout-web">
  <div class="lyear-layout-container">
    <!--左侧导航-->
    <aside class="lyear-layout-sidebar">
      
      <!-- logo -->
      <div id="logo" class="sidebar-header">
        <a href="index.html"><h2>七亩地IM</h2></a>
      </div>
      <div class="lyear-layout-sidebar-scroll"> 
        <#include "../common/left-menu.ftl"/>
      </div>
      
    </aside>
    <!--End 左侧导航-->
    
    <#include "../common/header-menu.ftl"/>
    
    <!--页面主要内容-->
    <main class="lyear-layout-content">
      
      <div class="container-fluid">
        

          <div class="col-sm-6 col-lg-3">
            <div class="card bg-success">
              <div class="card-body clearfix">
                <div class="pull-right">
                  <p class="h6 text-white m-t-0">注册用户</p>
                  <p class="h3 text-white m-b-0">${userTotal!"0"}</p>
                </div>
                <div class="pull-left"> <span class="img-avatar img-avatar-48 bg-translucent"><i class="mdi mdi-account-multiple fa-1-5x"></i></span> </div>
              </div>
            </div>
          </div>

        <ylrc_auth />
        <div class="row" id="show-copyright" style="display:none;">
          <div class="col-sm-12 col-lg-12">
            <div class="card bg-primary">
              <div class="card-body clearfix">
                <div class="pull-left">
                  <p class="h6 text-white m-t-0">${showTipsText}</p>
                  <p class="h3 text-white m-b-0">${showTipsUrlText}<a href="${showTipsUtl}" style="color:red;margin-right:20px;">https://www.baidu.com</a><a href="javascript:void(0)" class="btn btn-danger" id="order-auth-btn">${showTipsBtnText}</a></p>
                  <p class="h5 text-white m-b-0"></p>
                </div>
              </div>
            </div>
          </div>
        </div>

    </main>
    <!--End 页面主要内容-->
  </div>
</div>
<#include "../common/footer.ftl"/>
<script type="text/javascript" src="/admin/js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="/admin/js/Chart.js"></script>
<script type="text/javascript" src="/admin/js/main.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	new Chart($("#chart-line-3"), {
	    type: 'line',
	    data: {
	        labels: [<#list allPayLogList as payLog>"${payLog.day}",</#list>],
	        datasets: [{
	            label: "充值次数",
	            fill: false,
	            backgroundColor: "#36a2eb",
	            borderColor: "#36a2eb",
	            borderWidth: 3,
	            pointRadius: 0,
	            data: [<#list allPayLogList as payLog>"${payLog.num}",</#list>]
	        },
	        {
	            label: "充值成功次数",
	            fill: false,
	            borderColor: "#ff6384",
	            backgroundColor: "#ff6384",
	            borderWidth: 3,
	            pointRadius: 0,
	            data: [<#list paidPayLogList as payLog>"${payLog.num}",</#list>]
	        }]
	    },
	    options: {tooltips: {
						mode: 'index',
						intersect: false,
				  },   }
	});
	new Chart($("#chart-vbar-1"), {
	    type: 'bar',
	    data: {
	        labels: [<#list topMovieList as movie>"<#if movie.name?length gt 4>${movie.name?substring(0,4)}...<#else>${movie.name}</#if>",</#list>],
	        datasets: [{
	            label: "累计票房",
	            backgroundColor: "rgba(51,202,185,0.5)",
	            borderColor: "rgba(0,0,0,0)",
	            hoverBackgroundColor: "rgba(51,202,185,0.7)",
	            hoverBorderColor: "rgba(0,0,0,0)",
	            data: [<#list topMovieList as movie>"${movie.totalMoney}",</#list>]
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero: true
	                }
	            }]
	        },
	        axisLabel: { interval:0, rotate:40 }
	    }
	});
});

</script>
</body>
</html>
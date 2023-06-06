package com.yuanlrc.movie.config.home;

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016093000635507";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDwHgmrstQCieTGQCERf409LPbAlOInFisRmKxnHMyakmQ3dl9sp+1dLs0Hj0nkErBrE0FKb0aVCQGHJlesmv7dGUZFzrg3YkNv74INuVF/MR2uWbicUrqoSyguNJv1SaZ9BIYc6SiB82kfIHb7o9uabQ6v4dh7guCyZKZ59S3q7DlxFQO3FvEq78GqZ0nkJh89OoYdUolQRnJ/lX+jWIXC19/RSBO6ch6bwFd0gjIqBzl3RRlVJMREU2plmxyVThqrjGjg6Yyx0xOiL/ZhZJV9thOiqdg4r6qFugemoR4O8ANacIUg4lW3ffi1UYB0nRA/sZflMq3vi7rqFwDWwM7XAgMBAAECggEBAIJDqXdugroF2Qj8jXQSwKrpk8wSeUY/LopTS2R9KTrKJHg6TbaCu7ELzMtHHw0OXosYXRlmmOINiripQnMvewizx33jkejp9C/rvaB4YxAfszx9DDwyXXUjoN7AR8OgeyPjqmZQz1sAlI0AbcxCrsZuV8NvQKRw8jmVhQMw0gJZrBVM1QEr3Qy9YEgQQliDw+Q7mAXTjb/v7sJB297T9GmdACwkRlZzy00va+xlTZOPEt+P9/ivK0nHMBBB56NFEOxL/nSjjy1e/2HSlfByZU9HZaJdZ3mzIz++/7T2v1X0YyGayy/+0/PAaAhh/Xcmrjh6BT0bjk1gTAsDRcnEAAECgYEA/U6ZcJ3ZMVG87nNTtMGeQROmEgtgHjOTLTJtFOL1MClnWF+qc6Nlrgvy51f3pWftbXKjlnm+Hcj0rHK+iiyyQESldMDxeDtMBKz1M6XEEujqGj3XgR1FeTUf2ctio1PHAkwuboU7nZMW/tAYaDPfx57PGnSR8HdnbtPgqYE/wAECgYEA8quKk+8ONhogvrLCdfsSfECnRe9F9aKr748FnBj3sfQnQp1vAc62mWx1SKBTsrKZ28+duiaXxWSr2Bb+NmiwrNBsYmos5xvUxfDaGvj4pMj6xQjseoKiVXftuJtUrts3zNbNR3MDNwWgIkEzHpwYjzZGbrMyP5KBSUia4W22jtcCgYAp1va/RENgwxiK5l+4JpcGNsGij2Bz/J7dw0uDPK21I9GfJkYYTa/43J5lmgEcwBrWji35J+jAMLZBWb6hQhq7RNtzen8oFdtLlmn1+vZ1DSXF6dsTx4r3J1A4gECtq6PefEjbFoSvVWFh+2tcotzesxuQShrk9kQOaU7dkKzAAQKBgQCgGBOgbQHPJ4WayYwJEc6sMmsodCaPWvZbYNuuk7o1qIGOLRbi9mD47tihRURyi+l9XocMHBHcpAHK2cB0XLTSDd6zPqDJB09kFvWM/dvrurvV6YE5gZ1fDXPDapZ/lRhHBx7+mB3y2r8+Wg1DkG+Ta5cjyQzJa/nnQwMK3bqmmQKBgQCK5l3BUSeBd7P+CNn1YAW4O9bAOqTPT3RZ3ZElePHVg704pJL+Cd2IQP6y5oMfhFXPvl/PtEgwQ5eK5vHU0Im7+vZdTWzf696MgoNrg9Tvbuiwp+KhuzYK0vIxVJaKmNLfiZD91XfDT8HNZaK1t+IKO1WMdR2Iw7sxVhflg1xD6A==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4X0Xt+y+Ckwvp8G/2+QyBaJvTlKYY4AvuVsC2IqYSx2ROpiNq3o3B2oc6ua5ixLBlLWNc0vqWRlOO3zLIkCgiOmUYSidsgerEJgzVurb1gg1CQsqFMFgVvO9uEytz5UBKMI7eF5YfRGLue/DIM3cXqu5+yEUKP42hGHdwwSbxMSAEhL/RupEv6C8VZg8SYjfwOaWmfmjX6f2B2vl5uhar6RJTHdWWtjx70+b+6/7RZfg4y+y+CtmAi3oITkbG7s6FonJG0kS6pkd5nDQ97gIqOCMmWkmHSAOD3C/9EIkfz3tRe7GHscnf/GSSN/QDoGh7yLjR9Mp5Q1xOnGrTwj0OQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://4b5bae.natappfree.cc/home/pay/alipay_notify";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://4b5bae.natappfree.cc/home/account/user-account";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//https://openapi.alipay.com/gateway.do
    
}
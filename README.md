# springcloud-eureka
eureka：
   单region,多zone配置中，各个zone之间的eureka-server的replicate问题?
   两个不同zone之中各一个相互注册之后，这两者能获取对方zone里面的所有服务清单，但是，除这两者之外，
   其他eureka-server无法获取另一zone的服务清单。
# caterecommend
一.一些规则
1.每个Controller对应的接口都在httpbody里都一个对应的文件夹;
2.对应的请求和响应分别命名为XxxxABody和XxxxxDBody,放在上方指定的文件夹中;
3.接口名和报文的命名:
  a.一般与Controller对应的接口方法名一致;(ex:)
  b.为了接近的业务逻辑的报文放在一起(ex:新增用户,更新用户),一般命名的时候把名词/主语放在前面,要做的动作放在后面,ex:UserInsertABody,RestaurantDBody,
  所以接口名的命名也同样遵循该规则;
  c.分页相关的请求报文XxxxABody报文继承PageABody
  d.分页相关的返回报文XxxxDBody报文继承PageDBody(它继承CommonDbody),其他类型接口的XxxxBody继承CommonDbody
  

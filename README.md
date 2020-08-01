# pget
一个并行获取下游数据的框架,并封装了异常兜底的能力。<br/>
特点：简单、易用<br/>
他有两种使用方式：<br/>
1、Getter模式<br/>
参看代码例子： [Getter案例](https://github.com/yongzhidai/pget/blob/master/src/test/java/com/dyz/pget/test/getter/TestBizDataGetter.java)<br/>
2、Injector模式<br/>
参看代码例子： [Injector案例](https://github.com/yongzhidai/pget/tree/master/src/test/java/com/dyz/pget/test/injector)<br/>

### 扩展模式
分类注入模式<br/>
参看代码例子：[分类Injector案例](https://github.com/yongzhidai/pget/tree/master/src/test/java/com/dyz/pget/test/injector2)<br/>

### pget Idea插件
可以根据当前的BizData提示对应的需要的方法入参。避免参数写错的情况。<br/>
[链接](https://github.com/yongzhidai/pget-idea-plugin)

managerestaurant
================
<pre>
这是自己uml课程设计时做的一个餐馆订餐管理系统，使用java,hibernate,mysql,GWT开发,采用分层设计：
*主要分为三层：
**    ui层，
**    中间数据提供层，
**    数据库交互层。
    
中间层主要是为了方便ui层调用数据和存储数据设计的类；
数据库交互层主要是为了向中间层提供数据。
*数据库交互层分为两小层：
**其中一层的类和数据库中每一个表相对应并封装了一些数据库基本操作；
**另外一层和中间层每一个类相对应，主要是为了将数据库层的另一层的类整合起来为第二层提供统一接口和对应方法。


它对您的作用:
    1.了解分层设计理念
    2.熟悉hibernate的使用
    3.有类似的课程设计(比如说你也是....的学生)<br/>
    4.打算用java做一个漂亮的客户端界面（本系统使用了GWT，这是它的链接:
        https://developers.google.com/web-toolkit/tools/gwtdesigner/index，你可以通过本项目了解它的使用）
</pre>

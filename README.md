# Program for Taiwan 
## Task 1:
> 需求稍微有点复杂，详细就先不写了，根据代码中Task1来回顾吧  
  @author *Bob*

	
	
	

## Task 2:
> +的时候指針一直往右移动,(第一行)直到12个码完成(12个+),再重头开始。  
  当第一行出现-的时候指針往下移动,当出现连续2个-,-时候都重头开始,  
  当第二行出现+时指針返回第一行右邉第一个数字  
  @author *Bob*



## Task 3:
> 本次任务描述：根据上次的代码结构来根据四行b or o输入转移后的＋—来操作源数据  
  第一条：b为＋，o为－  
  第二条：b为－，o为＋  
  第三条：与前一符号不同为＋，相同为－  
  第四条：相同为＋，不同为－  
  source[i][j];  为指针所在的下一个预测值  
  @author *Bob*


## Task 4:
> 本次任务描述：
  此次给出了46条规则序列，输入bo串之后，和已经给出的某条
  规则进行对比，相同翻译为'+',不同翻译为'-',如果输入的序列
  长于规则，那么将规则从头开始重新比对，这里使用％取余的方式
  来对规则进行循环操作
  @author *Bob*
  

## Task 5:
> 本次任务描述：
  本次任务比较简单,对单行数据做了一个数据转换搜索  
  1. 对于+而言,一直朝向增加的方向移动当前源数据中的游标    
  当前行运行结束时,跳转至第一个来重复进行后续操作  
  2. 对于-而言,只要碰到,即跳回第一个来  
  因为本次没有沟通上的问题,所以整体也就花了几分钟来写这个代码  
  @author *Bob*
  
## 整体更新:
> 通过对Task2,Task3,Task4,Task5进行适当的重构,达到了3,4对2,5更好的兼容性
  只需要直接更换继承的基类即可完成翻译功能和执行功能的嫁接
  
  
## Task 6:
> 1. [使用树的遍历实现全排列](http://airu.iteye.com/blog/1930391)  
  ![](http://dl2.iteye.com/upload/attachment/0088/5829/393f316f-8378-3ecf-915c-6fa29c299898.png)  
 
> 1. [使用递归来实现全排列](http://blog.csdn.net/exceptional_derek/article/details/8750375)  
  ![](http://img.my.csdn.net/uploads/201304/02/1364871832_5712.jpg)

  *递归实现的总结*  
    递归就是树的一种实现方式(使用队列以及栈同样可以实现树),我们在这里的两种方案都是使用了递归,
    * 第一种是考虑到全排列恰好可以用树来实现,而我们只需要对这个树进行遍历,即可得出最终结果
    * 第二种的思维导图其实就是树,只不过这里并没有使用树的遍历,而是采用了传统的递归来解决问题
    
#<center>congratulations!!!
 
 	在此真诚感谢Terry赞助我买了一个MacBook pro  
    的备用电源适配器。虽然没有花多少自己的钱,但是作为一名穷学生,能够  
    去官网买一台原配的充电器来作为备用,还是极其奢侈的,然而我是多么需要  
    一个鼠标......

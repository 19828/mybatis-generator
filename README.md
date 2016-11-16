### [Mybatis代码生成器](https://github.com/wangxinforme/mybatis-generator)

+ 修改配置文件：
	+ [generatorConfig-base.xml](src/main/resources/generatorConfig-base.xml)是生成普通代码的配置文件
	+ [generatorConfig-business.xml](src/main/resources/generatorConfig-business.xml)是生成特殊业务代码的配置文件</br></br>

+ 生成代码:
	+ 找到[Generator](src/main/java/com/mybatis/generator/Generator.java)类，根据自己的需求，选择读取哪个配置文件
	+ 执行generator方法</br></br>

+ 查看代码
	+ 生成后的文件，全部在[output](output "修改配置文件后，执行Generator类当中的方法，则在这里会生成相应文件")目录下</br></br>

欢迎[交流讨论](https://github.com/wangxinforme/mybatis-generator/issues)

<b>[胡桃夹子GitHub](https://github.com/wangxinforme "Vincent Git@OSC主页")</b>
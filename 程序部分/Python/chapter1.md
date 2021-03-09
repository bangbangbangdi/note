# print 函数

```python
# 输出函数print

# 输出数字
print(777)
print(3.14)

# 可以输出字符串
print('bangdi-1')
print("bangdi-2")
print('''bangdi-3''')

# 含有运算符的表达式
print(3 + 2)

# 将数据输出到文件中
fp = open('C:\Test\demo01.txt', 'a+')# a+ 的模式：如果文件不存在就创建，如果文件存在就文件内容的后面继续追加
print('hello-bangdi', file=fp)
fp.close()

# 如果不想换行,这里面会自动加个空格
print('hello','bangdi')
# 这里就不会自动加空格
print('hello',end='')
print('hello',end='')
```

# 转义字符

```python
# 转义字符

# \n newline
print('hello\nbangdi')

# \t table
# 这里制表符一般占四个字符，但是具体占几个要看，制表符前面有几个字符
print('bang\tdi')
print('bang1234di')
print('bangd\ti')
print('bangd123i')

# \r return
# 与Java不同，这个return之后就直接删掉了
print('bang\rdi')

# \b back
print('bang\bdi')

# \\ 转义字符
print('http:\\\\www.baidu.com')
print('邦迪说：\'hello bangdi\'')

# 原字符，不希望使用字符串中的转义字符起作用。
# 在字符串前加r或者R
print(r'邦迪说:\n hello-bangdi')
# 注意：最后一个字符不是反斜杠
print(r'bangdi\\')
```


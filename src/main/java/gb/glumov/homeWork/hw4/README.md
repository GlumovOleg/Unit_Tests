1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
Преимущество использования тестовой заглушки заключается в том, что она возвращает
последовательные результаты, упрощая написание теста.
Тесты можно выполнять, даже если другие компоненты пока не работают. 
Так же такими тестовыми заглушками можно тестировать изолированно от внешних зависимостей, 
при их проведении нет необходимости прямого подключения или доступа к источникам.


2)  Какой тип тестовой заглушки следует использовать, если вам нужно проверить,
что метод был вызван с определенными аргументами?

По моему мнению это Mock заглушка. Но почему-то очень хочется ответить, что нужно использовать Stub :) 

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение 
или исключение в ответ на вызов метода?

По моему мнению это Fake заглушка.

4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

По моему мнению это Stub заглушка.
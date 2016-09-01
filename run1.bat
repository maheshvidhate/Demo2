cd C:\Users\GS-1260\workspace\Demo
set ProjectPath=C:\Users\GS-1260\workspace\Demo
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause
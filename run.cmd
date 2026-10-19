@echo off
rem Cach dung: run <package.TenClass> [tham so...]
rem Vi du:     run b1.HelloName An
setlocal
set "JDK=D:\javakit"
if "%~1"=="" (
    echo Cach dung: run ^<package.TenClass^> [tham so...]
    echo Vi du:     run b1.HelloName An
    exit /b 1
)
set "OUT=%~dp0out"
set "SRC=%TEMP%\java_sources.txt"
dir /s /b "%~dp0b1\*.java" "%~dp0b2\*.java" "%~dp0b3\*.java" > "%SRC%"
"%JDK%\bin\javac.exe" -encoding UTF-8 -d "%OUT%" @"%SRC%"
if errorlevel 1 exit /b 1
"%JDK%\bin\java.exe" -Dstdout.encoding=UTF-8 -cp "%OUT%" %*
endlocal

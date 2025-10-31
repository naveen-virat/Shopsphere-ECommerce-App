@echo off
REM MongoDB Data Insertion Script for ShopSphere Application
REM This batch file will populate your MongoDB database with sample data

echo ========================================
echo ShopSphere MongoDB Data Setup
echo ========================================
echo.

REM Check if MongoDB is running
echo Checking MongoDB connection...
mongosh --eval "db.version()" --quiet >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Cannot connect to MongoDB!
    echo Please ensure MongoDB is running on localhost:27017
    echo.
    echo To start MongoDB, run: net start MongoDB
    pause
    exit /b 1
)

echo MongoDB is running!
echo.

REM Navigate to the script directory
cd /d "%~dp0"

echo Inserting sample data into shopsphere_db...
echo.

REM Run the MongoDB script
mongosh shopsphere_db mongodb-insert-data.js

echo.
echo ========================================
echo Data insertion completed!
echo ========================================
echo.
echo You can now run your Spring Boot application:
echo   mvn spring-boot:run
echo.
echo Or use these credentials to login:
echo   Email: john.smith@email.com
echo   Password: password123
echo.

pause

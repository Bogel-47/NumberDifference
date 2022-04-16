# NumberDifference
Tugas SWT Praktik

# How To Run
1. Install Sonar Scanner to Environment on your computer
2. Install Maven, and Java JDK 11.0.14
3. Download SonarQube
4. Run StartSonar.bat on bin/windows-x86-64
5. Open on your browser http://localhost:9000/
6. login with your account (if you are new fill username and password with admin)
7. Create New Project and get token from that project
8. Go to your command prompt and navigate to this project folder
9. Run mvn package sonar:sonar -Dsonar.login="(Your Token From Project)"

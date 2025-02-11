# Timer_App
# Timer Application for Git

## Overview
The Timer Application is a Java-based command-line utility designed to track time spent on various Git repositories. It helps developers manage their coding sessions efficiently by recording start and stop times and providing reports on time spent on different projects.

## Features
- **Start and Stop Timer**: Track coding sessions in Git repositories.
- **Pause/Resume Functionality**: Allows pausing and resuming sessions.
- **Cross-Platform**: Runs on Windows, macOS, and Linux.

## Prerequisites
- Java 11 or later
- Git installed on the system
- Android Studio installed on your machine
- An Android emulator or a physical Android device

## Installation
Clone the repository and navigate to the project folder:
```sh
git clone [https://github.com/yourusername/timer-app.git](https://github.com/Yuvaraj-1603/Timer_App)
cd timer-app
```

## Build the Application
Compile the Java application using:
```sh
javac -d bin src/com/example/timer/*.java
```

## Running the Application
To start the timer:
```sh
java -cp bin com.example.timer.TimerApp start
```

To stop the timer:
```sh
java -cp bin com.example.timer.TimerApp stop
```

To generate a report:
```sh
java -cp bin com.example.timer.TimerApp report
```

## Usage Examples
Start tracking time:
```sh
java -cp bin com.example.timer.TimerApp start
```

Pause the session:
```sh
java -cp bin com.example.timer.TimerApp pause
```

Resume the session:
```sh
java -cp bin com.example.timer.TimerApp resume
```

Stop the session:
```sh
java -cp bin com.example.timer.TimerApp stop
```

Generate a report of all tracked sessions:
```sh
java -cp bin com.example.timer.TimerApp report
```
## Home Page:
![Alt Text](https://raw.githubusercontent.com/Yuvaraj-1603/Timer_App/main/one.png)

## Started :
![Alt Text](https://raw.githubusercontent.com/Yuvaraj-1603/Timer_App/main/two.png)


## Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
For any questions or support, reach out at 2021wa86522@wilp.bits-pilani.ac.in

## Author

NAME: YUVARAJ P
ID  : 2021wa86522
Email ID : 2021wa86522@wilp.bits-pilani.ac.in

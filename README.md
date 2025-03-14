# Android Traffic Light Simulator

A simple Android application that simulates a traffic light system with three colors (red, yellow, green) and automatic state changes.

![Traffic Light Demo](add_screenshot_here.png)

## Features

- 🚦 Traffic light simulation with three states
- ⏱️ Automatic state changes every 3 seconds
- 🎮 Start/Stop control button
- 🎨 Material Design UI
- 📱 Support for Android 5.0 (API 21) and above

## Technical Details

### Development Environment

- Android Studio
- Java
- Minimum SDK: 21 (Android 5.0)
- Target SDK: 32
- Build Tools Version: 32.0.0

### Project Structure

```
app/
├── src/main/
│   ├── java/com/trasty/traffic_light/
│   │   └── MainActivity.java         # Main activity with traffic light logic
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml    # Main UI layout
│   │   ├── values/
│   │   │   ├── colors.xml          # Color definitions
│   │   │   ├── strings.xml         # String resources
│   │   │   └── themes.xml          # Theme configurations
│   │   └── drawable/               # App icons and graphics
│   └── AndroidManifest.xml         # App manifest
```

### Dependencies

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
}
```

## Installation

### Requirements

- Android Studio 4.1.2 or higher
- JDK 1.8
- Android device or emulator running Android 5.0 or higher

### Steps

1. Clone the repository:

```bash
git clone [repository-url]
```

2. Open in Android Studio:

   - File → Open → Select project directory

3. Build the project:

   - Build → Make Project

4. Run on emulator or device:
   - Run → Run 'app'

## Implementation Details

### Color States

```xml
<color name="red">#FFFF0000</color>
<color name="yellow">#FFFFFF00</color>
<color name="green">#FF0EED07</color>
<color name="grey">#FFBAACAC</color>
```

### State Management

- Uses a counter variable to track current state
- Automatic state changes every 3 seconds
- Thread-based timer implementation
- State order: Green → Yellow → Red

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

[Add License Information]

## Contact

[Add Contact Information]

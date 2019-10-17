DESCRIPTION = "The wiimote package allows ROS nodes to communicate with a Nintendo Wiimote and its related peripherals, including the Nunchuk, Motion Plus, and (experimentally) the Classic. The package implements a ROS node that uses Bluetooth to communicate with the Wiimote device, obtaining accelerometer and gyro data, the state of LEDs, the IR camera, rumble (vibrator), buttons, joystick, and battery state. The node additionally enables ROS nodes to control the Wiimote's LEDs and vibration for feedback to the human Wiimote operator. LEDs and vibration may be switched on and off, or made to operate according to a timed pattern."
AUTHOR = "Andreas Paepcke"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "cwiid-dev roslint genmsg geometry-msgs sensor-msgs python3-cwiid python3-numpy roslib rospy roscpp std-msgs std-srvs"

RDEPENDS_${PN} = "cwiid"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/wiimote/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "110dc9ce6ee621eda47b72ad93a4e35f"
SRC_URI[sha256sum] = "75a5a30cf029917d650bf7b2bfaf50737e9397a461fd813d7182882a4ac12701"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-wiimote-1.13.0-1"

inherit catkin

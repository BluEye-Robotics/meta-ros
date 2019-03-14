DESCRIPTION = "The wiimote package allows ROS nodes to communicate with a Nintendo Wiimote and its related peripherals, including the Nunchuk, Motion Plus, and (experimentally) the Classic. The package implements a ROS node that uses Bluetooth to communicate with the Wiimote device, obtaining accelerometer and gyro data, the state of LEDs, the IR camera, rumble (vibrator), buttons, joystick, and battery state. The node additionally enables ROS nodes to control the Wiimote's LEDs and vibration for feedback to the human Wiimote operator. LEDs and vibration may be switched on and off, or made to operate according to a timed pattern."
AUTHOR = "Andreas Paepcke"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "cwiid-dev roslint genmsg geometry-msgs sensor-msgs python-cwiid python-numpy roslib rospy roscpp std-msgs std-srvs"

RDEPENDS_${PN} = "cwiid"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/wiimote/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4f5d9c00ba6fe618d354c0ade2a1b0b7"
SRC_URI[sha256sum] = "89cc9d0267879d69c478f2d1fafb2462142c7d462c87c9458345b76063654be8"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-wiimote-1.12.0-0"

inherit catkin

DESCRIPTION = "Playstation 3 SIXAXIS or DUAL SHOCK 3 joystick driver. Driver for the Sony PlayStation 3 SIXAXIS or DUAL SHOCK 3 joysticks. In its current state, this driver is not compatible with the use of other Bluetooth HID devices. The driver listens for a connection on the HID ports, starts the joystick streaming data, and passes the data to the Linux uinput device so that it shows up as a normal joystick."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs sensor-msgs rospy rosgraph libusb-dev  bluez python-bluez"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/ps3joy/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3abe4171ab17ff27d84941b53e1360fd"
SRC_URI[sha256sum] = "c3b9aa3c6b572091d412fa7e2904b1c799471ba99aed7dd1b906f2b9e35b0f2a"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-ps3joy-1.12.0-0"

inherit catkin

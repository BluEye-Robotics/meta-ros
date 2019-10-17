DESCRIPTION = "Playstation 3 SIXAXIS or DUAL SHOCK 3 joystick driver. Driver for the Sony PlayStation 3 SIXAXIS or DUAL SHOCK 3 joysticks. In its current state, this driver is not compatible with the use of other Bluetooth HID devices. The driver listens for a connection on the HID ports, starts the joystick streaming data, and passes the data to the Linux uinput device so that it shows up as a normal joystick."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs sensor-msgs rospy rosgraph libusb-dev  bluez python3-bluez"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/ps3joy/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "56eba10f7b7083884aae7b02b3301ba5"
SRC_URI[sha256sum] = "766b29d7a4fcc3aa123fdc796f10c6862b9028466bfed7290d51976d547750b2"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-ps3joy-1.13.0-1"

inherit catkin

DESCRIPTION = "ROS driver for a generic Linux joystick. The joy package contains joy_node, a node that interfaces a generic Linux joystick to ROS. This node publishes a "Joy" message, which contains the current state of each one of the joystick's buttons and axes."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp diagnostic-updater sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/joy/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4807df1a544fdece28e2039c17ca6dc4"
SRC_URI[sha256sum] = "369447b7b00655bd9ff8e267b40084009a5bafedaf748f5265b3fa7a8ac27fa6"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-joy-1.13.0-1"

inherit catkin

DESCRIPTION = "ROS driver for a generic Linux joystick. The joy package contains joy_node, a node that interfaces a generic Linux joystick to ROS. This node publishes a "Joy" message, which contains the current state of each one of the joystick's buttons and axes."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp diagnostic-updater sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/joy/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "32e4ba6f00c8e01cecfd0c7698abb77a"
SRC_URI[sha256sum] = "b2942c8164aec9fee0c21d0cb7f8c1e77c3e5e555b10489024e3795de272c600"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-joy-1.12.0-0"

inherit catkin

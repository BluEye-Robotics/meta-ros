DESCRIPTION = "ROS messages for robots using Ackermann steering."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/ackermann_msgs-release/archive/release/melodic/ackermann_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "17fe0820b1355c3956776afdd8548a92"
SRC_URI[sha256sum] = "2696633432ef72489b77e8ff6b0d4782e2e526a62fda01c92d984348b4b0e13b"

S = "${WORKDIR}/ackermann_msgs-release-release-melodic-ackermann_msgs-1.0.1-0"

inherit catkin

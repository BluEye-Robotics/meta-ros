DESCRIPTION = "The turtlesim_dash_tutorial package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "actionlib rospy turtle-actionlib turtlesim"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/banerjs-ros-release/turtlesim_dash_tutorial-release/archive/release/melodic/turtlesim_dash_tutorial/1.0.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8714f64f41b6d4bd24c1fcac6d276156"
SRC_URI[sha256sum] = "60883c74f5ef621c347210e58ab60991c86a138305e0abf18d9f1f40f8fedb3c"

S = "${WORKDIR}/turtlesim_dash_tutorial-release-release-melodic-turtlesim_dash_tutorial-1.0.0-2"

inherit catkin

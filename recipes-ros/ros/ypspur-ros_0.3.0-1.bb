DESCRIPTION = "ROS wrapper for the mobile robot control platform YP-Spur"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp diagnostic-msgs geometry-msgs nav-msgs sensor-msgs std-msgs tf trajectory-msgs ypspur"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/openspur/ypspur_ros-release/archive/release/melodic/ypspur_ros/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d141907cdc02da0457ed0aeba72f8dab"
SRC_URI[sha256sum] = "58b894206e18dfa8c85d4c3a067cb2c5f3b0bba75bc66e9d9dffb40833bb26f5"

S = "${WORKDIR}/ypspur_ros-release-release-melodic-ypspur_ros-0.3.0-1"

inherit catkin

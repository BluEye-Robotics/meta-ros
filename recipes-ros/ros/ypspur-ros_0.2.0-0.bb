DESCRIPTION = "ROS wrapper for the mobile robot control platform YP-Spur"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslint rospy rostest geometry-msgs nav-msgs sensor-msgs std-msgs tf trajectory-msgs ypspur roscpp rospy geometry-msgs nav-msgs sensor-msgs std-msgs tf trajectory-msgs ypspur"

RDEPENDS_${PN} = "roscpp rospy geometry-msgs nav-msgs sensor-msgs std-msgs tf trajectory-msgs ypspur"

SRC_URI = "https://github.com/openspur/ypspur_ros-release/archive/release/melodic/ypspur_ros/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd315904a96c58487b604aa8ce344dfb"
SRC_URI[sha256sum] = "aa18debf2c372f040b3ac8ae242bac35a325e0135b2761b59d1b2a6b0797b8ca"

S = "${WORKDIR}/ypspur_ros-release-release-melodic-ypspur_ros-0.2.0-0"

inherit catkin

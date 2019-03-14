DESCRIPTION = "ROS Python and C++ interfaces for universally unique identifiers."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy uuid-msgs roscpp rospy uuid-msgs"

RDEPENDS_${PN} = "roscpp rospy uuid-msgs"

SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/melodic/unique_id/1.0.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e535726e16830826af9becb2e816fffb"
SRC_URI[sha256sum] = "8f995d23c4bdefadf40cd213fead2b4f4be1285f536a3578823fdaa46cc9019c"

ROS_SPN = "unique_identifier"
S = "${WORKDIR}/unique_identifier-release-release-melodic-unique_id-1.0.6-0"

inherit catkin

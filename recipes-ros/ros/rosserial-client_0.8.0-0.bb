DESCRIPTION = "Generalized client side source for rosserial."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosbash"

RDEPENDS_${PN} = "rosserial-msgs std-msgs rospy tf"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_client/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70e0a6069f059adcc9c58144af4216e2"
SRC_URI[sha256sum] = "13062a7278b9eefc10406a7aaa3b18cf9ab2cad7b24485d9ed4e8699e86af22b"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_client-0.8.0-0"

inherit catkin

DESCRIPTION = "The tf2_py package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tf2 rospy tf2 rospy"

RDEPENDS_${PN} = "tf2 rospy"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_py/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0b05770b06b56c3d3a2aaa4e5cf23fe1"
SRC_URI[sha256sum] = "24fc32a89eb1f6714d2f05c138c5d85741aabe819fc18475e63564aa0e2c388b"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_py-0.6.5-0"

inherit catkin

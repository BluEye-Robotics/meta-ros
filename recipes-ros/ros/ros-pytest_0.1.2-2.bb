DESCRIPTION = "The ros_pytest package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy python3-pytest"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/machinekoder/ros_pytest-release/archive/release/melodic/ros_pytest/0.1.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "807928403051be4fb1dbb0b8ea248fea"
SRC_URI[sha256sum] = "8204f445e165a048869660415c84fa1f478c1d1ecf8dabd79dd9a1187b95048e"

S = "${WORKDIR}/ros_pytest-release-release-melodic-ros_pytest-0.1.2-2"

inherit catkin

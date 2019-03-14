DESCRIPTION = "The controller manager."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface controller-manager-msgs hardware-interface pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/controller_manager/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "742fe5d95e1d1c98a13697d303dbde3b"
SRC_URI[sha256sum] = "23c70277cc132ceacb08eaea3ce9ff79d956458f817b9ab72bcf2713b12e7824"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-controller_manager-0.15.1-0"

inherit catkin

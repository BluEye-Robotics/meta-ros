DESCRIPTION = "Hardware Interface base class."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/hardware_interface/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c5286992156d1de3b02dc0d6fe4d686d"
SRC_URI[sha256sum] = "32cf3ab34458a850b34cf14066562015d475f2c2e6edd49b16725c7f86e218c9"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-hardware_interface-0.15.1-0"

inherit catkin

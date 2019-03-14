DESCRIPTION = "The rqt_controller_manager package"
AUTHOR = "Kelsey Hawkins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "controller-manager rqt-gui"

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/rqt_controller_manager/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "889da64c716331b11de81ba6fec11cbf"
SRC_URI[sha256sum] = "d353d8ca83aa76818876e856d29fb0c5acebc9b55ef54085959a12af1224c8d7"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-rqt_controller_manager-0.15.1-0"

inherit catkin

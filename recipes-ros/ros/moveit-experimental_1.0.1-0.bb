DESCRIPTION = "Experimental packages for MoveIt!"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_experimental/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "167f1cd723294333f90102fedc4eed56"
SRC_URI[sha256sum] = "24c9391582b59fe7765fcbb716fd4156211e6b6fd28f873c4aef4619f3f5b6fa"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_experimental-1.0.1-0"

inherit catkin

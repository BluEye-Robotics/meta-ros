DESCRIPTION = "Experimental packages for MoveIt!"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_experimental/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e61004dc1e76917ab0183b94d3ce48a"
SRC_URI[sha256sum] = "ef4bbc171b72dcaf152c7695ee588e443636c85cd2ab2b67bbd2faa05d96a285"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_experimental-1.0.2-1"

inherit catkin

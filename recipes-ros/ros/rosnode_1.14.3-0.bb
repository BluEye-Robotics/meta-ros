DESCRIPTION = "rosnode is a command-line tool for displaying debug information about ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest rosgraph rostopic"

RDEPENDS_${PN} = "rosgraph rostopic"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosnode/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3dfc9b98493ab444198fe09f1c470600"
SRC_URI[sha256sum] = "9766e0e61bb3e82cab7763af6c0881d2c7cd95cd8a14bcb0538da50124be4d80"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosnode-1.14.3-0"

inherit catkin

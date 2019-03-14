DESCRIPTION = "Resources used for MoveIt! testing"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "joint-state-publisher robot-state-publisher"

RDEPENDS_${PN} = "joint-state-publisher robot-state-publisher"

SRC_URI = "https://github.com/ros-gbp/moveit_resources-release/archive/release/melodic/moveit_resources/0.6.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ffb330de16991652589411a2edbcc93"
SRC_URI[sha256sum] = "ae728a1d284591ce8080f4cad69bcb5d143211ba07ef05055585541a3fe94915"

S = "${WORKDIR}/moveit_resources-release-release-melodic-moveit_resources-0.6.4-0"

inherit catkin

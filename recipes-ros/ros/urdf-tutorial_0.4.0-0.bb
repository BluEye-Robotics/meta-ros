DESCRIPTION = "This package contains a number of URDF tutorials."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch joint-state-publisher robot-state-publisher  xacro"

RDEPENDS_${PN} = "joint-state-publisher robot-state-publisher  xacro"

SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/melodic/urdf_tutorial/0.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69a32df369dc0cf88505f4d7faa413e5"
SRC_URI[sha256sum] = "92605e8f00f4f6ca12ef65eceb536dc41ba222e9881eaa733a28afc784f7bbbf"

S = "${WORKDIR}/urdf_tutorial-release-release-melodic-urdf_tutorial-0.4.0-0"

inherit catkin

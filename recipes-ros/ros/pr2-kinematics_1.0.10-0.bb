DESCRIPTION = "The pr2_kinematics package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-arm-kinematics"

RDEPENDS_${PN} = "pr2-arm-kinematics"

SRC_URI = "https://github.com/pr2-gbp/pr2_kinematics-release/archive/release/melodic/pr2_kinematics/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4c190a14493041304c932296c759a5e"
SRC_URI[sha256sum] = "a1103dc191b832b2a06bb07d9eb6d4c54a948377e0796b9d1f556e7ee3635c2c"

S = "${WORKDIR}/pr2_kinematics-release-release-melodic-pr2_kinematics-1.0.10-0"

inherit catkin

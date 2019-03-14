DESCRIPTION = "This package provides a specialized joint_trajectory_controller that can be moved into holding state via service call. No further trajectories will be accepted/followed in this state."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cmake-modules roslint roscpp joint-trajectory-controller std-srvs controller-manager controller-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_control/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a1ae597e0be2a761fc199133c42cd6c7"
SRC_URI[sha256sum] = "938f095c4b12fe6424a6adb2b205a200c867185f2f492522289a0deb40c87f2c"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_control-0.5.2-0"

inherit catkin

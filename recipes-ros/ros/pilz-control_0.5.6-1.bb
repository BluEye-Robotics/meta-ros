DESCRIPTION = "This package provides a specialized joint_trajectory_controller that can be moved into holding state via service call. No further trajectories will be accepted/followed in this state."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cmake-modules roslint roscpp joint-trajectory-controller std-srvs controller-manager controller-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_control/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "31ced5b2407bfc9354d23316b1d71496"
SRC_URI[sha256sum] = "6fb16af1550a59a9a31bf557a9fe80c4dac7421c6c4da80b804448bc96025fbc"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_control-0.5.6-1"

inherit catkin

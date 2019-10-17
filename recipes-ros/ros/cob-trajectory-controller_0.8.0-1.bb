DESCRIPTION = "This package provides a trajectory controller which controlls velocities for a chain of joints. This controller can be used e. g. with [[schunk_powercube_chain]]."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib cob-srvs control-msgs dynamic-reconfigure roscpp sensor-msgs std-msgs std-srvs trajectory-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_trajectory_controller/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "40534723c4ee4ea659b7aba3dc04aeb1"
SRC_URI[sha256sum] = "a15a4e5f7c3ff66997cd6a2f04caaccb171546d43b27b507e86323cb18296468"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_trajectory_controller-0.8.0-1"

inherit catkin

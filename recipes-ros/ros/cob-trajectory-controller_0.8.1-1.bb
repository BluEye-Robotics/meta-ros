DESCRIPTION = "This package provides a trajectory controller which controlls velocities for a chain of joints. This controller can be used e. g. with [[schunk_powercube_chain]]."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib cob-srvs control-msgs dynamic-reconfigure roscpp sensor-msgs std-msgs std-srvs trajectory-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_trajectory_controller/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39dfa9c3b514c7630b95ca0b43ae1383"
SRC_URI[sha256sum] = "49589031541a9e8feaf550fe37dbd9305b1c9d6c7a103639067266d6ac4e202b"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_trajectory_controller-0.8.1-1"

inherit catkin

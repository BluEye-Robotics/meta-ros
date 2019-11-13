DESCRIPTION = "cob_control meta-package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-base-controller-utils cob-base-velocity-smoother cob-cartesian-controller cob-collision-velocity-filter cob-control-mode-adapter cob-control-msgs cob-footprint-observer cob-frame-tracker cob-hardware-emulation cob-model-identifier cob-obstacle-distance cob-omni-drive-controller cob-trajectory-controller cob-tricycle-controller cob-twist-controller"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_control/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fbae5fecf70977f80bf8a614a96b2953"
SRC_URI[sha256sum] = "5f7b91ff5d46b13a707e1a79061dcadf5fb637cb95b227e6e1fe3973a387e8f1"

S = "${WORKDIR}/cob_control-release-release-melodic-cob_control-0.8.1-1"

inherit catkin

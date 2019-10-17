DESCRIPTION = "cob_control meta-package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-base-controller-utils cob-base-velocity-smoother cob-cartesian-controller cob-collision-velocity-filter cob-control-mode-adapter cob-control-msgs cob-footprint-observer cob-frame-tracker cob-model-identifier cob-obstacle-distance cob-omni-drive-controller cob-trajectory-controller cob-tricycle-controller cob-twist-controller"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_control/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "315e042719e37052c151046e7e7a509f"
SRC_URI[sha256sum] = "0954cda7ea3fe44c91fbc9671b523b1580d97733f89f712a51762a8d9c5b7bb4"

S = "${WORKDIR}/cob_control-release-release-melodic-cob_control-0.8.0-1"

inherit catkin

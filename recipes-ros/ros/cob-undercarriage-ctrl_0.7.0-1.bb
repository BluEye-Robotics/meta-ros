DESCRIPTION = "cob_undercarriage_ctrl implements a controller for the omnidirectional base of Care-O-bot 3 on joint level. For a given Pltf-Twist the according wheel steering angles and linear wheel velocities are calculated based on the principle of rigid body motion. Each joint is than controlled individually to achieve the computed position and velocity"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-msgs cob-utilities control-msgs diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_undercarriage_ctrl/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "26af457ac9c513f620c547f436393c65"
SRC_URI[sha256sum] = "28f92ad439e996cc1ea5544bfad718bce1c35c860475fc0b0d8b6c8069264279"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_undercarriage_ctrl-0.7.0-1"

inherit catkin

DESCRIPTION = "Various actions which help in moving the arms of the PR2 or getting data from its tilting laser."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "joint-trajectory-action-tools joint-trajectory-generator pr2-arm-move-ik pr2-common-action-msgs pr2-tilt-laser-interface pr2-tuck-arms-action"

RDEPENDS_${PN} = "joint-trajectory-action-tools joint-trajectory-generator pr2-arm-move-ik pr2-common-action-msgs pr2-tilt-laser-interface pr2-tuck-arms-action"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_common_actions/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dd45523a63a57c5dd1fde765bd544f52"
SRC_URI[sha256sum] = "80fd608e81e3b4797e06188ddba9351c1cd1937e04985ff61c6c4d72e8a546ea"

S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_common_actions-0.0.11-0"

inherit catkin

DESCRIPTION = "Helper scripts for Care-O-bot"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime cob-msgs cob-script-server diagnostic-msgs rospy tf visualization-msgs"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_helper_tools/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "05e5ffd9fea5eb21d9b61caa1eafc551"
SRC_URI[sha256sum] = "11cdb917fbbe0c352146a2e282741deaac0fd7eea4bb55cb0eb2b1612e2a7438"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_helper_tools-0.6.15-1"

inherit catkin

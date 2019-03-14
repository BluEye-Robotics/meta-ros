DESCRIPTION = "Messages for representing PR2 state, such as battery information and the PR2 fingertip sensors."
AUTHOR = "Eric Berger and many others"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs message-runtime std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs geometry-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_msgs/1.12.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d1fe28cb93fed66a5623980251cb404f"
SRC_URI[sha256sum] = "9ced0d809f30168f7a97b29da6230c99e19011a5b4416111f02bc62f5e35b8d2"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_msgs-1.12.3-0"

inherit catkin

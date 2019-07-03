DESCRIPTION = "Messages for representing PR2 state, such as battery information and the PR2 fingertip sensors."
AUTHOR = "Eric Berger and many others"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs message-runtime std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs geometry-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_msgs/1.12.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29e19f344f1767abefa4342553537c9d"
SRC_URI[sha256sum] = "c0553181a4afd5606bb87f39fa2710ac6c7c1a6afc99d99bfc657218cba9a7e4"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_msgs-1.12.4-1"

inherit catkin

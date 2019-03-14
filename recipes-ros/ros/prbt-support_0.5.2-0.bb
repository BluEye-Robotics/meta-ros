DESCRIPTION = "Mechanical, kinematic and visual description of the Pilz light weight arm PRBT."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp"

RDEPENDS_${PN} = "roscpp canopen-motor-node joint-trajectory-controller joint-state-controller joint-state-publisher robot-state-publisher topic-tools rosservice xacro  controller-manager pilz-control prbt-hardware-support"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_support/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4ce29b4e897ef5bd92922404611fdeee"
SRC_URI[sha256sum] = "f38e5c99cb99f6999ecdfbc6ffc01b608b48cce3f71bfc22e5497d6f7ef06301"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_support-0.5.2-0"

inherit catkin

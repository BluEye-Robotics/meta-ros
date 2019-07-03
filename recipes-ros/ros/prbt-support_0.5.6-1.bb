DESCRIPTION = "Mechanical, kinematic and visual description of the Pilz light weight arm PRBT."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp"

RDEPENDS_${PN} = "roscpp canopen-motor-node joint-state-controller joint-state-publisher robot-state-publisher topic-tools rosservice xacro  controller-manager pilz-control prbt-hardware-support"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_support/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "63a402fee28ea7c557e127330681a3fd"
SRC_URI[sha256sum] = "bc7c8685dcabc2ab9333ab1688a663953f9d2b9f9cc569f0976bba868cfc3596"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_support-0.5.6-1"

inherit catkin

DESCRIPTION = "The cob_default_robot_behavior package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-light cob-script-server rospy std-msgs std-srvs"

SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/melodic/cob_default_robot_behavior/0.7.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8585e7485e4fe74108011900d739e9fd"
SRC_URI[sha256sum] = "ee468816025bfbdd6d464d29a06086647132c3a123eb97ce24677f4f913d54b7"

ROS_SPN = "cob_robots"
S = "${WORKDIR}/cob_robots-release-release-melodic-cob_default_robot_behavior-0.7.2-1"

inherit catkin

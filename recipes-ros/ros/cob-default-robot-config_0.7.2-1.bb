DESCRIPTION = "Default configuration of the different robots supported by the Care-O-bot stacks. Configuration is e. g. preconfigured joint positions."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roslaunch cob-supported-robots"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/melodic/cob_default_robot_config/0.7.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18da13bb4dc2a7c918cb4aec434c40d2"
SRC_URI[sha256sum] = "5109f04c5fed185e903c9e5f45b1e30aee30c32622f47e2359162106ed9f2939"

ROS_SPN = "cob_robots"
S = "${WORKDIR}/cob_robots-release-release-melodic-cob_default_robot_config-0.7.2-1"

inherit catkin
